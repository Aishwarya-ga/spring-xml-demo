/*Movie “has a” Actor that can be initialized via the corresponding setter method. Use property
* based object injection in the bean definition file (beans.xml)*/
package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie {
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
}
