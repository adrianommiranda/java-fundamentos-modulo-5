# 📘 Java Básico — Módulo 5 (Estruturas de Dados: Listas)

Este repositório compreende o quinto módulo do meu percurso de aprendizado em Java Básico. O foco aqui é aprofundar os conhecimentos em **Estruturas de Dados**, com ênfase em **Listas (Arrays e ArrayList)**, praticando criação, preenchimento automático, manipulação de posições, buscas, ordenação e validações.

Os exercícios foram desenvolvidos para consolidar lógica de programação, organização do código e boas práticas, resultando em implementações claras e fáceis de manter.

**Status:** Em evolução, com atualizações semanais.  
**Foco:** Estruturas de dados, lógica com listas, manipulação e análise de coleções.  
**Comunidade:** Feedbacks, abertura de issues e pull requests são bem-vindos para aprimoramento contínuo.

---

## 📚 Conteúdo do Módulo

Este módulo está dividido em três blocos de exercícios, todos voltados para listas.

---

## ✅ Parte 1 — Exercícios de Listas (I)

| Exercício | Descrição |
| :-- | :-- |
| `Exe01` | Criar uma lista com vinte números aleatórios. |
| `Exe02` | Adicionar o número 11 à lista criada no exercício anterior. |
| `Exe03` | Remover o número da 5ª posição da lista. |
| `Exe04` | Concatenar a lista atual com outra lista contendo os números de 12 a 15. |
| `Exe05` | Encontrar o comprimento (tamanho) da lista resultante. |
| `Exe06` | Verificar se o número 8 está presente na lista. |
| `Exe07` | Inverter a ordem dos elementos na lista. |
| `Exe08` | Remover todos os números pares da lista. |
| `Exe09` | Substituir o valor da 3ª posição por 30. |
| `Exe10` | Ordenar a lista em ordem crescente. |

---

## ✅ Parte 2 — Exercícios de Listas (II)

| Exercício | Descrição |
| :-- | :-- |
| `Exe01` | Preencher automaticamente uma lista com 8 posições com o valor 999 em todas. |
| `Exe02` | Preencher automaticamente uma lista de 10 posições com: 5, 10, 15, ..., 50. |
| `Exe03` | Preencher automaticamente uma lista de 10 posições com: 9, 8, 7, ..., 0. |
| `Exe04` | Preencher automaticamente uma lista de 10 posições alternando: 5, 3, 5, 3, ... |
| `Exe05` | Preencher uma lista com os primeiros elementos da sequência de Fibonacci (conforme especificação do exercício). |
| `Exe06` | Preencher uma lista com 7 números aleatórios e exibir os valores gerados. |
| `Exe07` | Ler 7 nomes, armazenar em lista e exibir em ordem inversa. |
| `Exe08` | Ler 15 números, exibir a lista e mostrar as posições de valores múltiplos de 10. |
| `Exe09` | Ler 10 números inteiros e mostrar os pares e suas respectivas posições. |
| `Exe10` | Preencher uma lista de 30 posições com números 1..15 (sorteio), ler uma chave e mostrar posições e quantas vezes apareceu. |
| `Exe11` | Ler idade de 8 pessoas e mostrar: média, posições > 25, maior idade e posições da maior idade. |
| `Exe12` | Ler nota de 10 alunos e mostrar: média, quantidade acima da média, maior nota e posições da maior nota. |
| `Exe13` | Preencher lista de 20 números aleatórios (0..99), exibir e ordenar crescente (mostrar ordenada). |
| `Exe14` | Ler nome e idade de 9 pessoas em duas listas relacionadas e listar apenas os menores de idade. |
| `Exe15` | Ler nome, gênero e salário de 5 funcionários em três listas e listar mulheres com salário > R$ 5.000. |

---

## ✅ Parte 3 — Exercícios de Listas (III) — ArrayList de Carros (String)

| Exercício | Descrição |
| :-- | :-- |
| `Exe01` | Criar uma lista (`ArrayList<String>`) com nomes de carros. |
| `Exe02` | Adicionar 3 carros e exibir o conteúdo da lista. |
| `Exe03` | Inserir 2 novos carros nas posições 0 e 3 e exibir a lista. |
| `Exe04` | Imprimir um elemento específico da posição 3. |
| `Exe05` | Percorrer a lista e imprimir usando `for` tradicional. |
| `Exe06` | Limpar a lista de carros (`clear`). |
| `Exe07` | Informar o objeto/tipo de dados utilizado no `ArrayList` (String). |
| `Exe08` | Remover um elemento informando a posição. |
| `Exe09` | Remover um elemento informando o nome. |
| `Exe10` | Ordenar a lista em ordem crescente. |
| `Exe11` | Reduzir capacidade não utilizada do `ArrayList` (otimização de memória). |
| `Exe12` | Verificar se a lista está vazia. |
| `Exe13` | Verificar se a lista contém um elemento (ex.: `"Adriano"`). |
| `Exe14` | Verificar o tamanho do `ArrayList`. |
| `Exe15` | Concatenar duas listas. |

---

## 📝 Observações Importantes

Para a implementação e avaliação dos exercícios, as seguintes diretrizes são essenciais:

* **Validações Essenciais:**
  * Validar índices antes de acessar/remover posições (evitar `IndexOutOfBoundsException`).
  * Validar entradas do usuário (números, textos, gênero etc.).
  * Em exercícios com sorteio, garantir que os números estejam dentro do intervalo definido.

* **Boas práticas com listas:**
  * Evitar “números mágicos”: utilizar constantes para tamanhos e limites.
  * Separar lógica (processamento) de entrada/saída para facilitar manutenção.
  * Nomear variáveis de forma clara (`numeros`, `idades`, `nomes`, `salarios` etc.).

* **Saída e formatação:**
  * Em valores monetários, exibir com duas casas decimais: `System.out.printf("R$ %.2f%n", valor);`
  * Para listas, exibir de forma legível com mensagens objetivas.

---

## 📁 Estrutura do Projeto

A organização do repositório segue uma estrutura padrão para projetos Java:
├── src │ └── listas │ ├── Exe01.java │ ├── Exe02.java │ └── ... ├── .gitignore ├── README.md └── pom.xml (opcional)


**Boas práticas de pacotes:** Recomenda-se o uso de nomes em minúsculas para pacotes (ex.: `package listas;`).

---

## ⚙️ Pré-requisitos

Para compilar e executar os exercícios contidos neste repositório, é necessário ter instalado:

* **JDK 17+:** Certifique-se de que `javac` e `java` estejam configurados corretamente no seu `PATH`.
* **Editor/IDE de Preferência:** VS Code, IntelliJ IDEA, Eclipse, etc.

**Dica:** Configure uma *Run Configuration* para cada classe que possui `public static void main(String[] args)`.

---

## 🧭 Princípios Aplicados

A construção do código neste módulo adere aos seguintes princípios:

* **`try-with-resources`:** Para fechamento automático do `Scanner`.
* **Separação de Lógica e E/S:** Melhora testabilidade e manutenção.
* **Constantes:** Evita números mágicos em limites e tamanhos de listas.
* **`printf` para Formatação:** Especialmente em valores monetários e mensagens.
* **Nomes claros e organização:** Código legível e padronizado.

---

## 📝 Convenções Adotadas

* **Versão Java:** Java 17+
* **Nomenclatura de Classes:** `Exe01`, `Exe02`, ... (por bloco, se aplicável)
* **Estilo de Código:** Linhas com até ~120 colunas, mensagens objetivas
* **Controle de versão:** diretórios de build (`out/`, `bin/`) fora do Git

---

## 📄 Licença

Este projeto é distribuído sob a licença **MIT**.

---

## 👨‍💻 Autor

**Adriano Miranda**  
GitHub: https://github.com/adrianommiranda


