# Java Spring Professional Desafio: CRUD de clientes


# Sobre o projeto
Este projeto é o desafio do capítulo sobre API REST, camadas, CRUD, exceções e 
validações do Curso Java Spring Professional da [DevSuperior](https://devsuperior.com.br "Site da DevSuperior").
O desafio consiste em criar um projeto Spring Boot contendo um CRUD completo de web services REST para 
acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:
- Busca paginada de recursos 
- Busca de recurso por id 
- Inserir novo recurso 
- Atualizar recurso 
- Deletar recurso 

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar 
Maven como gerenciador de dependência, e Java como linguagem.



## Especificações
Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da 
entidade Client é mostrada a seguir(a aplicação deve seguir à risca os nomes de classe e atributos mostrados no 
diagrama):

![Diagrama entidade client](https://github.com/GabrielSilva2310/Assets/blob/main/Images%20Crud%20De%20Clientes/Diagrama.png)

O projeto deverá fazer um seed de pelo menos 10 clientes e tratar as seguintes exceções: 
- Id não encontrado (para GET por id, PUT e DELETE), retornando código 404. 
- Erro de validação, retornando código 422 e mensagens customizada para cada campo inválido. As 
  regras de validação são: 
  - Nome: não pode ser vazio 
  - Data de nascimento: não pode ser data futura

# Checklist das requisições 
1. Busca por id retorna cliente existente 
2. Busca por id retorna 404 para cliente inexistente 
3. Busca paginada retorna listagem paginada corretamente 
4. Inserção de cliente insere cliente com dados válidos 
5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos 
6. Atualização de cliente atualiza cliente com dados válidos 
7. Atualização de cliente retorna 404 para cliente inexistente 
8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos 
9. Deleção de cliente deleta cliente existente 
10. Deleção de cliente retorna 404 para cliente inexistente

# Tecnologias utilizadas
- Java 17
- Spring Boot 3
- Maven
- JPA/Hibernate
- H2 Database
- Bean Validation
- Postman

# Como executar o projeto

Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/GabrielSilva2310/Spring-Professional-Projeto-CRUD-de-clientes.git

# entrar na pasta do projeto
cd Spring-Professional-Projeto-CRUD-de-clientes

# executar o projeto
./mvnw spring-boot:run
```

# Competências avaliadas no desafio
- Implementação de operações de CRUD
- Tratamento de exceções
- Customização de respostas HTTP
- Validação de dados com Bean Validation

# Autor

Gabriel Da Silva 

www.linkedin.com/in/gabriel-da-silva-457039193
