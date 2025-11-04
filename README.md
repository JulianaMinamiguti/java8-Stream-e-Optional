## 🧠☕ Aula Java 8 - Stream & Optional/ ADA - Elas + tech!

Este repositório reúne alguns conceitos abordados na aula mencionada, acompanhados de um resumo explicativo neste README para facilitar o entendimento.

## 🔄 Stream

## Operadores intermediários: 
São aqueles que produzem uma nova Stream como resultado de uma operação. Não executam nada imediatamente, mas sim definem o pipeline de operações que será processado quando uma operação terminal for chamada.

| Método      | Descrição                                           |
|-------------|-----------------------------------------------------|
| `filter()`  | Filtra elementos com base em uma condição           |
| `map()`     | Transforma cada elemento da Stream                  |
| `sorted()`  | Ordena os elementos                                 |
| `distinct()`| Remove elementos duplicados                         |
| `limit()`   | Limita a quantidade de elementos                    |
| `skip()`    | Ignora os primeiros elementos                       |


## 🔚 Operações Terminais em Streams

As operações terminais são aquelas que consomem a Stream e produzem um resultado final. Ao serem chamadas, elas encerram o pipeline de operações e executam o processamento dos dados.

📌 Exemplos comuns de operações terminais
| Método       | Descrição                                                       |
|--------------|-----------------------------------------------------------------|
| `collect()`  | Agrupa os elementos da Stream em uma coleção (lista, conjunto) |
| `forEach()`  | Executa uma ação para cada elemento da Stream                  |
| `reduce()`   | Combina os elementos da Stream em um único resultado           |





## ☕ Sobre Optional em Java
O uso da classe Optional ajuda a evitar problemas comuns de NullPointerException (NPE), que ocorrem quando tentamos acessar métodos ou propriedades de objetos que estão nulos.


🧪 Exemplo prático

| Código Java                                                                 |
|-----------------------------------------------------------------------------|
| `Optional<String> nome = Optional.ofNullable(possivelNome);`               |
| `System.out.println("Olá, " + nome.orElse("visitante") + "!");`            |



## ✅ Principais métodos

| Método         | Descrição                                      |
|----------------|------------------------------------------------|
| `isPresent()`  | Verifica se o valor está presente              |
| `ifPresent()`  | Executa uma ação se o valor estiver presente   |
| `orElse()`     | Retorna o valor ou um valor padrão             |
| `orElseGet()`  | Retorna o valor ou gera um valor com função    |
| `orElseThrow()`| Lança exceção se o valor estiver ausente       |

