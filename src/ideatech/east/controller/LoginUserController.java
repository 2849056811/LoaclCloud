package ideatech.east.controller;

import ideatech.east.bean.UserInfo;
import ideatech.east.model.MsgInfo;
import ideatech.east.service.userinfo.UserInfoService;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("loginUserController")
public class LoginUserController {
	@Resource(name="userInfoService")
	private UserInfoService userInfoService;
	
	@RequestMapping("/selectUserInfoByNameAndPassWord")
	@ResponseBody
	public MsgInfo selectUserInfoByNameAndPassWord(HttpSession session,UserInfo userInfo){
		System.out.println(userInfo.getuName()+"||"+userInfo.getuPassWord());
		if(StringUtils.isEmpty(userInfo.getuName())||StringUtils.isEmpty(userInfo.getuPassWord())){
			MsgInfo m=new MsgInfo();
			m.setMsg("login filed!");
			m.setFlg("0");
			m.setUrl("login.jsp");
			return m;
		}
		List<UserInfo> userList=userInfoService.selectUserInfoService(userInfo);
		if(userList==null){
			MsgInfo m=new MsgInfo();
			m.setMsg("Password or account error!!!");
			m.setFlg("0");
			m.setUrl("login.jsp");
			System.out.println("Password or account error!!!");
			return m;
		}
		session.setAttribute("userList",userList);
		MsgInfo m=new MsgInfo();
		m.setMsg("Login successful!!!");
		m.setFlg("1");
		m.setUrl("index.jsp");
		System.out.println("Login successful!!!");
		return m;
	}
}
