package br.com.dodivargas.service;

import br.com.dodivargas.exception.DesenvolvedorException;
import br.com.dodivargas.dataBase.DesenvolvedorDAO;
import br.com.dodivargas.modelo.Desenvolvedor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DesenvolvedorService {
    DesenvolvedorDAO dao = new DesenvolvedorDAO();

    public List<Desenvolvedor> listaDesenvolvedores(){
        return dao.listaTodosDesenvolvedores();
    }

    public Desenvolvedor criaDesenvolvedor(Desenvolvedor desenvolvedor){
        dao.criaDesenvolvedor(desenvolvedor);
        return desenvolvedor;
    }

    public Desenvolvedor buscaDesenvolvedor(Integer id) throws DesenvolvedorException {
        return dao.retornaDesenvolvedor(id);

    }

    public Desenvolvedor excluiDesenvolvedor(Integer id) throws DesenvolvedorException {
        return dao.excluiDesenvolvedor(id);
    }

    public Desenvolvedor atualizaDesenvolvedor(Integer id,Desenvolvedor desenvolvedor) throws DesenvolvedorException {
        return dao.atualizaDesenvolvedor(id,desenvolvedor);
    }


}
