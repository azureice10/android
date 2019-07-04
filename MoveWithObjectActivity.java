package com.example.intent1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {
    TextView tvObject;
    public static final String EXTRA_MHS = "extra_mhs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        tvObject = findViewById(R.id.tv_object_received);
        Mhs mhs = getIntent().getParcelableExtra(EXTRA_MHS);
        String text = "NIP : " + mhs.getNpm() + ",\nNama : " + mhs.getNama() + ",\nUmur : " + mhs.getUmur() + ",\nKelas : " + mhs.getKelas();
        tvObject.setText(text);
    }
}
