package com.example.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "score")
public class Score {
    /**
     * 主键自增
     */
    @Id
    private Integer id;

    /**
     * 学号
     */
    private String sno;

    /**
     * 课程号
     */
    private String cno;

    /**
     * 成绩
     */
    private BigDecimal degree;

    /**
     * 获取主键自增
     *
     * @return id - 主键自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键自增
     *
     * @param id 主键自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取学号
     *
     * @return sno - 学号
     */
    public String getSno() {
        return sno;
    }

    /**
     * 设置学号
     *
     * @param sno 学号
     */
    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    /**
     * 获取课程号
     *
     * @return cno - 课程号
     */
    public String getCno() {
        return cno;
    }

    /**
     * 设置课程号
     *
     * @param cno 课程号
     */
    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    /**
     * 获取成绩
     *
     * @return degree - 成绩
     */
    public BigDecimal getDegree() {
        return degree;
    }

    /**
     * 设置成绩
     *
     * @param degree 成绩
     */
    public void setDegree(BigDecimal degree) {
        this.degree = degree;
    }
}