package oo.day05;
//求一组图形中的最大面积
public class ShapeTest {
	public static void main(String[] args) {
		//Shape s1 = new Shape(); //编译错误，抽象类不能被实例化
		Shape[] shapes = new Shape[4]; //创建Shape数组对象
		shapes[0] = new Circle(1); //向上造型
		shapes[1] = new Circle(2); 
		shapes[2] = new Square(1); 
		shapes[3] = new Square(2); 
		maxArea(shapes);
	}
	public static void maxArea(Shape[] shapes){ //求最大面积
		double max = shapes[0].area(); //最大面积
		int maxIndex = 0; //最大面积下标
		for(int i=1;i<shapes.length;i++){
			double area = shapes[i].area();
			if(area>max){
				max = area;
				maxIndex = i;
			}
		}
		System.out.println("最大面积为:"+max+"，所在索引为:"+maxIndex);
	}
}

abstract class Shape{ //抽象类-不完整
	protected double c; //周长
	public abstract double area(); //抽象方法-不完整
}
class Square extends Shape{
	public Square(double c){
		this.c = c;
	}
	public double area(){ //重写--变不完整为完整
		return 0.0625*c*c;
	}
}
class Circle extends Shape{  //0.0796
	public Circle(double c){
		this.c = c;
	}
	public double area(){
		return 0.0796*c*c;
	}
}








