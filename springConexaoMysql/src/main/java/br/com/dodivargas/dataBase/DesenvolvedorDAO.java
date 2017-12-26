package br.com.dodivargas.dataBase;

import br.com.dodivargas.exception.DesenvolvedorException;
import br.com.dodivargas.modelo.Desenvolvedor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


@Repository
public class DesenvolvedorDAO {

    private ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<>();
    private final AtomicInteger autoId = new AtomicInteger();


    public boolean criar(Desenvolvedor desenvolvedor){
        if (desenvolvedor != null){
            desenvolvedor.setId(autoId.incrementAndGet());
            desenvolvedores.add(desenvolvedor);
            return true;
        }
        return false;
    }

    public ArrayList<Desenvolvedor> listaTodosDesenvolvedores(){
        return desenvolvedores;
    }

    public Desenvolvedor excluir(Integer id) throws DesenvolvedorException {
        for (int i = 0; i < desenvolvedores.size(); i++) {
            if (desenvolvedores.get(i).getId().equals(id)) {
                Desenvolvedor desenvolvedor = desenvolvedores.get(i);
                desenvolvedores.remove(i);
                return desenvolvedor;
            }
        }
        throw new DesenvolvedorException();
    }

    public Desenvolvedor retornar(Integer id) throws DesenvolvedorException {
        for (Desenvolvedor iterator: desenvolvedores) {
            if (iterator.getId().equals(id)){
                return iterator;
            }
        }
        throw new DesenvolvedorException();
    }

    public Desenvolvedor atualizar(Integer id,Desenvolvedor desenvolvedor) throws DesenvolvedorException {
        for (int i = 0; i < desenvolvedores.size() ; i++) {
            if (desenvolvedores.get(i).getId().equals(id)){
                desenvolvedores.set(i,desenvolvedor);
                return desenvolvedor;
            }
        }
        throw new DesenvolvedorException();
    }

}
