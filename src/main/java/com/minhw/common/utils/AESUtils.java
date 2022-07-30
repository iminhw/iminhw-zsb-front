package com.minhw.common.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * @program: iminhw-zsb-front
 * @description: https://www.cnblogs.com/wsj1/p/15343174.html
 * @author: MinHw or mz
 * @create: 2022-07-27 17:52
 **/
public class AESUtils {
    /** 密钥长度: 128, 192 or 256 */
    private static final int KEY_SIZE = 128;

    /**
     * 加密/解密算法名称
     */
    private static final String ALGORITHM = "AES/ECB/PKCS5Padding";
    /**
     * 秘钥算法
     */
    private static final String KEY_ALGORITHM = "AES";

    /** 16位密码 */
    private static final String key = "JK6wxIfrOleaU2Em";

    /**
     * 秘钥对象
     */
    private static final SecretKey secKey = new SecretKeySpec(key.getBytes(), KEY_ALGORITHM);

    /**
     * 数据加密: 明文 -> 密文
     */
    public static String encrypt(String plainString) throws Exception {
        // 获取 AES 密码器
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        // 初始化密码器（加密模型）
        cipher.init(Cipher.ENCRYPT_MODE, secKey);
        // 加密数据, 返回密文，使用base64编码密文byte数组，返回密文字符串
        return new String(Base64.getEncoder().encode(cipher.doFinal(plainString.getBytes("utf-8"))));
    }

    /**
     * 数据解密: 密文 -> 明文
     */
    public static String decrypt(String cipherString) throws Exception {
        // 获取 AES 密码器
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        // 初始化密码器（解密模型）
        cipher.init(Cipher.DECRYPT_MODE, secKey);
        // 解密数据, 返回明文，对base64编码的密文解码成密文byte数组，再使用AES解码
        byte[] plainBytes = cipher.doFinal(Base64.getDecoder().decode(cipherString));
        return new String(plainBytes);
    }

//    public static void main(String[] args) {
//        try {
//            System.out.println(AESUtils.encrypt("{status: 200, message: '操作成功', data: null}"));
//            System.out.println(AESUtils.decrypt("kvNpX9bQOxgysy1qTOdqb58kr8+QbKLPmA5dwFIL6oh/5+jOISQu4ZwCqMPz0H0gfziPkRV1A1Oi5oMdLtMZTLjl0iq1o2h6tiwTJA+ghzkJBiSKD8VHuV7hF3KQm09hraugX+aO5yPNluOgPdxKBtQIKNDhOAIvFiLWps/EHwjIlmAZ6QB55mAWg4FkQHD+"));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}
