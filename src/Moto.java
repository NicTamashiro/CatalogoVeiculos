public class Moto extends Veiculo{
    private boolean temSidecar;
    private String estilo;

    public Moto(String marca, String modelo, int ano, double preco, boolean temSidecar, String estilo){
        super(marca, modelo, ano, preco);
        this.temSidecar = temSidecar;
        this.estilo = estilo;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("=== Moto ===");
        super.exibirDetalhes();
        System.out.println("Estilo: " + estilo);
        System.out.println("Sidecar: " + (temSidecar ? "Sim" : "Não"));
    }
}
