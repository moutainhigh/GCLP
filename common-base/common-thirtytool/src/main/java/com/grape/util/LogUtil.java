package com.grape.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.grape.model.db.Log;
import com.grape.model.mapper.base.LogMapper;

@Component
public class LogUtil {

	private static LogUtil _intstance = null;
	
	@Autowired
	private LogMapper logMapper;
	
	public LogUtil() {
		_intstance = this;
	}
	
	public static synchronized LogUtil getInstance() {
		if (_intstance == null)
			throw new IllegalStateException();
		return _intstance;
	}
	
	public static void saveLog(String type,String descriptions,String workerid) {
		Log log=new Log();
		log.setLogid(Util.getID());
		log.setType(type);
		log.setDescriptions(descriptions);
		log.setChecktl(workerid);
        log.setRefLogid(getIpAddr());
        log.setChgdt(new Date());
        log.setChgtl(workerid);
		_intstance.log(log);
	}
	
	private void log(Log log){
		logMapper.insert(log);
	}
	
	public static String getIpAddr() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		
        String ipAddress = null;
        try {
            ipAddress = request.getHeader("x-forwarded-for");
            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getHeader("Proxy-Client-IP");
            }
            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getHeader("WL-Proxy-Client-IP");
            }
            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getRemoteAddr();
                if (ipAddress.equals("127.0.0.1")) {
                    // 根据网卡取本机配置的IP
                    InetAddress inet = null;
                    try {
                        inet = InetAddress.getLocalHost();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    ipAddress = inet.getHostAddress();
                }
            }
            // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
            if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()
                                                                // = 15
                if (ipAddress.indexOf(",") > 0) {
                    ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
                }
            }
        } catch (Exception e) {
            ipAddress="";
        }
        // ipAddress = this.getRequest().getRemoteAddr();
        
        return ipAddress;
    }
}
