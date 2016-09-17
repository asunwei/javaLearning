package day06;
/**
 * 该类用于测试一个类的equals方法与hashCode方法的重写
 * 在HashMap中作为Key的类的equals方法与hashCode方法
 * 的执行结果对HashMap的查询性能起着决定性作用
 * 当两个Key的hashCode值相同并put到HashMap中时
 * 若两个key的equals比较为true：
 * 那么就是替换value的操作
 * 若两个key的equals比较为false：
 * 那么他们在HashMap内部数组的同一个位置，
 * 这时该位置上的两个Entry会形成链表结构
 * 遍历链表会降低HashMap的检索性能，应当避免
 * 
 * JavaAPI手册上对于重写Object的equals方法与equals方法有说明：
 * 1：hashCode方法返回值应该是一个稳定值，意思是，当一个对象中参与
 * 与equals方法比较的属性值没有发生改变的前提下，多次调用hashCode方法
 * 返回的数字应该相同
 * 2:当我们重写一个类的equals方法就应当连同重写hashCode方法，并应当遵循：
 * 两个对象的equals方法比较为true，那么hashCode值应当相同
 * 两个对象的equals方法比较为false，hashCode值最好不同，否则会影响
 * HashMap的查询性能
 * 
 * Java提供的类作为key都没有问题，他们都已经重写
 * @author Administrator
 *
 */
public class Key {
	private int x;
	private int y;
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
	public Key(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
