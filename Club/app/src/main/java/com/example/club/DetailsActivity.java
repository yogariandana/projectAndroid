package com.example.club;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {
    public static final String nama="nama";
    public static final String deskripsi="deskripsi";
    public static final String keterangan="keterangan";
    public static final String gambar="NULL";
    public ImageView imdata;
    public TextView tvdesdata;
    public TextView tvnamadata;
    public TextView tvketerangandata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail );

        tvnamadata= findViewById( R.id.tv_nama );
        tvdesdata = findViewById( R.id.tv_des );
        tvketerangandata = findViewById( R.id.tv_ket);
        imdata = findViewById( R.id.img_menu );

        String simpanama = getIntent().getStringExtra(nama);
        String simpandeskripsi = getIntent().getStringExtra(deskripsi);
        String simpanketarangan = getIntent().getStringExtra(keterangan);
        String simpangambar = getIntent().getStringExtra(gambar);

        tvnamadata.setText(simpanama);
        tvdesdata.setText(simpandeskripsi);
        tvketerangandata.setText(simpanketarangan);
        Glide
                .with(this)
                .load(simpangambar)
                .centerCrop()
                .into(imdata);
    }
}

