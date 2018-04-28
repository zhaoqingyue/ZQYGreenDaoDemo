package com.zqy.greendaodemo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by zhaoqy on 2018/4/28.
 */

@Entity
public class Student {

    @Id(autoincrement = true)
    private Long id;
    private String name;
    private int age;
    private String num;
    private String sex;

    @Generated(hash = 1556870573)
    public Student() {
    }

    @Generated(hash = 228704446)
    public Student(Long id, String name, int age, String num, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.num = num;
        this.sex = sex;
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNum() {
        return this.num;
    }
    public void setNum(String num) {
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
