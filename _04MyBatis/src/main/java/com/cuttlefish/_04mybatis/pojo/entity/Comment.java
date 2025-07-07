package com.cuttlefish._04mybatis.pojo.entity;

import java.util.Date;

public class Comment {
    private Long id;

    private String content;

    private Date created;

    private Long userId;

    private Long weiboId;

    public Comment(String content, Date created, Long userId, Long weiboId) {
        this.content = content;
        this.created = created;
        this.userId = userId;
        this.weiboId = weiboId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(Long weiboId) {
        this.weiboId = weiboId;
    }

    @Override
    public String toString() {
        return "comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                ", weiboId=" + weiboId +
                '}';
    }
}
