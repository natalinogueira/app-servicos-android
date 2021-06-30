package com.univesp.servicoscomunidade.dao;

import com.univesp.servicoscomunidade.model.Servico;

import java.util.ArrayList;
import java.util.List;

public class ServicoDAO {

    private final static List<Servico> servicos = new ArrayList<>();

    public void salvar(Servico servico) {
        servicos.add(servico);
    }

    public List<Servico> listaServicos() {
        return new ArrayList<>(servicos);
    }
}
