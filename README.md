# Aluvery - Meu Primeiro App com Kotlin e Jetpack Compose

Bem-vindo ao repositório do meu projeto **Aluvery**. Este é um projeto de exemplo que desenvolvi durante o curso **"Jetpack Compose: criando um app Android"**.

## Sobre o Curso

Neste curso, eu aprendi a:
- Conhecer o que é o Jetpack Compose e porque ele é interessante para escrever Apps Android.
- Criar um projeto Android com suporte ao Jetpack Compose.
- Implementar uma tela inteira utilizando apenas o Jetpack Compose.
- Escrever composables com diferentes estruturas de layout.
- Estilizar composables usando Modifier.
- Organizar o projeto com composables a nível de componentes e tela.

## Sobre o Projeto

O projeto **Aluvery** simula um app de entrega de comidas e bebidas. Através deste aplicativo, tive minha introdução ao Jetpack Compose.

## O que Fiz no Projeto

### Introdução ao Jetpack Compose

No início, aprendi o que é o Jetpack Compose, uma ferramenta para construção de interfaces no Android que utiliza um paradigma declarativo. Descobri suas vantagens, como escrever menos código, ser mais intuitivo e permitir um desenvolvimento mais rápido.

### Criando o Projeto

Criei um projeto Android com suporte ao Jetpack Compose no Android Studio. Escrevi meus primeiros composables, que são componentes visuais básicos como textos e imagens.

### Componentes Composables

Criei meus próprios composables, como `ProductItem` e `ProductsSection`. Utilizei o recurso de `preview` do Compose para visualizar e ajustar meus composables de forma eficiente.

### Layouts no Compose

Aprendi a usar composables de layout como `Column`, `Row` e `Box` para organizar os elementos na tela. Por exemplo, usei `Box` para posicionar uma imagem dentro do `ProductItem`.

### Modifier no Compose

Descobri o `Modifier`, que é similar ao CSS, permitindo modificar altura, largura, adicionar margem e padding aos composables. Usei o `Modifier` para estilizar meus componentes e adicionar comportamentos específicos.

### Textos e Estilos

Modifiquei textos alterando fonte, peso e tamanho. Aprendi a passar parâmetros personalizados para os composables de texto para estilização.

### Componentização e Organização

Implementei componentes como `ProductItem` e `ProductsSection` de forma modular e reutilizável. Adicionei rolagem (scroll) para permitir a navegação pelo conteúdo das telas.

Finalmente, organizei o código separando composables de componentes e composables de tela. Por exemplo, `ProductItem` e `ProductsSection` são componentes menores, enquanto `HomeScreen` representa a tela completa.

## Estrutura do Projeto

- **MainActivity.kt**: Ponto de entrada do aplicativo.
- **composables/**: Diretório contendo todos os composables de componentes e telas.
  - `ProductItem.kt`: Composable para os itens de produto.
  - `ProductsSection.kt`: Composable para as seções de produtos.
  - `HomeScreen.kt`: Composable que organiza as seções em uma tela.

## Contribuindo

Feedbacks são bem-vindos! Sinta-se à vontade para deixar uma mensagem indicando o que gostou ou o que pode ser melhorado.

- Participe do fórum: Deixe uma mensagem caso tenha alguma dúvida ou ajude outros respondendo suas perguntas.
- Compartilhe nas redes sociais: Compartilhe o projeto e o que você aprendeu para ajudar a divulgar o Jetpack Compose.


Este projeto foi desenvolvido durante o curso oferecido pela Alura.
