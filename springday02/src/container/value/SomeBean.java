package container.value;

import java.io.Serializable;
/**
 * 使用spring表达式
 *
 */
public class SomeBean implements 
	Serializable{
	private String name;
	private String interest;
	private Double score;
	private int pageSize;
	public Double getScore() {
		return score;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "SomeBean [interest=" + interest + ", name=" + name
				+ ", pageSize=" + pageSize + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
