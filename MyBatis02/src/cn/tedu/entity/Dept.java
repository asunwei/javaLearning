package cn.tedu.entity;

import java.io.Serializable;
/**
 * Java Bean
 * 1.有包
 * 2.序列化接口
 * 3.Bean属性方法get、set方法
 * 4.无参构造器
 */
public class Dept implements Serializable{
	private String dname;
	private String loc;
	private int deptNo;
	public Dept() {
		System.out.println("Dept无参方法执行了...");
	}
	
	public Dept(int deptNo,String dname, String loc) {
		System.out.println("Dept有参方法执行了...");
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
