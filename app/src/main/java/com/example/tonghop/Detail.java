package com.example.tonghop;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class Detail extends AppCompatActivity {
    TextView txtTen, txtNoidung, txtMota, txtNgay, txtNhacsi;
    ImageView imgHinh,imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTen = (TextView) findViewById(R.id.textviewTen);
        txtNoidung = (TextView) findViewById(R.id.textviewNoidung);
        txtMota = (TextView) findViewById(R.id.textviewMota);
        txtNhacsi = (TextView) findViewById(R.id.textviewNhacsi);
        txtNgay = (TextView) findViewById(R.id.textviewNgay);
        imgHinh = (ImageView) findViewById(R.id.imageviewHinh);


        Intent intent = getIntent();
        String Ten = intent.getStringExtra("ten");
        txtTen.setText(Ten);

        String Noidung = intent.getStringExtra("noidung");
        txtNoidung.setText(Noidung);

        String Mota = intent.getStringExtra("mota");
        txtMota.setText(Mota);

        String Nhacsi = intent.getStringExtra("nhacsi");
        txtNhacsi.setText(Nhacsi);

        String Ngay= intent.getStringExtra("ngay");
        txtNgay.setText(Ngay);


        int Hinh= intent.getIntExtra("hinh",1);
        imgHinh.setImageResource(Hinh);


        imgBack = (ImageView) findViewById(R.id.imageviewBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Detail.this, Listview.class);
                startActivity(back);
            }
        });

    }
}