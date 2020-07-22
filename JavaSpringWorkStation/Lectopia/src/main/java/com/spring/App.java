package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AppContext.xml");

        Test ltp = ctx.getBean(Test.class);
        System.out.printf("%d %d %d", ltp.getKor(), ltp.getEng(), ltp.getMath());
        
    }
}
