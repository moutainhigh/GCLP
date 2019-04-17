package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//产品放款类型表
public class Procloantype implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=6,min=0,message="产品编号不能超出6位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(6)", required = true )
    private String productno;

	@Length(max=32,min=0,message="放款条件不能超出32位")
	@ApiModelProperty(value = "放款条件", example = "", dataType="varchar(32)", required = true )
    private String termofloan;

	@Length(max=1,min=0,message="分次放款标识不能超出1位")
	@ApiModelProperty(value = "分次放款标识", example = "", dataType="char(1)", required = true )
    private String subloanflg;

	@Length(max=9,min=0,message="首次放款比例不能超出9位")
	@ApiModelProperty(value = "首次放款比例", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal firstloanratio;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public String getTermofloan() {
        return termofloan;
    }

    public void setTermofloan(String termofloan) {
        this.termofloan = termofloan == null ? null : termofloan.trim();
    }

    public String getSubloanflg() {
        return subloanflg;
    }

    public void setSubloanflg(String subloanflg) {
        this.subloanflg = subloanflg == null ? null : subloanflg.trim();
    }

    public BigDecimal getFirstloanratio() {
        return firstloanratio;
    }

    public void setFirstloanratio(BigDecimal firstloanratio) {
        this.firstloanratio = firstloanratio;
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
        Procloantype other = (Procloantype) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getTermofloan() == null ? other.getTermofloan() == null : this.getTermofloan().equals(other.getTermofloan()))
            && (this.getSubloanflg() == null ? other.getSubloanflg() == null : this.getSubloanflg().equals(other.getSubloanflg()))
            && (this.getFirstloanratio() == null ? other.getFirstloanratio() == null : this.getFirstloanratio().equals(other.getFirstloanratio()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getTermofloan() == null) ? 0 : getTermofloan().hashCode());
        result = prime * result + ((getSubloanflg() == null) ? 0 : getSubloanflg().hashCode());
        result = prime * result + ((getFirstloanratio() == null) ? 0 : getFirstloanratio().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
