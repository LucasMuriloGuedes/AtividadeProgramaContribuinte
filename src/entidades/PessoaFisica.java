/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Lucas Murilo
 */
public class PessoaFisica extends Contribuinte {
    
    private float gastoSaude;
   

    public PessoaFisica(float gastoSaude, String nome, float rendaAnual) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public float getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(float gastoSaude) {
        this.gastoSaude = gastoSaude;
    }
    
    
    

    @Override
    public float impostoArrecadado() {
        if(this.getRendaAnual() <= 20000){
            float calculoDesconto = (float) ((float) (this.getRendaAnual()*0.15) -(this.getGastoSaude() * 0.5));
            this.setTotalDescontos(calculoDesconto);
            
        }else{
            float totalDescontos = (float) ((this.getRendaAnual() * 0.25) - (this.getGastoSaude() * 0.5));
            this.setTotalDescontos(totalDescontos);
        }
        
        return this.getTotalDescontos();
        
    }
    
    
}
