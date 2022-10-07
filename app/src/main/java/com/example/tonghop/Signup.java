package com.example.tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;

public class Signup extends AppCompatActivity {
    Button bDangky ;
    ImageView imgBack;
    EditText edtUserSU, edtPassSU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        bDangky= (Button) findViewById(R.id.buttonSignup1);
        edtUserSU = (EditText) findViewById(R.id.editUser1);
        edtPassSU = (EditText) findViewById(R.id.editPassword1);

        bDangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Signup.this, "Đăng kí tài khoản thành công!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Signup.this, Login.class);
                startActivity(intent);
            }
        });
     imgBack = (ImageView) findViewById(R.id.imageviewBack);
     imgBack.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent back = new Intent(Signup.this, Login.class);
             startActivity(back);
         }
     });
    }

}



