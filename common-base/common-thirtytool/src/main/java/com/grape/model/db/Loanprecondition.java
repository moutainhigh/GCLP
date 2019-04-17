package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//放款前提表
public class Loanprecondition implements Serializable {
	@Length(max=4,min=0,message="放款前提资料编号不能超出4位")
	@ApiModelProperty(value = "放款前提资料编号", example = "", dataType="varchar(4)", required = true )
    private String loanpredocno;

	@Length(max=80,min=0,message="放款前提资料名称不能超出80位")
	@ApiModelProperty(value = "放款前提资料名称", example = "", dataType="varchar(80)", required = true )
    private String loanpredocname;

	@Length(max=6,min=0,message="产品编号不能超出6位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(6)", required = true )
    private String productno;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public String getLoanpredocno() {
        return loanpredocno;
    }

    public void setLoanpredocno(String loanpredocno) {
        this.loanpredocno = loanpredocno == null ? null : loanpredocno.trim();
    }

    public String getLoanpredocname() {
        return loanpredocname;
    }

    public void setLoanpredocname(String loanpredocname) {
        this.loanpredocname = loanpredocname == null ? null : loanpredocname.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
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
        Loanprecondition other = (Loanprecondition) that;
        return (this.getLoanpredocno() == null ? other.getLoanpredocno() == null : this.getLoanpredocno().equals(other.getLoanpredocno()))
            && (this.getLoanpredocname() == null ? other.getLoanpredocname() == null : this.getLoanpredocname().equals(other.getLoanpredocname()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoanpredocno() == null) ? 0 : getLoanpredocno().hashCode());
        result = prime * result + ((getLoanpredocname() == null) ? 0 : getLoanpredocname().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
