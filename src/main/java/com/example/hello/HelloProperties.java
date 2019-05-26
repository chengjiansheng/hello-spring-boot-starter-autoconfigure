package com.example.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ChengJianSheng
 * @date 2019-05-26
 */
@ConfigurationProperties("my.hello")
public class HelloProperties {

    private String name;

    private Integer age;

    private String hometown;

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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "HelloProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
