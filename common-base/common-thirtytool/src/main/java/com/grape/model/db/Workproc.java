package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//流程进度表
public class Workproc implements Serializable {
	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=80,min=0,message="流程类型不能超出80位")
	@ApiModelProperty(value = "流程类型", example = "", dataType="varchar(80)", required = true )
    private String process;

	@Length(max=9,min=0,message="部门编号不能超出9位")
	@ApiModelProperty(value = "部门编号", example = "", dataType="varchar(9)", required = true )
    private String departid;

	@Length(max=8,min=0,message="创建人不能超出8位")
	@ApiModelProperty(value = "创建人", example = "", dataType="varchar(8)", required = true )
    private String creator;

	@Length(max=8,min=0,message="创建日期不能超出8位")
	@ApiModelProperty(value = "创建日期", example = "", dataType="varchar(8)", required = true )
    private String createdate;

	@Length(max=6,min=0,message="创建时间不能超出6位")
	@ApiModelProperty(value = "创建时间", example = "", dataType="varchar(6)", required = true )
    private String createtime;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid == null ? null : departid.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
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
        Workproc other = (Workproc) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getProcess() == null ? other.getProcess() == null : this.getProcess().equals(other.getProcess()))
            && (this.getDepartid() == null ? other.getDepartid() == null : this.getDepartid().equals(other.getDepartid()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getProcess() == null) ? 0 : getProcess().hashCode());
        result = prime * result + ((getDepartid() == null) ? 0 : getDepartid().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}
