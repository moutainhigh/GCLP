package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//房产评估表
public class Houseassess implements Serializable {
	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=19,min=0,message="抵押物编号不能超出19位")
	@ApiModelProperty(value = "抵押物编号", example = "", dataType="varchar(19)", required = true )
    private String mortgageno;

	@Length(max=80,min=0,message="评估渠道不能超出80位")
	@ApiModelProperty(value = "评估渠道", example = "", dataType="varchar(80)", required = true )
    private String channel;

	@Length(max=17,min=0,message="线上评估单价不能超出17位")
	@ApiModelProperty(value = "线上评估单价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal assessOnlinePrice;

	@Length(max=17,min=0,message="线上评估总价不能超出17位")
	@ApiModelProperty(value = "线上评估总价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal assessOnlineTotal;

	@Length(max=17,min=0,message="风控评估总价不能超出17位")
	@ApiModelProperty(value = "风控评估总价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal assessControlTotal;

	@Length(max=17,min=0,message="风控评估单价不能超出17位")
	@ApiModelProperty(value = "风控评估单价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal assessControlPrice;

	@Length(max=17,min=0,message="复估评估单价不能超出17位")
	@ApiModelProperty(value = "复估评估单价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal assessAgainPrice;

	@Length(max=17,min=0,message="复估评估总价不能超出17位")
	@ApiModelProperty(value = "复估评估总价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal assessAgainTotal;

	@Length(max=17,min=0,message="成交单价不能超出17位")
	@ApiModelProperty(value = "成交单价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal quickUnitPrice;

	@Length(max=17,min=0,message="成交总价不能超出17位")
	@ApiModelProperty(value = "成交总价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal generalUnitPrice;

	@ApiModelProperty(value = "修改日期", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="修改人不能超出8位")
	@ApiModelProperty(value = "修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=80,min=0,message="渠道名称不能超出80位")
	@ApiModelProperty(value = "渠道名称", example = "", dataType="varchar(80)", required = true )
    private String channelname;

	@Length(max=255,min=0,message="评估地址不能超出255位")
	@ApiModelProperty(value = "评估地址", example = "", dataType="varchar(255)", required = true )
    private String assessaddress;

	@Length(max=1,min=0,message="评估进度不能超出1位")
	@ApiModelProperty(value = "评估进度", example = "", dataType="varchar(1)", required = true )
    private String assessprogress;

	@Length(max=1,min=0,message="估价类型不能超出1位")
	@ApiModelProperty(value = "估价类型", example = "", dataType="varchar(1)", required = true )
    private String valuetype;

	@Length(max=255,min=0,message="附件名称不能超出255位")
	@ApiModelProperty(value = "附件名称", example = "", dataType="varchar(255)", required = true )
    private String filename;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getMortgageno() {
        return mortgageno;
    }

    public void setMortgageno(String mortgageno) {
        this.mortgageno = mortgageno == null ? null : mortgageno.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public BigDecimal getAssessOnlinePrice() {
        return assessOnlinePrice;
    }

    public void setAssessOnlinePrice(BigDecimal assessOnlinePrice) {
        this.assessOnlinePrice = assessOnlinePrice;
    }

    public BigDecimal getAssessOnlineTotal() {
        return assessOnlineTotal;
    }

    public void setAssessOnlineTotal(BigDecimal assessOnlineTotal) {
        this.assessOnlineTotal = assessOnlineTotal;
    }

    public BigDecimal getAssessControlTotal() {
        return assessControlTotal;
    }

    public void setAssessControlTotal(BigDecimal assessControlTotal) {
        this.assessControlTotal = assessControlTotal;
    }

    public BigDecimal getAssessControlPrice() {
        return assessControlPrice;
    }

    public void setAssessControlPrice(BigDecimal assessControlPrice) {
        this.assessControlPrice = assessControlPrice;
    }

    public BigDecimal getAssessAgainPrice() {
        return assessAgainPrice;
    }

    public void setAssessAgainPrice(BigDecimal assessAgainPrice) {
        this.assessAgainPrice = assessAgainPrice;
    }

    public BigDecimal getAssessAgainTotal() {
        return assessAgainTotal;
    }

    public void setAssessAgainTotal(BigDecimal assessAgainTotal) {
        this.assessAgainTotal = assessAgainTotal;
    }

    public BigDecimal getQuickUnitPrice() {
        return quickUnitPrice;
    }

    public void setQuickUnitPrice(BigDecimal quickUnitPrice) {
        this.quickUnitPrice = quickUnitPrice;
    }

    public BigDecimal getGeneralUnitPrice() {
        return generalUnitPrice;
    }

    public void setGeneralUnitPrice(BigDecimal generalUnitPrice) {
        this.generalUnitPrice = generalUnitPrice;
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

    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname == null ? null : channelname.trim();
    }

    public String getAssessaddress() {
        return assessaddress;
    }

    public void setAssessaddress(String assessaddress) {
        this.assessaddress = assessaddress == null ? null : assessaddress.trim();
    }

    public String getAssessprogress() {
        return assessprogress;
    }

    public void setAssessprogress(String assessprogress) {
        this.assessprogress = assessprogress == null ? null : assessprogress.trim();
    }

    public String getValuetype() {
        return valuetype;
    }

    public void setValuetype(String valuetype) {
        this.valuetype = valuetype == null ? null : valuetype.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
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
        Houseassess other = (Houseassess) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getMortgageno() == null ? other.getMortgageno() == null : this.getMortgageno().equals(other.getMortgageno()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getAssessOnlinePrice() == null ? other.getAssessOnlinePrice() == null : this.getAssessOnlinePrice().equals(other.getAssessOnlinePrice()))
            && (this.getAssessOnlineTotal() == null ? other.getAssessOnlineTotal() == null : this.getAssessOnlineTotal().equals(other.getAssessOnlineTotal()))
            && (this.getAssessControlTotal() == null ? other.getAssessControlTotal() == null : this.getAssessControlTotal().equals(other.getAssessControlTotal()))
            && (this.getAssessControlPrice() == null ? other.getAssessControlPrice() == null : this.getAssessControlPrice().equals(other.getAssessControlPrice()))
            && (this.getAssessAgainPrice() == null ? other.getAssessAgainPrice() == null : this.getAssessAgainPrice().equals(other.getAssessAgainPrice()))
            && (this.getAssessAgainTotal() == null ? other.getAssessAgainTotal() == null : this.getAssessAgainTotal().equals(other.getAssessAgainTotal()))
            && (this.getQuickUnitPrice() == null ? other.getQuickUnitPrice() == null : this.getQuickUnitPrice().equals(other.getQuickUnitPrice()))
            && (this.getGeneralUnitPrice() == null ? other.getGeneralUnitPrice() == null : this.getGeneralUnitPrice().equals(other.getGeneralUnitPrice()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChannelname() == null ? other.getChannelname() == null : this.getChannelname().equals(other.getChannelname()))
            && (this.getAssessaddress() == null ? other.getAssessaddress() == null : this.getAssessaddress().equals(other.getAssessaddress()))
            && (this.getAssessprogress() == null ? other.getAssessprogress() == null : this.getAssessprogress().equals(other.getAssessprogress()))
            && (this.getValuetype() == null ? other.getValuetype() == null : this.getValuetype().equals(other.getValuetype()))
            && (this.getFilename() == null ? other.getFilename() == null : this.getFilename().equals(other.getFilename()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getMortgageno() == null) ? 0 : getMortgageno().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getAssessOnlinePrice() == null) ? 0 : getAssessOnlinePrice().hashCode());
        result = prime * result + ((getAssessOnlineTotal() == null) ? 0 : getAssessOnlineTotal().hashCode());
        result = prime * result + ((getAssessControlTotal() == null) ? 0 : getAssessControlTotal().hashCode());
        result = prime * result + ((getAssessControlPrice() == null) ? 0 : getAssessControlPrice().hashCode());
        result = prime * result + ((getAssessAgainPrice() == null) ? 0 : getAssessAgainPrice().hashCode());
        result = prime * result + ((getAssessAgainTotal() == null) ? 0 : getAssessAgainTotal().hashCode());
        result = prime * result + ((getQuickUnitPrice() == null) ? 0 : getQuickUnitPrice().hashCode());
        result = prime * result + ((getGeneralUnitPrice() == null) ? 0 : getGeneralUnitPrice().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChannelname() == null) ? 0 : getChannelname().hashCode());
        result = prime * result + ((getAssessaddress() == null) ? 0 : getAssessaddress().hashCode());
        result = prime * result + ((getAssessprogress() == null) ? 0 : getAssessprogress().hashCode());
        result = prime * result + ((getValuetype() == null) ? 0 : getValuetype().hashCode());
        result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
        return result;
    }
}
