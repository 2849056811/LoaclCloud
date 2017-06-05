package ideatech.east.service.userinfo.impl;

import ideatech.east.bean.UserInfo;
import ideatech.east.dao.UserInfoDao;
import ideatech.east.service.userinfo.UserInfoService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{
	@Resource(name="userInfoDao")
	private UserInfoDao userInfoDao;
	@Override
	public List<UserInfo> selectUserInfoService(UserInfo userInfo) {
		List<UserInfo> user=(List<UserInfo>) userInfoDao.selectuserinfodao(userInfo);
		if(user.isEmpty()){
			return null;
		}
		return user;
	}

}
