/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeprogramacontribuintes;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lucas Murilo
 */
public class AtividadeProgramaContribuintes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        List<Contribuinte> list = new ArrayList<>();
        
        System.out.print("Informe a quantidade de contribuintes: ");
        int quantidadeContribuintes = teclado.nextInt();
        for(int i = 0; i< quantidadeContribuintes; i++){
            System.out.println("Informe os dados do " + (i+1) +"° contribuinte: ");
            System.out.print("É fisica ou juridica? (F/J): ");
            char fouJ = teclado.next().charAt(0);
            System.out.print("Digite o nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.print("Digite o redimento anual: ");
            float rendimento = teclado.nextFloat();
            if(fouJ == 'J'){
                System.out.print("Digite a quantidade de funcionários: ");
                int numFuncionarios = teclado.nextInt();
                PessoaJuridica pJ = new PessoaJuridica(numFuncionarios, nome, rendimento);
                list.add(pJ);
                pJ.impostoArrecadado();

            }else if(fouJ == 'F'){
                System.out.print("Digite o valor gasto com saúde:  ");
                float valorSaude = teclado.nextFloat();
                PessoaFisica pF = new PessoaFisica(valorSaude, nome, rendimento);
                list.add(pF);
                pF.impostoArrecadado();
               
                
            }else{
                System.out.println("Valor nao correponde a Fisica ou Juridica. Informe todos os dados novamente!");
                i = 1-1;
            }
            
        }
        
        for(Contribuinte c : list){
            System.out.println( " O nome do contribuinte é: " + c.getNome() + " - Total dos rendimentos é R$: " + c.getRendaAnual() + " e os descontos total é: " + c.impostoArrecadado());
        }
        
        teclado.close();
        
    }
    
}
