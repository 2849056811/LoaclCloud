package ideatech.east.bean;
/**
 * 
 * @author lee_book
 * @date 2017/05/16
 * 用户数据表实体bean
 *
 */
public class UserInfo {
	private Integer uId;
	private String uName;
	private String uPassWord;
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassWord() {
		return uPassWord;
	}
	public void setuPassWord(String uPassWord) {
		this.uPassWord = uPassWord;
	}
	@Override
	public String toString() {
		return "UserInfo [uId=" + uId + ", uName=" + uName + ", uPassWord="
				+ uPassWord + "]";
	}
	
}
