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
import android.widget.Toast;

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
        tilUser = (TextInputLayout) findViewById(R.id.tilUserLogIn);
        tilPass = (TextInputLayout) findViewById(R.id.tilPassword);
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

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tilUser.getEditText().getText().toString().trim().isEmpty()) {
                    tilUser.setError("Vui l??ng nh???p T??i kho???n ng?????i d??ng");
                } else {
                    tilUser.setErrorEnabled(false);
                }
                if (tilPass.getEditText().getText().toString().trim().isEmpty()) {
                    tilPass.setError("Vui l??ng nh???p m???t kh???u");
                } else {
                    tilPass.setErrorEnabled(false);
                }
                if (tilUser.getEditText().getText().toString().equalsIgnoreCase("admin") && tilPass.getEditText().getText().toString().equalsIgnoreCase("admin")) {
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "????ng nh???p th???t b???i", Toast.LENGTH_SHORT).show();
                }
            }
        });


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
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    Thread thread = new Thread() {
        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            count++;
                            TransitionManager.beginDelayedTransition(viewGroup);
                            if (count == 5) {
                                tvQuotes.setVisibility(View.INVISIBLE);
                            } else if (count == 6) {
                                tvQuotes.setVisibility(View.VISIBLE);
                                tvQuotes.setText("C??ng kh??m ph?? b???ng x???p h???ng c??c b???n nh???c \n ???????c y??u th??ch");
                            } else if (count == 11) {
                                tvQuotes.setVisibility(View.INVISIBLE);
                            } else if (count == 12) {
                                tvQuotes.setVisibility(View.VISIBLE);
                                tvQuotes.setText("H??y ????ng nh???p ????? tr???i nghi???m t???i ??a c??ng \n \"MUSICNAME\"");
                            } else if (count == 17) {
                                tvQuotes.setVisibility(View.INVISIBLE);
                            } else if (count == 18) {
                                tvQuotes.setVisibility(View.VISIBLE);
                                tvQuotes.setText("Nghe nh???c b???t c??? ????u b???t c??? n???i n??o");
                            } else if (count == 23) {
                                tvQuotes.setVisibility(View.INVISIBLE);
                            } else if (count == 24) {
                                tvQuotes.setVisibility(View.VISIBLE);
                                tvQuotes.setText("S??? h???u c??c b??i h??t Hot nh???t hi???n nay");
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

    private void openSkipLogInDialog() {
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
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}