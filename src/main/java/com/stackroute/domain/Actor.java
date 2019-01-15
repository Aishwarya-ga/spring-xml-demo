/*Actor has two String properties, name and gender, and an age property of type int.
*An Actor can be initialized with the three properties via the corresponding setter methods. Use
*property based injection in the bean definition file (beans.xml)
*/

package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;
    //getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
