package com.minhw.common.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw or mz
 * @create: 2022-07-30 23:57
 **/
public class Smartcoder {

    /**
     * 转码
     * @param strTest
     * @return
     */
    public static String encoder(String strTest) {
        try {
            strTest = URLEncoder.encode(strTest, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return strTest;
    }

    /**
     * 解码
     * @param strTest
     * @return
     */
    public static String decoder(String strTest) {
        try {
            strTest = URLDecoder.decode(strTest, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return strTest;
    }


}
