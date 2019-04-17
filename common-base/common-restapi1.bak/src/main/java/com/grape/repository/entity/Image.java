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

@Table(name = "image")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Image {//影像表

	@Id
	@Column(name = "imageid", nullable = false, length = 19)
	private String imageid;//主键ID

	@Column(name = "imagetype", nullable = true, length = 4)
	private String imagetype;//影像类型

	@Column(name = "imagename", nullable = true, length = 120)
	private String imagename;//影像名称

	@Column(name = "rootdir", nullable = true, length = 80)
	private String rootdir;//保存跟路径

	@Column(name = "absolutedir", nullable = true, length = 240)
	private String absolutedir;//保存相对路径

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//流水号

	@Column(name = "savetype", nullable = true, length = 10)
	private String savetype;//保存类型

	@Column(name = "saveaddress", nullable = true, length = 200)
	private String saveaddress;//存放地

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//操作时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//操作人

}