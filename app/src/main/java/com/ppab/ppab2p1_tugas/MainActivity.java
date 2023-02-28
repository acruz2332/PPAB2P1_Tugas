package com.ppab.ppab2p1_tugas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private boolean isFullContent = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.show);
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FragmentTugas fragmentTugas = FragmentTugas.newInstance();

        FT.add(R.id.frame_content, fragmentTugas).addToBackStack(null).commit();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isFullContent){
                    FragmentTugas fragmentTugas1 = (FragmentTugas) FM.findFragmentById(R.id.frame_content);
                    fragmentTugas1.close();
                    isFullContent = false;
                    btn.setText("LIHAT SELENGKAPNYA");
                }else{
                    FragmentTugas fragmentTugas1 = (FragmentTugas) FM.findFragmentById(R.id.frame_content);
                    fragmentTugas1.showAll();
                    isFullContent = true;
                    btn.setText("TUTUP");
                }
            }
        });
    }
}