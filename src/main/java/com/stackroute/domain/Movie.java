/*Movie “has a” Actor that can be initialized via the corresponding setter method. Use property
* based object injection in the bean definition file (beans.xml)*/
package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    Actor actor;
    public Movie(){}
    public Movie(Actor actor){
        this.actor = actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor() {
        return actor;
    }
    //implementing method in ApplicationContextAware
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Movie movie = (Movie) applicationContext.getBean("movie");
        System.out.println("From application context: "+movie.getActor().getName()+" "+movie.getActor().getGender()+" "+movie.getActor().getAge());
    }
    //implementing method in BeanNameAware
    public void setBeanName(String beanName){
        System.out.println("Bean name: "+" "+ beanName);
    }
    //implementing method in BeanFactoryAware
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Movie movie = (Movie) beanFactory.getBean("movie");
        System.out.println("From beanFactory: " + movie.getActor().getName() + " " + movie.getActor().getAge() + " " + movie.getActor().getGender());
    }
}
