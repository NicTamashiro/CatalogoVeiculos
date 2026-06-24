public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        // Carros
        catalogo.adicionar(new Carro("Toyota", "Corolla", 2022, 120000.0, 4, "Flex"));
        catalogo.adicionar(new Carro("Fiat", "Pulse", 2023, 98000.0, 4, "Flex"));
        catalogo.adicionar(new Carro("Volkswagen", "Polo", 2023, 105000.0, 4, "Flex"));
        catalogo.adicionar(new Carro("Chevrolet", "Onix", 2022, 89000.0, 4, "Flex"));
        catalogo.adicionar(new Carro("Hyundai", "HB20", 2021, 78000.0, 4, "Flex"));

        // Motos
        catalogo.adicionar(new Moto("Honda", "CB 500", 2021, 35000.0, false, "Esportiva"));
        catalogo.adicionar(new Moto("Yamaha", "MT-07", 2022, 52000.0, false, "Naked"));
        catalogo.adicionar(new Moto("Honda", "Biz 125", 2023, 14000.0, false, "Scooter"));

        // Caminhões
        catalogo.adicionar(new Caminhao("Volvo", "FH 540", 2020, 650000.0, 28.0, 6));
        catalogo.adicionar(new Caminhao("Scania", "R 450", 2021, 580000.0, 25.0, 6));

        System.out.println("=== Todos os veiculos ===");
        catalogo.listarTodos();

        System.out.println("\n=== Busca por marca: Fiat ===");
        for (Veiculo v : catalogo.buscarPorMarca("Fiat")) {
            v.exibirDetalhes();
        }

        System.out.println("\n=== Busca por marca: Honda ===");
        for (Veiculo v : catalogo.buscarPorMarca("Honda")) {
            v.exibirDetalhes();
        }

        System.out.println("\n=== Busca por marca: Volvo ===");
        for (Veiculo v : catalogo.buscarPorMarca("Volvo")) {
            v.exibirDetalhes();
        }
    }
}