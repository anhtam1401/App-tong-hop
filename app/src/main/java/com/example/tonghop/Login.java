package com.example.tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button   btnCreate;
    ImageButton btnLogin;
    ImageView btnSignUp;
    EditText edtUser, edtPassWord, edtUserSU, edtPassSU;
    String ten,mk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AnhXa();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtUser.getText().length() != 0 && edtPassWord.getText().length() !=0){
                    if (edtUser.getText().toString().equals(ten) && edtPassWord.getText().toString().equals(mk)) {
                        Toast.makeText(Login.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, Listview.class);
                        startActivity(intent);
                    }else if (edtUser.getText().toString().equals("anhtam") && edtPassWord.getText().toString().equals("123")){
                        Toast.makeText(Login.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this,Listview.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(Login.this,"Sai mật khẩu",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(Login.this,"Vui lòng nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Login.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.activity_signup);

                Window window = dialog.getWindow();
                if (window == null) {
                    return;
                }

                window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
                window.setBackgroundDrawable( new ColorDrawable(Color.TRANSPARENT));

                btnCreate = (Button) dialog.findViewById(R.id.buttonSignup1);
                edtUserSU = (EditText) dialog.findViewById(R.id.editUser1);
                edtPassSU = (EditText) dialog.findViewById(R.id.editPassword1);
                btnCreate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ten = edtUserSU.getText().toString().trim();
                        mk  = edtPassSU.getText().toString().trim();
                        Toast.makeText(Login.this, "", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
    }

    private void AnhXa() {
        btnLogin = (ImageButton) findViewById(R.id.buttonSignin);
        btnSignUp = (ImageView) findViewById(R.id.buttonSignup);
        edtUser = (EditText) findViewById(R.id.editUser);
        edtPassWord = (EditText) findViewById(R.id.editPassword);

    }
}
