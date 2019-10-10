package com.boraji.tutorial.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boraji.tutorial.spring.dao.EmployeeDao;

@Service
public class EmployeeService {

   @Autowired
   private EmployeeDao employeeDao;
   
   public void doSomething(){
      System.out.println("Inside EmployeeService's doSomething() method.");
      employeeDao.doSomething();
   }
}
