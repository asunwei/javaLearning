package lianxi;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape[] shaps=new Shape[6];
		shaps[0]=new Six(1);
		shaps[1]=new Six(2);
		shaps[2]=new Square(1);
		shaps[3]=new Square(2);
		shaps[4]=new Circle(1);
		shaps[5]=new Circle(2);
		maxArea(shaps);
	}
	public static void maxArea(Shape[] shaps){
		double max=shaps[0].area();
		int maxIndex=0;
		for(int i=0;i<shaps.length;i++){
			double area=shaps[i].area();
			if(max<area){
				max=area;
				maxIndex=i;
			}
		}
		System.out.println("最大面积为："+max+",最大值索引为："+maxIndex);		
	}

}
abstract class Shape{
	protected double c;
	public abstract double area();
}
class Six extends Shape{
	public Six(double c){
		this.c=c;
	}
	public double area(){
		return 0.0721*c*c;
	}
}
class Square extends Shape{
	public Square(double c){
		this.c=c;
	}
	public double area(){
		return 0.065*c*c;
	}
}
class Circle extends Shape{
	public Circle(double c){
		this.c=c;
	}
	public double area(){
		return 0.0796*c*c;
	}
}