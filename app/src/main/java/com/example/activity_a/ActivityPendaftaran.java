package com.example.activity_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ActivityPendaftaran extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail,edtPassword, edtrepass;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);
        //////////////////

        //Harus dikasih access, kalo nggak progrmnya nyari null
        fab = (FloatingActionButton) findViewById(R.id.fabSimpan);
        edtNama = (EditText) findViewById(R.id.edNama);
        edtAlamat = (EditText) findViewById(R.id.edAlamat);
        edtEmail = (EditText) findViewById(R.id.edEmail);
        edtPassword = (EditText) findViewById(R.id.eePass);
        edtrepass = (EditText) findViewById(R.id.edrePass);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (edtNama.getText().toString().isEmpty()||
                        edtAlamat.getText().toString().isEmpty()||
                        edtEmail.getText().toString().isEmpty()||
                        edtPassword.getText().toString().isEmpty()||
                        edtrepass.getText().toString().isEmpty())
                {
                    Snackbar.make(view, "Seluruh Data Wajib Diisi!", Snackbar.LENGTH_LONG).show();
                    //biar muncul error merah" di samping edittextnya
                    edtNama.setError(null);
                    edtAlamat.setError(null);
                    edtEmail.setError(null);
                    edtPassword.setError(null);
                } // OK

                else {
                    if(edtPassword.getText().toString().equals(edtrepass.getText().toString())){
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil!", Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }else {
                        Snackbar.make(view, "Password Harus Sama!", Snackbar.LENGTH_LONG).show();
                        edtPassword.setError(null);
                        edtrepass.setError(null);
                    }
                }
            }
        });
    }
}