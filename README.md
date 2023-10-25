# jailton-cad-cidadao

Este projeto utiliza o Quarkus, o Framework Java Supersônico Subatômico.

Se você deseja saber mais sobre o Quarkus, por favor, visite o site oficial: https://quarkus.io/ .

## Executando a aplicação no modo de desenvolvimento

Você pode executar sua aplicação no modo de desenvolvimento que permite a codificação ao vivo usando:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTA:_**  Quarkus agora vem com uma interface de desenvolvimento (Dev UI), que está disponível apenas no modo de desenvolvimento em http://localhost:8080/q/dev/.

## Empacotamento e execução da aplicação

A aplicação pode ser empacotada usando:
```shell script
./mvnw package
```
Isso produz o arquivo `quarkus-run.jar` no diretório `target/quarkus-app/`.
Esteja ciente de que não se trata de um  _über-jar_ uma vez que as dependências são copiadas para o diretório `target/quarkus-app/lib/`.

A aplicação agora pode ser executada usando `java -jar target/quarkus-app/quarkus-run.jar`.

Se você deseja construir um _über-jar_, execute o seguinte comando:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

A aplicação, empacotada como um _über-jar_, agora pode ser executada usando `java -jar target/*-runner.jar`.

## Criando um executável nativo

Você pode criar um executável nativo usando: 
```shell script
./mvnw package -Dnative
```

Ou, se você não tiver o GraalVM instalado, pode executar a compilação do executável nativo em um contêiner usando: 
```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

Em seguida, você pode executar seu executável nativo com: `./target/jailton-cad-cidadao-1.0.0-SNAPSHOT-runner`

Se você deseja aprender mais sobre a construção de executáveis nativos, consulte https://quarkus.io/guides/maven-tooling.

## Related Guides

- SmallRye OpenTracing ([guia](https://quarkus.io/guides/opentracing)): Rastreie seus serviços com o SmallRye OpenTracing.
- JDBC Driver - H2 ([guia](https://quarkus.io/guides/datasource)): Conectar ao banco de dados H2 via JDBC.
- REST Client Classic ([guia](https://quarkus.io/guides/rest-client)): Chamar serviços REST.
- SmallRye OpenAPI ([guia](https://quarkus.io/guides/openapi-swaggerui)): Documente suas APIs REST com OpenAPI - acompanha o Swagger UI.
- Jacoco - Code Coverage ([guia](https://quarkus.io/guides/tests-with-coverage)): Suporte à cobertura de teste do Jacoco.
- RESTEasy Classic ([guia](https://quarkus.io/guides/resteasy)): Estrutura de endpoint REST que implementa Jakarta REST e mais.
- Hibernate ORM with Panache ([guia](https://quarkus.io/guides/hibernate-orm-panache)): Simplifique seu código de persistência para o Hibernate ORM por meio do padrão active record ou do padrão repositório.

## Código Fornecido

### Hibernate ORM

Crie sua primeira entidade JPA.

[Seção relacionada do guia...](https://quarkus.io/guides/hibernate-orm)

[Seção relacionada do Hibernate com Panache...](https://quarkus.io/guides/hibernate-orm-panache)


### REST Client

Invocar diferentes serviços por meio de REST com JSON

[Seção relacionada do guia...](https://quarkus.io/guides/rest-client)

### RESTEasy JAX-RS

Inicie facilmente seus serviços web RESTful

[Seção do guia relacionada...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
