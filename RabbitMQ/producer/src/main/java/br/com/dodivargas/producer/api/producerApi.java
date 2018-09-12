package br.com.dodivargas.producer.api;

import br.com.dodivargas.producer.rabitt.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/send")
public class producerApi {

    @Autowired
    private QueueSender queueSender;

    @PostMapping
    public void send(@RequestParam String mensagem) {
        queueSender.send(mensagem);
    }

}
