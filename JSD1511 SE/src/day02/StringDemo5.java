package day02;
/*
 * ��г����
 * */
public class StringDemo5 {
	public static void main(String[] args) {
		String regex="(wqnmlgb|cnm|nmb|nc|sb|djb)";
		String massage="wqnmlgb!���sb!cnm!�����һ��djb";
		massage=massage.replaceAll(regex, "****");
		System.out.println(massage);
	}
}
