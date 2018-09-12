package br.com.dodivargas.producer.rabitt;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueSender {

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Autowired
    private Queue queue;

    public void send(String mensagem) {
        amqpTemplate.convertAndSend(this.queue.getName(), mensagem);
    }
}
