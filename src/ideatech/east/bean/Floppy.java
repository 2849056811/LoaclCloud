package ideatech.east.bean;

public class Floppy {
	private Integer floid;
	private String floName;
	private String floSize;
	private String floType;
	private String floFileType;
	private String floKnownSpace;
	private String floUsableSpace;
	public Integer getFloid() {
		return floid;
	}
	public void setFloid(Integer floid) {
		this.floid = floid;
	}
	public String getFloName() {
		return floName;
	}
	public void setFloName(String floName) {
		this.floName = floName;
	}
	public String getFloSize() {
		return floSize;
	}
	public void setFloSize(String floSize) {
		this.floSize = floSize;
	}
	public String getFloType() {
		return floType;
	}
	public void setFloType(String floType) {
		this.floType = floType;
	}
	public String getFloFileType() {
		return floFileType;
	}
	public void setFloFileType(String floFileType) {
		this.floFileType = floFileType;
	}
	public String getFloKnownSpace() {
		return floKnownSpace;
	}
	public void setFloKnownSpace(String floKnownSpace) {
		this.floKnownSpace = floKnownSpace;
	}
	public String getFloUsableSpace() {
		return floUsableSpace;
	}
	public void setFloUsableSpace(String floUsableSpace) {
		this.floUsableSpace = floUsableSpace;
	}
	@Override
	public String toString() {
		return "Floppy [floid=" + floid + ", floName=" + floName + ", floSize="
				+ floSize + ", floType=" + floType + ", floFileType="
				+ floFileType + ", floKnownSpace=" + floKnownSpace
				+ ", floUsableSpace=" + floUsableSpace + "]";
	}
}
