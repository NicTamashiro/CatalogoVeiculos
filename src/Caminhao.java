public class Caminhao extends Veiculo{
    private double capacidadeCargaToneladas;
    private int numeroEixos;

    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCargaToneladas, int numeroEixos){
        super(marca, modelo, ano, preco);
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
        this.numeroEixos = numeroEixos;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("=== Caminhão ===");
        super.exibirDetalhes();
        System.out.printf("Capacidade: %.1f toneladas%n", capacidadeCargaToneladas);
        System.out.println("Eixos: " + numeroEixos);
    }
}
