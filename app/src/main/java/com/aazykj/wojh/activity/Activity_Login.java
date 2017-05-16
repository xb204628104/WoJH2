package com.aazykj.wojh.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.aazykj.wojh.R;
import com.aazykj.wojh.utils.W;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zykj on 2017/5/16.
 */

public class Activity_Login extends Activity {
    @Bind(R.id.tv_login_zhuce)
    TextView tvLoginZhuce;
    @Bind(R.id.et_login_num)
    EditText etLoginNum;
    @Bind(R.id.et_login_pwd)
    EditText etLoginPwd;
    @Bind(R.id.bt_login_ok)
    Button btLoginOk;
    @Bind(R.id.tv_login_forget)
    TextView tvLoginForget;
    private String pwd;
    private String unm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_login_zhuce, R.id.bt_login_ok, R.id.tv_login_forget})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_login_zhuce:
                Intent intent=new Intent(Activity_Login.this,Activity_Signin.class);
                startActivity(intent);
                break;
            case R.id.bt_login_ok:
                unm = etLoginNum.getText().toString().trim();
                pwd = etLoginPwd.getText().toString().trim();
                if (TextUtils.isEmpty(unm)){
                    W.t("手机号不能为空");
                    return;
                }
                if (!W.isPhoneNO(unm)){
                    W.t("请输入正确的手机号");
                    return;
                }
                if (TextUtils.isEmpty(pwd)){
                    W.t("密码不能为空");
                    return;
                }
                /*if (!W.rexCheckPassword(pwd)){
                    W.t("请输入正确的密码");
                    return;
                }*/
                Intent intent1=new Intent(Activity_Login.this,Activity_Main.class);
                startActivity(intent1);
                break;
            case R.id.tv_login_forget:
                break;
        }
    }
}
