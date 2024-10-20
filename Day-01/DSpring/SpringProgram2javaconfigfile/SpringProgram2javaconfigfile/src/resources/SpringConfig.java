package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bean.studentt;

@Configuration
public class SpringConfig 
{
    // @Bean
    // public studentt stdId1()
    // {
    //     studentt std = new studentt();
    //     std.setName("Aditya");
    //     std.setRollNo(103);
    //     std.setEmail("Adi@gmail.com");

    //     return std;
    // }

    @Bean("Stdobj1")
    public studentt createstdobj1()
    {
        studentt std = new studentt();
        std.setName("Aditya");
        std.setRollNo(103);
        std.setEmail("Adi@gmail.com");

        return std;
    }
    
}
