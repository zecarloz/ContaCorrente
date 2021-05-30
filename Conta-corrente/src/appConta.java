
/**
 *
 * @author josec
 */
public class appConta {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Fulano", "fulano@gmail.com");
        Pessoa p2 = new Pessoa();
        
        Conta c1 = new Conta();
        Conta c2 = new Conta(190876, p1, 750.00f);
        
        p2.setNome("Ciclano");
        p2.setEmail("ciclano@gmail.com");
        c1.setCorrentista(p2);
        c1.setNumero(129876);
        c1.setSaldo(150.00f);

        System.out.println("O nome do correntista é : " + c1.getCorrentista().getNome());
        System.out.println("O numero da conta é: " + c1.getNumero());
        System.out.println("O valor do do saldo é :" + c1.getSaldo());
        System.out.println("================================================");
         System.out.println("O nome do correntista é : " + c2.getCorrentista().getNome());
        System.out.println("O numero da conta é: " + c2.getNumero());
        System.out.println("O valor do saldo é :" + c2.getSaldo());
        
        if(c2.sacar(750.00f))
            System.out.println("Saque efetuado com sucesso");
        else
            System.out.println("Saque não ralizado,saldo insuficiente");
        c2.depositar(100.00f);
        System.out.println("O valor do saldo é: " + c2.getSaldo());
            

    }

}
