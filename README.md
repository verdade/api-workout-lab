

## API <teste> 
 Esse projeto foi desenvolvido com Spring Boot, Flyway, Jpa, Mysql, H2 e Swagger.  Para rodar localmente por favor siga as instruções abaixo:
 
 
 
 
## PREPARANDO O AMBIENTE (Necessário o Docker instalado)

*👉🏼 Baixe o projeto digitando o comando: * `git clone https://github.com/verdade/api-softplan.git (é necessário o git instalado)` 

*👉🏼 Acesse o diretório /src/test/resource, nesse diretório se encontra o arquivo docker-compose.yml execute o comando nesse diretório:* `docker-compose up sonar`   

O docker compose instalará:

* Sonar rodando na porta localhost:9000 (ferramente que inspecionará a qualidade da API).
* Mysql rodando na porta 3306 (banco relacional em que o projeto usará).
* PhpMyadmin rodando na porta localhost:80 (para ver os dados do mysql).

ATENÇAO: Para o sonar rodar corretamente acrescente o profile abaixo no seu settings.xml do seu maven

       <profile>
            <id>sonar</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <!-- Optional URL to server. Default value is http://localhost:9000 -->
                <sonar.host.url>
                  http://localhost:9000
                </sonar.host.url>
            </properties>
        </profile>



## Rodando o projeto

*👉🏼 Acesse o diretório /src/test/resource, nesse diretório se encontra o arquivo docker-compose.yml execute o comando nesse diretório:* `docker-compose up sonar`   



