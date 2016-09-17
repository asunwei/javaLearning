package oo.day03;
//T型与J型的测试类
public class TJTest {
	public static void main(String[] args) {
		Tetromino o1 = new T(2,5); //向上造型
		printWall(o1); //先造型再传值
		
		J o2 = new J(3,6);
		printWall(o2); //传值的同时造型
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














