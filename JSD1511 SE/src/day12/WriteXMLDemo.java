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
 * ʹ��DOM����XML
 * @author Administrator
 *
 */
public class WriteXMLDemo {
	public static void main(String[] args) {
		try {
			List<Emp> list=new ArrayList<Emp>();
			list.add(new Emp(1,"����",22,"��",5000));
			list.add(new Emp(2,"����",23,"Ů",6000));
			list.add(new Emp(3,"����",24,"Ů",7000));
			list.add(new Emp(4,"����",25,"��",8000));
			list.add(new Emp(5,"Ǯ��",26,"��",9000));
			
			/*
			 * ����XML������
			 * 1������һ���յ�Document����
			 * 2����Document��������Ӹ�Ԫ��
			 * 3�����Ԫ����������ɲ㼶��Ԫ�أ��Դﵽ
			 *    XML�ĵ��ṹ��Ҫ��
			 * 4������XMLWriter����ָ��д����Ŀ�ĵ�
			 * 5��ͨ��XMLWriter��Document����д��
			 *    ��ô�ͻᰴ��Document���������Ľṹ
			 *    д����XML�ĵ���ʽ����
			 */
			//1
			Document document =DocumentHelper.createDocument();
			
			//2
			/*
			 * Document�ṩ����Ӹ�Ԫ�صķ���
			 * Element addElement(String name)
			 * ��ǰ�ļ������ָ�������ָ�Ԫ�أ�����
			 * ��Ԫ�ط��أ��Ա��������
			 * ��Ҫע����ǣ��÷���ֻ�ܵ���һ�Σ���Ϊһ���ĵ�
			 * ֻ��һ����Ԫ��
			 */
			Element root=document.addElement("list");
			
			//3
			for(Emp emp: list){
				//���Ԫ�������һ��emp��ǩ
				/*
				 * Elementͬ���ṩ��
				 * Element addElement(String name)
				 * ��ǰԪ�������ָ�����ֵ���Ԫ�أ�����
				 * ��Ԫ�ط���
				 */
				Element empEle=root.addElement("emp");
				//���name
				Element nameEle=empEle.addElement("name");
				nameEle.addText(emp.getName());
				//���age
				Element ageEle=empEle.addElement("age");
				ageEle.addText(emp.getAge()+"");
				//����Ա�
				Element genderEle=empEle.addElement("gender");
				genderEle.addText(emp.getGender());
				//��ӹ���
				Element salaryEle=empEle.addElement("salary");
				salaryEle.addText(emp.getSalary()+"");
				
				/*
				 * ��ǰ��ǩ�����ָ�������Լ�
				 * ��Ӧֵ������
				 */
				empEle.addAttribute("id", emp.getId()+"");
			}
			  //4 XMLWriter(OutputFormat.createPrettyPrint())��һ����������ʽд��		 
			  XMLWriter writer=new XMLWriter(OutputFormat.createPrettyPrint());
			  writer.setOutputStream(new FileOutputStream("myemp.xml"));
			  //5
			  writer.write(document);
			  
			  writer.close();
			  System.out.println("д����ϣ�");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
