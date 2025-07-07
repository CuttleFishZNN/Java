package com.cuttlefish._04mybatis.pojo.entity;

import java.util.Date;

public class Weibo {
    private int id;

    private String content;

    private Date created;

    private int userId;

    public Weibo(String content, Date created, int userId) {
        this.content = content;
        this.created = created;
        this.userId = userId;
    }

    public Weibo(int id, String content, Date created, int userId) {
        this.id = id;
        this.content = content;
        this.created = created;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "weibo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                '}';
    }
}
