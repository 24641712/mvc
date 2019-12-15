package com.example.mvc.entity;

import java.util.List;

/**
 * @version 1.0
 * @Description :
 * Copyright: Copyright (c)2019
 * Company: Tope
 * Created Date : 2019/9/8
 */
public class Student {
    private long id;

    private String name;

    private String sex;

    private int age;

    private List<String> contacts;

    public List<String> getContacts()
    {
        return contacts;
    }

    public void setContacts(List<String> contacts)
    {
        this.contacts = contacts;
    }

    public Student(){
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", sex='" + sex + '\'' + ", age=" + age + ", contacts=" + contacts + '}';
    }
}
