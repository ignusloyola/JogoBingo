/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author pc
 */
public class sorteio {
    
    //criação dos arraylist s
    
    ArrayList<String> dicionario = new ArrayList<String>();
    ArrayList<String> discricao = new ArrayList<String>();
    
    ArrayList<String> Dici = new ArrayList<String>();
    ArrayList<String> Dis = new ArrayList<String>();
    
    
    public void CarregarPalavras()
    {
        dicionario.add(0,"Zero");
        dicionario.add(1,"Abacaxi");
        dicionario.add(2,"Amoitado");
        dicionario.add(3,"Amuado");
        dicionario.add(4,"Angu");
        dicionario.add(5,"Apartar");
        dicionario.add(6,"Aquetar");
        dicionario.add(7,"Ariado");
        dicionario.add(8,"Arranca-rabo");
        dicionario.add(9,"Arremedar");
        dicionario.add(10,"Arretado");
        dicionario.add(11,"Baleado");
        dicionario.add(12,"Beca");
        dicionario.add(13,"Bicada");
        dicionario.add(14,"Bicudo");
        dicionario.add(15,"Bisaco");
        dicionario.add(16,"Bizu");
        dicionario.add(17,"Boa pinta");
        dicionario.add(18,"Boca de siri");
        dicionario.add(19,"Botar banca");
        dicionario.add(20,"Brigalhada");
        dicionario.add(21,"Cabra(caba)");
        dicionario.add(22,"Cabreiro");
        dicionario.add(23,"Caçoar");
        dicionario.add(24,"Chibata");
        dicionario.add(25,"Chumbado");
        dicionario.add(26,"Chutado");
        dicionario.add(27,"Chuvisco");
        dicionario.add(28,"Cipuada");
        dicionario.add(29,"Coca");
        dicionario.add(30,"Coiteiro");
        dicionario.add(31,"Dada(ou dado) ");
        dicionario.add(32,"Da molesta");
        dicionario.add(33,"Dar maçada");
        dicionario.add(34,"Dedada");
        dicionario.add(35,"De lua");
        dicionario.add(36,"Descambimbado");
        dicionario.add(37,"Destiorado");
        dicionario.add(38,"Destrocar");
        dicionario.add(39,"Desunerado");
        dicionario.add(40,"Disgrama");
        dicionario.add(41,"Embrabecer");
        dicionario.add(42,"Embromar");
        dicionario.add(43,"Embuchar");
        dicionario.add(44,"Emburrado");
        dicionario.add(45,"Empapado");
        dicionario.add(46,"Emperebado");
        dicionario.add(47,"Empombar");
        dicionario.add(48,"Emprenhar");
        dicionario.add(49,"Encafifado");
        dicionario.add(50,"Encalhada");
        dicionario.add(51,"Fajuto");
        dicionario.add(52,"Famía");
        dicionario.add(53,"Faniquito");
        dicionario.add(54,"Fasti ");
        dicionario.add(55,"Feiúra");
        dicionario.add(56,"Frechar(flechar)");
        dicionario.add(57,"Fubento");
        dicionario.add(58,"Fuxico");
        dicionario.add(59,"Fuzuê");
        dicionario.add(60,"Fulô");
        dicionario.add(61,"A MIGUÉ");
        dicionario.add(62,"APULSO");
        dicionario.add(63,"ABESTADO");
        dicionario.add(64,"ABESTALHADO");
        dicionario.add(65,"ABILOLADO");
        dicionario.add(66,"ABIROBADO");
        dicionario.add(67,"ABISCOITADO");
        dicionario.add(68,"ABUFELAR");
        dicionario.add(69,"ABULETADO");
        dicionario.add(70,"ABUTICADO");
        dicionario.add(71,"ACOITE");
        dicionario.add(72,"ACUNHAR");
        dicionario.add(73,"ADULAR");
        dicionario.add(74,"AFEIÇOADO");
        dicionario.add(75,"AFOLOZADO");
    }
        public void CarregarDescricao()
    {
        discricao.add(0,"Nada");
        discricao.add(1,"Coisa trabalhosa, complicada, embrulhada, intrincada.");
        discricao.add(2,"Agachado. Escondido.");
        discricao.add(3,"Mal humorado.");
        discricao.add(4,"Papa grossa de farinha de milho.");
        discricao.add(5,"Separar. (Apartar uma briga).");
        discricao.add(6,"Acalmar.");
        
        discricao.add(7,"Perdido, distraído, desnorteado.");
        discricao.add(8,"Confusão, briga.");
        discricao.add(9,"Imitar. (Remedar)");
        discricao.add(10,"Muito bom, excelente, maravilhoso. (ex: Êta dicionário arretado).");
        discricao.add(11,"Em mau estado. Danificado. De ressaca. Adoentado.");
        discricao.add(12,"Roupa elegante. Roupa nova.");
        
        discricao.add(13,"Dose de cachaça.");
        discricao.add(14," Chute com a ponta do pé.");
        discricao.add(15,"Mochila.");
        discricao.add(16,"Dica, informação valiosa.");
        discricao.add(17,"Pessoa de bom aspecto.");
        discricao.add(18,"Calado. Na moita.");
        
        discricao.add(19,"Veado");
        discricao.add(20,"Criar dificuldades. Vangloriar-se.");
        discricao.add(21,"Qualquer pessoa.");
        discricao.add(22,"Desconfiado");
        discricao.add(23,"Zombar. Fazer troça.");
        discricao.add(24,"Pênis.");
        
        discricao.add(25,"Bêbado, doente.");
        discricao.add(26,"Em grande velocidade.");
        discricao.add(27,"Chuveiro.");
        discricao.add(28,"Porrada, chibatada, chicotada.");
        discricao.add(29,"Cócoras. (Estar de coca é estar abaixado, acocorado).");
        discricao.add(30,"Aquele que dá abrigo a criminosos.");
        
        discricao.add(31,"Pessoa simpática, agradável.");
        discricao.add(32,"Indivíduo muito bom em alguma coisa.Eita cabra bom da molesta.");
        discricao.add(33,"Fazer alguém esperar.");
        discricao.add(34,"Cutucar a bunda de alguém com o dedo.");
        discricao.add(35,"Pessoa que tem um comportamento instável.");
        discricao.add(36,"Desajeitado. Torto.");
        
        discricao.add(37,"Deteriorado");
        discricao.add(38,"Trocar dinheiro.");
        discricao.add(39,"Estragado.Revirado.");
        discricao.add(40,"Desgraça");
        discricao.add(41,"Tornar-se furioso. Embravecer.");
        discricao.add(42,"Enrolar. Remanchar.");
        
        discricao.add(43,"Engravidar.");
        discricao.add(44,"Chateado, de cara feia.");
        discricao.add(45,"Molhado, ensopado. (Empapado de suor).");
        discricao.add(46,"Molhado, ensopado. (Empapado de suor).");
        discricao.add(47,"Empacar. Criar dificuldades.");
        discricao.add(48,"Engravidar");
        
        discricao.add(49,"Desconfiado");
        discricao.add(50,"Não casou. Ficou pra titia.");
        discricao.add(51,"Ruim. De má qualidade");
        discricao.add(52,"Família");
        discricao.add(53,"Histeria passageira. Reação.violenta e afetada.(Coisa de viado) ");
        discricao.add(54,"Falta de apetite. Fastio.");
        
        discricao.add(55,"Ato reprovável, indignidade.");
        discricao.add(56,"Arrebatar. Partir pra cima.(Frechar em Frúita - Fruta. Pederasta.");
        discricao.add(57,"Sem cor, desbotado.");
        discricao.add(58,"Fofoca, mexerico.");
        discricao.add(59,"Barulho, confusão, conflito.");
        discricao.add(60,"Flor");
        discricao.add(61,"À toa, relaxado, largado, sem interesse.");
        discricao.add(62,"À força. Contra a vontade");
        discricao.add(63,"Otário. Tolo");
        discricao.add(64,"Otário. Tolo");
        discricao.add(65,"Doido");
        discricao.add(66,"Maluco");
        discricao.add(67,"Maluco, desorientado.");
        discricao.add(68,"Agarrar pela gola, agredir.");
        discricao.add(69,"Pessoa que ocupou um espaço tomou conta do pedaço (fulano aboletou-se na casa de sicrana e não sai mais);");
        discricao.add(70,"Pessoa espantada, com os olhos vidrados (abuticados).");
        discricao.add(71,"Chicote.");
        discricao.add(72,"Chegar junto.");
        discricao.add(73,"Agradar, bajular. Fazer a vontade de alguém");
        discricao.add(74,"Pessoa bem aparentada (bonita, arrumada)");
        discricao.add(75,"Folgado, arrombado.");

        
        
    }
    public void sorteio( JLabel lbldic, JLabel lbldesc)
    {
        //int qtd, ArrayList listDic, ArrayList listDesc,
        CarregarPalavras();
        CarregarDescricao();
        int num = 0;
        int num1 = 0;
        for(int b=0; b<=50;b++){
        boolean y=true;		
		while(y){
			if(dicionario.size()!=5){
			//SAMI	
                        num = num1 = (int) (Math.random()*dicionario.size());
			//System.out.println(dicionario.get(num));
                       // listDic.add(num);
                        //listDesc.add(num1);
                        lbldic.setText(dicionario.get(num));
                        lbldesc.setText(discricao.get(num1));
			dicionario.remove(num);
                        discricao.remove(num1);
			}
			else{
				y=false;
			}
		}
        }
    }
    public void sorteio2(JLabel jlbl){
        CarregarPalavras();
        int num = 0;
        for(int b=0; b<=75;b++){
        boolean y=true;		
		while(y){
			if(dicionario.size()!=12){
			//SAMI	
                        num = (int) (Math.random()*dicionario.size());
			//System.out.println(dicionario.get(num));
                       // listDic.add(num);
                        //listDesc.add(num1);
                        jlbl.setText(dicionario.get(num));
                	dicionario.remove(num);
                        break;
			}
			else{
				y=false;
			}
		}
        }
        
        
    }
        public void selecaoPalavras(JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5, JButton btn6, JButton btn7, JButton btn8, JButton btn9, JButton btn10)
    {
        CarregarPalavras();
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0; 
        int num5 = 0;       
        int num6 = 0;       
        int num7 = 0;      
        int num8 = 0;      
        int num9 = 0;
        
         
        
        		num0 = (int) (Math.random()*dicionario.size());
			btn10.setText(dicionario.get(num0));
                        btn10.setEnabled(true);
                        Dici.add(0, dicionario.get(num0));
                       // Dis.add(0, discricao.get(num0));
                	dicionario.remove(num0);
                        
        
                        num1 = (int) (Math.random()*dicionario.size());
			btn1.setText(dicionario.get(num1));
                        btn1.setEnabled(true);
                        Dici.add(dicionario.get(num1));
             //           Dis.add(discricao.get(num1));
                	dicionario.remove(num1);
                        
                         num2 = (int) (Math.random()*dicionario.size());
			btn2.setText(dicionario.get(num2));
                        btn2.setEnabled(true);
                        Dici.add(dicionario.get(num2));
              //          Dis.add(discricao.get(num2));
                	dicionario.remove(num2);
                        
                         num3 = (int) (Math.random()*dicionario.size());
			btn3.setText(dicionario.get(num3));
                        btn3.setEnabled(true);
                        Dici.add(dicionario.get(num3));
                //        Dis.add(discricao.get(num3));
                	dicionario.remove(num3);
                        
                         num4 = (int) (Math.random()*dicionario.size());
			btn4.setText(dicionario.get(num4));
                        btn4.setEnabled(true);
                        Dici.add(dicionario.get(num4));
               //         Dis.add(discricao.get(num4));
                	dicionario.remove(num4);
                        
                         num5 = (int) (Math.random()*dicionario.size());
			btn5.setText(dicionario.get(num5));
                        btn5.setEnabled(true);
                        Dici.add(dicionario.get(num5));
             //           Dis.add(discricao.get(num5));
                	dicionario.remove(num5);
                        
                         num6 = (int) (Math.random()*dicionario.size());
			btn6.setText(dicionario.get(num6));
                        btn6.setEnabled(true);
                        Dici.add(dicionario.get(num6));
               //         Dis.add(discricao.get(num6));
                	dicionario.remove(num6);
                        
                         num7 = (int) (Math.random()*dicionario.size());
			btn7.setText(dicionario.get(num7));
                        btn7.setEnabled(true);
                        Dici.add(dicionario.get(num7));
                //        Dis.add(discricao.get(num7));
                	dicionario.remove(num7);
                        
                        
                         num8 = (int) (Math.random()*dicionario.size());
			btn8.setText(dicionario.get(num8));
                        btn8.setEnabled(true);
                        Dici.add(dicionario.get(num8));
                //        Dis.add(discricao.get(num8));
                	dicionario.remove(num8);
                        
                         num9 = (int) (Math.random()*dicionario.size());
			btn9.setText(dicionario.get(num9));
                        btn9.setEnabled(true);
                        Dici.add(dicionario.get(num9));
                //        Dis.add(discricao.get(num9));
                	dicionario.remove(num9);
                        
                         
                        
	
    }
        public void sorteioLevel1(JLabel label)
        {
                       int num = 0;
        			
			num = (int) (Math.random()*Dici.size());
			label.setText(Dici.get(num));
                     //   label2.setText(Dis.get(num));
                	Dici.remove(num);
                    //    Dis.remove(num);
                      
        }
    
        
    
     
}
