package edu.ccut.cn.domain;

/**
 * @ProjectName: crm
 * @ClassName: Customer
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-09 11:51
 */
public class Customer {

    private String id;
    private String username;
    private String gender;
    private String age;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
