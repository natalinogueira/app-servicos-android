package com.univesp.servicoscomunidade.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.univesp.servicoscomunidade.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaServicosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Exemplo 1:
        //Toast.makeText(this, "NATALI", Toast.LENGTH_SHORT).show();

        //Exemplo 2:
        //TextView servico = new TextView(this);
        //servico.setText("NATALI");
        //setContentView(servico);

        //Exemplo 3:
        //setContentView(R.layout.activity_main);

        //Exemplo 4:
        /*setContentView(R.layout.activity_main);
        List<String> servicos = new ArrayList<String>(Arrays.asList("Magali", "Mônica", "Cebolinha", "Cascão"));
        TextView aluno1 = findViewById(R.id.textView);
        TextView aluno2 = findViewById(R.id.textView2);
        TextView aluno3 = findViewById(R.id.textView3);
        TextView aluno4 = findViewById(R.id.textView4);
        aluno1.setText(servicos.get(0));
        aluno2.setText(servicos.get(1));
        aluno3.setText(servicos.get(2));
        aluno4.setText(servicos.get(3));*/

        //Exemplo 5:
        setContentView(R.layout.activity_lista_servicos);
        setTitle("Lista de Serviços");
        List<String> servicos = new ArrayList<>(Arrays.asList("Marceneiro", "Doces e Salgados", "Serralheiro", "Pedreiro"));
        ListView listaServicos = findViewById(R.id.activity_lista_servicos_listview);
        listaServicos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, servicos));

    }
}
