package com.grape.oss.client;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.aliyun.oss.OSSClient;

@Component
public class ConfigUtils {


    /**
     *  腾讯云配置
     * @return
     */
    @Bean
    public OSSClient getCOSClient() {
        return this.getOSSClient();
    }





        /**
         * 阿里云OSS对象存储 客户端
         * @return
         */
        public static OSSClient getOSSClient() {
            String endpoint         = "http://os.com";
            String accessKeyId      = "LTadAI";
            String accessKeySecret  = "zLIRj001";
            // 创建OSSClient实例
            OSSClient ossClient     = new OSSClient(endpoint, accessKeyId, accessKeySecret);
            return ossClient;
        }




}