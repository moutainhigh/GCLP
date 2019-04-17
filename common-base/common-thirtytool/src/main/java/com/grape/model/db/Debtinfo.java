package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//负债信息表
public class Debtinfo implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=32,min=0,message="身份证号码不能超出32位")
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=12,min=0,message="负债类型不能超出12位")
	@ApiModelProperty(value = "负债类型", example = "", dataType="varchar(12)", required = true )
    private String debttype;

	@Length(max=80,min=0,message="借款人不能超出80位")
	@ApiModelProperty(value = "借款人", example = "", dataType="varchar(80)", required = true )
    private String borrowman;

	@Length(max=80,min=0,message="金融机构不能超出80位")
	@ApiModelProperty(value = "金融机构", example = "", dataType="varchar(80)", required = true )
    private String fananceorg;

	@Length(max=17,min=0,message="借款总额不能超出17位")
	@ApiModelProperty(value = "借款总额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totalloan;

	@Length(max=17,min=0,message="借款余额不能超出17位")
	@ApiModelProperty(value = "借款余额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal borrowremain;

	@ApiModelProperty(value = "开始日期", example = "", dataType="datetime", required = true )
    private Date startdate;

	@ApiModelProperty(value = "结束日期", example = "", dataType="datetime", required = true )
    private Date enddate;

	@Length(max=80,min=0,message="抵押物产权编号不能超出80位")
	@ApiModelProperty(value = "抵押物产权编号", example = "", dataType="varchar(80)", required = true )
    private String pledgeno;

	@Length(max=120,min=0,message="抵押物坐落地址不能超出120位")
	@ApiModelProperty(value = "抵押物坐落地址", example = "", dataType="varchar(120)", required = true )
    private String pledgeaddress;

	@Length(max=17,min=0,message="可用额度不能超出17位")
	@ApiModelProperty(value = "可用额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal usefulposition;

	@Length(max=17,min=0,message="已用额度不能超出17位")
	@ApiModelProperty(value = "已用额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal usedposition;

	@Length(max=600,min=0,message="负债情况说明不能超出600位")
	@ApiModelProperty(value = "负债情况说明", example = "", dataType="varchar(600)", required = true )
    private String debtinforemark;

	@Length(max=1,min=0,message="是否有民间借贷记录不能超出1位")
	@ApiModelProperty(value = "是否有民间借贷记录", example = "", dataType="char(1)", required = true )
    private String havaloanflg;

	@Length(max=8,min=0,message="折算比例不能超出8位")
	@ApiModelProperty(value = "折算比例", example = "", dataType="decimal(8,5)", required = true )
    private BigDecimal conversion;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=120,min=0,message="坐落地址省份不能超出120位")
	@ApiModelProperty(value = "坐落地址省份", example = "", dataType="varchar(120)", required = true )
    private String addressprov;

	@Length(max=120,min=0,message="坐落地址城市不能超出120位")
	@ApiModelProperty(value = "坐落地址城市", example = "", dataType="varchar(120)", required = true )
    private String addresscity;

	@Length(max=120,min=0,message="坐落地址地区不能超出120位")
	@ApiModelProperty(value = "坐落地址地区", example = "", dataType="varchar(120)", required = true )
    private String addressarea;

	@Length(max=120,min=0,message="详细坐落地址不能超出120位")
	@ApiModelProperty(value = "详细坐落地址", example = "", dataType="varchar(120)", required = true )
    private String address;

	@Length(max=4,min=0,message="历史是否无民间借贷记录不能超出4位")
	@ApiModelProperty(value = "历史是否无民间借贷记录", example = "", dataType="varchar(4)", required = true )
    private String historicalhavaloanflg;

	@Length(max=40,min=0,message="产权证编号不能超出40位")
	@ApiModelProperty(value = "产权证编号", example = "", dataType="varchar(40)", required = true )
    private String noofcertificate;

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

    public String getCerdid() {
        return cerdid;
    }

    public void setCerdid(String cerdid) {
        this.cerdid = cerdid == null ? null : cerdid.trim();
    }

    public String getDebttype() {
        return debttype;
    }

    public void setDebttype(String debttype) {
        this.debttype = debttype == null ? null : debttype.trim();
    }

    public String getBorrowman() {
        return borrowman;
    }

    public void setBorrowman(String borrowman) {
        this.borrowman = borrowman == null ? null : borrowman.trim();
    }

    public String getFananceorg() {
        return fananceorg;
    }

    public void setFananceorg(String fananceorg) {
        this.fananceorg = fananceorg == null ? null : fananceorg.trim();
    }

    public BigDecimal getTotalloan() {
        return totalloan;
    }

    public void setTotalloan(BigDecimal totalloan) {
        this.totalloan = totalloan;
    }

    public BigDecimal getBorrowremain() {
        return borrowremain;
    }

    public void setBorrowremain(BigDecimal borrowremain) {
        this.borrowremain = borrowremain;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getPledgeno() {
        return pledgeno;
    }

    public void setPledgeno(String pledgeno) {
        this.pledgeno = pledgeno == null ? null : pledgeno.trim();
    }

    public String getPledgeaddress() {
        return pledgeaddress;
    }

    public void setPledgeaddress(String pledgeaddress) {
        this.pledgeaddress = pledgeaddress == null ? null : pledgeaddress.trim();
    }

    public BigDecimal getUsefulposition() {
        return usefulposition;
    }

    public void setUsefulposition(BigDecimal usefulposition) {
        this.usefulposition = usefulposition;
    }

    public BigDecimal getUsedposition() {
        return usedposition;
    }

    public void setUsedposition(BigDecimal usedposition) {
        this.usedposition = usedposition;
    }

    public String getDebtinforemark() {
        return debtinforemark;
    }

    public void setDebtinforemark(String debtinforemark) {
        this.debtinforemark = debtinforemark == null ? null : debtinforemark.trim();
    }

    public String getHavaloanflg() {
        return havaloanflg;
    }

    public void setHavaloanflg(String havaloanflg) {
        this.havaloanflg = havaloanflg == null ? null : havaloanflg.trim();
    }

    public BigDecimal getConversion() {
        return conversion;
    }

    public void setConversion(BigDecimal conversion) {
        this.conversion = conversion;
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

    public String getAddressprov() {
        return addressprov;
    }

    public void setAddressprov(String addressprov) {
        this.addressprov = addressprov == null ? null : addressprov.trim();
    }

    public String getAddresscity() {
        return addresscity;
    }

    public void setAddresscity(String addresscity) {
        this.addresscity = addresscity == null ? null : addresscity.trim();
    }

    public String getAddressarea() {
        return addressarea;
    }

    public void setAddressarea(String addressarea) {
        this.addressarea = addressarea == null ? null : addressarea.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHistoricalhavaloanflg() {
        return historicalhavaloanflg;
    }

    public void setHistoricalhavaloanflg(String historicalhavaloanflg) {
        this.historicalhavaloanflg = historicalhavaloanflg == null ? null : historicalhavaloanflg.trim();
    }

    public String getNoofcertificate() {
        return noofcertificate;
    }

    public void setNoofcertificate(String noofcertificate) {
        this.noofcertificate = noofcertificate == null ? null : noofcertificate.trim();
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
        Debtinfo other = (Debtinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getCerdid() == null ? other.getCerdid() == null : this.getCerdid().equals(other.getCerdid()))
            && (this.getDebttype() == null ? other.getDebttype() == null : this.getDebttype().equals(other.getDebttype()))
            && (this.getBorrowman() == null ? other.getBorrowman() == null : this.getBorrowman().equals(other.getBorrowman()))
            && (this.getFananceorg() == null ? other.getFananceorg() == null : this.getFananceorg().equals(other.getFananceorg()))
            && (this.getTotalloan() == null ? other.getTotalloan() == null : this.getTotalloan().equals(other.getTotalloan()))
            && (this.getBorrowremain() == null ? other.getBorrowremain() == null : this.getBorrowremain().equals(other.getBorrowremain()))
            && (this.getStartdate() == null ? other.getStartdate() == null : this.getStartdate().equals(other.getStartdate()))
            && (this.getEnddate() == null ? other.getEnddate() == null : this.getEnddate().equals(other.getEnddate()))
            && (this.getPledgeno() == null ? other.getPledgeno() == null : this.getPledgeno().equals(other.getPledgeno()))
            && (this.getPledgeaddress() == null ? other.getPledgeaddress() == null : this.getPledgeaddress().equals(other.getPledgeaddress()))
            && (this.getUsefulposition() == null ? other.getUsefulposition() == null : this.getUsefulposition().equals(other.getUsefulposition()))
            && (this.getUsedposition() == null ? other.getUsedposition() == null : this.getUsedposition().equals(other.getUsedposition()))
            && (this.getDebtinforemark() == null ? other.getDebtinforemark() == null : this.getDebtinforemark().equals(other.getDebtinforemark()))
            && (this.getHavaloanflg() == null ? other.getHavaloanflg() == null : this.getHavaloanflg().equals(other.getHavaloanflg()))
            && (this.getConversion() == null ? other.getConversion() == null : this.getConversion().equals(other.getConversion()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getAddressprov() == null ? other.getAddressprov() == null : this.getAddressprov().equals(other.getAddressprov()))
            && (this.getAddresscity() == null ? other.getAddresscity() == null : this.getAddresscity().equals(other.getAddresscity()))
            && (this.getAddressarea() == null ? other.getAddressarea() == null : this.getAddressarea().equals(other.getAddressarea()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getHistoricalhavaloanflg() == null ? other.getHistoricalhavaloanflg() == null : this.getHistoricalhavaloanflg().equals(other.getHistoricalhavaloanflg()))
            && (this.getNoofcertificate() == null ? other.getNoofcertificate() == null : this.getNoofcertificate().equals(other.getNoofcertificate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getCerdid() == null) ? 0 : getCerdid().hashCode());
        result = prime * result + ((getDebttype() == null) ? 0 : getDebttype().hashCode());
        result = prime * result + ((getBorrowman() == null) ? 0 : getBorrowman().hashCode());
        result = prime * result + ((getFananceorg() == null) ? 0 : getFananceorg().hashCode());
        result = prime * result + ((getTotalloan() == null) ? 0 : getTotalloan().hashCode());
        result = prime * result + ((getBorrowremain() == null) ? 0 : getBorrowremain().hashCode());
        result = prime * result + ((getStartdate() == null) ? 0 : getStartdate().hashCode());
        result = prime * result + ((getEnddate() == null) ? 0 : getEnddate().hashCode());
        result = prime * result + ((getPledgeno() == null) ? 0 : getPledgeno().hashCode());
        result = prime * result + ((getPledgeaddress() == null) ? 0 : getPledgeaddress().hashCode());
        result = prime * result + ((getUsefulposition() == null) ? 0 : getUsefulposition().hashCode());
        result = prime * result + ((getUsedposition() == null) ? 0 : getUsedposition().hashCode());
        result = prime * result + ((getDebtinforemark() == null) ? 0 : getDebtinforemark().hashCode());
        result = prime * result + ((getHavaloanflg() == null) ? 0 : getHavaloanflg().hashCode());
        result = prime * result + ((getConversion() == null) ? 0 : getConversion().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getAddressprov() == null) ? 0 : getAddressprov().hashCode());
        result = prime * result + ((getAddresscity() == null) ? 0 : getAddresscity().hashCode());
        result = prime * result + ((getAddressarea() == null) ? 0 : getAddressarea().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getHistoricalhavaloanflg() == null) ? 0 : getHistoricalhavaloanflg().hashCode());
        result = prime * result + ((getNoofcertificate() == null) ? 0 : getNoofcertificate().hashCode());
        return result;
    }
}
