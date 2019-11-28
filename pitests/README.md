# Pitest

Proposta:

- Teste de mutação, quem vigia quem deveria vigiar os seu projeto(testes), testes de mutação estão ai para isso, eles vão te dar métricas da qualidade dos testes do seu projeto, gerando mutações em tempo de compilação. 

### Ops

- Java 8
- JUnit 4
- Spring Boot 2.2.1.RELEASE
- Gradle
 
##### Compilar e rodar testes

```
./gradlew clean build test
```

##### Rodar os testes de mutação.

```
./gradlew pitest
```
##### Relatórios de cobertura.

- O pitest gerá para cada classe que você tem cobertura de testes uma classe mutante em tempo de compilação e rodas os seus próprios testes me cima dela postando o relatório de efetividade do seus testes em gradle/reports/pitest .
Você pode escolher os tipos de input de saída e etc...





