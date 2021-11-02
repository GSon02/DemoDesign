package com.example.demodesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    private TextInputLayout tilUser;
    private TextInputLayout tilPass;
    private AppCompatButton btnSignIn;
    private AppCompatButton btnSkipLogIn;
    private TextView tvDangKy;
    private TextView tvLostPass;
    private TextView tvXinChao;
    private TextView tvDesText;
    private ViewGroup viewGroup;
    private TextView tvQuotes;
    private TextView tvNull;
    private Dialog dialog;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        viewGroup = findViewById(R.id.containerLogIn);
        tilUser = (TextInputLayout) findViewById(R.id.tilUser);
        tilPass = (TextInputLayout) findViewById(R.id.tilPass);
        btnSignIn = (AppCompatButton) findViewById(R.id.btnSignIn);
        tvLostPass = (TextView) findViewById(R.id.tvLostPass);
        tvXinChao = (TextView) findViewById(R.id.tvXinChao);
        tvDesText = (TextView) findViewById(R.id.tv_DesText);
        tvQuotes = (TextView) findViewById(R.id.tvQuotes);
        btnSkipLogIn = (AppCompatButton) findViewById(R.id.btnSkipLogIn);
        tvDangKy = (TextView) findViewById(R.id.tvDangKy);
        tvNull = (TextView) findViewById(R.id.tvTextNull);

        tvQuotes.setVisibility(View.INVISIBLE);
        tilUser.setVisibility(View.GONE);
        tilPass.setVisibility(View.GONE);
        btnSignIn.setVisibility(View.GONE);
        tvLostPass.setVisibility(View.GONE);
        tvXinChao.setVisibility(View.GONE);
        tvDesText.setVisibility(View.GONE);
        btnSkipLogIn.setVisibility(View.GONE);
        tvDangKy.setVisibility(View.GONE);
        tvNull.setVisibility(View.GONE);


        btnSkipLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSkipLogInDialog();
            }
        });

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        thread.start();
        CountDownTimer countDownTimer = new CountDownTimer(1000, 100) {
            @Override
            public void onTick(long l) {

            }
            @Override
            public void onFinish() {
                TransitionManager.beginDelayedTransition(viewGroup);
                tilUser.setVisibility(View.VISIBLE);
                tilPass.setVisibility(View.VISIBLE);
                btnSignIn.setVisibility(View.VISIBLE);
                tvLostPass.setVisibility(View.VISIBLE);
                tvXinChao.setVisibility(View.VISIBLE);
                tvDesText.setVisibility(View.VISIBLE);
                tvQuotes.setVisibility(View.VISIBLE);
                btnSkipLogIn.setVisibility(View.VISIBLE);
                tvDangKy.setVisibility(View.VISIBLE);
                tvNull.setVisibility(View.VISIBLE);
            }
        }.start();

        tvDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    Thread thread = new Thread(){
        @Override
        public void run() {
            while (!isInterrupted()){
                try {
                    Thread.sleep(1000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            count++;
                            TransitionManager.beginDelayedTransition(viewGroup);
                            if(count == 5){
                                tvQuotes.setVisibility(View.INVISIBLE);
                            }else if(count == 6){
                                tvQuotes.setVisibility(View.VISIBLE);
                                tvQuotes.setText("Cùng khám phá bảng xếp hạng các bản nhạc \n được yêu thích");
                            }else if(count == 11){
                                tvQuotes.setVisibility(View.INVISIBLE);
                            }else if(count == 12){
                                tvQuotes.setVisibility(View.VISIBLE);
                                tvQuotes.setText("Hãy đăng nhập để trải nghiệm tối đa cùng \n \"MUSICNAME\"");
                            }else if(count == 17){
                                tvQuotes.setVisibility(View.INVISIBLE);
                            }else if(count == 18){
                                tvQuotes.setVisibility(View.VISIBLE);
                                tvQuotes.setText("Nghe nhạc bất cứ đâu bất cứ nới nào");
                            }else if(count == 23){
                                tvQuotes.setVisibility(View.INVISIBLE);
                            }else if(count == 24){
                                tvQuotes.setVisibility(View.VISIBLE);
                                tvQuotes.setText("Sở hữu các bài hát Hot nhất hiện nay");
                                count = 0;
                                run();
                            }
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private AppCompatButton btnCancelLogin;
    private AppCompatButton btnYesLogIn;

    private void openSkipLogInDialog(){
        dialog = new Dialog(LoginActivity.this);
        dialog.setContentView(R.layout.skiplogin_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        btnCancelLogin = (AppCompatButton) dialog.findViewById(R.id.btnCancelLogin);
        btnYesLogIn = (AppCompatButton) dialog.findViewById(R.id.btnYesLogIn);
        dialog.show();
        btnCancelLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        btnYesLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}