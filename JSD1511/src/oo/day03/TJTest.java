package oo.day03;
//T����J�͵Ĳ�����
public class TJTest {
	public static void main(String[] args) {
		Tetromino o1 = new T(2,5); //��������
		printWall(o1); //�������ٴ�ֵ
		
		J o2 = new J(3,6);
		printWall(o2); //��ֵ��ͬʱ����
	}
	
	//��ǽ+��T��
	public static void printWall(Tetromino tt){
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				boolean flag = true; //1.�����-
				for(int k=0;k<tt.cells.length;k++){
					if(i==tt.cells[k].row && j==tt.cells[k].col){
						flag = false; //2.��Ϊ��*
						break;
					}
				}
				if(flag==true){ //3.�ж�
					System.out.print("- ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	
}














