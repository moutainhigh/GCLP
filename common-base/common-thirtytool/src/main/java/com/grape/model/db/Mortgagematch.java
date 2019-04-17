package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Mortgagematch implements Serializable {
	@Length(max=19,min=0,message="抵押物编号不能超出19位")
	@ApiModelProperty(value = "抵押物编号", example = "", dataType="varchar(19)", required = true )
    private String mortgageno;

	@Length(max=1,min=0,message="匹配编号不能超出1位")
	@ApiModelProperty(value = "匹配编号", example = "", dataType="varchar(1)", required = true )
    private String matchno;

	@Length(max=80,min=0,message="相似的小区名称不能超出80位")
	@ApiModelProperty(value = "相似的小区名称", example = "", dataType="varchar(80)", required = true )
    private String similarword;

	@Length(max=255,min=0,message="房屋坐落地址不能超出255位")
	@ApiModelProperty(value = "房屋坐落地址", example = "", dataType="varchar(255)", required = true )
    private String houseaddress;

	@Length(max=1,min=0,message="是否匹配不能超出1位")
	@ApiModelProperty(value = "是否匹配", example = "", dataType="varchar(1)", required = true )
    private String matchflag;

	@Length(max=40,min=0,message="小区GUID不能超出40位")
	@ApiModelProperty(value = "小区GUID", example = "", dataType="varchar(40)", required = true )
    private String communityid;

	@ApiModelProperty(value = "修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="修改人不能超出8位")
	@ApiModelProperty(value = "修改人", example = "", dataType="varchar(8)", required = true )
    private String cdgtl;

    private static final long serialVersionUID = 1L;

    public String getMortgageno() {
        return mortgageno;
    }

    public void setMortgageno(String mortgageno) {
        this.mortgageno = mortgageno == null ? null : mortgageno.trim();
    }

    public String getMatchno() {
        return matchno;
    }

    public void setMatchno(String matchno) {
        this.matchno = matchno == null ? null : matchno.trim();
    }

    public String getSimilarword() {
        return similarword;
    }

    public void setSimilarword(String similarword) {
        this.similarword = similarword == null ? null : similarword.trim();
    }

    public String getHouseaddress() {
        return houseaddress;
    }

    public void setHouseaddress(String houseaddress) {
        this.houseaddress = houseaddress == null ? null : houseaddress.trim();
    }

    public String getMatchflag() {
        return matchflag;
    }

    public void setMatchflag(String matchflag) {
        this.matchflag = matchflag == null ? null : matchflag.trim();
    }

    public String getCommunityid() {
        return communityid;
    }

    public void setCommunityid(String communityid) {
        this.communityid = communityid == null ? null : communityid.trim();
    }

    public Date getChgdt() {
        return chgdt;
    }

    public void setChgdt(Date chgdt) {
        this.chgdt = chgdt;
    }

    public String getCdgtl() {
        return cdgtl;
    }

    public void setCdgtl(String cdgtl) {
        this.cdgtl = cdgtl == null ? null : cdgtl.trim();
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
        Mortgagematch other = (Mortgagematch) that;
        return (this.getMortgageno() == null ? other.getMortgageno() == null : this.getMortgageno().equals(other.getMortgageno()))
            && (this.getMatchno() == null ? other.getMatchno() == null : this.getMatchno().equals(other.getMatchno()))
            && (this.getSimilarword() == null ? other.getSimilarword() == null : this.getSimilarword().equals(other.getSimilarword()))
            && (this.getHouseaddress() == null ? other.getHouseaddress() == null : this.getHouseaddress().equals(other.getHouseaddress()))
            && (this.getMatchflag() == null ? other.getMatchflag() == null : this.getMatchflag().equals(other.getMatchflag()))
            && (this.getCommunityid() == null ? other.getCommunityid() == null : this.getCommunityid().equals(other.getCommunityid()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getCdgtl() == null ? other.getCdgtl() == null : this.getCdgtl().equals(other.getCdgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMortgageno() == null) ? 0 : getMortgageno().hashCode());
        result = prime * result + ((getMatchno() == null) ? 0 : getMatchno().hashCode());
        result = prime * result + ((getSimilarword() == null) ? 0 : getSimilarword().hashCode());
        result = prime * result + ((getHouseaddress() == null) ? 0 : getHouseaddress().hashCode());
        result = prime * result + ((getMatchflag() == null) ? 0 : getMatchflag().hashCode());
        result = prime * result + ((getCommunityid() == null) ? 0 : getCommunityid().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getCdgtl() == null) ? 0 : getCdgtl().hashCode());
        return result;
    }
}
