package com.shiquanxi.springbootday1.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 配置文件下的每个属性值，映射到每个实现下面
 * @ConfigurationProperties：告诉sprngboot配置类中的每个属性和类中的所有属性进行绑定
 *     prefix ：配置文件中那个下面的所有属性进行对应
 *     **只有这个组见识容器的功能，才能使用容器提供的@ConfigurationProperties功能，
 *     必须添加@Component
 */
@Component
@ConfigurationProperties(prefix="student")
public class Student {

    private String name;
    private  Integer age;
    private Date birthday;
    private Map<String,Object> map;
    private List<String> list;
    private Dag dag;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                ", dag=" + dag +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Dag getDag() {
        return dag;
    }

    public void setDag(Dag dag) {
        this.dag = dag;
    }
}
