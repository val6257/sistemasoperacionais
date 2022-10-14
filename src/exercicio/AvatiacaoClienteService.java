package exercicio;

public class AvatiacaoClienteService {

    public void ativar(Cliente cliente) {
        if (cliente.ativo == true) {
            System.out.println("Ativado");
        } else {
            System.out.println("Desativado");          
        }
    }
}
