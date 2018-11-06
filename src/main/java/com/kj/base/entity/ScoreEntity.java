package com.kj.base.entity;

import java.util.Date;

public class ScoreEntity {
private String id;
	
	/**宿舍id*/
	private String dormid;
	
	/**分数*/
    private Integer score;
    
    /**打分日期*/
    private Date scoredate;
    
    /**创建时间*/
    private Date createtime;
    

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
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getScoredate() {
        return scoredate;
    }

    public void setScoredate(Date scoredate) {
        this.scoredate = scoredate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}