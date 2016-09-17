package day12;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用DOM解析XML
 * DOM：文档对象模型
 * 将XML对象以java中的对象形式表示
 * @author Administrator
 *
 */
public class ParseXMLDemo {
	public static void main(String[] args) {
		try {
			/*
			 * 使用DOM4J解析XML文档的流程
			 * 1：创建用于解析XML文档的类SAXReader
			 * 2：使用SAXReader读取要解析的文档
			 *    并将内容转换为一个Document对象表示
			 *    DOM操作耗时耗资源体现在这一步。
			 *    所有的内容存入到Document对象中，由于
			 *    java中对象存入内存，所以消耗内存
			 *    就体现在这里
			 * 3：通过Document对象获取文档根元素
			 * 4：根据XML的结构，结合需求通过根元素逐层获取
			 *    子元素，以达到获取XML中保存的数据的目的
			 */
			//1 org.dom4j
			SAXReader reader=new SAXReader();
			
			//2
			Document document =reader.read(new File("emplist.xml"));
			//3
			/*Document提供了获取根元素的方法
			 * Element getRootElement()
			 * 
			 * 每一个Element实例都是表示XML文档中的
			 * 一对标签
			 */
			Element root=document.getRootElement();
			
			//用来保存解析后的所有员工信息
			List<Emp> list=new ArrayList<Emp>();
			
			//4
			/*Elment提供了获取子元素的方法
			 * 
			 * List elements()
			 * 获取当前元素下的所有子元素
			 * 
			 * List elements(String name)
			 * 获取当前元素下所有同名的子元素
			 * 
			 * Element element(String name)
			 * 获取当前元素下只指定名字的子元素
			 * 
			 */
			/*
			 * 获取<list>根标签下的所有子标签
			 * 也就是若干的<emp>标签
			 * 
			 */
			
			List<Element> elements =root.elements();
			
			for(Element empEle:elements){
				//获取员工名字
				Element nameEle=empEle.element("name");
				/*
				 * Element还提供了获取文本类型
				 * 子元素的方法
				 * String getText()
				 */
				String name=nameEle.getText();
				
				//获取年龄
//				Element ageEle=empEle.element("age");
//				int age=Integer.parseInt(ageEle.getText());
				/*
				 * Element提供的方法
				 * String elemenText（String name）
				 * 获取当前标签下指定名字的子标签中间
				 * 的文本。等等同于上面两步
				 */
				int age=Integer.parseInt(empEle.elementText("age"));
				
				//获取性别
				String gender=empEle.elementText("gender");
				
				//获取工资
				int salary=Integer.parseInt(empEle.elementText("salary"));
				
				/*
				 *Element 提供了方法：
				 *Attribute attribute(String name)
				 *获取当前标签中指定名字的属性
				 *
				 * Attribute的每一个实例用于表示一个属性
				 * 常用方法：
				 * String getName() 获取属性名
				 * String getValue() 获取属性值
				 */
				Attribute arr=empEle.attribute("id");
				int id=Integer.parseInt(arr.getValue());
				/*
				 * 将一个<emp>标签中记录的员工信息存入一个
				 * 存入到emp对象中，再存入集合
				 */
				Emp emp=new Emp(id,name,age,gender,salary);
				list.add(emp);
			}
			System.out.println("list:"+list.size());
			for(Emp emp:list){
				System.out.println(emp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
