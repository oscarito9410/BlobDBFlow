package com.cetech.cardview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;
public class NotasListaActivity extends AppCompatActivity {

    private RecyclerView mRecyclerNotas;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas_lista);
        mRecyclerNotas = findViewById(R.id.rvNotas);
        AdapterNotas adpt = new AdapterNotas(this, getNotas());
        mRecyclerNotas.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerNotas.setAdapter(adpt);
    }
    private List <NotaTable> getNotas () {
        return SQLite.select().from(NotaTable.class).queryList();
    }
}
