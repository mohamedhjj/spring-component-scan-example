package com.boraji.tutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.boraji.tutorial.spring.config.AppConfig;
import com.boraji.tutorial.spring.service.EmployeeService;

/**
 * @author imssbora
 */
public class MainApp {
   public static void main(String[] args) {

      // Enabling auto component scanning using <context:component-scan/>
	   
	   // url tuto https://www.boraji.com/spring-4-auto-component-scanning-example
      System.out.println("---------------------------------");
      @SuppressWarnings("resource")
      ApplicationContext context1 = new ClassPathXmlApplicationContext("file:src/main/java/Beans.xml");
      EmployeeService service1 = context1.getBean(EmployeeService.class);
      service1.doSomething();

      // Enabling auto component scanning using @ComponentScan
      System.out.println("---------------------------------");
      @SuppressWarnings("resource")
      ApplicationContext context2=new AnnotationConfigApplicationContext(AppConfig.class);
      EmployeeService service2 = context2.getBean(EmployeeService.class);
      service2.doSomething();
      
   // Enabling auto component scanning using AnnotationConfigApplicationContext#scan()
      System.out.println("---------------------------------");
      AnnotationConfigApplicationContext context3=new AnnotationConfigApplicationContext();
      context3.scan("com.boraji.tutorial.spring.service");
      context3.scan("com.boraji.tutorial.spring.dao");
      context3.refresh();
      EmployeeService service3 = context3.getBean(EmployeeService.class);
      service3.doSomething();
      context3.close();
   }
}
