package oo.day01;
//������
public class Cell {
	int row; //�к�
	int col; //�к�
	
	void drop(){ //����һ��
		row++;
	}
	void moveLeft(int n){ //����n��
		col-=n;
	}
	String getCellInfo(){ //��ȡ�кź��к�
		return row+","+col;
	}
}










