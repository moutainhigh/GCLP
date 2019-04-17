package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//
public class Bnkincomeinfo implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="身份证号码不能超出19位")
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(19)", required = true )
    private String cerdid;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=40,min=0,message="薪资来源不能超出40位")
	@ApiModelProperty(value = "薪资来源", example = "", dataType="varchar(40)", required = true )
    private String amountsource;

	@Length(max=4,min=0,message="收入计算方式不能超出4位")
	@ApiModelProperty(value = "收入计算方式", example = "", dataType="varchar(4)", required = true )
    private String incomeway;

	@Length(max=80,min=0,message="所属银行不能超出80位")
	@ApiModelProperty(value = "所属银行", example = "", dataType="varchar(80)", required = true )
    private String bnkname;

	@Length(max=17,min=0,message="月流水金额不能超出17位")
	@ApiModelProperty(value = "月流水金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal amount;

	@Length(max=19,min=0,message="银行账户不能超出19位")
	@ApiModelProperty(value = "银行账户", example = "", dataType="varchar(19)", required = true )
    private String bnkaccount;

	@ApiModelProperty(value = "流水日期", example = "", dataType="datetime", required = true )
    private Date incomedate;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=80,min=0,message="其他所属银行不能超出80位")
	@ApiModelProperty(value = "其他所属银行", example = "", dataType="varchar(80)", required = true )
    private String banname2;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCerdid() {
        return cerdid;
    }

    public void setCerdid(String cerdid) {
        this.cerdid = cerdid == null ? null : cerdid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getAmountsource() {
        return amountsource;
    }

    public void setAmountsource(String amountsource) {
        this.amountsource = amountsource == null ? null : amountsource.trim();
    }

    public String getIncomeway() {
        return incomeway;
    }

    public void setIncomeway(String incomeway) {
        this.incomeway = incomeway == null ? null : incomeway.trim();
    }

    public String getBnkname() {
        return bnkname;
    }

    public void setBnkname(String bnkname) {
        this.bnkname = bnkname == null ? null : bnkname.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBnkaccount() {
        return bnkaccount;
    }

    public void setBnkaccount(String bnkaccount) {
        this.bnkaccount = bnkaccount == null ? null : bnkaccount.trim();
    }

    public Date getIncomedate() {
        return incomedate;
    }

    public void setIncomedate(Date incomedate) {
        this.incomedate = incomedate;
    }

    public String getChgtl() {
        return chgtl;
    }

    public void setChgtl(String chgtl) {
        this.chgtl = chgtl == null ? null : chgtl.trim();
    }

    public Date getChgdt() {
        return chgdt;
    }

    public void setChgdt(Date chgdt) {
        this.chgdt = chgdt;
    }

    public String getBanname2() {
        return banname2;
    }

    public void setBanname2(String banname2) {
        this.banname2 = banname2 == null ? null : banname2.trim();
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
        Bnkincomeinfo other = (Bnkincomeinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCerdid() == null ? other.getCerdid() == null : this.getCerdid().equals(other.getCerdid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getAmountsource() == null ? other.getAmountsource() == null : this.getAmountsource().equals(other.getAmountsource()))
            && (this.getIncomeway() == null ? other.getIncomeway() == null : this.getIncomeway().equals(other.getIncomeway()))
            && (this.getBnkname() == null ? other.getBnkname() == null : this.getBnkname().equals(other.getBnkname()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getBnkaccount() == null ? other.getBnkaccount() == null : this.getBnkaccount().equals(other.getBnkaccount()))
            && (this.getIncomedate() == null ? other.getIncomedate() == null : this.getIncomedate().equals(other.getIncomedate()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getBanname2() == null ? other.getBanname2() == null : this.getBanname2().equals(other.getBanname2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCerdid() == null) ? 0 : getCerdid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getAmountsource() == null) ? 0 : getAmountsource().hashCode());
        result = prime * result + ((getIncomeway() == null) ? 0 : getIncomeway().hashCode());
        result = prime * result + ((getBnkname() == null) ? 0 : getBnkname().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getBnkaccount() == null) ? 0 : getBnkaccount().hashCode());
        result = prime * result + ((getIncomedate() == null) ? 0 : getIncomedate().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getBanname2() == null) ? 0 : getBanname2().hashCode());
        return result;
    }
}
