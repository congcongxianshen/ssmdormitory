package com.kj.base.entity;

import java.util.Date;

public class DormEntity {
	/**宿舍id*/
    private String id;

    /**宿舍名称*/
    private String dormname;

    /**宿舍床位数*/
    private Integer total;

    /**宿舍剩余床位数*/
    private Integer used;

    /**宿舍管理员*/
    private String dormadmin;

    /**备注*/
    private String remark;

    /**创建时间*/
    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDormname() {
        return dormname;
    }

    public void setDormname(String dormname) {
        this.dormname = dormname == null ? null : dormname.trim();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public String getDormadmin() {
        return dormadmin;
    }

    public void setDormadmin(String dormadmin) {
        this.dormadmin = dormadmin == null ? null : dormadmin.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}