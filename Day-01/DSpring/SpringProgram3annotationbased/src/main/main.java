package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.studenttt;

public class main 
{
    public static void main(String[] args) 
    {
        String filepath ="/resources/applicationContext.xml"; 
        ApplicationContext contextt = new ClassPathXmlApplicationContext(filepath);
        studenttt std = (studenttt) contextt.getBean("studenttt");
        std.display();
        
    }
    
}
