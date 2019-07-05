package com.dulianbin.springboot.entity;




import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.dulianbin.springboot.entity.enums.AgeEnum;
import com.dulianbin.springboot.entity.enums.PhoneEnum;

import java.util.Date;

/**
 * 用户表
 */
@SuppressWarnings("serial")
public class User extends SuperEntity<User> {


    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private AgeEnum age;
    /**
     * 这里故意演示注解可无
     */
    @TableField("test_type")
    @TableLogic
    private Integer testType;

    private Date testDate;

    private Long role;
    private PhoneEnum phone;

    private Integer tenantId;

    public User() {
    }

    public User(Long id, String name, AgeEnum age, Integer testType, Integer tenantId) {
        this.setId(id);
        this.name = name;
        this.age = age;
        this.testType = testType;
        this.tenantId=tenantId;
    }

    public User(String name, AgeEnum age, Integer testType,Integer tenantId ) {
        this.name = name;
        this.age = age;
        this.testType = testType;
        this.tenantId=tenantId;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgeEnum getAge() {
        return this.age;
    }

    public void setAge(AgeEnum age) {
        this.age = age;
    }

    public Integer getTestType() {
        return this.testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public Long getRole() {
        return this.role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    public PhoneEnum getPhone() {
        return this.phone;
    }

    public void setPhone(PhoneEnum phone) {
        this.phone = phone;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "User [id=" + this.getId() + ", name=" + name + ", age=" + age
                + ", testType=" + testType + ", testDate="
                + testDate + ", role=" + role + ", phone=" + phone + "]";
    }

}
