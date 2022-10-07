package com.example.tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;

public class Listview extends AppCompatActivity {

    ListView lvbaihat;
    ArrayList<Baihat> arraybaihat;
    BaihatAdapter adapter;
    ImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        Anhxa();

        adapter = new BaihatAdapter(this,R.layout.dong_bai_hat, arraybaihat);
        lvbaihat.setAdapter(adapter);


        lvbaihat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Listview.this, Detail.class);
                Baihat baihat = arraybaihat.get(i);
                intent.putExtra("ten", baihat.getTen());
                intent.putExtra("noidung", baihat.getNoidung());
                intent.putExtra("mota", baihat.getMota());
                intent.putExtra("nhacsi", baihat.getNhacsi());
                intent.putExtra("ngay", baihat.getNgay());
                intent.putExtra("hinh", baihat.getHinh());
                startActivity(intent);
            }
        });

        imgProfile= (ImageView) findViewById(R.id.imageviewProfile);
        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Listview.this, Profile.class);
                startActivity(back);
            }
        });


    }
    private  void Anhxa(){
        lvbaihat = (ListView) findViewById(R.id.listviewBaihat);
        arraybaihat = new ArrayList<>();

        arraybaihat.add(new Baihat("Vô cùng","Phan Duy Anh","Vì Anh Thương Em","Đạt G"," 4 thg 4, 2018",R.drawable.vocung));
        arraybaihat.add(new Baihat(" Đi Về Nhà","Đen","Đi Về Nhà","Đen","18 thg 12, 2020",R.drawable.divenha));
        arraybaihat.add(new Baihat("Buồn Của Anh","Đạt G","Buồn Của Anh","Đạt G","15 thg 12, 2017 ",R.drawable.buoncuaanh));
        arraybaihat.add(new Baihat("Có Chắc Yêu Là Đây","Sơn Tùng M-TP","Có Chắc Yêu Là Đây","Sơn Tùng M-TP","5 thg 7, 2020 ",R.drawable.cochacyeuladay));
        arraybaihat.add(new Baihat("Vệ Tinh","HIEUTHUHAI x Hoàng Tôn","Vệ Tinh","HIEUTHUHAI x Hoàng Tôn","11 thg 8, 2022",R.drawable.vetinh));
        arraybaihat.add(new Baihat("Ngôi Sao Cô Đơn","JACK - J97","Ngôi Sao Cô Đơn ","JACK - J97","19 thg 7, 2022",R.drawable.ngoisaocodon));
    }


}