package day02;
/*
 * 和谐用语
 * */
public class StringDemo5 {
	public static void main(String[] args) {
		String regex="(wqnmlgb|cnm|nmb|nc|sb|djb)";
		String massage="wqnmlgb!你个sb!cnm!你就是一个djb";
		massage=massage.replaceAll(regex, "****");
		System.out.println(massage);
	}
}
