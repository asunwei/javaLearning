package oo.day04;
//T����J�͵Ĳ�����
public class TJTest {
	public static void main(String[] args) {
		Tetromino t = new T(2,5); //��������(�Զ�����ת��)
		t.print(); //�����������
		
		J j = new J(0,1);
		j.print(); //�����������
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














