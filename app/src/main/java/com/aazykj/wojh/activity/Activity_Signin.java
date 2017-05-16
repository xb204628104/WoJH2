package com.aazykj.wojh.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.aazykj.wojh.R;
import com.aazykj.wojh.bean.CountDownTimerUtils;
import com.aazykj.wojh.utils.W;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zykj on 2017/5/16.
 */

public class Activity_Signin extends Activity {
    @Bind(R.id.et_signin_num)
    EditText etSigninNum;
    @Bind(R.id.et_signin_yanzma)
    EditText etSigninYanzma;
    @Bind(R.id.bt_signin_yanzma)
    Button btSigninYanzma;
    @Bind(R.id.et_signin_pwd)
    EditText etSigninPwd;
    @Bind(R.id.et_signin_tuijanren)
    EditText etSigninTuijanren;
    @Bind(R.id.bt_signin_ok)
    Button btSigninOk;
    @Bind(R.id.iv_signin_back)
    ImageView ivSigninBack;
    private String unm;
    private String yanzma;
    private String pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_signin_yanzma, R.id.bt_signin_ok,R.id.iv_signin_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_signin_yanzma:
                unm = etSigninNum.getText().toString().trim();
                yanzma = etSigninYanzma.getText().toString().trim();
                pwd = etSigninPwd.getText().toString().trim();
                if (TextUtils.isEmpty(unm)){
                    W.t("手机号不能为空");
                    return;
                }
                if (!W.isPhoneNO(unm)){
                    W.t("请输入正确的手机号");
                    return;
                }
                CountDownTimerUtils countDownTimerUtils = new CountDownTimerUtils(btSigninYanzma, 60000, 1000);
                countDownTimerUtils.start();
                break;
            case R.id.bt_signin_ok:
                if (TextUtils.isEmpty(unm)){
                    W.t("手机号不能为空");
                    return;
                }
                if (TextUtils.isEmpty(yanzma)){
                    W.t("验证码不能为空");
                    return;
                }
                if (TextUtils.isEmpty(pwd)){
                    W.t("密码不能为空");
                    return;
                }

                if (!W.isPhoneNO(unm)){
                    W.t("请输入正确的手机号");
                    return;
                }
                if (!W.rexCheckPassword(pwd)){
                    W.t("请输入正确的密码");
                    return;
                }
                break;
            case R.id.iv_signin_back:
                Intent intent=new Intent(Activity_Signin.this,Activity_Login.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
