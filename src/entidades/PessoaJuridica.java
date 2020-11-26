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
public class PessoaJuridica extends Contribuinte {
    
    private int numFuncionarios;

    public PessoaJuridica(int numFuncionarios, String nome, float rendaAnual) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }
    
    

    @Override
    public float impostoArrecadado() {
        if(this.getNumFuncionarios() < 10){
            float totalDescontos = (float) (this.getRendaAnual() * 0.16);
            this.setTotalDescontos(totalDescontos);
        }else{
            float totalDescontos = (float) (this.getRendaAnual() * 0.14);
            this.setTotalDescontos(totalDescontos);
        }
        
        return this.getTotalDescontos();
    }
    
    
    
}
