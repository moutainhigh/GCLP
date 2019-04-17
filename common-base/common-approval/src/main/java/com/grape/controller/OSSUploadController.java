package com.grape.controller;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.OSSObject;

@RestController
public class OSSUploadController {

    @Autowired
    private OSSClient ossClient;

    @RequestMapping(value = "/upload")
    public String OSSUpLoad(){

        // 上传byte数组
//        byte[] content = "Hello OSS xudy".getBytes();
//        ossClient.putObject("xudy", "xudy", new ByteArrayInputStream(content));

        String filePath = System.getProperty("user.dir") + File.separator + "file" + File.separator + "top.jpg";
        // 上传文件流
        try {
            File file = new File(filePath);
            InputStream inputStream = new FileInputStream(file);

            // 上传文件
            ossClient.putObject("xudy", "txt.jpg", inputStream);
        } catch (Exception  e) {
//            e.printStackTrace();
            System.out.println("上传阿里云OSS服务器异常." + e.getMessage());

        }
       // 关闭client  正常开发的时候 做好把下面代码屏蔽  
      //  ossClient.shutdown();

        return "upload";
    }

    @RequestMapping(value = "/download")
    public void OssAction(HttpServletRequest request, HttpServletResponse response){
        try {
            String fileName="1.jpg";
            String ossKey="1.jpg";
            // 从阿里云进行下载
            OSSObject ossObject = ossClient.getObject("loan-eye",ossKey);//bucketName需要自己设置
            // 已缓冲的方式从字符输入流中读取文本，缓冲各个字符，从而提供字符、数组和行的高效读取
            BufferedReader reader = new BufferedReader(new InputStreamReader(ossObject.getObjectContent()));

            InputStream inputStream = ossObject.getObjectContent();

            //缓冲文件输出流
            BufferedOutputStream outputStream=new BufferedOutputStream(response.getOutputStream());
            //通知浏览器以附件形式下载
            response.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"UTF-8"));
            // 为防止 文件名出现乱码

			response.setContentType("application/doc");
			final String userAgent = request.getHeader("USER-AGENT");
			if(StringUtils.contains(userAgent, "MSIE")){//IE浏览器
			    fileName = URLEncoder.encode(fileName,"UTF-8");
			}else if(StringUtils.contains(userAgent, "Mozilla")){//google,火狐浏览器
			    fileName = new String(fileName.getBytes(), "ISO8859-1");
			}else{
			    fileName = URLEncoder.encode(fileName,"UTF-8");//其他浏览器
			}
			response.addHeader("Content-Disposition", "attachment;filename=" +fileName);//这里设置一下让浏览器弹出下载提示框，而不是直接在浏览器中打开
	
	
	
	            // 进行解码 如果上传时为了防止乱码 进行解码使用此方法
	//            Base64Decoder base64Decoder = new Base64Decoder();
	//            byte[] car;
	//            while (true) {
	//                String line = reader.readLine();
	//                if (line == null) break;
	//                car =  base64Decoder.decodeBuffer(line);
	//
	//                outputStream.write(car);
	//            }
	//            reader.close();
	
	            byte[] car = new byte[1024];
	                int L;
	
	                while((L = inputStream.read(car)) != -1){
	                    if (car.length!=0){
	                        outputStream.write(car, 0,L);
	                    }
	                }
	
	            if(outputStream!=null){
	                outputStream.flush();
	                outputStream.close();
	            }
	

        } catch (IOException e) {
            e.printStackTrace();

        } catch (OSSException e){

        }
    }

    /**
     * 删除存储空间buckName
     */
    public  void deleteBucket(){
        ossClient.deleteBucket("");

    }
}