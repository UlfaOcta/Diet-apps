package com.example.user.mydiet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainFormDiagnosa extends AppCompatActivity implements View.OnClickListener {

    //mendeklarasikan variabel
    Button bt2;
    RadioGroup genderRadio;
    RadioGroup penyakitRadio;
    EditText nama, umur, berat_badan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_form_diagnosa);
        findAllViewsId();
        bt2.setOnClickListener(this);
    }

    private void findAllViewsId() {
        bt2 = (Button) findViewById(R.id.bt_lihathasil);
        nama = (EditText) findViewById(R.id.input_nama);
        umur = (EditText) findViewById(R.id.input_umur);
        berat_badan = (EditText) findViewById(R.id.input_bb);
        genderRadio = (RadioGroup) findViewById(R.id.input_jeniskelamin);
        penyakitRadio = (RadioGroup) findViewById(R.id.input_penyakit);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MainHasilDiagnosa.class);
        //Membuat obyek bundle
        Bundle b = new Bundle();
        //Menyisipkan tipe data String ke dalam obyek bundle
        b.putString("nama", nama.getText().toString());
        b.putString("umur", umur.getText().toString());
        int id = genderRadio.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(id);
        b.putString("jeniskelamin", radioButton.getText().toString());
        //Menambahkan bundle intent
        intent.putExtras(b);
        //memulai activity kedua
        startActivity(intent);

    }
}
