# Plataforma de Streaming

Este é um projeto em Java que simula uma plataforma de streaming, desenvolvido para praticar conceitos de orientação a objetos, herança, encapsulamento, polimorfismo, interfaces e abstração.

## Funcionalidades

- Adicionar filmes, séries e episódios à plataforma.
- Adicionar avaliações para filmes, séries e episódios.
- Filtrar qualidade por avaliações.

## Tecnologias Utilizadas

- Java

## Como executar o projeto

1. Certifique-se de ter o Java instalado em sua máquina.
2. Faça o clone deste repositório para o seu ambiente local.
3. Abra o projeto em sua IDE de preferência.
4. Execute a classe principal `Principal.java`.

## Estrutura do Projeto

- `src/`
  - `models/`
    - `Filme.java`: Sublasse da classe Titulo que representa um filme.
    - `Serie.java`: Subclasse da classe Ttiulo que representa uma série.
    - `Episodios.java`: Classe que representa um episódio de uma série.
    - `Titulo.java`: Classe que contém a lógica da plataforma de streaming.
    - `Principal.java`: Classe principal para execução do projeto.
  - `CalculadoraTempoReal/`
    - `Calculadora.java`: Classe que calcula a duração em minutos de filme e séries.
    - `Classificavel.java`: Interface que classifica filmes e séries.
    - `FiltroRecomendacao.java`: Classe que filtra e faz a recomendação de filmes e séries aparti de sua avaliações e visualizações.
  
    

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias, correções de bugs ou novas funcionalidades.

## Autor

-Romário Abílio

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
