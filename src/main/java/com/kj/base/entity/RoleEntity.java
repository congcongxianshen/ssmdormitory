package com.kj.base.entity;

import java.util.Date;

public class RoleEntity {
	 private String id;
	    
	    /**创建时间*/
	    private Date createtime;
	    
	    /**描述*/
	    private String description;
	    
	    /**角色名*/
	    private String name;

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id == null ? null : id.trim();
	    }

	    public Date getCreatetime() {
	        return createtime;
	    }

	    public void setCreatetime(Date createtime) {
	        this.createtime = createtime;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description == null ? null : description.trim();
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name == null ? null : name.trim();
	    }
}