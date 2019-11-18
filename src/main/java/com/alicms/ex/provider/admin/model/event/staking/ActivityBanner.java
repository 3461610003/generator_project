package com.alicms.ex.provider.admin.model.event.staking;

import java.util.Date;

public class ActivityBanner {
    private Long id;

    private String pcBanner;

    private String appBanner;

    private String h5Banner;

    private Date createTime;

    private Date updateTime;

    private Integer type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPcBanner() {
        return pcBanner;
    }

    public void setPcBanner(String pcBanner) {
        this.pcBanner = pcBanner == null ? null : pcBanner.trim();
    }

    public String getAppBanner() {
        return appBanner;
    }

    public void setAppBanner(String appBanner) {
        this.appBanner = appBanner == null ? null : appBanner.trim();
    }

    public String getH5Banner() {
        return h5Banner;
    }

    public void setH5Banner(String h5Banner) {
        this.h5Banner = h5Banner == null ? null : h5Banner.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}