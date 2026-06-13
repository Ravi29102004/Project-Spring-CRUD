package com.example;

import com.example.Config.AppConfig;
import com.example.Controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        UserController controller=context.getBean(UserController.class);
        controller.createUser("Ravi");
        controller.createUser("Rohit");
        controller.listUser();
    }
}
