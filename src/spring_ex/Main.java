package spring_ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context 
			= new ClassPathXmlApplicationContext("context.xml");
		
		Object c = context.getBean("car");
		Object t = context.getBean("tire");
		
		System.out.println(c);
		System.out.println(t);
		
		Car c1 = (Car) c;
		System.out.println(c1.getTire());
	}
}
