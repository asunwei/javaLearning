package day12;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * ʹ��DOM����XML
 * DOM���ĵ�����ģ��
 * ��XML������java�еĶ�����ʽ��ʾ
 * @author Administrator
 *
 */
public class ParseXMLDemo {
	public static void main(String[] args) {
		try {
			/*
			 * ʹ��DOM4J����XML�ĵ�������
			 * 1���������ڽ���XML�ĵ�����SAXReader
			 * 2��ʹ��SAXReader��ȡҪ�������ĵ�
			 *    ��������ת��Ϊһ��Document�����ʾ
			 *    DOM������ʱ����Դ��������һ����
			 *    ���е����ݴ��뵽Document�����У�����
			 *    java�ж�������ڴ棬���������ڴ�
			 *    ������������
			 * 3��ͨ��Document�����ȡ�ĵ���Ԫ��
			 * 4������XML�Ľṹ���������ͨ����Ԫ������ȡ
			 *    ��Ԫ�أ��Դﵽ��ȡXML�б�������ݵ�Ŀ��
			 */
			//1 org.dom4j
			SAXReader reader=new SAXReader();
			
			//2
			Document document =reader.read(new File("emplist.xml"));
			//3
			/*Document�ṩ�˻�ȡ��Ԫ�صķ���
			 * Element getRootElement()
			 * 
			 * ÿһ��Elementʵ�����Ǳ�ʾXML�ĵ��е�
			 * һ�Ա�ǩ
			 */
			Element root=document.getRootElement();
			
			//������������������Ա����Ϣ
			List<Emp> list=new ArrayList<Emp>();
			
			//4
			/*Elment�ṩ�˻�ȡ��Ԫ�صķ���
			 * 
			 * List elements()
			 * ��ȡ��ǰԪ���µ�������Ԫ��
			 * 
			 * List elements(String name)
			 * ��ȡ��ǰԪ��������ͬ������Ԫ��
			 * 
			 * Element element(String name)
			 * ��ȡ��ǰԪ����ָֻ�����ֵ���Ԫ��
			 * 
			 */
			/*
			 * ��ȡ<list>����ǩ�µ������ӱ�ǩ
			 * Ҳ�������ɵ�<emp>��ǩ
			 * 
			 */
			
			List<Element> elements =root.elements();
			
			for(Element empEle:elements){
				//��ȡԱ������
				Element nameEle=empEle.element("name");
				/*
				 * Element���ṩ�˻�ȡ�ı�����
				 * ��Ԫ�صķ���
				 * String getText()
				 */
				String name=nameEle.getText();
				
				//��ȡ����
//				Element ageEle=empEle.element("age");
//				int age=Integer.parseInt(ageEle.getText());
				/*
				 * Element�ṩ�ķ���
				 * String elemenText��String name��
				 * ��ȡ��ǰ��ǩ��ָ�����ֵ��ӱ�ǩ�м�
				 * ���ı����ȵ�ͬ����������
				 */
				int age=Integer.parseInt(empEle.elementText("age"));
				
				//��ȡ�Ա�
				String gender=empEle.elementText("gender");
				
				//��ȡ����
				int salary=Integer.parseInt(empEle.elementText("salary"));
				
				/*
				 *Element �ṩ�˷�����
				 *Attribute attribute(String name)
				 *��ȡ��ǰ��ǩ��ָ�����ֵ�����
				 *
				 * Attribute��ÿһ��ʵ�����ڱ�ʾһ������
				 * ���÷�����
				 * String getName() ��ȡ������
				 * String getValue() ��ȡ����ֵ
				 */
				Attribute arr=empEle.attribute("id");
				int id=Integer.parseInt(arr.getValue());
				/*
				 * ��һ��<emp>��ǩ�м�¼��Ա����Ϣ����һ��
				 * ���뵽emp�����У��ٴ��뼯��
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
