public class Carro extends Veiculo{
    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, double preco, int numeroPortas, String tipoCombustivel){
        super(marca, modelo, ano, preco);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("=== Carro ===");
        super.exibirDetalhes(); // aproveita o método do pai
        System.out.println("Portas: " + numeroPortas);
        System.out.println("Combustível: " + tipoCombustivel);
    }
}
