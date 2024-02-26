package com.example.dsrmobile.uts_stephanie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ubahProfil extends AppCompatActivity {

    EditText isiNIM, isiNama, isiJurusan,isiTahun,isiKampus;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah_profil);

        isiNIM = (EditText) findViewById(R.id.isiNIM);
        isiNIM.setText("03081220016");

        isiNama = (EditText) findViewById(R.id.isiNama);
        isiNama.setText("Stephanie");

        isiJurusan = (EditText) findViewById(R.id.isiJurusan);
        isiJurusan.setText("Sistem Informasi");

        isiTahun = (EditText) findViewById(R.id.isiTahun);
        isiTahun.setText("2022");

        isiKampus = (EditText) findViewById(R.id.isiKampus);
        isiKampus.setText("UPH Medan");

        Spinner isiStatus = (Spinner) findViewById(R.id.isiStatus);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.status_mahasiswa,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        isiStatus.setAdapter(adapter);

        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ubahProfil.this, MainActivity.class);
                startActivity(intent);

                String nim = isiNIM.getText().toString();
                String nama = isiNama.getText().toString();
                String jurusan = isiJurusan.getText().toString();
                String tahun = isiTahun.getText().toString();
                String status = isiStatus.getSelectedItem().toString();
                String kampus = isiKampus.getText().toString();

                String message = "Student ID: " + nim +
                        "\nNama: " + nama +
                        "\nJurusan: " + jurusan +
                        "\nTahun Masuk: " + tahun +
                        "\nStatus Mahasiswa: " + status +
                        "\nKampus: " + kampus;
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(ubahProfil.this, message, duration);
                toast.show();
            }
        });
    }

}