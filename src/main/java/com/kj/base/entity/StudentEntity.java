package com.kj.base.entity;

import java.util.Date;

public class StudentEntity  {
private String id;
	
	/**班级id*/
	private String classid;
	
	/**宿舍id*/
	private String dormid;
	
	/**姓名*/
    private String name;
    
    /**性别*/
    private String sex;
    
    /**生日*/
    private Date birthday;
    
    /**qq*/
    private String qq;
    
    /**手机*/
    private String mobile;
    
    /**创建时间*/
    private Date createtime;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getDormid() {
        return dormid;
    }

    public void setDormid(String dormid) {
        this.dormid = dormid == null ? null : dormid.trim();
    }
}