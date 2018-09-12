package br.com.dodivargas.producer.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public Queue queue() {
        return new Queue("filaLegal", true);
    }

}
