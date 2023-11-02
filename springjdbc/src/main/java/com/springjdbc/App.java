package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);
       Student st1 =context.getBean("Student",Student.class);
    st1.insertData();
    }
}
