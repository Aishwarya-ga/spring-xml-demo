/*From the aware-interface branch of spring-xml-demo repo create a bean-lifecycle branch.
*Add a BeanLifecycleDemoBean class in com.stackroute.demo that implements
*InitializingBean and DisposableBean.
*Override the required methods to print out messages.
*Define BeanLifecycleDemoBean as a bean in beans.xml.
* Add two methods customInit() and customDestroy() to the BeanLifecycleDemoBean class and print out custom messages.
*In the BeanLifecycleDemoBean bean definition, in beans.xml, set the customInit()
*and customDestroy() methods to be called*/
package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    //overridding the method of InitializingBean and DisposableBean
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertiesSet method");
    }
    public void destroy() throws Exception {
        System.out.println("Inside destroy method");
    }
    public void customInit() throws Exception {
        System.out.println("Inside customInit method");
    }
    public void customDestroy() throws Exception {
        System.out.println("Inside custom destroy method");
    }
}
