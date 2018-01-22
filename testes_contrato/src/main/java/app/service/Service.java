package app.service;

import app.dao.PessoaDAO;
import app.modelo.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private PessoaDAO pessoaDAO;

    public void cadastraPessoa(Pessoa pessoa){
        pessoaDAO.cadastraPessoa(pessoa);
    }
}
