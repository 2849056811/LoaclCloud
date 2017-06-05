package ideatech.east.service.userinfo;

import ideatech.east.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
	public List<UserInfo> selectUserInfoService(UserInfo userInfo);
}
