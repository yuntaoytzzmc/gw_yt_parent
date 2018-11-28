package util;



import sun.misc.BASE64Encoder;

import java.security.MessageDigest;


/**
 *
 * md5  加密  但是不能解密
 */
public class MD5UTIL {
    public static String MD5Encrypt64(String password)
     {
         String newstr="";
        try {
        MessageDigest md5= MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        newstr=base64en.encode(md5.digest(password.getBytes("utf-8")));
        }catch (Exception e){
            e.printStackTrace();
        }
         return newstr;
    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String ters =MD5Encrypt64("yuntao");
        System.out.println(ters);
    }
}
