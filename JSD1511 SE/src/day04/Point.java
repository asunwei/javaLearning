package day04;
/**
 * 泛型
 * 泛型是参数化类型，作用是将一个类中的属性的类型
 * 方法参数的类型，方法返回值的类型的定义权从当前类交给了
 * 使用当前类的使用者决定。从而提高了代码的灵活度
 * @author Administrator
 *
 */
public class Point<E> {
	private E x;
	private E y;
	public E getX() {
		return x;
	}
	public void setX(E x) {
		this.x = x;
	}
	public E getY() {
		return y;
	}
	public void setY(E y) {
		this.y = y;
	}
	public Point(E x, E y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "("+x+","+y+")"; 
	}
	
}
