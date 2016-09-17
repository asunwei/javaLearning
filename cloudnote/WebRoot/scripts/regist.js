$(function(){
	  $("#regist_button").click(function(){
		  //清楚原有提示信息
		  $("#warning_1").hide();
		  $("#warning_2").hide();
		  $("#warning_3").hide();
		  $("#warning_4").hide();
		  //获取请求参数
		  var name = $("#regist_username").val().trim();
		  var nick = $("#nickname").val().trim();
		  var pwd = $("#regist_password").val().trim();
		  var final_pwd = $("#final_password").val().trim();
		  //检查格式
		  var ischeck=true;
		  if(name==""){
			  $("#warning_1 span").html("用户名为空");
			  $("#warning_1").show();
			  ischeck=false;
		  }
		  if(nick==""){
			  $("#warning_4 span").html("昵称为空");
			  $("#warning_4").show();
			  ischeck=false;
		  }
		  if(pwd==""){
			  $("#warning_2 span").html("密码为空");
			  $("#warning_2").show();
			  ischeck=false;
		  }else{
			   if(pwd.length<6||pwd.length>20){
			  $("#warning_2 span").html("密码位数为6-20");
			  $("#warning_2").show();
			  ischeck=false;
		     }
		  }
		  if(final_pwd==""){
			  $("#warning_3 span").html("确认密码为空");
			  $("#warning_3").show();
			  ischeck=false;
		  }else{
			  if(final_pwd!=pwd){
			  $("#warning_3 span").html("与密码不一致");
			  $("#warning_3").show();
			  ischeck=false;
			  }
		  }
		  //发送Ajax请求
		  if(ischeck){
			  $.ajax({
				  url:url_path+"/user/regist.do",
				  type:"post",
				  data:{"name":name,"password":pwd,"nick":nick},
				  dataType:"json",
				  success:function(result){
					  if(result.status==0){//成功
						  alert(result.msg);
						  $("#back").click();//触发单击事件
					  }else if(result.status==1){//用户名被占用
						  $("#warning_1 span").html(result.msg);
			              $("#warning_1").show();
					  }
				  },
				  error:function(){
					  alert("注册失败！")
				  }
			  });
		  }
	  });
  });