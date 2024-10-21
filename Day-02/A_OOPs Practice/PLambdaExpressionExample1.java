// interface Say{
//     String say(String name);  
// }  
  
// public class PLambdaExpressionExample1{  
//     public static void main(String[] args) {  
      
//         Say s1=(name)->{  
//             return "Hello, "+name;  
//         };  
//         System.out.println(s1.say("Aditya Ranjan"));  
          
//         Say s2= name ->{  
//             return "Hello, "+name;  
//         };  
//         System.out.println(s2.say("Pradhan"));  
//     }  
// }  

interface Say{
    String say(String name);  
}  
  
public class PLambdaExpressionExample1{  
    public static void main(String[] args) {  
      
        Say s1=(name)->name; 
        System.out.println(s1.say("Aditya Ranjan"));  
          
        Say s2= name ->name;
        System.out.println(s2.say("Pradhan"));  
    }  
} 