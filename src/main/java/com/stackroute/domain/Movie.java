/*Movie “has a” Actor that can be initialized via the corresponding setter method. Use property
* based object injection in the bean definition file (beans.xml)*/
package com.stackroute.domain;

public class Movie {
    Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor() {
        return actor;
    }
}
