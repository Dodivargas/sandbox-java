package br.com.dodivargas.service;

import br.com.dodivargas.exception.DesenvolvedorException;
import br.com.dodivargas.dataBase.DesenvolvedorDAO;
import br.com.dodivargas.modelo.Desenvolvedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DesenvolvedorService {


    @Autowired
    private DesenvolvedorDAO dao;

    public List<Desenvolvedor> listaDesenvolvedores(){
        return dao.listaTodosDesenvolvedores();
    }

    public Desenvolvedor criar(Desenvolvedor desenvolvedor){
        dao.criar(desenvolvedor);
        return desenvolvedor;
    }

    public Desenvolvedor buscar(Integer id) throws DesenvolvedorException {
        return dao.retornar(id);

    }

    public Desenvolvedor excluir(Integer id) throws DesenvolvedorException {
        return dao.excluir(id);
    }

    public Desenvolvedor atualizar(Integer id,Desenvolvedor desenvolvedor) throws DesenvolvedorException {
        return dao.atualizar(id,desenvolvedor);
    }


}
