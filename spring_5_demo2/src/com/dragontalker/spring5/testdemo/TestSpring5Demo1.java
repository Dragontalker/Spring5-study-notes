package com.dragontalker.spring5.testdemo;

import com.dragontalker.spring5.collectiontype.Book;
import com.dragontalker.spring5.collectiontype.Student;
import com.dragontalker.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {

    @Test
    public void testCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student", Student.class);
        student.test();
    }

    @Test
    public void testBookList() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }

    @Test
    public void testFactoryBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println(myBean);
    }
}
