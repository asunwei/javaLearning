function loadUserBooks(){
	$.ajax({
		url:url_path+"/notebook/loadbooks.do",
		type:"post",
		data:{"userId":userId},
		dataType:"json",
		success:function(result){
			if(result.status==0){
				var books = result.data;
				//循环解析生成li
				for(var i=0;i<books.length;i++){
					var bookName = books[i].cn_notebook_name;
					var bookId = books[i].cn_notebook_id;
					//创建笔记本项LI
					createBookLi(bookId,bookName);
				}
			}
		},
		error:function(){
			alert("加载笔记本列表失败");
		}
	});
}
//创建添加一个笔记本项LI
function createBookLi(bookId,bookName){
   var sli=' <li class="online">';
       sli+='  <a>';
       sli+='    <i class="fa fa-book" title="online" rel="tooltip-bottom"></i>'; 
       sli+=    bookName;
       sli+='  </a>';
       sli+='</li>';
       //将sli字符串转换成jquery对象
       var $li = $(sli);
       $li.data("bookId",bookId);//绑定bookId值
       //添加到ul元素中
       $("#book_ul").append($li);
}

//确认添加笔记本
function sureAddBook(){
        	    	 //获取请求参数
        	    	 var bookName = $("#input_notebook").val().trim();
        	    	 //ToDo检查格式
        	    	 //发送Ajax请求
        	    	 $.ajax({
        	    		 url:url_path+"/notebook/add.do",
        	    	     type:"post",
        	    	     data:{"userId":userId,"bookName":bookName},
        	    	     dataType:"json",
        	    	     success:function(result){
        	    		 if(result.status==0){
        	    			 //关闭对话框
        	    			 closeAlertWindow();
        	    			 //添加笔记本列表项
        	    			 var bookId = result.data;
        	    			 createBookLi(bookId,bookName);
        	    			 //提示成功
        	    			 alert(result.msg);
        	    		    }
        	    	     },
        	    	     error:function(){
        	    	    	 alert("创建笔记本失败");
        	    	     }
        	    	 });
        	     }
