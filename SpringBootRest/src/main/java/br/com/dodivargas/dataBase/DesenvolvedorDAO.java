package br.com.dodivargas.dataBase;

import br.com.dodivargas.Exception.DesenvolvedorException;
import br.com.dodivargas.modelo.Desenvolvedor;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class DesenvolvedorDAO {

    private ArrayList<Desenvolvedor> desenvolvedores;
    private final AtomicInteger cont = new AtomicInteger();


    public DesenvolvedorDAO() {
        desenvolvedores = new ArrayList<>();
    }

    public boolean criaDesenvolvedor(Desenvolvedor desenvolvedor){
        if (desenvolvedor != null){
            desenvolvedor.setId(cont.incrementAndGet());
            desenvolvedores.add(desenvolvedor);
            return true;
        }
        return false;
    }

    public ArrayList<Desenvolvedor> listaTodosDesenvolvedores(){
        return desenvolvedores;
    }

    public Desenvolvedor excluiDesenvolvedor(Integer id) throws DesenvolvedorException {
        for (int i = 0; i < desenvolvedores.size(); i++) {
            if (desenvolvedores.get(i).getId().equals(id)) {
                Desenvolvedor desenvolvedor = desenvolvedores.get(i);
                desenvolvedores.remove(i);
                return desenvolvedor;
            }
        }
        throw new DesenvolvedorException();
    }

    public Desenvolvedor retornaDesenvolvedor(Integer id) throws DesenvolvedorException {
        for (Desenvolvedor iterator: desenvolvedores) {
            if (iterator.getId().equals(id)){
                return iterator;
            }
        }
        throw new DesenvolvedorException();
    }

    public Desenvolvedor atualizaDesenvolvedor(Integer id,Desenvolvedor desenvolvedor) throws DesenvolvedorException {
        for (int i = 0; i < desenvolvedores.size() ; i++) {
            if (desenvolvedores.get(i).getId().equals(id)){
                desenvolvedores.set(i,desenvolvedor);
                return desenvolvedor;
            }
        }
        throw new DesenvolvedorException();
    }

}
