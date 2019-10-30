package com.kuis.lukas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity  extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KeluargaAdapter keluargaAdapter;
    private ArrayList<Keluarga>keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        keluargaAdapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keluargaAdapter);
    }
    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Laurensius", "Ayah",  getDrawable(R.drawable.ayah)));
        keluargaArrayList.add(new Keluarga("Monika", "Ibu", getDrawable(R.drawable.ibu)));
        keluargaArrayList.add(new Keluarga("Tono", "Anak Pertama", getDrawable(R.drawable.tono)));
        keluargaArrayList.add(new Keluarga("Lukas Paryanto", "Anak Kedua", getDrawable(R.drawable.lukas)));
    }
}
