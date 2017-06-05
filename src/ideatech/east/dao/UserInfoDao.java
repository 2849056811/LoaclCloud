package ideatech.east.dao;

import ideatech.east.bean.UserInfo;

import java.util.List;
/**
 * 
 * @author lee_book
 * user interface method
 *
 */
public interface UserInfoDao {
	public List<UserInfo> selectuserinfodao(UserInfo userinfo);
}
