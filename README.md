#  Catálogo de Veículos — Java POO

Projeto em Java para fixação de conceitos de **Programação Orientada a Objetos (POO)**.

O sistema simula um catálogo de veículos (carros, motos e caminhões), aplicando **herança**, **polimorfismo** e **encapsulamento**.

##  Conceitos aplicados

- **Herança**: `Carro`, `Moto` e `Caminhao` estendem a classe base `Veiculo`.
- **Polimorfismo**: o catálogo armazena e manipula todos os tipos de veículo como referências do tipo `Veiculo`, mas cada um exibe seus próprios detalhes através de `@Override`.
- **Encapsulamento**: atributos privados com acesso via getters.
- **Reuso de código**: uso de `super()` no construtor e em `exibirDetalhes()` para evitar duplicação.
- **Coleções genéricas**: `ArrayList<Veiculo>` para armazenar diferentes subtipos de forma uniforme.

##  Estrutura do projeto

```
├── Veiculo.java     # Classe base (marca, modelo, ano, preço)
├── Carro.java       # Extende Veiculo (portas, combustível)
├── Moto.java        # Extende Veiculo (sidecar, estilo)
├── Caminhao.java    # Extende Veiculo (capacidade de carga, eixos)
├── Catalogo.java    # Armazena os veículos e permite listar/buscar
└── Main.java         # Ponto de entrada do programa
```

##  Funcionalidades

- `Catalogo.adicionar(Veiculo v)` → adiciona qualquer tipo de veículo ao catálogo.
- `Catalogo.listarTodos()` → exibe os detalhes de todos os veículos cadastrados.
- `Catalogo.buscarPorMarca(String marca)` → retorna uma lista de veículos filtrados por marca (busca **case-insensitive**, usando `equalsIgnoreCase`).

##  Como executar

```bash
javac *.java
java Main
```

##  Exemplo de saída

```
=== Todos os veiculos ===
=== Carro ===
Marca: Toyota
Modelo: Corolla
Ano: 2022
Preco: R$ 120000.00
Portas: 4
Combustível: Flex

=== Carro ===
Marca: Fiat
Modelo: Pulse
Ano: 2023
Preco: R$ 98000.00
Portas: 4
Combustível: Flex

(... demais veículos ...)

=== Moto ===
Marca: Honda
Modelo: CB 500
Ano: 2021
Preco: R$ 35000.00
Estilo: Esportiva
Sidecar: Não

=== Caminhão ===
Marca: Volvo
Modelo: FH 540
Ano: 2020
Preco: R$ 650000.00
Capacidade: 28.0 toneladas
Eixos: 6


=== Busca por marca: Fiat ===
=== Carro ===
Marca: Fiat
Modelo: Pulse
Ano: 2023
Preco: R$ 98000.00
Portas: 4
Combustível: Flex

=== Busca por marca: Honda ===
=== Moto ===
Marca: Honda
Modelo: CB 500
...
=== Moto ===
Marca: Honda
Modelo: Biz 125
...

=== Busca por marca: Volvo ===
=== Caminhão ===
Marca: Volvo
Modelo: FH 540
...
```

##  Possíveis melhorias futuras

- Adicionar busca por ano ou faixa de preço.
- Ordenar o catálogo (por preço, ano, marca).
- Persistir os dados em arquivo ou banco de dados.
- Validar dados de entrada (ex: preço negativo, ano inválido).

---

