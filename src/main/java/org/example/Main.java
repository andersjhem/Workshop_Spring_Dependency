package org.example;




import org.example.config.ComponentScanConfig;
import org.example.util.UserInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static <StudentDao> void main(String[] args) {
        //AnnotationConfigApplicationContext context =
          //      new AnnotationConfigApplicationContext(ObjectInputFilter.Config.class);
        //StudentDao studentDao = (StudentDao) context.getBean(Student_Dao.class);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        UserInputService userInputService =context.getBean(UserInputService.class);


    }
}

