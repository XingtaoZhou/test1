package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "teacher")
public class Teacher {
    /**
     * 教工编号(主码)
     */
    @Id
    private String tno;

    /**
     * 教工姓名
     */
    private String tname;

    /**
     * 教工性别
     */
    private String tsex;

    /**
     * 教工出生年月
     */
    private Date tbirthday;

    /**
     * 职称
     */
    private String prof;

    /**
     * 教工所在部门
     */
    private String depart;

    /**
     * 获取教工编号(主码)
     *
     * @return tno - 教工编号(主码)
     */
    public String getTno() {
        return tno;
    }

    /**
     * 设置教工编号(主码)
     *
     * @param tno 教工编号(主码)
     */
    public void setTno(String tno) {
        this.tno = tno == null ? null : tno.trim();
    }

    /**
     * 获取教工姓名
     *
     * @return tname - 教工姓名
     */
    public String getTname() {
        return tname;
    }

    /**
     * 设置教工姓名
     *
     * @param tname 教工姓名
     */
    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    /**
     * 获取教工性别
     *
     * @return tsex - 教工性别
     */
    public String getTsex() {
        return tsex;
    }

    /**
     * 设置教工性别
     *
     * @param tsex 教工性别
     */
    public void setTsex(String tsex) {
        this.tsex = tsex == null ? null : tsex.trim();
    }

    /**
     * 获取教工出生年月
     *
     * @return tbirthday - 教工出生年月
     */
    public Date getTbirthday() {
        return tbirthday;
    }

    /**
     * 设置教工出生年月
     *
     * @param tbirthday 教工出生年月
     */
    public void setTbirthday(Date tbirthday) {
        this.tbirthday = tbirthday;
    }

    /**
     * 获取职称
     *
     * @return prof - 职称
     */
    public String getProf() {
        return prof;
    }

    /**
     * 设置职称
     *
     * @param prof 职称
     */
    public void setProf(String prof) {
        this.prof = prof == null ? null : prof.trim();
    }

    /**
     * 获取教工所在部门
     *
     * @return depart - 教工所在部门
     */
    public String getDepart() {
        return depart;
    }

    /**
     * 设置教工所在部门
     *
     * @param depart 教工所在部门
     */
    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }
}