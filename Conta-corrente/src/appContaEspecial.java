public class appContaEspecial {

    public static void main(String[] args) {
       
         
        Pessoa p1 = new Pessoa("Ciclano", "ciclano@gmail.com");
        ContaEspecial e1 = new ContaEspecial(123456, p1,0.00f, -1000.00f);
        
        System.out.println("Saldo inicial da conta: " + e1.getSaldo());
        System.out.println("O lmite da conta é : " + e1.getLimite());
        
        if(e1.sacar(1000.00f))
            System.out.println("operação de saque realizada com sucesso");
        else
            System.out.println("Limite insuficiente para realização do saque");
        
        System.out.println("Saldo atual da conta : "+ e1.getSaldo());
    }
    
}
