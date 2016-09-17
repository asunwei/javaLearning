function loadBookNotes(){
    	    	 //将当前笔记本li设置选中
    	    	$("#book_ul li a").removeClass("checked");
	            $(this).find("a").addClass("checked");
    	    	 //获得 请求参数
    	    	 var bookId = $(this).data("bookId");
    	    	 //发送Ajax
    	    	 $.ajax({
    	    		url:url_path+"/note/loadnotes.do",
					type:"post",
					data:{"bookId":bookId},
					dataType:"json",
					success:function(result){
						if(result.status==0){
							var notes = result.data;
							//清除原有列表
							$("#note_ul").empty();
							for(var i=0;i<notes.length;i++){
								var noteTitle = notes[i].cn_note_title;
								var noteId = notes[i].cn_note_id;
								//调用li
								createNoteLi(noteId,noteTitle)
							  
							}
						}
					},
					error:function(){
						alert("加载笔记列表失败");
					}
    	    	 });
    	     }

//拼一个笔记的li
function createNoteLi(noteId,noteTitle){
//拼一个笔记li
	var sli ='<li class="online">';
		sli+='	<a>';
		sli+='		<i class="fa fa-file-text-o" title="online" rel="tooltip-bottom"></i> ';
		sli+=noteTitle;
		sli+='		<button type="button" class="btn btn-default btn-xs btn_position btn_slide_down"><i class="fa fa-chevron-down"></i></button>';
		sli+='	</a>';
		sli+='	<div class="note_menu" tabindex="-1">';
		sli+='		<dl>';
		sli+='			<dt><button type="button" class="btn btn-default btn-xs btn_move" title="移动至..."><i class="fa fa-random"></i></button></dt>';
		sli+='			<dt><button type="button" class="btn btn-default btn-xs btn_share" title="分享"><i class="fa fa-sitemap"></i></button></dt>';
		sli+='			<dt><button type="button" class="btn btn-default btn-xs btn_delete" title="删除"><i class="fa fa-times"></i></button></dt>';
		sli+='		</dl>';
		sli+='	</div>';
		sli+='</li>';
		//绑定一个noteId
		var $li = $(sli);
		$li.data("noteId",noteId);
		//添加到笔记ul中
		$("#note_ul").append($li)
}
						  

function loadNoteContent(){
        	    	 //将当前的li设置为选中
        	    	 $("#note_ul li a").removeClass("checked");
        	    	 $(this).find("a").addClass("checked");
        	    	 //获得请求参数
        	    	 var noteId = $(this).data("noteId");
        	    	 //发送Ajax
        	    	 $.ajax({
        	    		url:url_path+"/note/load.do",
						type:"post",
						data:{"noteId":noteId},
						dataType:"json",
						success:function(result){
							if(result.status==0){
								var note = result.data;
							    var noteTitle = note.cn_note_title;
								var noteBody = note.cn_note_body;
								//设置编辑区
								$("#input_note_title").val(noteTitle);
								//设置编辑区内容
								um.setContent(noteBody);
							}
						},
						error:function(){
							alert("加载笔记内容失败！")
						}
        	    	 });
        	     }


//添加笔记标题
function sureAddNote(){
        	    	 //获取请求参数
        	    	 var noteTitle = $("#input_note").val().trim();
        	    	 var $li = $("#book_ul li a.checked").parent();
        	    	 var bookId=$li.data("bookId");
        	    	 //检查格式
        	    	 //发送Ajax请求
        	    	 $.ajax({
        	    		 url:url_path+"/note/add.do",
        	    		 type:"post",
        	    		 data:{"bookId":bookId,"userId":userId,"noteTitle":noteTitle},
        	    		 dataType:"json",
        	    		 success:function(result){
        	    			 if(result.status==0){
						//关闭对话框
						closeAlertWindow();
						//添加笔记列表项
						var noteId = result.data;//返回笔记ID
						createNoteLi(noteId,noteTitle);
						//提示成功
						alert(result.msg);
					}
        	    		 },
        	    		 error:function(){
        	    			 alert("创建笔记失败");
        	    		 }
        	    	 });
        	    	 
        	     }

//确认保存笔记按钮处理
function sureUpdateNote(){
        	    	 //获取请求参数
        	    	 var noteTitle = $("#input_note_title").val().trim();
        	    	 var noteBody = um.getContent();
        	    	 var $a = $("#note_ul li a.checked");
        	    	 if($a.length==0){
        	    		 alert("请选择要保存笔记");
        	    		 return;
        	    	 }
        	    	 var $li = $a.parent();
        	    	 var noteId = $li.data("noteId");
        	    	 //检查格式
        	    	 //发送Ajax请求
        	    	 $.ajax({
        	    		 url:url_path+"/note/update.do",
        	    		 type:"post",
        	    		 data:{"noteId":noteId,"noteTitle":noteTitle,"noteBody":noteBody},
        	    		 dataType:"json",
        	    	    success:function(result){
        	    			 if(result.status==0){
        	    				 //刷新列表标题
							var sli ='		<i class="fa fa-file-text-o" title="online" rel="tooltip-bottom"></i> ';
								sli+=noteTitle;
								sli+='		<button type="button" class="btn btn-default btn-xs btn_position btn_slide_down"><i class="fa fa-chevron-down"></i></button>';
								//替换a元素内容
								$a.html(sli);
								//提示成功
								alert(result.msg);
        	    			 }else{
        	    				 //提示失败
								alert(result.msg);
        	    			 }
								
        	    	    },
        	    	    error:function(){
        	    	    	alert("保存失败!")
        	    	    }
        	    	 });
        	     }

//弹出笔记菜单处理
function showNoteMenu(){
	  $("#note_ul").on("click",".btn_slide_down",function(){
    	 //将所有菜单隐藏
    	 $("#note_ul .note_menu").hide();
    	 //显示点击笔记的div
    	 var $li = $(this).parents("li");
    	 var $menu = $li.find(".note_menu");
    	 $menu.slideDown(1000);//显示菜单
    	 //设置当前li选中模式
    	 $("#note_ul li a").removeClass("checked");
    	 $li.find("a").addClass("checked");
    	 //阻止冒泡
    	 return false;
     });
     //当鼠标在div菜单移动时保持显示菜单
     $("#note_ul").on("mouseover",".note_menu",function(){
    	 $(this).show();
     });
     //当鼠标在div菜单移开时菜单隐藏
     $("#note_ul").on("mouseout",".note_menu",function(){
    	 $(this).hide();
     });
     //点击body任何位置，隐藏弹出来的菜单
     $("body").click(function(){
		$("#note_ul .note_menu").hide();
	});
}

function sureRecycleNote(){
        	    	 //获得参数
        	    	 var $li = $("#note_ul li a.checked").parent();
        	    	 var noteId = $li.data("noteId");
        	    	 //检查格式
        	    	 //发送Ajax请求
        	    	 $.ajax({
        	    		 url:url_path+"/note/recycle.do",
        	    	     type:"post",
        	    	     data:{"noteId":noteId},
        	    	     dataType:"json",
        	    	     success:function(result){
        	    	    	 if(result.status==0){
        	    	    		 //删除列表项
        	    	    		 $li.remove();
        	    	    		 //提示成功
        	    	    		 alert(result.msg);
        	    	    	 }
        	    	     },
        	    	     error:function(){
        	    	    	 alert("删除笔记失败！");
        	    	     }
        	    	 });
        	     }

//分享笔记处理
function sureShareNote(){
	//获取请求参数
	var $li = 
		$("#note_ul li a.checked").parent();
	var noteId = $li.data("noteId");
	//发送Ajax请求
	$.ajax({
		url:url_path+"/share/add.do",
		type:"post",
		data:{"noteId":noteId},
		dataType:"json",
		success:function(result){
			alert(result.msg);
		},
		error:function(){
			alert("分享笔记失败");
		}
	});
	//阻止冒泡
	return false;
	};