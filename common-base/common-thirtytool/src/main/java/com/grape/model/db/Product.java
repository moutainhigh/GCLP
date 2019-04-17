package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//null
public class Product implements Serializable {
	@Length(max=19,min=0,message="产品编号不能超出19位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(19)", required = true )
    private String productno;

	@Length(max=80,min=0,message="产品名称不能超出80位")
	@ApiModelProperty(value = "产品名称", example = "", dataType="varchar(80)", required = true )
    private String productname;

	@Length(max=2,min=0,message="产品类型不能超出2位")
	@ApiModelProperty(value = "产品类型", example = "", dataType="varchar(2)", required = true )
    private String producttype;

	@Length(max=800,min=0,message="产品描述不能超出800位")
	@ApiModelProperty(value = "产品描述", example = "", dataType="varchar(800)", required = true )
    private String description;

	@Length(max=17,min=0,message="产品最低贷款金额不能超出17位")
	@ApiModelProperty(value = "产品最低贷款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal minloanamount;

	@Length(max=17,min=0,message="产品最高贷款金额不能超出17位")
	@ApiModelProperty(value = "产品最高贷款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal maxloanamount;

	@Length(max=20,min=0,message="利率类型不能超出20位")
	@ApiModelProperty(value = "利率类型", example = "", dataType="varchar(20)", required = true )
    private String ratetype;

	@Length(max=9,min=0,message="最低利率（年）不能超出9位")
	@ApiModelProperty(value = "最低利率（年）", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal minrateofyear;

	@Length(max=9,min=0,message="最高利率（年）不能超出9位")
	@ApiModelProperty(value = "最高利率（年）", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal maxrateofyear;

	@Length(max=6,min=0,message="所属资金方企业编号不能超出6位")
	@ApiModelProperty(value = "所属资金方企业编号", example = "", dataType="varchar(6)", required = true )
    private String fundcomno;

	@Length(max=255,min=0,message="通道机构编号不能超出255位")
	@ApiModelProperty(value = "通道机构编号", example = "", dataType="varchar(255)", required = true )
    private String aislecomno;

	@Length(max=5,min=0,message="兜底机构不能超出5位")
	@ApiModelProperty(value = "兜底机构", example = "", dataType="varchar(5)", required = true )
    private String subsidycomno;

	@Length(max=5,min=0,message="档案管理机构不能超出5位")
	@ApiModelProperty(value = "档案管理机构", example = "", dataType="varchar(5)", required = true )
    private String docmanagecomno;

	@Length(max=5,min=0,message="回款要件管理机构不能超出5位")
	@ApiModelProperty(value = "回款要件管理机构", example = "", dataType="varchar(5)", required = true )
    private String receivedoccomno;

	@Length(max=5,min=0,message="出款要件管理机构不能超出5位")
	@ApiModelProperty(value = "出款要件管理机构", example = "", dataType="varchar(5)", required = true )
    private String outloandoccomno;

	@Length(max=16,min=0,message="资金方对接方式不能超出16位")
	@ApiModelProperty(value = "资金方对接方式", example = "", dataType="varchar(16)", required = true )
    private String buttmode;

	@Length(max=1,min=0,message="是否需要尽调直播不能超出1位")
	@ApiModelProperty(value = "是否需要尽调直播", example = "", dataType="char(1)", required = true )
    private String duediligenceflg;

	@Length(max=16,min=0,message="抵押办理方式不能超出16位")
	@ApiModelProperty(value = "抵押办理方式", example = "", dataType="varchar(16)", required = true )
    private String mortgagetype;

	@Length(max=1,min=0,message="是否生效不能超出1位")
	@ApiModelProperty(value = "是否生效", example = "", dataType="char(1)", required = true )
    private String takeeffectflg;

	@Length(max=1,min=0,message="是否允许渠道尽调不能超出1位")
	@ApiModelProperty(value = "是否允许渠道尽调", example = "", dataType="char(1)", required = true )
    private String permitchandueflg;

	@Length(max=1,min=0,message="是否允许资金方尽调不能超出1位")
	@ApiModelProperty(value = "是否允许资金方尽调", example = "", dataType="char(1)", required = true )
    private String permitfunddueflg;

	@Length(max=1,min=0,message="是否允许平台尽调不能超出1位")
	@ApiModelProperty(value = "是否允许平台尽调", example = "", dataType="char(1)", required = true )
    private String permitplaformdueflg;

	@Length(max=1,min=0,message="尽调是否系统对接不能超出1位")
	@ApiModelProperty(value = "尽调是否系统对接", example = "", dataType="char(1)", required = true )
    private String duesystemflg;

	@Length(max=1,min=0,message="通道风控审批是否系统对接不能超出1位")
	@ApiModelProperty(value = "通道风控审批是否系统对接", example = "", dataType="char(1)", required = true )
    private String issysriskapprovel;

	@Length(max=1,min=0,message="通道放款审批是否系统对接不能超出1位")
	@ApiModelProperty(value = "通道放款审批是否系统对接", example = "", dataType="char(1)", required = true )
    private String issysgrantapprovel;

	@Length(max=1,min=0,message="是否允许平台抵押办理不能超出1位")
	@ApiModelProperty(value = "是否允许平台抵押办理", example = "", dataType="char(1)", required = true )
    private String permitplaformmortflg;

	@Length(max=1,min=0,message="是否允许渠道抵押办理不能超出1位")
	@ApiModelProperty(value = "是否允许渠道抵押办理", example = "", dataType="char(1)", required = true )
    private String permitchanmortflg;

	@Length(max=1,min=0,message="是否允许资金方抵押办理不能超出1位")
	@ApiModelProperty(value = "是否允许资金方抵押办理", example = "", dataType="char(1)", required = true )
    private String permitfundmortflg;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=10,min=0,message="查档频率不能超出10位")
	@ApiModelProperty(value = "查档频率", example = "", dataType="varchar(10)", required = true )
    private String checkfrequency;

	@Length(max=1,min=0,message="是否进行经营场所尽调不能超出1位")
	@ApiModelProperty(value = "是否进行经营场所尽调", example = "", dataType="char(1)", required = true )
    private String companydiligenceflg;

	@Length(max=40,min=0,message="还款方式不能超出40位")
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(40)", required = true )
    private String repaymethod;

	@Length(max=2,min=0,message="产品状态不能超出2位")
	@ApiModelProperty(value = "产品状态", example = "", dataType="varchar(2)", required = true )
    private String state;

	@ApiModelProperty(value = "产品内容", example = "", dataType="longtext", required = true )
    private String content;

    private static final long serialVersionUID = 1L;

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype == null ? null : producttype.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getMinloanamount() {
        return minloanamount;
    }

    public void setMinloanamount(BigDecimal minloanamount) {
        this.minloanamount = minloanamount;
    }

    public BigDecimal getMaxloanamount() {
        return maxloanamount;
    }

    public void setMaxloanamount(BigDecimal maxloanamount) {
        this.maxloanamount = maxloanamount;
    }

    public String getRatetype() {
        return ratetype;
    }

    public void setRatetype(String ratetype) {
        this.ratetype = ratetype == null ? null : ratetype.trim();
    }

    public BigDecimal getMinrateofyear() {
        return minrateofyear;
    }

    public void setMinrateofyear(BigDecimal minrateofyear) {
        this.minrateofyear = minrateofyear;
    }

    public BigDecimal getMaxrateofyear() {
        return maxrateofyear;
    }

    public void setMaxrateofyear(BigDecimal maxrateofyear) {
        this.maxrateofyear = maxrateofyear;
    }

    public String getFundcomno() {
        return fundcomno;
    }

    public void setFundcomno(String fundcomno) {
        this.fundcomno = fundcomno == null ? null : fundcomno.trim();
    }

    public String getAislecomno() {
        return aislecomno;
    }

    public void setAislecomno(String aislecomno) {
        this.aislecomno = aislecomno == null ? null : aislecomno.trim();
    }

    public String getSubsidycomno() {
        return subsidycomno;
    }

    public void setSubsidycomno(String subsidycomno) {
        this.subsidycomno = subsidycomno == null ? null : subsidycomno.trim();
    }

    public String getDocmanagecomno() {
        return docmanagecomno;
    }

    public void setDocmanagecomno(String docmanagecomno) {
        this.docmanagecomno = docmanagecomno == null ? null : docmanagecomno.trim();
    }

    public String getReceivedoccomno() {
        return receivedoccomno;
    }

    public void setReceivedoccomno(String receivedoccomno) {
        this.receivedoccomno = receivedoccomno == null ? null : receivedoccomno.trim();
    }

    public String getOutloandoccomno() {
        return outloandoccomno;
    }

    public void setOutloandoccomno(String outloandoccomno) {
        this.outloandoccomno = outloandoccomno == null ? null : outloandoccomno.trim();
    }

    public String getButtmode() {
        return buttmode;
    }

    public void setButtmode(String buttmode) {
        this.buttmode = buttmode == null ? null : buttmode.trim();
    }

    public String getDuediligenceflg() {
        return duediligenceflg;
    }

    public void setDuediligenceflg(String duediligenceflg) {
        this.duediligenceflg = duediligenceflg == null ? null : duediligenceflg.trim();
    }

    public String getMortgagetype() {
        return mortgagetype;
    }

    public void setMortgagetype(String mortgagetype) {
        this.mortgagetype = mortgagetype == null ? null : mortgagetype.trim();
    }

    public String getTakeeffectflg() {
        return takeeffectflg;
    }

    public void setTakeeffectflg(String takeeffectflg) {
        this.takeeffectflg = takeeffectflg == null ? null : takeeffectflg.trim();
    }

    public String getPermitchandueflg() {
        return permitchandueflg;
    }

    public void setPermitchandueflg(String permitchandueflg) {
        this.permitchandueflg = permitchandueflg == null ? null : permitchandueflg.trim();
    }

    public String getPermitfunddueflg() {
        return permitfunddueflg;
    }

    public void setPermitfunddueflg(String permitfunddueflg) {
        this.permitfunddueflg = permitfunddueflg == null ? null : permitfunddueflg.trim();
    }

    public String getPermitplaformdueflg() {
        return permitplaformdueflg;
    }

    public void setPermitplaformdueflg(String permitplaformdueflg) {
        this.permitplaformdueflg = permitplaformdueflg == null ? null : permitplaformdueflg.trim();
    }

    public String getDuesystemflg() {
        return duesystemflg;
    }

    public void setDuesystemflg(String duesystemflg) {
        this.duesystemflg = duesystemflg == null ? null : duesystemflg.trim();
    }

    public String getIssysriskapprovel() {
        return issysriskapprovel;
    }

    public void setIssysriskapprovel(String issysriskapprovel) {
        this.issysriskapprovel = issysriskapprovel == null ? null : issysriskapprovel.trim();
    }

    public String getIssysgrantapprovel() {
        return issysgrantapprovel;
    }

    public void setIssysgrantapprovel(String issysgrantapprovel) {
        this.issysgrantapprovel = issysgrantapprovel == null ? null : issysgrantapprovel.trim();
    }

    public String getPermitplaformmortflg() {
        return permitplaformmortflg;
    }

    public void setPermitplaformmortflg(String permitplaformmortflg) {
        this.permitplaformmortflg = permitplaformmortflg == null ? null : permitplaformmortflg.trim();
    }

    public String getPermitchanmortflg() {
        return permitchanmortflg;
    }

    public void setPermitchanmortflg(String permitchanmortflg) {
        this.permitchanmortflg = permitchanmortflg == null ? null : permitchanmortflg.trim();
    }

    public String getPermitfundmortflg() {
        return permitfundmortflg;
    }

    public void setPermitfundmortflg(String permitfundmortflg) {
        this.permitfundmortflg = permitfundmortflg == null ? null : permitfundmortflg.trim();
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

    public String getCheckfrequency() {
        return checkfrequency;
    }

    public void setCheckfrequency(String checkfrequency) {
        this.checkfrequency = checkfrequency == null ? null : checkfrequency.trim();
    }

    public String getCompanydiligenceflg() {
        return companydiligenceflg;
    }

    public void setCompanydiligenceflg(String companydiligenceflg) {
        this.companydiligenceflg = companydiligenceflg == null ? null : companydiligenceflg.trim();
    }

    public String getRepaymethod() {
        return repaymethod;
    }

    public void setRepaymethod(String repaymethod) {
        this.repaymethod = repaymethod == null ? null : repaymethod.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        Product other = (Product) that;
        return (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getProducttype() == null ? other.getProducttype() == null : this.getProducttype().equals(other.getProducttype()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getMinloanamount() == null ? other.getMinloanamount() == null : this.getMinloanamount().equals(other.getMinloanamount()))
            && (this.getMaxloanamount() == null ? other.getMaxloanamount() == null : this.getMaxloanamount().equals(other.getMaxloanamount()))
            && (this.getRatetype() == null ? other.getRatetype() == null : this.getRatetype().equals(other.getRatetype()))
            && (this.getMinrateofyear() == null ? other.getMinrateofyear() == null : this.getMinrateofyear().equals(other.getMinrateofyear()))
            && (this.getMaxrateofyear() == null ? other.getMaxrateofyear() == null : this.getMaxrateofyear().equals(other.getMaxrateofyear()))
            && (this.getFundcomno() == null ? other.getFundcomno() == null : this.getFundcomno().equals(other.getFundcomno()))
            && (this.getAislecomno() == null ? other.getAislecomno() == null : this.getAislecomno().equals(other.getAislecomno()))
            && (this.getSubsidycomno() == null ? other.getSubsidycomno() == null : this.getSubsidycomno().equals(other.getSubsidycomno()))
            && (this.getDocmanagecomno() == null ? other.getDocmanagecomno() == null : this.getDocmanagecomno().equals(other.getDocmanagecomno()))
            && (this.getReceivedoccomno() == null ? other.getReceivedoccomno() == null : this.getReceivedoccomno().equals(other.getReceivedoccomno()))
            && (this.getOutloandoccomno() == null ? other.getOutloandoccomno() == null : this.getOutloandoccomno().equals(other.getOutloandoccomno()))
            && (this.getButtmode() == null ? other.getButtmode() == null : this.getButtmode().equals(other.getButtmode()))
            && (this.getDuediligenceflg() == null ? other.getDuediligenceflg() == null : this.getDuediligenceflg().equals(other.getDuediligenceflg()))
            && (this.getMortgagetype() == null ? other.getMortgagetype() == null : this.getMortgagetype().equals(other.getMortgagetype()))
            && (this.getTakeeffectflg() == null ? other.getTakeeffectflg() == null : this.getTakeeffectflg().equals(other.getTakeeffectflg()))
            && (this.getPermitchandueflg() == null ? other.getPermitchandueflg() == null : this.getPermitchandueflg().equals(other.getPermitchandueflg()))
            && (this.getPermitfunddueflg() == null ? other.getPermitfunddueflg() == null : this.getPermitfunddueflg().equals(other.getPermitfunddueflg()))
            && (this.getPermitplaformdueflg() == null ? other.getPermitplaformdueflg() == null : this.getPermitplaformdueflg().equals(other.getPermitplaformdueflg()))
            && (this.getDuesystemflg() == null ? other.getDuesystemflg() == null : this.getDuesystemflg().equals(other.getDuesystemflg()))
            && (this.getIssysriskapprovel() == null ? other.getIssysriskapprovel() == null : this.getIssysriskapprovel().equals(other.getIssysriskapprovel()))
            && (this.getIssysgrantapprovel() == null ? other.getIssysgrantapprovel() == null : this.getIssysgrantapprovel().equals(other.getIssysgrantapprovel()))
            && (this.getPermitplaformmortflg() == null ? other.getPermitplaformmortflg() == null : this.getPermitplaformmortflg().equals(other.getPermitplaformmortflg()))
            && (this.getPermitchanmortflg() == null ? other.getPermitchanmortflg() == null : this.getPermitchanmortflg().equals(other.getPermitchanmortflg()))
            && (this.getPermitfundmortflg() == null ? other.getPermitfundmortflg() == null : this.getPermitfundmortflg().equals(other.getPermitfundmortflg()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getCheckfrequency() == null ? other.getCheckfrequency() == null : this.getCheckfrequency().equals(other.getCheckfrequency()))
            && (this.getCompanydiligenceflg() == null ? other.getCompanydiligenceflg() == null : this.getCompanydiligenceflg().equals(other.getCompanydiligenceflg()))
            && (this.getRepaymethod() == null ? other.getRepaymethod() == null : this.getRepaymethod().equals(other.getRepaymethod()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getProducttype() == null) ? 0 : getProducttype().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getMinloanamount() == null) ? 0 : getMinloanamount().hashCode());
        result = prime * result + ((getMaxloanamount() == null) ? 0 : getMaxloanamount().hashCode());
        result = prime * result + ((getRatetype() == null) ? 0 : getRatetype().hashCode());
        result = prime * result + ((getMinrateofyear() == null) ? 0 : getMinrateofyear().hashCode());
        result = prime * result + ((getMaxrateofyear() == null) ? 0 : getMaxrateofyear().hashCode());
        result = prime * result + ((getFundcomno() == null) ? 0 : getFundcomno().hashCode());
        result = prime * result + ((getAislecomno() == null) ? 0 : getAislecomno().hashCode());
        result = prime * result + ((getSubsidycomno() == null) ? 0 : getSubsidycomno().hashCode());
        result = prime * result + ((getDocmanagecomno() == null) ? 0 : getDocmanagecomno().hashCode());
        result = prime * result + ((getReceivedoccomno() == null) ? 0 : getReceivedoccomno().hashCode());
        result = prime * result + ((getOutloandoccomno() == null) ? 0 : getOutloandoccomno().hashCode());
        result = prime * result + ((getButtmode() == null) ? 0 : getButtmode().hashCode());
        result = prime * result + ((getDuediligenceflg() == null) ? 0 : getDuediligenceflg().hashCode());
        result = prime * result + ((getMortgagetype() == null) ? 0 : getMortgagetype().hashCode());
        result = prime * result + ((getTakeeffectflg() == null) ? 0 : getTakeeffectflg().hashCode());
        result = prime * result + ((getPermitchandueflg() == null) ? 0 : getPermitchandueflg().hashCode());
        result = prime * result + ((getPermitfunddueflg() == null) ? 0 : getPermitfunddueflg().hashCode());
        result = prime * result + ((getPermitplaformdueflg() == null) ? 0 : getPermitplaformdueflg().hashCode());
        result = prime * result + ((getDuesystemflg() == null) ? 0 : getDuesystemflg().hashCode());
        result = prime * result + ((getIssysriskapprovel() == null) ? 0 : getIssysriskapprovel().hashCode());
        result = prime * result + ((getIssysgrantapprovel() == null) ? 0 : getIssysgrantapprovel().hashCode());
        result = prime * result + ((getPermitplaformmortflg() == null) ? 0 : getPermitplaformmortflg().hashCode());
        result = prime * result + ((getPermitchanmortflg() == null) ? 0 : getPermitchanmortflg().hashCode());
        result = prime * result + ((getPermitfundmortflg() == null) ? 0 : getPermitfundmortflg().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getCheckfrequency() == null) ? 0 : getCheckfrequency().hashCode());
        result = prime * result + ((getCompanydiligenceflg() == null) ? 0 : getCompanydiligenceflg().hashCode());
        result = prime * result + ((getRepaymethod() == null) ? 0 : getRepaymethod().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}
