package com.android.DataMahasiswaList;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    ImageView d_foto;
    private TextView d_nama, d_nim, d_email, d_fakultas, d_prodi, d_smstr, d_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detail);
        getSupportActionBar().setTitle("Data Mahasiswa");

        d_nama = findViewById(R.id.nama_mahasiswa);
        d_nim = findViewById(R.id.nim_mahasiswa);
        d_email = findViewById(R.id.email_mahasiswa);
        d_fakultas = findViewById(R.id.fklts_mahasiswa);
        d_prodi = findViewById(R.id.prodi_mahasiswa);
        d_smstr = findViewById(R.id.sem_mahasiswa);
        d_status = findViewById(R.id.stat_mahasiswa);
        d_foto = findViewById(R.id.foto_mahasiswa);

        setData();
    }

    @SuppressLint("SetTextI18n")
    private void setData(){
        String nama = getIntent().getExtras().getString("nama");
        String nim = getIntent().getExtras().getString("nim");
        String email = getIntent().getExtras().getString("email");
        String fklts = getIntent().getExtras().getString("fklts");
        String prodi = getIntent().getExtras().getString("prodi");
        String smstr = getIntent().getExtras().getString("smstr");
        String stat = getIntent().getExtras().getString("stat");
        String foto = getIntent().getExtras().getString("foto");

        d_nama.setText(nama);
        d_nim.setText(nim);
        d_email.setText(email);
        d_fakultas.setText(fklts);
        d_prodi.setText(prodi);
        d_smstr.setText(smstr);
        d_status.setText(stat);
        Picasso.get().load(foto).into(d_foto);
    }
}
