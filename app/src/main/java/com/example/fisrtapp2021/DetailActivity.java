package com.example.fisrtapp2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.fisrtapp2021.adapters.NameAdapter;

import java.util.Arrays;
import java.util.List;

public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.i("MAIN_APP", "Iniciando segunda actividad");

        //Lista de nombres
        RecyclerView rv = findViewById(R.id.rvNames);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        List<String> datos = Arrays.asList("Eliana Oblitas", "Mario Reyes", "Hugo Cervera", "Isabel Oblitas", "Maira Diaz", "Maria Rodriguez", "Luz Cervera", "Daniel Fernandez", "Ana Chavez", "David Diaz");
        NameAdapter adapter = new NameAdapter(datos);

        //List<String> datos2 = Arrays.asList("992148688", "974652356", "985364298", "974269873", "985367168", "975397165", "985486245", "970741122", "988641284", "975632976");
        //NameAdapter adapter2 = new NameAdapter(datos2);


        rv.setAdapter(adapter);//Poder llenar los elementos
        //rv.setAdapter(adapter2);//Poder llenar los elementos

    }
}