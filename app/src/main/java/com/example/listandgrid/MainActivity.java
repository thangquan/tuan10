package com.example.listandgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String ten[] ={
            "Giày Thể Thao XSPORT Ni.ke Air Force 1 Full Trắng SF",
            "Giày Thể Thao XSPORT Con.verse Cổ Cao",
            "Giày Thể Thao XSPORT Adi.das XPLR Rep",
            "Giày Thể Thao XSPORT MLB",
            "Giày Thể Thao XSPORT Ni.ke force 1 shadow",
            "Giày Thể Thao XSPORT Prophere Rep",
            "Giày Thể Thao XSPORT Adi.das Prophere Rep",
            "Giày Thể Thao XSPORT Ni.ke Zoom 879 Xám Trắng",
            "Giày Thể Thao XSPORT Ni.ke Zoom N213",
    };
    int hinh[] ={R.drawable.h1,R.drawable.h2,R.drawable.h3,R.drawable.h4,R.drawable.h5,R.drawable.h6,
            R.drawable.h1, R.drawable.h1,R.drawable.h1
    };
    String phi[] ={
            "FREE SHIPPING",
            "FREE SHIPPING",
            "FREE SHIPPING",
            "FREE SHIPPING",
            "FREE SHIPPING",
            "FREE SHIPPING",
            "FREE SHIPPING",
            "FREE SHIPPING",
            "FREE SHIPPING",
    };
    String gia[] ={
            "$234.00","$234.00","$234.00","$234.00","$234.00","$234.00","$234.00","$234.00", "$234.00",
    };
    String rbar[]={};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        ListviewAdapter listviewAdapter = new ListviewAdapter(this,ten,hinh,phi,gia,rbar);
        listView.setAdapter(listviewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,ten[i],Toast.LENGTH_LONG).show();
            }
        });
    }
}