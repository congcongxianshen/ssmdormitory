package com.kj.base.entity;

import java.util.Date;

public class DepartEntity {
	 private String id;
	    
	    /**部门名称*/
	    private String departname;

	    /**部门描述*/
	    private String description;

	    /**上级部门*/
	    private String parentid;

	    /**创建时间*/
	    private Date createtime;

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id == null ? null : id.trim();
	    }

	    public String getDepartname() {
	        return departname;
	    }

	    public void setDepartname(String departname) {
	        this.departname = departname == null ? null : departname.trim();
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description == null ? null : description.trim();
	    }

	    public String getParentid() {
	        return parentid;
	    }

	    public void setParentid(String parentid) {
	        this.parentid = parentid == null ? null : parentid.trim();
	    }

	    public Date getCreatetime() {
	        return createtime;
	    }

	    public void setCreatetime(Date createtime) {
	        this.createtime = createtime;
	    }
}