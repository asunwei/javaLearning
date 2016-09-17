package container.annotation;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("stu")
public class Student implements Serializable {
	@Value("#{jdbc.pagesize}")
	private String pageSize;
	@Value("李白")
	private String name;


	public  String getPageSize() {
		return pageSize;
	}

	public  void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public Student() {
		System.out.println("Student的构造器...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", pageSize=" + pageSize + "]";
	}
	
}
