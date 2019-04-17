package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//null
public class Proctask implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String taskid;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String productno;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String nodeid;

	@Length(max=2,min=0,message="不能超出2位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(2)", required = true )
    private String runflg;

	@Length(max=2,min=0,message="任务状态不能超出2位")
	@ApiModelProperty(value = "任务状态", example = "", dataType="varchar(2)", required = true )
    private String state;

	@Length(max=8,min=0,message="不能超出8位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "", example = "", dataType="datetime", required = true )
    private Date chgtm;

    private static final long serialVersionUID = 1L;

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getRunflg() {
        return runflg;
    }

    public void setRunflg(String runflg) {
        this.runflg = runflg == null ? null : runflg.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getChgtl() {
        return chgtl;
    }

    public void setChgtl(String chgtl) {
        this.chgtl = chgtl == null ? null : chgtl.trim();
    }

    public Date getChgtm() {
        return chgtm;
    }

    public void setChgtm(Date chgtm) {
        this.chgtm = chgtm;
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
        Proctask other = (Proctask) that;
        return (this.getTaskid() == null ? other.getTaskid() == null : this.getTaskid().equals(other.getTaskid()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getRunflg() == null ? other.getRunflg() == null : this.getRunflg().equals(other.getRunflg()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgtm() == null ? other.getChgtm() == null : this.getChgtm().equals(other.getChgtm()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskid() == null) ? 0 : getTaskid().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getRunflg() == null) ? 0 : getRunflg().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgtm() == null) ? 0 : getChgtm().hashCode());
        return result;
    }
}
