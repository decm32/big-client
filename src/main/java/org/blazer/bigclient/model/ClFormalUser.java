package org.blazer.bigclient.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cl_formal_user")
public class ClFormalUser {
    /**
     * 自动编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 手机号码
     */
    @Column(name = "phone_number")
    private Long phoneNumber;

    /**
     * 上报/分配
     */
    @Column(name = "report_or_allot")
    private String reportOrAllot;

    /**
     * 上报/分配时间
     */
    @Column(name = "report_or_allot_date")
    private String reportOrAllotDate;

    /**
     * 客户标识
     */
    @Column(name = "user_identify")
    private String userIdentify;

    /**
     * 是否删除;0:未删除，1:删除
     */
    @Column(name = "if_delete")
    private Integer ifDelete;

    /**
     * 是否业绩池（0：否，1：是）
     */
    @Column(name = "if_performance_pool")
    private Integer ifPerformancePool;

    /**
     * 更新时间
     */
    private Date mtime;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 获取自动编号
     *
     * @return id - 自动编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自动编号
     *
     * @param id 自动编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取手机号码
     *
     * @return phone_number - 手机号码
     */
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机号码
     *
     * @param phoneNumber 手机号码
     */
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取上报/分配
     *
     * @return report_or_allot - 上报/分配
     */
    public String getReportOrAllot() {
        return reportOrAllot;
    }

    /**
     * 设置上报/分配
     *
     * @param reportOrAllot 上报/分配
     */
    public void setReportOrAllot(String reportOrAllot) {
        this.reportOrAllot = reportOrAllot;
    }

    /**
     * 获取上报/分配时间
     *
     * @return report_or_allot_date - 上报/分配时间
     */
    public String getReportOrAllotDate() {
        return reportOrAllotDate;
    }

    /**
     * 设置上报/分配时间
     *
     * @param reportOrAllotDate 上报/分配时间
     */
    public void setReportOrAllotDate(String reportOrAllotDate) {
        this.reportOrAllotDate = reportOrAllotDate;
    }

    /**
     * 获取客户标识
     *
     * @return user_identify - 客户标识
     */
    public String getUserIdentify() {
        return userIdentify;
    }

    /**
     * 设置客户标识
     *
     * @param userIdentify 客户标识
     */
    public void setUserIdentify(String userIdentify) {
        this.userIdentify = userIdentify;
    }

    /**
     * 获取是否删除;0:未删除，1:删除
     *
     * @return if_delete - 是否删除;0:未删除，1:删除
     */
    public Integer getIfDelete() {
        return ifDelete;
    }

    /**
     * 设置是否删除;0:未删除，1:删除
     *
     * @param ifDelete 是否删除;0:未删除，1:删除
     */
    public void setIfDelete(Integer ifDelete) {
        this.ifDelete = ifDelete;
    }

    /**
     * 获取是否业绩池
     *
     * @return if_performance_pool - 是否业绩池
     */
    public Integer getIfPerformancePool() {
        return ifPerformancePool;
    }

    /**
     * 设置是否业绩池
     *
     * @param ifPerformancePool 是否业绩池
     */
    public void setIfPerformancePool(Integer ifPerformancePool) {
        this.ifPerformancePool = ifPerformancePool;
    }

    /**
     * 获取更新时间
     *
     * @return mtime - 更新时间
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * 设置更新时间
     *
     * @param mtime 更新时间
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}