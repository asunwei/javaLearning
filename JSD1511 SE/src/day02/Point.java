package day02;
/*
 * java中所有的类都直接或者间接的继承自object，
 * object中 的方法是比较少的 
 * */
public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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
	/*
	 * 当我们需要使用当前类toString方法时，
	 * 就应该重写该方法，因为从Object那里继承
	 * 下来的toString返回的字符串没有任何意义
	 * toString返回的字符串格式根据需求定义即可
	 * 通常返回的字符串中应包含当前类的属性信息
	 * 以便通过该字符了解当前对象的相关信息
	 * */
	public String toString(){
		return "("+x+","+y+")";
	}
	/*
	 * 当我们用到当前类的equals方法时，就应当重写该方法
	 * 来定义比较原则，若不重写则直接使用Objec提供的方法，该方法使用==比较的
	 * 没有实际意义
	 * */
	public boolean equals(Object obj){
		if (obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Point){
			Point p=(Point)obj;
			return this.x==p.x&&this.y==p.y;
		}else{
			return false;
		}
	}
	 
}
