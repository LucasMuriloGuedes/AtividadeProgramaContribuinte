
package entidades;

/**
 *
 * @author Lucas Murilo
 */
public abstract class Contribuinte {
    
    private String nome;
    private float rendaAnual;
    private float totalDescontos;

    public Contribuinte(String nome, float rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(float rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public float getTotalDescontos() {
        return totalDescontos;
    }

    public void setTotalDescontos(float totalDescontos) {
        this.totalDescontos = totalDescontos;
    }
    
    
    
    public abstract float impostoArrecadado();
    
    
    
}
