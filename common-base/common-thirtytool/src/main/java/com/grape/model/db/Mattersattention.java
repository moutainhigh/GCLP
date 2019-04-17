package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//注意事项表
public class Mattersattention implements Serializable {
	@Length(max=19,min=0,message="注意事项编号不能超出19位")
	@ApiModelProperty(value = "注意事项编号", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="贷款流水号不能超出10位")
	@ApiModelProperty(value = "贷款流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=10,min=0,message="尽调注意规则数量不能超出10位")
	@ApiModelProperty(value = "尽调注意规则数量", example = "", dataType="decimal(10,0)", required = true )
    private Long noticecount1;

	@Length(max=10,min=0,message="审批注意规则数量不能超出10位")
	@ApiModelProperty(value = "审批注意规则数量", example = "", dataType="decimal(10,0)", required = true )
    private Long noticecount2;

	@ApiModelProperty(value = "提示日期", example = "", dataType="datetime", required = true )
    private Date noticedate;

	@Length(max=2,min=0,message="注意事项类型不能超出2位")
	@ApiModelProperty(value = "注意事项类型", example = "", dataType="varchar(2)", required = true )
    private String noticetype;

	@ApiModelProperty(value = "尽调注意事项", example = "", dataType="text", required = true )
    private String notice1;

	@ApiModelProperty(value = "审批注意事项", example = "", dataType="text", required = true )
    private String notice2;

	@ApiModelProperty(value = "全部规则结果", example = "", dataType="text", required = true )
    private String notice3;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public Long getNoticecount1() {
        return noticecount1;
    }

    public void setNoticecount1(Long noticecount1) {
        this.noticecount1 = noticecount1;
    }

    public Long getNoticecount2() {
        return noticecount2;
    }

    public void setNoticecount2(Long noticecount2) {
        this.noticecount2 = noticecount2;
    }

    public Date getNoticedate() {
        return noticedate;
    }

    public void setNoticedate(Date noticedate) {
        this.noticedate = noticedate;
    }

    public String getNoticetype() {
        return noticetype;
    }

    public void setNoticetype(String noticetype) {
        this.noticetype = noticetype == null ? null : noticetype.trim();
    }

    public String getNotice1() {
        return notice1;
    }

    public void setNotice1(String notice1) {
        this.notice1 = notice1 == null ? null : notice1.trim();
    }

    public String getNotice2() {
        return notice2;
    }

    public void setNotice2(String notice2) {
        this.notice2 = notice2 == null ? null : notice2.trim();
    }

    public String getNotice3() {
        return notice3;
    }

    public void setNotice3(String notice3) {
        this.notice3 = notice3 == null ? null : notice3.trim();
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
        Mattersattention other = (Mattersattention) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getNoticecount1() == null ? other.getNoticecount1() == null : this.getNoticecount1().equals(other.getNoticecount1()))
            && (this.getNoticecount2() == null ? other.getNoticecount2() == null : this.getNoticecount2().equals(other.getNoticecount2()))
            && (this.getNoticedate() == null ? other.getNoticedate() == null : this.getNoticedate().equals(other.getNoticedate()))
            && (this.getNoticetype() == null ? other.getNoticetype() == null : this.getNoticetype().equals(other.getNoticetype()))
            && (this.getNotice1() == null ? other.getNotice1() == null : this.getNotice1().equals(other.getNotice1()))
            && (this.getNotice2() == null ? other.getNotice2() == null : this.getNotice2().equals(other.getNotice2()))
            && (this.getNotice3() == null ? other.getNotice3() == null : this.getNotice3().equals(other.getNotice3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getNoticecount1() == null) ? 0 : getNoticecount1().hashCode());
        result = prime * result + ((getNoticecount2() == null) ? 0 : getNoticecount2().hashCode());
        result = prime * result + ((getNoticedate() == null) ? 0 : getNoticedate().hashCode());
        result = prime * result + ((getNoticetype() == null) ? 0 : getNoticetype().hashCode());
        result = prime * result + ((getNotice1() == null) ? 0 : getNotice1().hashCode());
        result = prime * result + ((getNotice2() == null) ? 0 : getNotice2().hashCode());
        result = prime * result + ((getNotice3() == null) ? 0 : getNotice3().hashCode());
        return result;
    }
}
