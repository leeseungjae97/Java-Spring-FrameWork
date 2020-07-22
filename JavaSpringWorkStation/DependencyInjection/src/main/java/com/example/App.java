package com.example;

import java.lang.reflect.Member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/example/config/AppContext.xml");
        ApplicationContext ctx = ClassPathXmlApplicationContext("AppContext.xml");
        MemberVO member = (MemberVO)ctx.getBean("member1");
        MemberVO member2 = (MemberVO)ctx.getBean("member2");
        System.out.println(member);
        System.out.println(member2);
    }
}
