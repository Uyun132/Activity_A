package com.example.activity_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private ListView list;
    private ListViewAdapter adapter;
    String[] listNama;

    public static ArrayList<ClassName> classNameArrayList = new ArrayList<ClassName>();

    Bundle bundle = new Bundle();

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        listNama = new String[]{"Inayah","Ilham","Eris","Fikri","Maul","Intan","Vina","Gita","Vian","Lutfi"};
        list = findViewById(R.id.listKontak);

        classNameArrayList = new ArrayList<>();

        for(int i = 0; i <listNama.length; i++){
            ClassName className = new ClassName(listNama[i]);
            classNameArrayList.add(className);
        }

        adapter = new ListViewAdapter(this);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nama = classNameArrayList.get(position).getName();

                bundle.putString("a",nama.trim());

                PopupMenu pm = new PopupMenu(getApplicationContext(),view);
                pm.setOnMenuItemClickListener(Home_Activity.this);

                pm.inflate(R.menu.popup_menu);
                pm.show();
            }
        });

    }



    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.mnviev:
                intent = new Intent(getApplicationContext(),ActivityLihatData.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(),"Ini untuk edit kont",Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}