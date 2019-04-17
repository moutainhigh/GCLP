package com.grape.model.db;

import java.io.Serializable;
import java.math.BigDecimal;

public class Assessmodel implements Serializable {
    private Integer id;

    private Float floatOnline;

    private BigDecimal tonevalueOnline;

    private BigDecimal lowervalueOnline;

    private Float floatBng;

    private BigDecimal tonevalueBng;

    private BigDecimal lowervalueBng;

    private BigDecimal tonevalueBng2;

    private BigDecimal lowervalueBng2;

    private Float floatCno;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getFloatOnline() {
        return floatOnline;
    }

    public void setFloatOnline(Float floatOnline) {
        this.floatOnline = floatOnline;
    }

    public BigDecimal getTonevalueOnline() {
        return tonevalueOnline;
    }

    public void setTonevalueOnline(BigDecimal tonevalueOnline) {
        this.tonevalueOnline = tonevalueOnline;
    }

    public BigDecimal getLowervalueOnline() {
        return lowervalueOnline;
    }

    public void setLowervalueOnline(BigDecimal lowervalueOnline) {
        this.lowervalueOnline = lowervalueOnline;
    }

    public Float getFloatBng() {
        return floatBng;
    }

    public void setFloatBng(Float floatBng) {
        this.floatBng = floatBng;
    }

    public BigDecimal getTonevalueBng() {
        return tonevalueBng;
    }

    public void setTonevalueBng(BigDecimal tonevalueBng) {
        this.tonevalueBng = tonevalueBng;
    }

    public BigDecimal getLowervalueBng() {
        return lowervalueBng;
    }

    public void setLowervalueBng(BigDecimal lowervalueBng) {
        this.lowervalueBng = lowervalueBng;
    }

    public BigDecimal getTonevalueBng2() {
        return tonevalueBng2;
    }

    public void setTonevalueBng2(BigDecimal tonevalueBng2) {
        this.tonevalueBng2 = tonevalueBng2;
    }

    public BigDecimal getLowervalueBng2() {
        return lowervalueBng2;
    }

    public void setLowervalueBng2(BigDecimal lowervalueBng2) {
        this.lowervalueBng2 = lowervalueBng2;
    }

    public Float getFloatCno() {
        return floatCno;
    }

    public void setFloatCno(Float floatCno) {
        this.floatCno = floatCno;
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
        Assessmodel other = (Assessmodel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFloatOnline() == null ? other.getFloatOnline() == null : this.getFloatOnline().equals(other.getFloatOnline()))
            && (this.getTonevalueOnline() == null ? other.getTonevalueOnline() == null : this.getTonevalueOnline().equals(other.getTonevalueOnline()))
            && (this.getLowervalueOnline() == null ? other.getLowervalueOnline() == null : this.getLowervalueOnline().equals(other.getLowervalueOnline()))
            && (this.getFloatBng() == null ? other.getFloatBng() == null : this.getFloatBng().equals(other.getFloatBng()))
            && (this.getTonevalueBng() == null ? other.getTonevalueBng() == null : this.getTonevalueBng().equals(other.getTonevalueBng()))
            && (this.getLowervalueBng() == null ? other.getLowervalueBng() == null : this.getLowervalueBng().equals(other.getLowervalueBng()))
            && (this.getTonevalueBng2() == null ? other.getTonevalueBng2() == null : this.getTonevalueBng2().equals(other.getTonevalueBng2()))
            && (this.getLowervalueBng2() == null ? other.getLowervalueBng2() == null : this.getLowervalueBng2().equals(other.getLowervalueBng2()))
            && (this.getFloatCno() == null ? other.getFloatCno() == null : this.getFloatCno().equals(other.getFloatCno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFloatOnline() == null) ? 0 : getFloatOnline().hashCode());
        result = prime * result + ((getTonevalueOnline() == null) ? 0 : getTonevalueOnline().hashCode());
        result = prime * result + ((getLowervalueOnline() == null) ? 0 : getLowervalueOnline().hashCode());
        result = prime * result + ((getFloatBng() == null) ? 0 : getFloatBng().hashCode());
        result = prime * result + ((getTonevalueBng() == null) ? 0 : getTonevalueBng().hashCode());
        result = prime * result + ((getLowervalueBng() == null) ? 0 : getLowervalueBng().hashCode());
        result = prime * result + ((getTonevalueBng2() == null) ? 0 : getTonevalueBng2().hashCode());
        result = prime * result + ((getLowervalueBng2() == null) ? 0 : getLowervalueBng2().hashCode());
        result = prime * result + ((getFloatCno() == null) ? 0 : getFloatCno().hashCode());
        return result;
    }
}