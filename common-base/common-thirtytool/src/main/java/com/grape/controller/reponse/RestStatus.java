package com.grape.controller.reponse;

public interface RestStatus {

    /**
     * @return 返回的状态码
     */
    int code();

    /**
     * @return 状态码类型
     */
    String name();

    /**
     * @return 消息
     */
    String message();

}
