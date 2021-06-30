package com.univesp.servicoscomunidade.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.univesp.servicoscomunidade.R;
import com.univesp.servicoscomunidade.dao.ServicoDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaServicosActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Lista de Serviços";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ServicoDAO dao = new ServicoDAO();

        setContentView(R.layout.activity_lista_servicos);
        setTitle(TITLE_APPBAR);

        FloatingActionButton botaoNovoServico = findViewById(R.id.activity_lista_servicos_fab_novo_servico);
        botaoNovoServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(ListaServicosActivity.this, FormularioServicoActivity.class));
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        ServicoDAO dao = new ServicoDAO();
        ListView listaServicos = findViewById(R.id.activity_lista_servicos_listview);
        listaServicos.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, dao.listaServicos()));
    }
}
