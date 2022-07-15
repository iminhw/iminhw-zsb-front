package com.minhw.common.utils.ip;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.minhw.common.utils.StringUtils;
import com.minhw.common.utils.http.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 获取地址类
 *
 * @author minhw
 */
public class AddressUtils {
    // IP地址查询
    public static final String IP_URL = "http://whois.pconline.com.cn/ipJson.jsp";
    // 未知地址
    public static final String UNKNOWN = "XX XX";
    private static final Logger log = LoggerFactory.getLogger(AddressUtils.class);

    public static String getRealAddressByIP(String ip) {
        // 内网不查询
        if (IpUtils.internalIp(ip)) {
            return "内网IP";
        }
        try {
            String rspStr = HttpUtils.sendGet(IP_URL, "ip=" + ip + "&json=true", "GBK");
            if (StringUtils.isEmpty(rspStr)) {
                log.error("获取地理位置异常 {}", ip);
                return UNKNOWN;
            }
            JSONObject obj = JSON.parseObject(rspStr);
//            String region = obj.getString("pro");
//            String city = obj.getString("city");
            String addr = obj.getString("addr");
            return String.format("%s", addr);
        } catch (Exception e) {
            log.error("获取地理位置异常 {}", ip);
        }
        return UNKNOWN;
    }
}
