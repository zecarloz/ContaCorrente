
/**
 *
 * @author josec
 */
public class Conta {

    private int numero;
    private Pessoa correntista;
    private float saldo;
    
    public Conta(){}
    
    public Conta(int numero, Pessoa correntista,float saldo){
        this.setNumero (numero);
        this.setCorrentista(correntista);
        this.setSaldo(saldo);
        
    };

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
