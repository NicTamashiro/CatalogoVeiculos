import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionar(Veiculo v){
        veiculos.add(v);
    }

    public void listarTodos(){
        if(veiculos.isEmpty()){
            System.out.println("Catalogo vazio.");
            return;
        }
        for(Veiculo v : veiculos){
            v.exibirDetalhes();
            System.out.println();
        }
    }

    public List<Veiculo> buscarPorMarca(String marca){
        List<Veiculo> resultado = new ArrayList<>();
        for(Veiculo v : veiculos){
            if(v.getMarca().equalsIgnoreCase(marca)){
                resultado.add(v);
            }
        }
        return resultado;
    }
}
