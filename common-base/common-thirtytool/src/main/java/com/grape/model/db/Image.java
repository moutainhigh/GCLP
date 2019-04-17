package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//影像表
public class Image implements Serializable {
	@Length(max=19,min=0,message="主键ID不能超出19位")
	@ApiModelProperty(value = "主键ID", example = "", dataType="varchar(19)", required = true )
    private String imageid;

	@Length(max=4,min=0,message="影像类型不能超出4位")
	@ApiModelProperty(value = "影像类型", example = "", dataType="varchar(4)", required = true )
    private String imagetype;

	@Length(max=120,min=0,message="影像名称不能超出120位")
	@ApiModelProperty(value = "影像名称", example = "", dataType="varchar(120)", required = true )
    private String imagename;

	@Length(max=80,min=0,message="保存跟路径不能超出80位")
	@ApiModelProperty(value = "保存跟路径", example = "", dataType="varchar(80)", required = true )
    private String rootdir;

	@Length(max=240,min=0,message="保存相对路径不能超出240位")
	@ApiModelProperty(value = "保存相对路径", example = "", dataType="varchar(240)", required = true )
    private String absolutedir;

	@Length(max=10,min=0,message="流水号不能超出10位")
	@ApiModelProperty(value = "流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=10,min=0,message="保存类型不能超出10位")
	@ApiModelProperty(value = "保存类型", example = "", dataType="varchar(10)", required = true )
    private String savetype;

	@Length(max=200,min=0,message="存放地不能超出200位")
	@ApiModelProperty(value = "存放地", example = "", dataType="varchar(200)", required = true )
    private String saveaddress;

	@Length(max=12,min=0,message="节点编号不能超出12位")
	@ApiModelProperty(value = "节点编号", example = "", dataType="varchar(12)", required = true )
    private String nodeid;

	@ApiModelProperty(value = "操作时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="操作人不能超出8位")
	@ApiModelProperty(value = "操作人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid == null ? null : imageid.trim();
    }

    public String getImagetype() {
        return imagetype;
    }

    public void setImagetype(String imagetype) {
        this.imagetype = imagetype == null ? null : imagetype.trim();
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename == null ? null : imagename.trim();
    }

    public String getRootdir() {
        return rootdir;
    }

    public void setRootdir(String rootdir) {
        this.rootdir = rootdir == null ? null : rootdir.trim();
    }

    public String getAbsolutedir() {
        return absolutedir;
    }

    public void setAbsolutedir(String absolutedir) {
        this.absolutedir = absolutedir == null ? null : absolutedir.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getSavetype() {
        return savetype;
    }

    public void setSavetype(String savetype) {
        this.savetype = savetype == null ? null : savetype.trim();
    }

    public String getSaveaddress() {
        return saveaddress;
    }

    public void setSaveaddress(String saveaddress) {
        this.saveaddress = saveaddress == null ? null : saveaddress.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
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
        Image other = (Image) that;
        return (this.getImageid() == null ? other.getImageid() == null : this.getImageid().equals(other.getImageid()))
            && (this.getImagetype() == null ? other.getImagetype() == null : this.getImagetype().equals(other.getImagetype()))
            && (this.getImagename() == null ? other.getImagename() == null : this.getImagename().equals(other.getImagename()))
            && (this.getRootdir() == null ? other.getRootdir() == null : this.getRootdir().equals(other.getRootdir()))
            && (this.getAbsolutedir() == null ? other.getAbsolutedir() == null : this.getAbsolutedir().equals(other.getAbsolutedir()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getSavetype() == null ? other.getSavetype() == null : this.getSavetype().equals(other.getSavetype()))
            && (this.getSaveaddress() == null ? other.getSaveaddress() == null : this.getSaveaddress().equals(other.getSaveaddress()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getImageid() == null) ? 0 : getImageid().hashCode());
        result = prime * result + ((getImagetype() == null) ? 0 : getImagetype().hashCode());
        result = prime * result + ((getImagename() == null) ? 0 : getImagename().hashCode());
        result = prime * result + ((getRootdir() == null) ? 0 : getRootdir().hashCode());
        result = prime * result + ((getAbsolutedir() == null) ? 0 : getAbsolutedir().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getSavetype() == null) ? 0 : getSavetype().hashCode());
        result = prime * result + ((getSaveaddress() == null) ? 0 : getSaveaddress().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
