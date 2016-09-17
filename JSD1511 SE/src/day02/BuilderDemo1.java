package day02;
/**
 * StringBuilder的演示
 */
public class BuilderDemo1 {
	public static void main(String[] args) {
		String str="摩擦摩擦!";
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.toString());
		/*
		 * 调用toString方法可以获取当前的
		 * StringBuilder表示的字符串内容；
		 * */
		/*str=sb.toString();*/
		/*
		 * 摩擦摩擦！是魔鬼的步伐！
		 * 使用append方法可以在当前的末尾追加新的内容
		 * */
		sb.append("是魔鬼的步伐！");
		System.out.println(sb.toString());
		/*
		 * 一步两步，摩擦摩擦！是魔鬼的步伐!
		 * 使用insert方法可以在当前的字符串中间插入新内容*/
		sb.insert(0,"一步两步，");
		System.out.println(sb.toString());
		/*一步两步，一步一步似爪牙！摩擦摩擦！是魔鬼的步伐!
		 * 使用replace方法可以修改当前字符串的内容（替换）
		 * 通常在JAVA API中用两个数字标识范围时，都n是“含头不含尾”的
		 * */
		sb.replace(4, 5,"!一步一步似爪牙！");
		System.out.println(sb.toString());
		/*一步两步，一步一步似爪牙！摩擦摩擦！是魔鬼的步伐!
		 * 一步两步！一步一步似爪牙！是魔鬼的步伐！
		 * 使用delete方法可以删除当前的字符串部分内容*/
		sb.delete(13,18);
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
		String st="上海自来水来自海上";
		StringBuilder ss=new StringBuilder(st);
		ss.reverse();
		System.out.println(ss.toString());
	}
}
