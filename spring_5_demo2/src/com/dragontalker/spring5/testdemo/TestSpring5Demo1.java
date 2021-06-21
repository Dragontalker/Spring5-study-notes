package com.dragontalker.spring5.testdemo;

import com.dragontalker.spring5.autoweb.Employee;
import com.dragontalker.spring5.bean.Order;
import com.dragontalker.spring5.collectiontype.Book;
import com.dragontalker.spring5.collectiontype.Course;
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
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        //book.test();
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void testFactoryBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testBean() {
        //ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("Step 6: 获取创建bean实例对象");
        System.out.println(order);

        //手动让bean实例销毁
        context.close();
    }

    @Test
    public void testEmployee() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
