package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Groomapproval implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="关联审批历史id不能超出19位")
	@ApiModelProperty(value = "关联审批历史id", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "", dataType="varchar(8)", required = true )
    private String userid;

	@Length(max=6,min=0,message="节点id不能超出6位")
	@ApiModelProperty(value = "节点id", example = "", dataType="varchar(6)", required = true )
    private String nodeid;

	@Length(max=1,min=0,message="债权回购承诺函是否收取不能超出1位")
	@ApiModelProperty(value = "债权回购承诺函是否收取", example = "", dataType="char(1)", required = true )
    private String debtbackflg;

	@Length(max=300,min=0,message="债权回购承诺函是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "债权回购承诺函是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String debtbacknote;

	@Length(max=1,min=0,message="推荐函是否回收不能超出1位")
	@ApiModelProperty(value = "推荐函是否回收", example = "", dataType="char(1)", required = true )
    private String groombackflg;

	@Length(max=300,min=0,message="推荐函是否回收情况说明不能超出300位")
	@ApiModelProperty(value = "推荐函是否回收情况说明", example = "", dataType="varchar(300)", required = true )
    private String groombacknote;

	@Length(max=300,min=0,message="渠道保证金是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "渠道保证金是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String chanpromisenote;

	@Length(max=1,min=0,message="渠道保证金是否收取不能超出1位")
	@ApiModelProperty(value = "渠道保证金是否收取", example = "", dataType="char(1)", required = true )
    private String chanpromiseflg;

	@Length(max=1,min=0,message="提前放款申请书是否收取不能超出1位")
	@ApiModelProperty(value = "提前放款申请书是否收取", example = "", dataType="char(1)", required = true )
    private String preoutloanbackflg;

	@Length(max=300,min=0,message="提前放款申请书是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "提前放款申请书是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String preoutloanbacknote;

	@Length(max=300,min=0,message="审批意见不能超出300位")
	@ApiModelProperty(value = "审批意见", example = "", dataType="varchar(300)", required = true )
    private String notation;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getDebtbackflg() {
        return debtbackflg;
    }

    public void setDebtbackflg(String debtbackflg) {
        this.debtbackflg = debtbackflg == null ? null : debtbackflg.trim();
    }

    public String getDebtbacknote() {
        return debtbacknote;
    }

    public void setDebtbacknote(String debtbacknote) {
        this.debtbacknote = debtbacknote == null ? null : debtbacknote.trim();
    }

    public String getGroombackflg() {
        return groombackflg;
    }

    public void setGroombackflg(String groombackflg) {
        this.groombackflg = groombackflg == null ? null : groombackflg.trim();
    }

    public String getGroombacknote() {
        return groombacknote;
    }

    public void setGroombacknote(String groombacknote) {
        this.groombacknote = groombacknote == null ? null : groombacknote.trim();
    }

    public String getChanpromisenote() {
        return chanpromisenote;
    }

    public void setChanpromisenote(String chanpromisenote) {
        this.chanpromisenote = chanpromisenote == null ? null : chanpromisenote.trim();
    }

    public String getChanpromiseflg() {
        return chanpromiseflg;
    }

    public void setChanpromiseflg(String chanpromiseflg) {
        this.chanpromiseflg = chanpromiseflg == null ? null : chanpromiseflg.trim();
    }

    public String getPreoutloanbackflg() {
        return preoutloanbackflg;
    }

    public void setPreoutloanbackflg(String preoutloanbackflg) {
        this.preoutloanbackflg = preoutloanbackflg == null ? null : preoutloanbackflg.trim();
    }

    public String getPreoutloanbacknote() {
        return preoutloanbacknote;
    }

    public void setPreoutloanbacknote(String preoutloanbacknote) {
        this.preoutloanbacknote = preoutloanbacknote == null ? null : preoutloanbacknote.trim();
    }

    public String getNotation() {
        return notation;
    }

    public void setNotation(String notation) {
        this.notation = notation == null ? null : notation.trim();
    }

    public Date getChgdt() {
        return chgdt;
    }

    public void setChgdt(Date chgdt) {
        this.chgdt = chgdt;
    }

    public String getChgtl() {
        return chgtl;
    }

    public void setChgtl(String chgtl) {
        this.chgtl = chgtl == null ? null : chgtl.trim();
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
        Groomapproval other = (Groomapproval) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getDebtbackflg() == null ? other.getDebtbackflg() == null : this.getDebtbackflg().equals(other.getDebtbackflg()))
            && (this.getDebtbacknote() == null ? other.getDebtbacknote() == null : this.getDebtbacknote().equals(other.getDebtbacknote()))
            && (this.getGroombackflg() == null ? other.getGroombackflg() == null : this.getGroombackflg().equals(other.getGroombackflg()))
            && (this.getGroombacknote() == null ? other.getGroombacknote() == null : this.getGroombacknote().equals(other.getGroombacknote()))
            && (this.getChanpromisenote() == null ? other.getChanpromisenote() == null : this.getChanpromisenote().equals(other.getChanpromisenote()))
            && (this.getChanpromiseflg() == null ? other.getChanpromiseflg() == null : this.getChanpromiseflg().equals(other.getChanpromiseflg()))
            && (this.getPreoutloanbackflg() == null ? other.getPreoutloanbackflg() == null : this.getPreoutloanbackflg().equals(other.getPreoutloanbackflg()))
            && (this.getPreoutloanbacknote() == null ? other.getPreoutloanbacknote() == null : this.getPreoutloanbacknote().equals(other.getPreoutloanbacknote()))
            && (this.getNotation() == null ? other.getNotation() == null : this.getNotation().equals(other.getNotation()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogid() == null) ? 0 : getLogid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getDebtbackflg() == null) ? 0 : getDebtbackflg().hashCode());
        result = prime * result + ((getDebtbacknote() == null) ? 0 : getDebtbacknote().hashCode());
        result = prime * result + ((getGroombackflg() == null) ? 0 : getGroombackflg().hashCode());
        result = prime * result + ((getGroombacknote() == null) ? 0 : getGroombacknote().hashCode());
        result = prime * result + ((getChanpromisenote() == null) ? 0 : getChanpromisenote().hashCode());
        result = prime * result + ((getChanpromiseflg() == null) ? 0 : getChanpromiseflg().hashCode());
        result = prime * result + ((getPreoutloanbackflg() == null) ? 0 : getPreoutloanbackflg().hashCode());
        result = prime * result + ((getPreoutloanbacknote() == null) ? 0 : getPreoutloanbacknote().hashCode());
        result = prime * result + ((getNotation() == null) ? 0 : getNotation().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
