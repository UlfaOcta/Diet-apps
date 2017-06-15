package com.example.user.mydiet;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by User on 14/06/2017.
 */

public class MainHasilDiagnosa extends AppCompatActivity {

    Button bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_hasil_diagnosa);

        bt3 = (Button) findViewById(R.id.bt_workout);
        bt3.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainHasilDiagnosa.this, MainLayoutDepan.class);
                startActivity(intent);
            }
        });

        Bundle b = getIntent().getExtras();
        //membuat obyek dari vidget textView
        TextView nama = (TextView) findViewById(R.id.view_nama);
        TextView umur = (TextView) findViewById(R.id.view_umur);
        TextView jeniskelamin = (TextView) findViewById(R.id.view_jeniskelamin);
        TextView berat_badan = (TextView) findViewById(R.id.view_bb);
        TextView penyakit = (TextView) findViewById(R.id.view_penyakit);
        TextView hasilsaran = (TextView) findViewById(R.id.view_hasilsaran);

        //mensetting nilai dari widget textView
        nama.setText(b.getCharSequence("nama"));
        umur.setText(b.getCharSequence("umur"));
        jeniskelamin.setText(b.getCharSequence("jeniskelamin"));
        berat_badan.setText(b.getCharSequence("berat badan"));
        penyakit.setText(b.getCharSequence("penyakit"));
        hasilsaran.setText(b.getCharSequence("hasil saran"));

    }
}
