package exercicio;

public class Exercicio {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Val", "val@", "51", true);

        Cliente cliente2 = new Cliente("Eugenio", "eugenio@", "55", false);

        AvatiacaoClienteService ativar = new AvatiacaoClienteService();
        
        Notificar notificar = new Notificar();
        
        ativar.ativar(cliente);
        ativar.ativar(cliente2);
        notificar.notificar(cliente);
        notificar.notificar(cliente2);
    }

}
