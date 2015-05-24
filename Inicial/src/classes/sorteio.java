/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class sorteio {
    
    ArrayList<String> dicionario = new ArrayList<String>();
    
    public void CarregarPalavras()
    {
        dicionario.add("casa");
        dicionario.add("terra");
        dicionario.add("xadrez");
        dicionario.add("chuva");
        dicionario.add("muleque");
        dicionario.add("homem");
    }
    
    public void sorteio(int qtd, ArrayList list)
    {
        CarregarPalavras();
        
        boolean y=true;
				
		while(y){
			
			if(dicionario.size()!=5){
				
			int num = (int) (Math.random()*dicionario.size());
			System.out.println(dicionario.get(num));
                        list.add(num);
			dicionario.remove(num);
			
			}
			else{
				y=false;
			}
		}
    }
    
    
    
    
    
}
