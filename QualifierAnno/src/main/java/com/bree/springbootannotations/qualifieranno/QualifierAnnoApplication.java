package com.bree.springbootannotations.qualifieranno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@SpringBootApplication
public class QualifierAnnoApplication {

    @Autowired
    @Qualifier("mathTeacher")
    private Teacher mathTeacher;

  /*  @Autowired
    @Qualifier("scienceTeacher")
    private Teacher scienceTeacher;*/

    public static void main(String[] args) {

        //var context = SpringApplication.run(QualifierAnnoApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QualifierAnnoApplication.class);
        QualifierAnnoApplication qualifierAnnoApplication = context.getBean(QualifierAnnoApplication.class);
        System.out.println("Math Teacher: " + qualifierAnnoApplication.mathTeacher.teach());
        //System.out.println("Science Teacher: " + qualifierAnnoApplication.scienceTeacher.teach());

        context.close();
    }

}
