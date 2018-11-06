package com.kj.base.entity;

import java.util.Date;

public class ResourceEntity {
	 private String id;

	    private Date createtime;

	    private String description;

	    private String href;

	    private String name;

	    private Integer orderNo;

	    private Integer resourcetype;

	    private String parentid;

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

	    public String getHref() {
	        return href;
	    }

	    public void setHref(String href) {
	        this.href = href == null ? null : href.trim();
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name == null ? null : name.trim();
	    }

	    public Integer getOrderNo() {
	        return orderNo;
	    }

	    public void setOrderNo(Integer orderNo) {
	        this.orderNo = orderNo;
	    }

	    public Integer getResourcetype() {
	        return resourcetype;
	    }

	    public void setResourcetype(Integer resourcetype) {
	        this.resourcetype = resourcetype;
	    }

	    public String getParentid() {
	        return parentid;
	    }

	    public void setParentid(String parentid) {
	        this.parentid = parentid == null ? null : parentid.trim();
	    }
}