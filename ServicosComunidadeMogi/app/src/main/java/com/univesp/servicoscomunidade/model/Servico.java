package com.univesp.servicoscomunidade.model;

import androidx.annotation.NonNull;

public class Servico {
    private final String nome;
    private final String telefone;
    private final String email;
    private final String tipo;
    private final String redesSociais;

    public Servico(String nome, String telefone, String email, String tipo, String redesSociais) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.tipo = tipo;
        this.redesSociais = redesSociais;

    }

    @NonNull
    @Override
    public String toString() {
        return nome + " - " + tipo;
    }
}
