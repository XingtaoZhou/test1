package com.example.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "student")
public class Student {
    /**
     * 学号(主码)
     */
    @Id
    private String sno;

    /**
     * 学生姓名
     */
    private String sname;

    /**
     * 学生性别
     */
    private String ssex;

    /**
     * 学生出生年月
     */
    private Date sbirthday;

    /**
     * 学生所在班级
     */
    private String sclass;

    /**
     * 获取学号(主码)
     *
     * @return sno - 学号(主码)
     */
    public String getSno() {
        return sno;
    }

    /**
     * 设置学号(主码)
     *
     * @param sno 学号(主码)
     */
    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    /**
     * 获取学生姓名
     *
     * @return sname - 学生姓名
     */
    public String getSname() {
        return sname;
    }

    /**
     * 设置学生姓名
     *
     * @param sname 学生姓名
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * 获取学生性别
     *
     * @return ssex - 学生性别
     */
    public String getSsex() {
        return ssex;
    }

    /**
     * 设置学生性别
     *
     * @param ssex 学生性别
     */
    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    /**
     * 获取学生出生年月
     *
     * @return sbirthday - 学生出生年月
     */
    public Date getSbirthday() {
        return sbirthday;
    }

    /**
     * 设置学生出生年月
     *
     * @param sbirthday 学生出生年月
     */
    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    /**
     * 获取学生所在班级
     *
     * @return sclass - 学生所在班级
     */
    public String getSclass() {
        return sclass;
    }

    /**
     * 设置学生所在班级
     *
     * @param sclass 学生所在班级
     */
    public void setSclass(String sclass) {
        this.sclass = sclass == null ? null : sclass.trim();
    }
}