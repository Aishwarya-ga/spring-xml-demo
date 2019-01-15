/*Movie “has a” Actor that can be initialized via the corresponding setter method. Use property
* based object injection in the bean definition file (beans.xml)*/
package com.stackroute.domain;

public class Movie {
    public Movie(){}
    public Movie(Actor actor){
        this.actor = actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    Actor actor;

    public Actor getActor() {
        return actor;
    }
}
