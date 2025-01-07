# Projeto: Strategy Pattern - Sistema de Busca em Inventário

## Objetivo
Este projeto demonstra a aplicação do padrão de projeto Strategy no contexto de um sistema de busca em inventário. O sistema permite realizar buscas em um vetor de códigos de produtos utilizando diferentes estratégias de busca (linear e binária), com flexibilidade para alternar entre elas de forma dinâmica. Além disso, o projeto inclui benchmarks para avaliar o desempenho das estratégias em diferentes volumes de dados.

---

## Organização do Projeto
A estrutura do projeto está organizada da seguinte forma:

```
.
├── src
│   ├── Benchmark.java           # Classe principal para executar os benchmarks.
│   ├── InventorySearch.java     # Classe de contexto que utiliza o padrão Strategy.
│
├── strategies
│   ├── SearchStrategy.java      # Interface que define o contrato das estratégias.
│   ├── LinearSearchStrategy.java # Implementação da busca linear.
│   ├── BinarySearchStrategy.java # Implementação da busca binária.
│
├── target                      # Diretório gerado pelo Maven contendo o JAR final.
```

### Detalhes dos Arquivos
- **`SearchStrategy.java`**: Interface que define o método `search(int[] array, int key)` para implementação das estratégias.
- **`LinearSearchStrategy.java`**: Implementação da busca linear, que percorre o vetor sequencialmente para encontrar o valor.
- **`BinarySearchStrategy.java`**: Implementação da busca binária, que divide o espaço de busca pela metade em cada iteração (requer vetor ordenado).
- **`InventorySearch.java`**: Classe de contexto que delega a busca à estratégia configurada.
- **`Benchmark.java`**: Classe principal que executa testes de desempenho com diferentes tamanhos de vetores.

---

## Execução

### Pré-requisitos
Certifique-se de ter o **Maven** e o **Java** instalados no seu ambiente.

### Passos para Compilar e Executar
1. Compile o projeto utilizando o Maven:

```bash
mvn clean package
```

2. Execute a classe `Benchmark`:

```bash
java -cp ./target/nomedoarquivojar com.strategypattern.app.Benchmark
```

Substitua `nomedoarquivojar` pelo nome do arquivo gerado no diretório `target` após o build.

---

## Funcionamento

1. **Seleção de Estratégia:**
   A classe `InventorySearch` permite configurar dinamicamente a estratégia de busca (linear ou binária) conforme a necessidade.

2. **Execução:**
   O sistema avalia se o código do produto informado está presente no vetor de inventário e retorna a posição do elemento ou `-1` caso não seja encontrado.

3. **Benchmark:**
   A classe `Benchmark` realiza testes de desempenho em quatro cenários:
   - Vetores com 50 elementos.
   - Vetores com 5.000 elementos.
   - Vetores com 100.000 elementos.
   - Vetores com 1000.000 elementos.

Os resultados mostram a diferença de eficiência entre as estratégias conforme o volume de dados.

---

**Desenvolvido como um exemplo educacional do padrão Strategy no Java.**
