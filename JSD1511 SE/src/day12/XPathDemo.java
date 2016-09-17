package day12;

import java.io.File;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/**
 * 使用XPath快速检索XML文档中的信息
 */
public class XPathDemo {
	public static void main(String[] args) {
		try {
			SAXReader reader=new SAXReader();
			Document document=reader.read(new File("myemp.xml"));
			
//			List<Element> list=document.selectNodes("/list/emp[name='赵六']/age");
//			for(Element ele:list){
//			System.out.println(ele.getText());
//			}
			List<Attribute> list=document.selectNodes("/list/emp[name='赵六']/@id");
			for(Attribute att:list){
				System.out.println(att.getValue());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
