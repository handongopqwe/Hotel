package entity;

public class RmesCourse {
	private String  xz;
	private String Sh;
	private String Pdxz;
	private  String Pddj;
	private String Sc;
	public String getPddj() {
		return Pddj;
	}
	public void setPddj(String pddj) {
		Pddj = pddj;
	}
	
	
	public String getSc() {
		return Sc;
	}
	public void setSc(String sc) {
		Sc = sc;
	}
	public RmesCourse(String xz, String sh, String pdxz, String pddj, String sc) {
		super();
		this.xz = xz;
		Sh = sh;
		Pdxz = pdxz;
		Pddj = pddj;
		Sc = sc;
	}
	public RmesCourse() {
		super();
	}
	public String getPdxz() {
		return Pdxz;
	}
	public void setPdxz(String pdxz) {
		Pdxz = pdxz;
	}
	public String getXz() {
		return xz;
	}
	public void setXz(String xz) {
		this.xz = xz;
	}
	public String getSh() {
		return Sh;
	}
	public void setSh(String sh) {
		Sh = sh;
	}
	
}
