package day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * 查找字符个数
 * @author Administrator
 *
 */
public class Homework2 {
	public static void main(String[] args) {
		String str="good good study,day day up";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(map.containsKey(c)){
				int n=map.get(c);
				n+=1;
				map.put(c, n);
				/*map.put(c, map.get(c)+1);*/
			}else{
				map.put(c, 1);
			}
			
		}
		System.out.println(map);
		//迭代key的形式
		Set<Character> keySet=map.keySet();
		for(char c:keySet){
			System.out.println(c);
		}
		//迭代key-Value的形式
		Set<Entry<Character,Integer>> entrySet=map.entrySet();
		for( Entry<Character,Integer> e:entrySet){
			char key=e.getKey();
			int value=e.getValue();
			System.out.println(key+":"+value);
		}
	}
}
