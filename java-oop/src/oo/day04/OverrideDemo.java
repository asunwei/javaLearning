package oo.day04;
//重写的演示
public class OverrideDemo {
	public static void main(String[] args) {
		/*
		 * 重写遵循"两同两小一大"原则:一般都是完全相同的
		 * 1.两同:
		 *   1)方法名相同
		 *   2)参数列表相同
		 * 2.两小:
		 *   1)子类的返回值类型小于或等于父类的
		 *     1.1)基本类型和void时，必须相同
		 *     1.2)引用类型时，小于或等于
		 *   2)子类抛出的异常小于或等于父类的--异常之后
		 * 3.一大:
		 *   1)子类的访问权限大于或等于父类的--访问控制修饰符后
		 */
	}
}

//父类大，子类小
class Aoo{
	void show(){}
	double say(){return 0.0;}
	Aoo get(){return null;}
	Boo test(){return null;}
}
class Boo extends Aoo{
	void show(){} //void时必须相同
	double say(){return 2.2;} //基本类型时必须相同
	//Boo get(){return null;} //正确的，小于
	//Aoo test(){return null;} //错误的，只能小于或等于
}








