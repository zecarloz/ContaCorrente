

/**
 *
 * @author josec
 */
public class ContaEspecial extends Conta{
    private float limite;

    public ContaEspecial() {
    }

    public ContaEspecial(int numero, Pessoa correntista, float valor,float limite) {
        super(numero, correntista,valor);
        this.setLimite(limite);
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(float valor){
        if(this.getSaldo() - valor >=this.getLimite()){
          this.setSaldo(this.getSaldo() - valor);
          return true;
        }
        return false;
    }
    
}
