//Client App
package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nt.comps.BlueDart;
import com.nt.comps.Flipkart;
import com.nt.singleton.Printer;

public class  AC_Container_Test1{

	public static void main(String[] args) {
		//create ApplicationContext Container
		 ClassPathXmlApplicationContext ctx=
				    new ClassPathXmlApplicationContext("com/nt/config/applicationContext.xml");
		System.out.println("_________________");
				//get Target spring bean class obj
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke b.method
		String msg=fpkt.shopping(new String[] {"shirt","trouser","belt"},
				                                             new double[] {1000.0,3000.0 ,500.0});
		System.out.println(msg);		
		
		
	}//main
}//class
