$(function(){//body载入完毕
	$("#login").click(function(){
		//清除原有的提示信息
		 $("#count_span").html("");
		 $("#password_span").html("");
		//alert("----");
		//获取请求参数
		var name = $("#count").val().trim();
		var password = $("#password").val().trim();
		//检查参数格式
		var ischeck = true;
		if(name==""){
			$("#count_span").html("用户名为空");
			ischeck=false;
		}
		if(password==""){
			$("#password_span").html("密码为空");
			ischeck=false;
		}
		//发送Ajax请求
		if(ischeck){
			$.ajax({
				url:url_path+"/user/login.do",
				type:"post",
				data:{"name":name,"password":password},
				dataType:"json",
				success:function(result){
					//正常回调
					if(result.status==0){
						//成功
						//获取用户ID，写入cookie
						var userId = result.data;
						addCookie("userId",userId,2);
						window.location.href="edit.html";
					} else if(result.status==1){//用户名错误
						$("#count_span").html(result.msg);
					} else if(result.status==2){//密码错误
						$("#password_span").html(result.msg);
					}
				},
				error:function(){
					alert("登录失败");
				}
				});
		}
		
	});
});