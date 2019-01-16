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

//        Movie movie1 = (Movie) applicationContext.getBean("movie1");
//        Actor actor1 = movie1.getActor();
//        System.out.println(actor1.getName()+" "+actor1.getAge()+" "+actor1.getGender());
//
//        Movie movie2 = (Movie) applicationContext.getBean("movie2");
//        Actor actor2 = movie2.getActor();
//        System.out.println(actor2.getName()+" "+actor2.getAge()+" "+actor2.getGender());
//
//        Movie movie3 = (Movie) applicationContext.getBean("movie3");
//        Actor actor3 = movie3.getActor();
//        System.out.println(actor3.getName()+" "+actor3.getAge()+" "+actor3.getGender());
//
//        //System.out.println(movie2==movie3);
//
//        Movie movieA = (Movie) applicationContext.getBean("movieA");
//        Actor actorA = movieA.getActor();
//        System.out.println(actorA.getName()+" "+actorA.getAge()+" "+actorA.getGender());
//
//        Movie movieB = (Movie) applicationContext.getBean("movieB");
//        Actor actorB = movieB.getActor();
//        System.out.println(actorB.getName()+" "+actorB.getAge()+" "+actorB.getGender());
        //register shutdownhook so that after main the object gets destroyed
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();

    }
}
