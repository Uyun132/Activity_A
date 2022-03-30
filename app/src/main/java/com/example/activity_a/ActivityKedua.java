package com.example.activity_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {
    TextView txUser, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
        //manggil id dari layout lain
        txUser = (TextView) findViewById(R.id.tvUser); //R.id karena nyari id layout
        txPassword = (TextView) findViewById(R.id.tvPass);

        //ngambil kontent yg di dalam bundle, simpen ke variable
        Bundle bundle = getIntent().getExtras();
        String user = bundle.getString("a"); // ngambil bundle dengan key "a"
        String password = bundle.getString("b");

        //isi bundle dimasukan ke layout text
        txUser.setText(user);
        txPassword.setText(password);
        //Jangan lupa daftarin layouttnya ke androidmanifest!
    }
}