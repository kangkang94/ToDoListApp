package model;

import java.io.Serializable;

/**
 * Created by kangyuhang on 18-5-3.
 * 用户类
 */
public class Person implements Serializable{
    private String name;
    private String password;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
