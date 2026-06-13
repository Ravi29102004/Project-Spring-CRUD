package com.example.Config;


import com.example.DataBase.DataBaseConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.example")

public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanup")

    public DataBaseConnection dataBaseConnection(){
        return new DataBaseConnection();
    }
}
