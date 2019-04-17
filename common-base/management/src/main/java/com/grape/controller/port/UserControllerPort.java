package com.grape.controller.port;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grape.controller.reponse.Response;

/**
 * @描述 用户信息模块
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/13 11:14
 */
@FeignClient(value = "frame-home", url = "http://localhost:8090/")
public interface UserControllerPort {
    /**
     * @描述
     * @参数 []
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/13 11:14
     */
    @RequestMapping("/user/info")
    public Response info();

}