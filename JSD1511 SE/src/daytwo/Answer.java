package daytwo;

public class Answer {
	int age=20;
public static void main(String[] args) {
	
	Answer ans=new Answer();
	ans.add(ans);
	System.out.println("ans:"+ans.age);
}
public void add(Answer ans){
	
	System.out.println("add"+ans.age++);
}
int a='a'+'b';
interface a{
	
}
interface b{
	
}
interface c extends a,b{
	
}

}


