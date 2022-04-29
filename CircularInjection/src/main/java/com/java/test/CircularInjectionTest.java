package com.java.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.java.beans.A;

public class CircularInjectionTest {

	public static void main(String[] args) {
		
		//create IOC container
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/java/confgs/applicationContext.xml"));
		
	   // get spring bean class obj ref
		A a1 = (A)factory.getBean("a1");
		System.out.println(a1);
	}
}
