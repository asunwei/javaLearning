package day12;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * 使用DOM生成XML
 * @author Administrator
 *
 */
public class WriteXMLDemo {
	public static void main(String[] args) {
		try {
			List<Emp> list=new ArrayList<Emp>();
			list.add(new Emp(1,"张三",22,"男",5000));
			list.add(new Emp(2,"李四",23,"女",6000));
			list.add(new Emp(3,"王五",24,"女",7000));
			list.add(new Emp(4,"赵六",25,"男",8000));
			list.add(new Emp(5,"钱七",26,"男",9000));
			
			/*
			 * 生成XML的流程
			 * 1：创建一个空的Document对象
			 * 2：向Document对象中添加根元素
			 * 3：向根元素中添加若干层级子元素，以达到
			 *    XML文档结构的要求
			 * 4：创建XMLWriter，并指定写出的目的地
			 * 5：通过XMLWriter将Document对象写出
			 *    那么就会按照Document对象描述的结构
			 *    写出成XML文档格式样子
			 */
			//1
			Document document =DocumentHelper.createDocument();
			
			//2
			/*
			 * Document提供了添加根元素的方法
			 * Element addElement(String name)
			 * 向当前文件中添加指定的名字根元素，并将
			 * 该元素返回，以便后续操作
			 * 需要注意的是，该方法只能调用一次，因为一个文档
			 * 只有一个根元素
			 */
			Element root=document.addElement("list");
			
			//3
			for(Emp emp: list){
				//向根元素中添加一个emp标签
				/*
				 * Element同样提供了
				 * Element addElement(String name)
				 * 向当前元素中添加指定名字的子元素，并将
				 * 该元素返回
				 */
				Element empEle=root.addElement("emp");
				//添加name
				Element nameEle=empEle.addElement("name");
				nameEle.addText(emp.getName());
				//添加age
				Element ageEle=empEle.addElement("age");
				ageEle.addText(emp.getAge()+"");
				//添加性别
				Element genderEle=empEle.addElement("gender");
				genderEle.addText(emp.getGender());
				//添加工资
				Element salaryEle=empEle.addElement("salary");
				salaryEle.addText(emp.getSalary()+"");
				
				/*
				 * 向当前标签中添加指定名字以及
				 * 对应值的属性
				 */
				empEle.addAttribute("id", emp.getId()+"");
			}
			  //4 XMLWriter(OutputFormat.createPrettyPrint())加一个参数按格式写出		 
			  XMLWriter writer=new XMLWriter(OutputFormat.createPrettyPrint());
			  writer.setOutputStream(new FileOutputStream("myemp.xml"));
			  //5
			  writer.write(document);
			  
			  writer.close();
			  System.out.println("写出完毕！");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
