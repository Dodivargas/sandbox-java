package br.com.dodivargas.controle;

import br.com.dodivargas.Exception.DesenvolvedorException;
import br.com.dodivargas.modelo.Desenvolvedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import br.com.dodivargas.service.DesenvolvedorService;
import java.util.List;

@RestController
@RequestMapping("/desenvolvedor")
public class DesenvolvedorControle {


    private DesenvolvedorService desenvolvedorService = new DesenvolvedorService();

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/listaDesenvolvedores",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Desenvolvedor> listaDesenvolvedores(){
        return desenvolvedorService.listaDesenvolvedores();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/criaDesenvolvedor",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Desenvolvedor criaDesenvolvedor(@RequestBody Desenvolvedor desenvolvedor){
        return desenvolvedorService.criaDesenvolvedor(desenvolvedor);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(
            value = "/deletaDesenvolvedor/{id}",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Desenvolvedor excluiDesenvolvedor(@PathVariable(value = "id") Integer id) throws DesenvolvedorException {
        return desenvolvedorService.excluiDesenvolvedor(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(
            value = "/buscaDesenvolvedor/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Desenvolvedor buscaDesenvolvedor(@PathVariable(value = "id") Integer id) throws DesenvolvedorException {
        return desenvolvedorService.buscaDesenvolvedor(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/atualizaDesenvolvedor/{id}",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Desenvolvedor atualizaDesenvolvedor(@PathVariable(value = "id") Integer id ,@RequestBody Desenvolvedor desenvolvedor) throws DesenvolvedorException {
        desenvolvedor.setId(id);
        return desenvolvedorService.atualizaDesenvolvedor(id,desenvolvedor);
    }
}
