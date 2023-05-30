package com.gsreenu;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.gsreenu")
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ctx=new AnnotationConfigApplicationContext(App.class);
    /* Employee a=(Employee)ctx.getBean(Employee.class);
      a.print();*/
      ProductBean a=(ProductBean)ctx.getBean(ProductBean.class);
      a.printpro();
    }
}
