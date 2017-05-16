package com.aazykj.wojh.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import com.orhanobut.logger.Logger;

/**
 * Created by zykj on 2017/5/16.
 */

public class W {
    public static Context context; //全局上下文
    public  static  boolean isLog=true; //控制日志打印的开关

    /**
     * 输出log日志
     * @param str
     */
    public static  void i(String  str){
        if(isLog)
            Logger.i(str);
    }
    /**
     * 吐司功能只需要传入一个 字符串
     * @param str
     */
    public static  void t(String  str){
        Toast.makeText(context,str, Toast.LENGTH_LONG).show();
    }
    /*
 * 手机号正则
 * */
    public static boolean isPhoneNO(String mobiles) {
    /*
    移动：134、135、136、137、138、139、150、151、157(TD)、158、159、187、188
    联通：130、131、132、152、155、156、185、186
    电信：133、153、180、189、（1349卫通）
    总结起来就是第一位必定为1，第二位必定为3或5或8，其他位置的可以为0-9
    */
        String telRegex = "[1][358]\\d{9}";//"[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
        if (TextUtils.isEmpty(mobiles))
            return false;
        else
            return mobiles.matches(telRegex);
    }
    /*
* 密码正则
* */
    public static boolean rexCheckPassword(String input) {
        // 6-20 位，字母、数字、字符
        //String reg = "^([A-Z]|[a-z]|[0-9]|[`-=[];,./~!@#$%^*()_+}{:?]){6,20}$";
        String regStr = "^([A-Z]|[a-z]|[0-9]|[`~!@#$%^&*()+=|{}':;',\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“'。，、？]){6,20}$";
        if (TextUtils.isEmpty(input))
            return false;
        else
        return input.matches(regStr);
    }


}
