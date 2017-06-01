package com.sanmao.you.ui.beans;

/**
 * Created by DELL on 2017/5/15.
 */

public class UseBean {
    private String photo;
    private String name;
    private String age;
    private String sign;

    @Override
    public String toString() {
        return "UseBean{" +
                "photo='" + photo + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
