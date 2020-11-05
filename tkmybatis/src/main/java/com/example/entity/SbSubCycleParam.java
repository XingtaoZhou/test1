package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sb_sub_cycle_param")
public class SbSubCycleParam {
    /**
     * 法人编码
     */
    @Column(name = "LEGAL_PERSON_CODE")
    private String legalPersonCode;

    /**
     * 周期类型（0-自然月，1-天，2-季度）
     */
    @Column(name = "CYCLE_TYPE")
    private Integer cycleType;

    /**
     * 周期开始时间
     */
    @Column(name = "BEGIN_DATE")
    private Date beginDate;

    /**
     * 周期发放日（周期类型为自然月、季度时有效），清零类型时做为清零日
     */
    @Column(name = "CYCLE_DATE_DAY")
    private Integer cycleDateDay;

    /**
     * 发放的钱包
     */
    @Column(name = "WALLET_NO")
    private Integer walletNo;

    /**
     * 补助金额
     */
    @Column(name = "SUB_AMOUNT")
    private Integer subAmount;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 操作人id
     */
    @Column(name = "OP_ID")
    private Integer opId;

    /**
     * 是否启用
     */
    @Column(name = "IS_USE")
    private Short isUse;

    /**
     * 卡类型（1-16）
     */
    @Column(name = "CARD_TYPE")
    private Short cardType;

    /**
     * 周期数,(天最大366，季度最大4，月最大12)
     */
    @Column(name = "CYCLE_NUM")
    private Short cycleNum;

    /**
     * 类型（0-补助，1-清零）
     */
    @Column(name = "SUB_TYPE")
    private Short subType;

    /**
     * 任务结束时间
     */
    @Column(name = "END_DATE")
    private Date endDate;

    /**
     * 发放原因（0：没有限制，1：根据消费记录，2：根据考勤记录）
     */
    @Column(name = "SUB_FOR")
    private Short subFor;

    /**
     * 发放的时序（0：消费前，1：消费时，2：消费后）
     */
    @Column(name = "SUB_FOR_TIME")
    private Short subForTime;

    /**
     * 发放日期限制：0无限制，1跳过双休
     */
    @Column(name = "SUB_NOT_DAY")
    private Short subNotDay;

    /**
     * 发放的时序为1：消费时，2：消费后时有效，清零的类型有效
     */
    @Column(name = "SUB_TIME")
    private Date subTime;

    /**
     * 脱机补发是否有效（为0时脱机不补发）
     */
    @Column(name = "SUB_UNLINE_HOUR")
    private Short subUnlineHour;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 获取法人编码
     *
     * @return LEGAL_PERSON_CODE - 法人编码
     */
    public String getLegalPersonCode() {
        return legalPersonCode;
    }

    /**
     * 设置法人编码
     *
     * @param legalPersonCode 法人编码
     */
    public void setLegalPersonCode(String legalPersonCode) {
        this.legalPersonCode = legalPersonCode == null ? null : legalPersonCode.trim();
    }

    /**
     * 获取周期类型（0-自然月，1-天，2-季度）
     *
     * @return CYCLE_TYPE - 周期类型（0-自然月，1-天，2-季度）
     */
    public Integer getCycleType() {
        return cycleType;
    }

    /**
     * 设置周期类型（0-自然月，1-天，2-季度）
     *
     * @param cycleType 周期类型（0-自然月，1-天，2-季度）
     */
    public void setCycleType(Integer cycleType) {
        this.cycleType = cycleType;
    }

    /**
     * 获取周期开始时间
     *
     * @return BEGIN_DATE - 周期开始时间
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 设置周期开始时间
     *
     * @param beginDate 周期开始时间
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取周期发放日（周期类型为自然月、季度时有效），清零类型时做为清零日
     *
     * @return CYCLE_DATE_DAY - 周期发放日（周期类型为自然月、季度时有效），清零类型时做为清零日
     */
    public Integer getCycleDateDay() {
        return cycleDateDay;
    }

    /**
     * 设置周期发放日（周期类型为自然月、季度时有效），清零类型时做为清零日
     *
     * @param cycleDateDay 周期发放日（周期类型为自然月、季度时有效），清零类型时做为清零日
     */
    public void setCycleDateDay(Integer cycleDateDay) {
        this.cycleDateDay = cycleDateDay;
    }

    /**
     * 获取发放的钱包
     *
     * @return WALLET_NO - 发放的钱包
     */
    public Integer getWalletNo() {
        return walletNo;
    }

    /**
     * 设置发放的钱包
     *
     * @param walletNo 发放的钱包
     */
    public void setWalletNo(Integer walletNo) {
        this.walletNo = walletNo;
    }

    /**
     * 获取补助金额
     *
     * @return SUB_AMOUNT - 补助金额
     */
    public Integer getSubAmount() {
        return subAmount;
    }

    /**
     * 设置补助金额
     *
     * @param subAmount 补助金额
     */
    public void setSubAmount(Integer subAmount) {
        this.subAmount = subAmount;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取操作人id
     *
     * @return OP_ID - 操作人id
     */
    public Integer getOpId() {
        return opId;
    }

    /**
     * 设置操作人id
     *
     * @param opId 操作人id
     */
    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    /**
     * 获取是否启用
     *
     * @return IS_USE - 是否启用
     */
    public Short getIsUse() {
        return isUse;
    }

    /**
     * 设置是否启用
     *
     * @param isUse 是否启用
     */
    public void setIsUse(Short isUse) {
        this.isUse = isUse;
    }

    /**
     * 获取卡类型（1-16）
     *
     * @return CARD_TYPE - 卡类型（1-16）
     */
    public Short getCardType() {
        return cardType;
    }

    /**
     * 设置卡类型（1-16）
     *
     * @param cardType 卡类型（1-16）
     */
    public void setCardType(Short cardType) {
        this.cardType = cardType;
    }

    /**
     * 获取周期数,(天最大366，季度最大4，月最大12)
     *
     * @return CYCLE_NUM - 周期数,(天最大366，季度最大4，月最大12)
     */
    public Short getCycleNum() {
        return cycleNum;
    }

    /**
     * 设置周期数,(天最大366，季度最大4，月最大12)
     *
     * @param cycleNum 周期数,(天最大366，季度最大4，月最大12)
     */
    public void setCycleNum(Short cycleNum) {
        this.cycleNum = cycleNum;
    }

    /**
     * 获取类型（0-补助，1-清零）
     *
     * @return SUB_TYPE - 类型（0-补助，1-清零）
     */
    public Short getSubType() {
        return subType;
    }

    /**
     * 设置类型（0-补助，1-清零）
     *
     * @param subType 类型（0-补助，1-清零）
     */
    public void setSubType(Short subType) {
        this.subType = subType;
    }

    /**
     * 获取任务结束时间
     *
     * @return END_DATE - 任务结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置任务结束时间
     *
     * @param endDate 任务结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取发放原因（0：没有限制，1：根据消费记录，2：根据考勤记录）
     *
     * @return SUB_FOR - 发放原因（0：没有限制，1：根据消费记录，2：根据考勤记录）
     */
    public Short getSubFor() {
        return subFor;
    }

    /**
     * 设置发放原因（0：没有限制，1：根据消费记录，2：根据考勤记录）
     *
     * @param subFor 发放原因（0：没有限制，1：根据消费记录，2：根据考勤记录）
     */
    public void setSubFor(Short subFor) {
        this.subFor = subFor;
    }

    /**
     * 获取发放的时序（0：消费前，1：消费时，2：消费后）
     *
     * @return SUB_FOR_TIME - 发放的时序（0：消费前，1：消费时，2：消费后）
     */
    public Short getSubForTime() {
        return subForTime;
    }

    /**
     * 设置发放的时序（0：消费前，1：消费时，2：消费后）
     *
     * @param subForTime 发放的时序（0：消费前，1：消费时，2：消费后）
     */
    public void setSubForTime(Short subForTime) {
        this.subForTime = subForTime;
    }

    /**
     * 获取发放日期限制：0无限制，1跳过双休
     *
     * @return SUB_NOT_DAY - 发放日期限制：0无限制，1跳过双休
     */
    public Short getSubNotDay() {
        return subNotDay;
    }

    /**
     * 设置发放日期限制：0无限制，1跳过双休
     *
     * @param subNotDay 发放日期限制：0无限制，1跳过双休
     */
    public void setSubNotDay(Short subNotDay) {
        this.subNotDay = subNotDay;
    }

    /**
     * 获取发放的时序为1：消费时，2：消费后时有效，清零的类型有效
     *
     * @return SUB_TIME - 发放的时序为1：消费时，2：消费后时有效，清零的类型有效
     */
    public Date getSubTime() {
        return subTime;
    }

    /**
     * 设置发放的时序为1：消费时，2：消费后时有效，清零的类型有效
     *
     * @param subTime 发放的时序为1：消费时，2：消费后时有效，清零的类型有效
     */
    public void setSubTime(Date subTime) {
        this.subTime = subTime;
    }

    /**
     * 获取脱机补发是否有效（为0时脱机不补发）
     *
     * @return SUB_UNLINE_HOUR - 脱机补发是否有效（为0时脱机不补发）
     */
    public Short getSubUnlineHour() {
        return subUnlineHour;
    }

    /**
     * 设置脱机补发是否有效（为0时脱机不补发）
     *
     * @param subUnlineHour 脱机补发是否有效（为0时脱机不补发）
     */
    public void setSubUnlineHour(Short subUnlineHour) {
        this.subUnlineHour = subUnlineHour;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}