package cn.tedu.entity;

import java.io.Serializable;
/**
 * Java Bean
 * 1.�а�
 * 2.���л��ӿ�
 * 3.Bean���Է���get��set����
 * 4.�޲ι�����
 */
public class Dept implements Serializable{
	private String dname;
	private String loc;
	private int deptNo;
	public Dept() {
		System.out.println("Dept�޲η���ִ����...");
	}
	
	public Dept(int deptNo,String dname, String loc) {
		System.out.println("Dept�вη���ִ����...");
		this.dname = dname;
		this.loc = loc;
		this.deptNo = deptNo;
	}

	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", dname=" + dname + ", loc=" + loc
				+ "]";
	}
	
	
}
