package com.itgaoshu.bean;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/*
* 实体类需要实现序列化接口,并把属性类型改为对应的包装类
*在类上使用@Table注解需要指定此实体类对应的表
* 在唯一属性上使用@id注解指定表中关联的主键
*如果表中字段名和属性名不一致需要使用@column注解指定关联字段名
*
* */
@Table(name="user1")
//实现序列化接口
public class User implements Serializable{
    @Id
    private  Integer uid;
    private  String uname;
    private Integer age;
    private Double salary;


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
