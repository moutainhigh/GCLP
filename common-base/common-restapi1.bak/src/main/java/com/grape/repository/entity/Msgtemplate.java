package com.grape.repository.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Table(name = "msgtemplate")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Msgtemplate {//短信模板表

	@Id
	@Column(name = "templateno", nullable = false, length = 6)
	private String templateno;//模板编号

	@Column(name = "templatecontent", nullable = true, length = 300)
	private String templatecontent;//模板内容

	@Column(name = "templatename", nullable = true, length = 80)
	private String templatename;//模板名称

	@Column(name = "noticetype", nullable = true, length = 10)
	private String noticetype;//提醒方式

	@Column(name = "templatetype", nullable = true, length = 10)
	private String templatetype;//模板类型

	@Column(name = "removeflg", nullable = true, length = 1)
	private String removeflg;//是否生效标志

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

}