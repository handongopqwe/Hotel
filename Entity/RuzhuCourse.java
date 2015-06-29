package entity;

public class RuzhuCourse {
  private String  xm;
  private String  sfid1;
  private String  Ruzhutime;
  private String  Ruzhufj;
  private int  yj;
  private String Rsh;

public RuzhuCourse() {
	super();
}

public RuzhuCourse(String xm, String sfid1, String ruzhutime, String ruzhufj,
		int yj, String rsh) {
	super();
	this.xm = xm;
	this.sfid1 = sfid1;
	Ruzhutime = ruzhutime;
	Ruzhufj = ruzhufj;
	this.yj = yj;
	Rsh = rsh;
}

public String getRsh() {
	return Rsh;
}

public void setRsh(String rsh) {
	Rsh = rsh;
}

public String getXm() {
	return xm;
}
public void setXm(String xm) {
	this.xm = xm;
}
public String getSfid1() {
	return sfid1;
}
public void setSfid1(String sfid1) {
	this.sfid1 = sfid1;
}
public String getRuzhutime() {
	return Ruzhutime;
}
public void setRuzhutime(String ruzhutime) {
	Ruzhutime = ruzhutime;
}
public String getRuzhufj() {
	return Ruzhufj;
}
public void setRuzhufj(String ruzhufj) {
	Ruzhufj = ruzhufj;
}
public int getYj() {
	return yj;
}
public void setYj(int yj) {
	this.yj = yj;
}
  
}