package org.springframework.gs_maven;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class App 
{
public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
    }
}
