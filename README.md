### FCamara 🚀

*"Queremos ser como uma árvore, crescer um pouco todos os dias e tentar tocar o céu, sem perder a solidez de nossas raízes."*
Conheça: www.fcamara.com.br

## Teste para vaga de Desenvolvedor Back-end
Criar uma API REST para gerenciar um estacionamento de carros e motos.

## Cadastro de estabelecimento
Criar um cadastro da empresa com os seguintes campos:
   - Nome;
   - CNPJ;
   - Endereço;
   - Telefone;
   - Quantidade de vagas para motos;
   - Quantidade de vagas para carros.

**Todos** os campos são de preenchimento obrigatório.

## Cadastro de veículos
Criar um cadastro de veículos com os seguintes campos:
   - Marca;
   - Modelo;
   - Cor;
   - Placa;
   - Tipo.

**Todos** os campos são de preenchimento obrigatório.

## Funcionalidades
   - **Estabelecimento:** CRUD;
   - **Veículos:** CRUD;
   - **Controle de entrada e saída de veículos.**

## Requisitos
   - Modelagem de dados;
   - O retorno deverá ser em formato JSON e XML;
   - Requisições GET, POST, PUT ou DELETE, conforme a melhor prática;
   - A persistência dos dados pode ser realizada da maneira que preferir;
   - Criar README do projeto descrevendo as tecnologias utilizadas, chamadas dos serviços e configurações necessário para executar a aplicação.
   
## Ganha mais pontos
   - Desenvolver utilizando TDD;
   - Criar API de relatório;
   - Sumário da quantidade de entrada e saída;
   - Sumário da quantidade de entrada e saída de veículos por hora;
   - Criar uma solução de autenticação.

## Questionário para Avaliação de Competências

### 1. GraphQL (Implementação BFF - Backend For Frontend)
   - **Implementação:** Crie um BFF com GraphQL localmente para permitir as operações de CRUD e controle de entrada e saída de veículos. O BFF deve expor as operações e lidar com as interações entre o front-end e o back-end.
   - **Disponibilização:** Após implementar o BFF, disponibilize o projeto publicamente no GitHub, com um link no README para o repositório.
     Link GitHub - https://github.com/radamesh/backend-test-graphql

   - **Documentação:** Explique no README os benefícios de usar GraphQL no contexto do projeto, descrevendo também como configurar e rodar o BFF localmente.
   - **Questões:** Além da implementação, responda às seguintes perguntas no README:
      - **Pergunta 1**: Explique o que é o GraphQL e como ele se diferencia de uma API REST tradicional.
          GraphQL é feito para lidar com consultas de dados mais eficientes como Query, e podendo também salvar informações na base usando Mutation, evitando volume de dados over-fetching
          Rest trabalha de modo diferente atraves de requisições HTTP e os dados (Contrato de Dados) sempre retornará todos os dados
     
      - **Pergunta 2**: Descreva como você implementaria o uso do GraphQL como BFF (Backend for Frontend) neste projeto de gerenciamento de estacionamento. Forneça exemplos práticos.
        Eu implementei o GraphQL no prjeto consumindo a API em Java e usei uma biblioteca https://typegraphql.com/ que ajuda manter a escrita e manutenção do código
        e seguir com as boas praticas.

     - **Pergunta 3**: Quais são os benefícios de utilizar GraphQL em relação à flexibilidade das consultas? Cite possíveis desafios ao utilizá-lo.
       O Beneficio de usar GraphQL é que ele possibilita o uso de relacionamento de dados vindo de apis diferentes e a vantagem de trabalhar com os dados necessário.

### 2. Banco de Dados (Nível Básico)
   - **Pergunta 1**: Explique os principais conceitos de um banco de dados relacional, como tabelas, chaves primárias e estrangeiras.
   Banco de Dados Relacional o nome já diz tudo. No caso tabelas é a etrutura basica onde se cria os campos para salvar os dados,
   cada tabela quando um dado é criado ele tem um uma chave primaria onde identifica aquele registro unico, e esse registro unico
   também é usado para definir o relacionamento com outras tabelas atraves da chave Estrangeira.

   - **Pergunta 2**: No contexto de uma aplicação de gerenciamento de estacionamento, como você organizaria a modelagem de dados para suportar as funcionalidades de controle de entrada e saída de veículos?
     No Caso do estacionamento é que para cada empresa pode ter muitos veículos
     
   - **Pergunta 3**: Quais seriam as vantagens e desvantagens de utilizar um banco de dados NoSQL neste projeto?
     Neste modelo de negócio como o volume de dados é pequeno não tem necessidade de usar NoSQL.
     Para uso de NoSQL recomendo em sistemas volumosos como e-commerce e etc

### 3. Agilidade (Nível Básico)
   - **Pergunta 1**: Explique o conceito de metodologias ágeis e como elas impactam o desenvolvimento de software.
     Metodologias ágeis é a forma que as empresas adotam para organizar o escopo do trabalho entre colaboradores
     O grande impacto é que elas ajudam na metrica do negócio, visando o tempo e o gasto nos recursos entre outras coisas

   - **Pergunta 2**: No desenvolvimento deste projeto, como você aplicaria princípios ágeis para garantir entregas contínuas e com qualidade?
     Além da definicição do escopo do porjeto é muito importante ter a definição do que é Pronto dentro da taréfa ent-to-end

   - **Pergunta 3**: Qual a importância da comunicação entre as equipes em um ambiente ágil? Dê exemplos de boas práticas.
     Com as reuniões diarias é um dos pilares de comunicação com o time

### 4. DevOps (Nível Básico)
   - **Pergunta 1**: O que é DevOps e qual a sua importância para o ciclo de vida de uma aplicação?
     É uma abordagem que ajuda no desenvolvimento do Projeto até sua entrega final des do local do desenvolvimento até o ambientes de
     HML e Produção, envolve a parte de segurança de dados e da empresa e boas praticas.

   - **Pergunta 2**: Descreva como você integraria práticas de DevOps no desenvolvimento desta aplicação de estacionamento. Inclua exemplos de CI/CD.
     No caso ao definir uma ferramenta de repositório de código implementaria CI/CD da propria ferramenta.

   - **Pergunta 3**: Cite as ferramentas que você usaria para automatizar o processo de deploy e monitoramento da aplicação.
     Usaria Docker, Kubernetes, Rancher, Grafana, GitLab e Ansible.

## Submissão
Crie um fork do teste para acompanharmos o seu desenvolvimento através dos seus commits.

## Obrigado!
Agradecemos sua participação no teste. Boa sorte! 😄
