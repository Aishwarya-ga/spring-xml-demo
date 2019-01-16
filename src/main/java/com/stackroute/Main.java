package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args){
        //Using ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) applicationContext.getBean("movie");
        Actor actor = movie.getActor();
        System.out.println(actor.getName()+" "+actor.getAge()+" "+actor.getGender());

        //register shutdownhook so that after main the object gets destroyed
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();

    }
}
