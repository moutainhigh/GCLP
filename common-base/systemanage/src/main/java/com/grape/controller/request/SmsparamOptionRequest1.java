package com.grape.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Smsparam;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class SmsparamOptionRequest1 extends RestfulRequest{
    private String id;

    private String accesskeyid;

    private String accesskeysecret;

    private String msgsign;

    private String templatecode;

    private String productno;

    private String sendfreq;

    private String sendtype;

    private String sendchance;

    private String sendflg;

    private Date chgdt;

    private String chgtl;

    private String description;
}
