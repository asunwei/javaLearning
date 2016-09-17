//弹出添加笔记本对话框
function alertAddBookWindow(){
	//加载alert_notebook.html内容
	$("#can").load("alert/alert_notebook.html");
	//背景色div显示
	$(".opacity_bg").show();
 }



//关闭弹出的对话框
function closeAlertWindow(){
	$("#can").empty();//清空,隐藏
	$(".opacity_bg").hide();//隐藏
};

//弹出添加笔记的对话框
function alertAddWindow(){
	//检测是否添加笔记本
	//选择class=checked的a元素
	var $a = $("#book_ul li a.checked");
	if($a.length==0){
		alert("请选择笔记本！")
	}else{
	//加载笔记框
	$("#can").load("alert/alert_note.html");
	//背景色div显示
	$(".opacity_bg").show();
	}
}

//弹出确认删除笔记对话框
function alertRecycleNote(){
	//加载alert_notebook.html内容
	$("#can").load("alert/alert_delete_note.html");
	//背景色div显示
	$(".opacity_bg").show();
 }

//弹出转移笔记对话框
function alertMoveNoteWindow(){
	$("#can").load("alert/alert_move.html",function(){
		//获取笔记本信息,生成select的option选项
		var $lis = $("#book_ul li");//获取所有笔记本li元素
		for(var i=0;i<$lis.length;i++){
			var $li = $($lis[i]);//获取li元素的jQuery对象
			var bookId = $li.data("bookId");
			var bookName = $li.text().trim();//获取文本内容(笔记本名)
			//拼一个option,添加到select下拉单
			var sopt = "<option value='"+bookId+"'>"
					+bookName+"</option>";
			$("#moveSelect").append(sopt);
		}
	});
	$(".opacity_bg").show();
	return false;//阻止li冒泡
};

