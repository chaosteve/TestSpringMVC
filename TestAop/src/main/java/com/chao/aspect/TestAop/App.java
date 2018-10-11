package com.chao.aspect.TestAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class App
{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
 
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeManager manager = context.getBean(EmployeeManager.class);
 
        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeDTO());
    }
}