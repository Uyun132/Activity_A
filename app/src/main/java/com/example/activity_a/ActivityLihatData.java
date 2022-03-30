package com.example.activity_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tcnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama){
            case "Inayah":
                tcnama.setText("Inayah M");;
                tvnomor.setText("08122233344");
                break;
            case "Ilham":
                tcnama.setText("Ilham R");;
                tvnomor.setText("08133224455");
                break;
            case "Eris":
                tcnama.setText("Eris J");;
                tvnomor.setText("08125533344");
                break;
            case "Fikri":
                tcnama.setText("M Fikri");;
                tvnomor.setText("08122453344");
                break;
            case "Maul":
                tcnama.setText("Maul M");;
                tvnomor.setText("08122536455");
                break;
            case "Intan":
                tcnama.setText("Intan S");;
                tvnomor.setText("08123324355");
                break;
            case "Vina":
                tcnama.setText("Vina R");;
                tvnomor.setText("08152443552");
                break;
            case "Gita":
                tcnama.setText("Gita S");;
                tvnomor.setText("081524435625");
                break;
            case "Lutfi":
                tcnama.setText("Lutfi M");;
                tvnomor.setText("081222443524");
                break;
            case "Vian":
                tcnama.setText("Vian M");;
                tvnomor.setText("085854244353");
                break;

        }
    }
}