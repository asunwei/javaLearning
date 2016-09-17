package controller;
/**
 * spring会将请求参数值自动转换为实际参数值
 * 注：
 *   转换过程可能出错
 *
 */
public class BmiParam {
	private double height;
	private double weight;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
