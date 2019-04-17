package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//逾期跟进表
public class Overduefollow implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=8,min=0,message="跟进人不能超出8位")
	@ApiModelProperty(value = "跟进人", example = "", dataType="varchar(8)", required = true )
    private String followman;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=80,min=0,message="逾期客户不能超出80位")
	@ApiModelProperty(value = "逾期客户", example = "", dataType="varchar(80)", required = true )
    private String overduecust;

	@Length(max=17,min=0,message="逾期金额不能超出17位")
	@ApiModelProperty(value = "逾期金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueamount;

	@Length(max=4,min=0,message="逾期天数不能超出4位")
	@ApiModelProperty(value = "逾期天数", example = "", dataType="varchar(4)", required = true )
    private String overdueday;

	@ApiModelProperty(value = "跟进日期", example = "", dataType="datetime", required = true )
    private Date followdate;

	@ApiModelProperty(value = "跟进内容", example = "", dataType="longtext", required = true )
    private String followcontent;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFollowman() {
        return followman;
    }

    public void setFollowman(String followman) {
        this.followman = followman == null ? null : followman.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getOverduecust() {
        return overduecust;
    }

    public void setOverduecust(String overduecust) {
        this.overduecust = overduecust == null ? null : overduecust.trim();
    }

    public BigDecimal getOverdueamount() {
        return overdueamount;
    }

    public void setOverdueamount(BigDecimal overdueamount) {
        this.overdueamount = overdueamount;
    }

    public String getOverdueday() {
        return overdueday;
    }

    public void setOverdueday(String overdueday) {
        this.overdueday = overdueday == null ? null : overdueday.trim();
    }

    public Date getFollowdate() {
        return followdate;
    }

    public void setFollowdate(Date followdate) {
        this.followdate = followdate;
    }

    public String getFollowcontent() {
        return followcontent;
    }

    public void setFollowcontent(String followcontent) {
        this.followcontent = followcontent == null ? null : followcontent.trim();
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
        Overduefollow other = (Overduefollow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFollowman() == null ? other.getFollowman() == null : this.getFollowman().equals(other.getFollowman()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getOverduecust() == null ? other.getOverduecust() == null : this.getOverduecust().equals(other.getOverduecust()))
            && (this.getOverdueamount() == null ? other.getOverdueamount() == null : this.getOverdueamount().equals(other.getOverdueamount()))
            && (this.getOverdueday() == null ? other.getOverdueday() == null : this.getOverdueday().equals(other.getOverdueday()))
            && (this.getFollowdate() == null ? other.getFollowdate() == null : this.getFollowdate().equals(other.getFollowdate()))
            && (this.getFollowcontent() == null ? other.getFollowcontent() == null : this.getFollowcontent().equals(other.getFollowcontent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFollowman() == null) ? 0 : getFollowman().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getOverduecust() == null) ? 0 : getOverduecust().hashCode());
        result = prime * result + ((getOverdueamount() == null) ? 0 : getOverdueamount().hashCode());
        result = prime * result + ((getOverdueday() == null) ? 0 : getOverdueday().hashCode());
        result = prime * result + ((getFollowdate() == null) ? 0 : getFollowdate().hashCode());
        result = prime * result + ((getFollowcontent() == null) ? 0 : getFollowcontent().hashCode());
        return result;
    }
}
