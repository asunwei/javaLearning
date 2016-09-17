package day05;
/**
 * 该类是用于测试作为集合元素时对集合的排序
 * 侵入性
 * @author Administrator
 *
 */
public class Point implements Comparable<Point>{
	private int x;
	private int y;
	public Point(){
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
	/**
	 * 该方法的作用是用于判断当前对象与给定的参数对象比较大小使用
	 * 
	 * 返回值不关心具体取值，只关心取值范围
	 * 当返回值>0：当前对象比参数对象大
	 * 当返回值<0:当前对象比参数对象小
	 * 当返回值=0：两个对象相等
	 */
	@Override
	public int compareTo(Point o) {
		//当前点到原点的距离
		int len=this.x*this.x+this.y*this.y;
		//当前o点到原点的距离
		int olen=o.x*o.x+o.y*o.y;
		return len-olen;
	}
}
