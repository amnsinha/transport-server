package com.transport.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Locale;

@Service
public class DataHideUtils {

    private static final BCryptPasswordEncoder passwordEcorder = new BCryptPasswordEncoder();

    public static String bcryptEncryptor(String plainText) {
        return passwordEcorder.encode(plainText);
    }

    public static Boolean doPasswordsMatchBcrypt(String rawPassword, String encodedPassword) {
        return passwordEcorder.matches(rawPassword, encodedPassword);
    }


    public static String getMD5(String otp) {
        String result = null;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(otp.getBytes(StandardCharsets.UTF_8));
            result = String.format(Locale.ROOT, "%032x",
                    new BigInteger(1, md.digest()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
        return result;
    }

    public static String timetosec(String time) {
        String result = null;
        if (time != null) {
            String[] strings = time.split(":");
            int min = Integer.parseInt(strings[0]);
            int sec = Integer.parseInt(strings[1]);
            result = String.valueOf(min * 60 + sec);
        }
        return result;
    }

    public static String sectotime(int time) {
        String result = null;
        if (time != 0) {
            int min = time / 60;
            int sec = time % 60;
            result = (min < 10 ? "0" + min : min) + ":"
                    + (sec < 10 ? "0" + sec : sec);
        }
        return result;
    }


    public static String encodeBase64(String string) {
        byte[] byteArray = Base64.getEncoder().encode(string.getBytes());
        String encodedString = new String(byteArray);
        return encodedString;
    }

    public static String decodeBase64(String string) {
        byte[] byteArray = Base64.getDecoder().decode(string);
        String encodedString = new String(byteArray);
        return encodedString;
    }

//    @Bean
//    public PasswordEncoder encoder() {
//        return new BCryptPasswordEncoder();
//    }


}
