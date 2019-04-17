package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//
public class Accountquota implements Serializable {
	@Length(max=19,min=0,message="额度编号不能超出19位")
	@ApiModelProperty(value = "额度编号", example = "", dataType="varchar(19)", required = true )
    private String linenumber;

	@Length(max=19,min=0,message="上级额度编号不能超出19位")
	@ApiModelProperty(value = "上级额度编号", example = "", dataType="varchar(19)", required = true )
    private String linenumbersenior;

	@Length(max=17,min=0,message="总授信额度不能超出17位")
	@ApiModelProperty(value = "总授信额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totalcreditline;

	@Length(max=17,min=0,message="已用抵押额度不能超出17位")
	@ApiModelProperty(value = "已用抵押额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal mortgageamount;

	@Length(max=17,min=0,message="已用赎楼额度不能超出17位")
	@ApiModelProperty(value = "已用赎楼额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal foreclosurefloorlines;

	@Length(max=17,min=0,message="剩余授信额度不能超出17位")
	@ApiModelProperty(value = "剩余授信额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal remainingamount;

	@Length(max=9,min=0,message="抵押比例不能超出9位")
	@ApiModelProperty(value = "抵押比例", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal mortgageratio;

	@Length(max=9,min=0,message="赎楼比例不能超出9位")
	@ApiModelProperty(value = "赎楼比例", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal foreclosurefloorratio;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getLinenumber() {
        return linenumber;
    }

    public void setLinenumber(String linenumber) {
        this.linenumber = linenumber == null ? null : linenumber.trim();
    }

    public String getLinenumbersenior() {
        return linenumbersenior;
    }

    public void setLinenumbersenior(String linenumbersenior) {
        this.linenumbersenior = linenumbersenior == null ? null : linenumbersenior.trim();
    }

    public BigDecimal getTotalcreditline() {
        return totalcreditline;
    }

    public void setTotalcreditline(BigDecimal totalcreditline) {
        this.totalcreditline = totalcreditline;
    }

    public BigDecimal getMortgageamount() {
        return mortgageamount;
    }

    public void setMortgageamount(BigDecimal mortgageamount) {
        this.mortgageamount = mortgageamount;
    }

    public BigDecimal getForeclosurefloorlines() {
        return foreclosurefloorlines;
    }

    public void setForeclosurefloorlines(BigDecimal foreclosurefloorlines) {
        this.foreclosurefloorlines = foreclosurefloorlines;
    }

    public BigDecimal getRemainingamount() {
        return remainingamount;
    }

    public void setRemainingamount(BigDecimal remainingamount) {
        this.remainingamount = remainingamount;
    }

    public BigDecimal getMortgageratio() {
        return mortgageratio;
    }

    public void setMortgageratio(BigDecimal mortgageratio) {
        this.mortgageratio = mortgageratio;
    }

    public BigDecimal getForeclosurefloorratio() {
        return foreclosurefloorratio;
    }

    public void setForeclosurefloorratio(BigDecimal foreclosurefloorratio) {
        this.foreclosurefloorratio = foreclosurefloorratio;
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
        Accountquota other = (Accountquota) that;
        return (this.getLinenumber() == null ? other.getLinenumber() == null : this.getLinenumber().equals(other.getLinenumber()))
            && (this.getLinenumbersenior() == null ? other.getLinenumbersenior() == null : this.getLinenumbersenior().equals(other.getLinenumbersenior()))
            && (this.getTotalcreditline() == null ? other.getTotalcreditline() == null : this.getTotalcreditline().equals(other.getTotalcreditline()))
            && (this.getMortgageamount() == null ? other.getMortgageamount() == null : this.getMortgageamount().equals(other.getMortgageamount()))
            && (this.getForeclosurefloorlines() == null ? other.getForeclosurefloorlines() == null : this.getForeclosurefloorlines().equals(other.getForeclosurefloorlines()))
            && (this.getRemainingamount() == null ? other.getRemainingamount() == null : this.getRemainingamount().equals(other.getRemainingamount()))
            && (this.getMortgageratio() == null ? other.getMortgageratio() == null : this.getMortgageratio().equals(other.getMortgageratio()))
            && (this.getForeclosurefloorratio() == null ? other.getForeclosurefloorratio() == null : this.getForeclosurefloorratio().equals(other.getForeclosurefloorratio()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLinenumber() == null) ? 0 : getLinenumber().hashCode());
        result = prime * result + ((getLinenumbersenior() == null) ? 0 : getLinenumbersenior().hashCode());
        result = prime * result + ((getTotalcreditline() == null) ? 0 : getTotalcreditline().hashCode());
        result = prime * result + ((getMortgageamount() == null) ? 0 : getMortgageamount().hashCode());
        result = prime * result + ((getForeclosurefloorlines() == null) ? 0 : getForeclosurefloorlines().hashCode());
        result = prime * result + ((getRemainingamount() == null) ? 0 : getRemainingamount().hashCode());
        result = prime * result + ((getMortgageratio() == null) ? 0 : getMortgageratio().hashCode());
        result = prime * result + ((getForeclosurefloorratio() == null) ? 0 : getForeclosurefloorratio().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
