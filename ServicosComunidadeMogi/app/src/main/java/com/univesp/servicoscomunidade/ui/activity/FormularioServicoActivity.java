package com.univesp.servicoscomunidade.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.univesp.servicoscomunidade.R;
import com.univesp.servicoscomunidade.dao.ServicoDAO;
import com.univesp.servicoscomunidade.model.Servico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormularioServicoActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Novo Serviço";
    private EditText campoNome;
    private EditText campoTipoServico;
    private EditText campoRedesSociais;
    private EditText campoTelefone;
    private EditText campoEmail;
    private final ServicoDAO dao = new ServicoDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_servico);

        setTitle(TITLE_APPBAR);
        inicializaCampos();

        Button botaoSalvar = findViewById(R.id.activity_formulario_servico_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(FormularioServicoActivity.this, "CLIQUE PARA SALVAR", Toast.LENGTH_SHORT).show();
                Servico servico = criaServico();
                /*Toast.makeText(FormularioServicoActivity.this,
                        servico.getNome() + " - " + servico.getTelefone() + " - " + servico.getEmail(),
                        Toast.LENGTH_SHORT).show();*/
                salvaServico(servico);
                startActivity(new Intent(FormularioServicoActivity.this, ListaServicosActivity.class));

            }

            private void salvaServico(Servico servico) {
                dao.salvar(servico);
                finish();
            }

            @NonNull
            private Servico criaServico() {
                String nome = campoNome.getText().toString();
                String tipo = campoTipoServico.getText().toString();
                String redesSociais = campoRedesSociais.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();

                Servico servico = new Servico(nome, telefone, email, tipo, redesSociais);
                return servico;
            }
        });

    }

    private void inicializaCampos() {
        campoNome = findViewById(R.id.activity_formulario_servico_nome);
        campoTipoServico = findViewById(R.id.activity_formulario_tipo_servico);
        campoRedesSociais = findViewById(R.id.activity_formulario_redes_sociais);
        campoTelefone = findViewById(R.id.activity_formulario_servico_telefone);
        campoEmail = findViewById(R.id.activity_formulario_servico_email);
    }
}