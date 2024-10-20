package main;

//using java configuration file
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bean.studentt;
import resources.SpringConfig;

public class main 
{
    public static void main(String[] args) 
    {
        // here we use AnnotationConfigApplicationContext because we have added springcongig file, 
        // if have used xml file, then we use classPathXmlApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // studentt std = (studentt) context.getBean("stdId1");
        // std.display();

        studentt std1 = (studentt) context.getBean("Stdobj1");
        std1.display();
        
    }
    
}
