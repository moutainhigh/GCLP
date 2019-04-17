package com.grape.tool;



import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;

import java.util.Map;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;

import lombok.extern.log4j.Log4j;

@Log4j
public class AliyunSignUtil {
	
	

    public static String getSignature(Map<String, String> paramMap,String accessKeyId,String accessKeySecret) throws Exception{
        String signature = "";
        try {
           
        	paramMap.put("Format", "JSON");
        	paramMap.put("Version", "2016-11-01");
        	paramMap.put("AccessKeyId", accessKeyId);
        	paramMap.put("SignatureMethod", "HMAC-SHA1");
            paramMap.put("Timestamp", getUTCTimeStr(new Date()));
            paramMap.put("SignatureVersion", "1.0");
            paramMap.put("SignatureNonce",UUID.randomUUID().toString());

           
            // 对参数进行排序
            String[] sortedKeys = (String[]) paramMap.keySet().toArray(new String[]{});
            Arrays.sort(sortedKeys);
            final String SEPARATOR = "&";
            // 生成stringToSign字符串
            StringBuilder stringToSign = new StringBuilder();

            stringToSign.append("GET").append(SEPARATOR);

            stringToSign.append(percentEncode("/")).append(SEPARATOR);

            StringBuilder canonicalizedQueryString = new StringBuilder();

            for (String key : sortedKeys) {
                // 这里注意对key和value进行编码
                canonicalizedQueryString.append("&").append(percentEncode(key))
                        .append("=").append(percentEncode((String) paramMap.get(key)));
            }
            // 这里注意对canonicalizedQueryString进行编码
            stringToSign.append(percentEncode(canonicalizedQueryString.toString()
                    .substring(1)));
            log.info("----------stringToSign:"+ stringToSign.toString());
             String ALGORITHM = "HmacSHA1";
             String ENCODING = "UTF-8";
            String key = accessKeySecret + "&";
            Mac mac = Mac.getInstance(ALGORITHM);
            mac.init(new SecretKeySpec(key.getBytes(ENCODING), ALGORITHM));
            byte[] signData = mac.doFinal(stringToSign.toString().getBytes(ENCODING));
            signature =Base64.getEncoder().encodeToString(signData); 
            signature = percentEncode(signature);
            log.info("----------signature:"+signature);
        } catch (Exception e) {
            throw e;
        } 
        return signature;
    }

    private static String percentEncode(String value) throws UnsupportedEncodingException {
        return value != null ? URLEncoder.encode(value, "utf-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~") : null;

    }

   

    public static String getUTCTimeStr(Date date) {
        //1、取得本地时间：
        final java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(date);
        System.out.println("xx"+new Date());
        //2、取得时间偏移量：
        final int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);
        System.out.println(zoneOffset);
        //3、取得夏令时差：
        final int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);
        System.out.println(dstOffset);
        //4、从本地时间里扣除这些差量，即可以取得UTC时间：
        cal.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return df.format(cal.getTime());
        
    }
    public static Date UTCtoDate(String timeStr) throws Exception{
    	//1、转换时间：
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    	Date date = df.parse(timeStr);
        
        final java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(date);
        System.out.println("xx"+new Date());
        //2、取得时间偏移量：
        final int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);
        System.out.println(zoneOffset);
        //3、取得夏令时差：
        final int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);
        System.out.println(dstOffset);
        //4、从时间里加上这些差量，即可以取得本地时间：
        cal.add(java.util.Calendar.MILLISECOND, +(zoneOffset + dstOffset));
        
        
        return cal.getTime();
        
    }
    public static String getUTCTime(Date date) {
       
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return df.format(date.getTime());
    }
    
    public static Date strToDate(String strDate) {
    	
    	   SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
    	   ParsePosition pos = new ParsePosition(0);
    	   Date strtodate = formatter.parse(strDate, pos);
    	   return strtodate;
    	}
    
    public static CloseableHttpClient getDefaultHttpClient() throws Exception{
    	SSLContextBuilder builder = new SSLContextBuilder();
		builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
		SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(builder.build(), NoopHostnameVerifier.INSTANCE);

		@SuppressWarnings("rawtypes")
		Registry registry = RegistryBuilder.create()

		.register("http", new PlainConnectionSocketFactory())

		.register("https", sslConnectionSocketFactory)

		.build();

		PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry);

		cm.setMaxTotal(100);

		CloseableHttpClient httpClient = HttpClients.custom()
			
		.setSSLSocketFactory(sslConnectionSocketFactory)

		.setConnectionManager(cm)

		.build();
		
		return httpClient;
    }
    public static void main(String[] args) {
		
		 try {
			System.out.println(UTCtoDate("2018-11-05T10:06:02Z"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
