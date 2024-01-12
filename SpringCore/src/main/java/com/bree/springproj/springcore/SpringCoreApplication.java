package com.bree.springproj.springcore;


import com.bree.springproj.springcore.DedanKimathi.School;
import com.bree.springproj.springcore.DedanKimathi.Student;
import com.bree.springproj.springcore.DedanKimathi.Teacher;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        School school = context.getBean("school", School.class);

        school.printInfo();
    }

}
