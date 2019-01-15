/*Add a BeanPostProcessorDemoBean class in com.stackroute.demo that implements BeanPostProcessor
*Override the required methods to print out messages.
*Define BeanLifecycleDemoBean as a bean in beans.xml.*/
package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    //method for Post processing
    public  Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Inside postProcessBeforeInitialization method : "+beanName);
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Inside postProcessAfterInitialization method: " +beanName);
        return bean;
    }
}
