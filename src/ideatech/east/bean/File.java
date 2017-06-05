package ideatech.east.bean;

public class File {
	private String filId;
	private String filName;
	private String filType;
	private String filSize;
	private String filPlace;
	private String filOccupySpace;
	private String filUpdateTime;
	private String filVisitTime;
	public String getFilId() {
		return filId;
	}
	public void setFilId(String filId) {
		this.filId = filId;
	}
	public String getFilName() {
		return filName;
	}
	public void setFilName(String filName) {
		this.filName = filName;
	}
	public String getFilType() {
		return filType;
	}
	public void setFilType(String filType) {
		this.filType = filType;
	}
	public String getFilSize() {
		return filSize;
	}
	public void setFilSize(String filSize) {
		this.filSize = filSize;
	}
	public String getFilPlace() {
		return filPlace;
	}
	public void setFilPlace(String filPlace) {
		this.filPlace = filPlace;
	}
	public String getFilOccupySpace() {
		return filOccupySpace;
	}
	public void setFilOccupySpace(String filOccupySpace) {
		this.filOccupySpace = filOccupySpace;
	}
	public String getFilUpdateTime() {
		return filUpdateTime;
	}
	public void setFilUpdateTime(String filUpdateTime) {
		this.filUpdateTime = filUpdateTime;
	}
	public String getFilVisitTime() {
		return filVisitTime;
	}
	public void setFilVisitTime(String filVisitTime) {
		this.filVisitTime = filVisitTime;
	}
	@Override
	public String toString() {
		return "File [filId=" + filId + ", filName=" + filName + ", filType="
				+ filType + ", filSize=" + filSize + ", filPlace=" + filPlace
				+ ", filOccupySpace=" + filOccupySpace + ", filUpdateTime="
				+ filUpdateTime + ", filVisitTime=" + filVisitTime + "]";
	}
}
