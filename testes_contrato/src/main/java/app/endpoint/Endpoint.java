package app.endpoint;

import app.modelo.Pessoa;
import app.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/pessoa")
public class Endpoint {

    @Autowired
    private Service service;

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity cadastrarPessoa(@RequestBody @Valid Pessoa pessoa, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bindingResult.getFieldError().getDefaultMessage());
       }
        service.cadastraPessoa(pessoa);
        return ResponseEntity.status(HttpStatus.OK).body(bindingResult.getFieldError());
    }
}
