package com.example.login_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginBtn = null;
    TextView findPwTxt = null;
    TextView signUpTxt = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        findPwTxt = findViewById(R.id.findPwTxt);
        signUpTxt = findViewById(R.id.signUpTxt);

//        로그인 버튼의 글자를 => 회원가입으로 바꾸자.
        loginBtn.setText("회원가입");

        findPwTxt.setText("비번 찾기");

//        로그인 버튼이 눌리면 => 비번 찾기 버튼을 "AAA"로 변경
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findPwTxt.setText("AAA");
            }
        });
//      클릭은 버튼 뿐만 아니라 모든 뷰가 다 눌릴 수 있다 _=> 텍스트뷰도 가능

        findPwTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findPwTxt.setText("비밀번호 찾기");
            }
        });

        loginBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                loginBtn.setText("로그인");
                return true; // 손을 뗐을떄, onClick실행을 막을건지?
            }
        });

//        회원가입을 누르면 => "회원가입 화면으로 이동합니다." 안내문구 출력
        signUpTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "회원가입 화면으로 이동합니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
