/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JButton;

/**
 *
 * @author pc
 */
public class level1 {
    
    
    public void BtnPalavras(int qtdbutao, JButton button)
    {
        for(int x=1; x<=qtdbutao; x++)
        {
            String bala = "jButton"+ String.valueOf(x);
            
            if(button.getText().equals(bala))
            {
                button.enable(true);
            }
        }
    }
    
    public void desabilitarButao(JButton button)
    {
        for(int y=1;y<=60;y++)
        {
            button.enable(false);
        }
        
    }
}
