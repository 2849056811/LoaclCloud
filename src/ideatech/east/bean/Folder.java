package ideatech.east.bean;

public class Folder {
	private Integer folId;
	private String folName;
	private String folType;
	private String folSize;
	private String folPlace;
	private String folOccupySpace;
	private String folContain;
	private String folCreateTime;
	public Integer getFolid() {
		return folId;
	}
	public void setFolid(Integer folid) {
		this.folId = folid;
	}
	public String getFolName() {
		return folName;
	}
	public void setFolName(String folName) {
		this.folName = folName;
	}
	public String getFolType() {
		return folType;
	}
	public void setFolType(String folType) {
		this.folType = folType;
	}
	public String getFolSize() {
		return folSize;
	}
	public void setFolSize(String folSize) {
		this.folSize = folSize;
	}
	public String getFolPlace() {
		return folPlace;
	}
	public void setFolPlace(String folPlace) {
		this.folPlace = folPlace;
	}
	public String getFolOccupySpace() {
		return folOccupySpace;
	}
	public void setFolOccupySpace(String folOccupySpace) {
		this.folOccupySpace = folOccupySpace;
	}
	public String getFolContain() {
		return folContain;
	}
	public void setFolContain(String folContain) {
		this.folContain = folContain;
	}
	public String getFolCreateTime() {
		return folCreateTime;
	}
	public void setFolCreateTime(String folCreateTime) {
		this.folCreateTime = folCreateTime;
	}
	@Override
	public String toString() {
		return "Folder [folId=" + folId + ", folName=" + folName + ", folType="
				+ folType + ", folSize=" + folSize + ", folPlace=" + folPlace
				+ ", folOccupySpace=" + folOccupySpace + ", folContain="
				+ folContain + ", folCreateTime=" + folCreateTime + "]";
	}
}
