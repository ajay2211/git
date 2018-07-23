package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource rs=new ClassPathResource("test/Beans.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("test/Beans.xml");
		BeanFactory fact=new XmlBeanFactory(rs);
		PaymentContext cp=fact.getBean("p",PaymentContext.class);
		cp.pay(32732.00);


	}

}
