package com.example.entity;

import javax.persistence.*;

@Table(name = "course")
public class Course {
    /**
     * 课程号(主码)
     */
    @Id
    private String cno;

    /**
     * 课程名称
     */
    private String cname;

    /**
     * 教工编号
     */
    private String tno;

    /**
     * 获取课程号(主码)
     *
     * @return cno - 课程号(主码)
     */
    public String getCno() {
        return cno;
    }

    /**
     * 设置课程号(主码)
     *
     * @param cno 课程号(主码)
     */
    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    /**
     * 获取课程名称
     *
     * @return cname - 课程名称
     */
    public String getCname() {
        return cname;
    }

    /**
     * 设置课程名称
     *
     * @param cname 课程名称
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * 获取教工编号
     *
     * @return tno - 教工编号
     */
    public String getTno() {
        return tno;
    }

    /**
     * 设置教工编号
     *
     * @param tno 教工编号
     */
    public void setTno(String tno) {
        this.tno = tno == null ? null : tno.trim();
    }
}