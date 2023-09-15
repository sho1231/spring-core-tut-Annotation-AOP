package org.example;

import org.example.pojos.Doctor;
import org.example.pojos.Staff;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        AbstractApplicationContext bean=new ClassPathXmlApplicationContext("config.xml");
        AbstractApplicationContext bean=new AnnotationConfigApplicationContext(Config.class);
        Doctor doctor=bean.getBean(Doctor.class);
        doctor.setName("MBBS");
        Doctor doctor1=bean.getBean(Doctor.class);
        doctor1.setName("MBBS1");
        System.out.println(doctor);
        System.out.println(doctor1);
    }
}
