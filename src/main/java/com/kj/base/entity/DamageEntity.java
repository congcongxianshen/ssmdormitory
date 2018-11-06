package com.kj.base.entity;

import java.util.Date;

public class DamageEntity {
private String id;
	
	/**毁坏的宿舍id*/
	private String dormid;
	
	/**情况描述*/
    private String damagestation;

    /**毁坏时间*/
    private Date damagetime;
    
    /**修复时间*/
    private Date fixtime;
    
    /**备注*/
    private String remark;
    
    /**创建时间*/
    private Date createtime;
    
    /**是否修复*/
    private String isfixed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDormid() {
        return dormid;
    }

    public void setDormid(String dormid) {
        this.dormid = dormid == null ? null : dormid.trim();
    }
    public String getDamagestation() {
        return damagestation;
    }

    public void setDamagestation(String damagestation) {
        this.damagestation = damagestation == null ? null : damagestation.trim();
    }

    public Date getDamagetime() {
        return damagetime;
    }

    public void setDamagetime(Date damagetime) {
        this.damagetime = damagetime;
    }

    public Date getFixtime() {
        return fixtime;
    }

    public void setFixtime(Date fixtime) {
        this.fixtime = fixtime;
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

    public String getIsfixed() {
        return isfixed;
    }

    public void setIsfixed(String isfixed) {
        this.isfixed = isfixed == null ? null : isfixed.trim();
    }
}