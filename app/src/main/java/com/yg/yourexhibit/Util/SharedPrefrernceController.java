package com.yg.yourexhibit.Util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by 2yg on 2017. 10. 18..
 */

public class SharedPrefrernceController {
    private static final String USER = "user";
    private static final String LOGIN_ID = "loginID";
    private static final String FACEBOOK_TOKEN = "facebookToken";
    private static final String NICKNAME = "nickname";
    private static final String EMAIL = "email";
    private static final String PASSWD = "passwd";
    private static final String IMAGE = "image";
    private static final String SELETED = "seleted";//얘가 자동로그인
    private static final String GALLERY = "gallery";


    public static void setLoginId(Context context, String loginType){
        SharedPreferences pref = context.getSharedPreferences(USER,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(LOGIN_ID, loginType);
        editor.commit();
    }
    public static String getLoginId(Context context){
        SharedPreferences pref = context.getSharedPreferences(USER, context.MODE_PRIVATE);
        String loginType = pref.getString(LOGIN_ID,"");
        return loginType;
    }
    public static void setFacebookToken(Context context,String token){
        SharedPreferences pref = context.getSharedPreferences(USER,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(FACEBOOK_TOKEN,token);
        editor.commit();
    }

    public static String getFacebookToken(Context context){
        SharedPreferences pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE);
        return pref.getString(FACEBOOK_TOKEN, "");
    }

    public static void setUserEmail(Context context,String email){
        SharedPreferences pref = context.getSharedPreferences(USER,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(EMAIL,email);
        editor.commit();
    }
    public static String getUserEmail(Context context){
        SharedPreferences pref = context.getSharedPreferences(USER, context.MODE_PRIVATE);
        return pref.getString(EMAIL,"");
    }

    public static void setPasswd(Context context, String passwd){
        SharedPreferences pref = context.getSharedPreferences(USER,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(PASSWD,passwd);
        editor.commit();
    }

    public static String getPasswd(Context context){
        SharedPreferences pref = context.getSharedPreferences(USER, context.MODE_PRIVATE);
        return pref.getString(PASSWD,"");
    }


    public static void setUserNickname(Context context, String nickname){
        SharedPreferences pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(NICKNAME, nickname);
        editor.commit();
    }

    public static String getUserNickname(Context context){
        SharedPreferences pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE);
        return pref.getString(NICKNAME, "");
    }

    public static void setUserImage(Context context, String image){
        SharedPreferences pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(IMAGE, image);
        editor.commit();
    }

    public static String getUserImage(Context context){
        SharedPreferences pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE);
        return pref.getString(IMAGE, "");
    }

    public static void setSelected(Context context, boolean selected){
        SharedPreferences pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(SELETED, selected);
        editor.commit();
    }

    public static boolean getSelected(Context context){
        SharedPreferences pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE);
        return pref.getBoolean(SELETED, false);
    }

    public static void setGallery(Context context, boolean selected){
        SharedPreferences pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(GALLERY, selected);
        editor.commit();
    }

    public static boolean getGallery(Context context){
        SharedPreferences pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE);
        return pref.getBoolean(GALLERY, false);
    }
}
