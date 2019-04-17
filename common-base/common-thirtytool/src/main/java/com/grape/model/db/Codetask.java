package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//
public class Codetask implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=60,min=0,message="任务名称不能超出60位")
	@ApiModelProperty(value = "任务名称", example = "", dataType="varchar(60)", required = true )
    private String taskname;

	@Length(max=60,min=0,message="任务class类不能超出60位")
	@ApiModelProperty(value = "任务class类", example = "", dataType="varchar(60)", required = true )
    private String taskclass;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public String getTaskclass() {
        return taskclass;
    }

    public void setTaskclass(String taskclass) {
        this.taskclass = taskclass == null ? null : taskclass.trim();
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
        Codetask other = (Codetask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaskname() == null ? other.getTaskname() == null : this.getTaskname().equals(other.getTaskname()))
            && (this.getTaskclass() == null ? other.getTaskclass() == null : this.getTaskclass().equals(other.getTaskclass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaskname() == null) ? 0 : getTaskname().hashCode());
        result = prime * result + ((getTaskclass() == null) ? 0 : getTaskclass().hashCode());
        return result;
    }
}
