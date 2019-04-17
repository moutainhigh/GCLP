package com.grape.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

/**
 * @描述 lombok插件例子
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/13 13:34
 */
@Log4j
public class LombokEp {

    // 部分字段追加setter
    @Setter
    private String partSetter;
    // 部分字段追加getter
    @Getter
    private String partGetter;

    public void nonNull(@NonNull String nonnull) {
        /*
         * 将生成
		 * if (nonnull == null) {  
		 * 		throw new NullPointerException("nonnull");  
		 * }  
	    */
    }

    public void stream() throws IOException {
        // 自动close资源，不是Lombok方式，@Cleanup有问题。
        try (BufferedReader br = new BufferedReader(new FileReader(""))) {
            // dosomething
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
    }


    public void log() {
        log.info("增加@Log4j注解即可");
    }

}
