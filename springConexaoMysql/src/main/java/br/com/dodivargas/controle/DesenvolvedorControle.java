package br.com.dodivargas.controle;

import br.com.dodivargas.exception.DesenvolvedorException;
import br.com.dodivargas.modelo.Desenvolvedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import br.com.dodivargas.service.DesenvolvedorService;
import java.util.List;

@RestController
@RequestMapping("/desenvolvedores")
public class DesenvolvedorControle {

    @Autowired
    private DesenvolvedorService desenvolvedorService;


    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Desenvolvedor> listar(){
        return desenvolvedorService.listaDesenvolvedores();
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Desenvolvedor criar(@RequestBody Desenvolvedor desenvolvedor){
        return desenvolvedorService.criar(desenvolvedor);
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Desenvolvedor excluir(@PathVariable(value = "id") Integer id) throws DesenvolvedorException {
        return desenvolvedorService.excluir(id);
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Desenvolvedor buscar(@PathVariable(value = "id") Integer id) throws DesenvolvedorException {
        return desenvolvedorService.buscar(id);
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Desenvolvedor atualizar(@PathVariable(value = "id") Integer id ,@RequestBody Desenvolvedor desenvolvedor) throws DesenvolvedorException {
        desenvolvedor.setId(id);
        return desenvolvedorService.atualizar(id,desenvolvedor);
    }
}
