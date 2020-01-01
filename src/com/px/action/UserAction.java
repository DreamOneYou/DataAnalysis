package com.px.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.px.entity.Firm;
import com.px.entity.User;
import com.px.service.UserService;

@SuppressWarnings("all")
public class UserAction extends ActionSupport implements ModelDriven<User>{

	//模型驱动
	private User user = new User();
	public User getModel() {
		return user;
	}
	
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String login(){
		User userExist = userService.login(user);
		
		if(userExist!=null){
			//登录成功
			HttpServletRequest request = ServletActionContext.getRequest();
			request.getSession().setAttribute("user", userExist);
			return "loginsuccess";
		}else{
			//登录失败
			return "login";
		}
	}
	//修改密码
	public String revisePasswd(){
		
		User userExist = userService.login(user);
		if(userExist!=null){
			if(userService.updatePsswd(user)){
				return "revisePasswdsuccess";
			}else{
				return "revisePasswderror";
			}
		}
		return "revisePasswderror";
		
	}
	
	private Integer adminId; 
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String passwd(){
		//验证用户
		User userOne = userService.findOne(adminId);
		ServletActionContext.getRequest().setAttribute("userOne", userOne);
		return "passwd";
	}
	//首页管理登录
	public String mainLogin(){
		
		return "mainLogin";
	}
}
