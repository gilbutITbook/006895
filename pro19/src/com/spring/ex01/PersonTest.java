package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("person.xml"));
		PersonService person = (PersonService) factory.getBean("personService");
		// PersonService person = new PersonServiceImpl();
		person.sayHello();
	}

}
