package Estrutura_Swithc_Case;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Exemplo de switch case");
        System.out.println("---------------------------------");
        System.out.println("1 .Cadastro de clientes");
        System.out.println("2. Cadastro de usuarios");
        System.out.println("3. Relatorios");
        System.out.println("=================================");
        int opcao = 2;
        switch (opcao) {
            case 1:
                System.out.println("CLIENTES");
                break;
            case 2:
                System.out.println("USUARIOS");
                break;
            case 3:
                System.out.println("RELATORIOS");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
