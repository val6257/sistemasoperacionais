package exercicio;

public class Notificar {

    public void notificar(Cliente cliente) {
        if (cliente.ativo) {
            System.out.println("Notificado!!!");
        } else {
            System.out.println("Cliente inativo!!!");
        }
    }
}
