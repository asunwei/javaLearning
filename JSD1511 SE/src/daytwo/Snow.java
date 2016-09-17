package daytwo;
		public class  Snow{
			 public String  jump(int x, int y) {
			    return "jump one";
			 }
			 public String jump(int[] vals) {
			    return "jump two";
			 }
			 public static void main(String[] args) {
			    Snow s=new Snow();
			    System.out.println(s.jump(4, 5));
			 }
	}

