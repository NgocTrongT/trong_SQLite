package com.example.sqlite_sinh_vien;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.sqlite_sinh_vien.adapter.SinhVienAdapter;
import com.example.sqlite_sinh_vien.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvSinhVien;
    private List<SinhVien> sinhVienList;
    private SinhVienAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //anh xa
        lvSinhVien = (ListView) findViewById(R.id.lv_sinhvien);
        //co du lieu
        sinhVienList = new ArrayList<SinhVien>();
        SinhVien sv1 = new SinhVien(348,"Hoàng Bùi Ngọc Trọng",0,"098112233","hoangbuingoctrong@gmail.com");
        sinhVienList.add(sv1);
        SinhVien sv2 = new SinhVien(2,"Ti",1,"098112244","ti@gmail.com");
        sinhVienList.add(sv2);
        SinhVien sv3 = new SinhVien(3,"Teo",0,"098112264","teo@gmail.com");
        sinhVienList.add(sv3);
        SinhVien sv4 = new SinhVien(4,"To",1,"098112288","to@gmail.com");
        sinhVienList.add(sv4);

        adapter = new SinhVienAdapter(getApplicationContext(),sinhVienList);
        lvSinhVien.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_them){
            Intent intent = new Intent(MainActivity.this,AddActivity.class);
            startActivity(intent);
        }
        if(id == R.id.menu_thoat){
            finish();
        }
        return true;
    }
}