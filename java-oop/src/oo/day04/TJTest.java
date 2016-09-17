package oo.day04;
//T型与J型的测试类
public class TJTest {
	public static void main(String[] args) {
		Tetromino t = new T(2,5); //向上造型(自动类型转换)
		t.print(); //看对象的类型
		
		J j = new J(0,1);
		j.print(); //看对象的类型
	}
	
	//打墙+打T型
	public static void printWall(Tetromino tt){
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				boolean flag = true; //1.假设打-
				for(int k=0;k<tt.cells.length;k++){
					if(i==tt.cells[k].row && j==tt.cells[k].col){
						flag = false; //2.改为打*
						break;
					}
				}
				if(flag==true){ //3.判断
					System.out.print("- ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	
}














