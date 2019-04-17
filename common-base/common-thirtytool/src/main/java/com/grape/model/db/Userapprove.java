package com.grape.model.db;

import java.io.Serializable;
import java.math.BigDecimal;

public class Userapprove implements Serializable {
    private String arerid;

    private String channelno;

    private String userid;

    private String productno;

    private BigDecimal amtlow;

    private BigDecimal amthigh;

    private BigDecimal quotalow;

    private BigDecimal quotahigh;

    private static final long serialVersionUID = 1L;

    public String getArerid() {
        return arerid;
    }

    public void setArerid(String arerid) {
        this.arerid = arerid == null ? null : arerid.trim();
    }

    public String getChannelno() {
        return channelno;
    }

    public void setChannelno(String channelno) {
        this.channelno = channelno == null ? null : channelno.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public BigDecimal getAmtlow() {
        return amtlow;
    }

    public void setAmtlow(BigDecimal amtlow) {
        this.amtlow = amtlow;
    }

    public BigDecimal getAmthigh() {
        return amthigh;
    }

    public void setAmthigh(BigDecimal amthigh) {
        this.amthigh = amthigh;
    }

    public BigDecimal getQuotalow() {
        return quotalow;
    }

    public void setQuotalow(BigDecimal quotalow) {
        this.quotalow = quotalow;
    }

    public BigDecimal getQuotahigh() {
        return quotahigh;
    }

    public void setQuotahigh(BigDecimal quotahigh) {
        this.quotahigh = quotahigh;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Userapprove other = (Userapprove) that;
        return (this.getArerid() == null ? other.getArerid() == null : this.getArerid().equals(other.getArerid()))
            && (this.getChannelno() == null ? other.getChannelno() == null : this.getChannelno().equals(other.getChannelno()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getAmtlow() == null ? other.getAmtlow() == null : this.getAmtlow().equals(other.getAmtlow()))
            && (this.getAmthigh() == null ? other.getAmthigh() == null : this.getAmthigh().equals(other.getAmthigh()))
            && (this.getQuotalow() == null ? other.getQuotalow() == null : this.getQuotalow().equals(other.getQuotalow()))
            && (this.getQuotahigh() == null ? other.getQuotahigh() == null : this.getQuotahigh().equals(other.getQuotahigh()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArerid() == null) ? 0 : getArerid().hashCode());
        result = prime * result + ((getChannelno() == null) ? 0 : getChannelno().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getAmtlow() == null) ? 0 : getAmtlow().hashCode());
        result = prime * result + ((getAmthigh() == null) ? 0 : getAmthigh().hashCode());
        result = prime * result + ((getQuotalow() == null) ? 0 : getQuotalow().hashCode());
        result = prime * result + ((getQuotahigh() == null) ? 0 : getQuotahigh().hashCode());
        return result;
    }
}