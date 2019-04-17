package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//公用借款人
public class Comapply implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="共同借款人不能超出19位")
	@ApiModelProperty(value = "共同借款人", example = "", dataType="varchar(19)", required = true )
    private String comapply;

	@Length(max=19,min=0,message="国籍不能超出19位")
	@ApiModelProperty(value = "国籍", example = "", dataType="varchar(19)", required = true )
    private String nationality;

	@Length(max=40,min=0,message="证件号码不能超出40位")
	@ApiModelProperty(value = "证件号码", example = "", dataType="varchar(40)", required = true )
    private String identi;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getComapply() {
        return comapply;
    }

    public void setComapply(String comapply) {
        this.comapply = comapply == null ? null : comapply.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getIdenti() {
        return identi;
    }

    public void setIdenti(String identi) {
        this.identi = identi == null ? null : identi.trim();
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
        Comapply other = (Comapply) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getComapply() == null ? other.getComapply() == null : this.getComapply().equals(other.getComapply()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getIdenti() == null ? other.getIdenti() == null : this.getIdenti().equals(other.getIdenti()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getComapply() == null) ? 0 : getComapply().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getIdenti() == null) ? 0 : getIdenti().hashCode());
        return result;
    }
}
