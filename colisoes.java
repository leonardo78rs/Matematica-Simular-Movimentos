
import java.awt.Color;
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

//import java.awt.image.BufferedImage;


/*
 * TelaJFrame.java
 *
 * Created on 24/09/2011, 03:56:36
 */
public class colisoes extends Applet {

    /** Creates new form TelaJFrame */
    public colisoes() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Inicia");

        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                //.addGap(20, 20, 20)
                )
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                //.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
        );

        jLabel2.setText("Vx1");
        jLabel3.setText("gravidade");
        jLabel4.setText("Vx2");
        jLabel5.setText("amortecimento");
        jLabel6.setText("Dorme");
        jLabel7.setText("chão");
        jLabel8.setText("teto");
        jLabel9.setText("direita");
        jLabel10.setText("esquerda");
        jLabel11.setText("passos");
        jLabel12.setText("Muitas combinações podem gerar erro de calculo, colapsando o movimento -- dai é só mudar um ou outro parâmetro");
        jLabel13.setText("Vy1");
        jLabel14.setText("Vy2");
        jCheckBox1.setText("Mostrar bola 1");
        jCheckBox2.setText("Mostrar bola 2");
        jButton2.setText("limpa");

        jSpinner1.setValue(25);    //vx1
        jSpinner2.setValue(15);    //vx2
        jSpinner3.setValue(7);    //dorme
        jSpinner4.setValue(-12);    // vy1
        jSpinner5.setValue(250);    // passos
        jSpinner6.setValue(-40);     // vy2
        jSpinner7.setValue(1);    // a gravidade
        jSpinner8.setValue(9);    // amortec
        jSpinner9.setValue(20);    // teto
        jSpinner10.setValue(950);    //direita
        jSpinner11.setValue(530);    // chao
        jSpinner12.setValue(0);    //esquerda
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8)
                                .addComponent(jLabel14)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jCheckBox2)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))))
        );

        jSpinner3.getAccessibleContext().setAccessibleName("");

        pack();
   // </editor-fold>
         

        jButton2.addActionListener(
      		  new ActionListener(){
      		  public void actionPerformed(ActionEvent e){
      			Graphics graphics = jLabel1.getGraphics();
      			graphics.clearRect(0, 0, 1000, 600);
      		//	//graphics.clearRect(0, 0, ((Number)jSpinner9.getValue()).intValue(), ((Number)jSpinner11.getValue()).intValue());
      			
      		  }});        
    /**
     * @param args the command line arguments
     */
    jButton1.addActionListener(
    		  new ActionListener(){
    		  public void actionPerformed(ActionEvent e){
    		        
    		        Graphics graphics = jLabel1.getGraphics();
    		        
    		          /** depois tem que testar para ver os melhores
    		           * limites de cada variável.
    		           *   
    		           */
    		         // int quemvai = 3;      // bolas 1 ou 2, 3=ambas
    		          int colorido=1;       // bola1: (0 preto/ 1 color) 
    		          int raio = 5;         // largura da bolinha 
    		          
    		          int dorme = 10;       // tempo delay (0- até 200) 
    		          int passos=500;       // num. bolinhas (for..next) até 1000
    		          
    		          double amortec=0.9;   // (0.1-1.0) coeficiente de amortecimento na colisão com o chão
    		          double amortec2=1-((1-amortec)/2);
    		          
    		          int a = 1;
    		                    
    		          int chao = 500;       // posicao do chao na tela
    		          int teto = 150;        // posicao do teto 
    		          int parede = 800;    // parede direita
    		          int inicial1 = 0;     // inicial é a parede direita
    		          int inicial2 = 0;     // só pode ter na 2a. volta
    		          // se passos*dorme>valor_x  fica muito demorado  
    		          int y1 = 200;  int x1 = 10;   
    		          int vx1 = 20;  int vy1 = -12;
    		        
    		          int y2 = 200;  int x2 = 10;
    		          int vx2 = 25;  int vy2 = -10;
    		        
    		          //vx1 = DeStringPraInt(jSpinner1.get....());
    		          
    		          vx1=((Number)jSpinner1.getValue()).intValue();
    		          vx2=((Number)jSpinner2.getValue()).intValue();
    		          vy1=((Number)jSpinner4.getValue()).intValue();
    		          vy2=((Number)jSpinner6.getValue()).intValue();
    		          
    		          
    		          dorme=((Number)jSpinner3.getValue()).intValue();
    		          passos=((Number)jSpinner5.getValue()).intValue();
    		          a=((Number)jSpinner7.getValue()).intValue();
    		          amortec=(((Number)jSpinner8.getValue()).doubleValue())/10;
    		          teto=((Number)jSpinner9.getValue()).intValue();
    		          parede=((Number)jSpinner10.getValue()).intValue();
    		          chao=((Number)jSpinner11.getValue()).intValue();
    		          inicial1=((Number)jSpinner12.getValue()).intValue();
    		          inicial2=((Number)jSpinner12.getValue()).intValue();
    		          
    		          amortec2=1-((1-amortec)/2);  //este é o calculo certo
    		          amortec2=1;                  // este está anulando temporariamente o amortec na componente secundaria
    		          
    		          System.out.println(dorme);
    		          System.out.println(passos);
    		          System.out.println(vx1);
    		          System.out.println(vx2);
    		          System.out.println(vy1);
    		          System.out.println(vy2);
    		          System.out.println((int)a);
    		          System.out.println(amortec);
    		          System.out.println(amortec2);
    		          System.out.println(teto);
    		          System.out.println(parede);
    		          System.out.println(chao);
    		          System.out.println(inicial1);
    		          int margem=0;
    		          
        	          // cenário (teto, prédio e chão e parede lateral)
    		          graphics.drawLine(0, teto-margem, parede+margem, teto-margem);
    		          graphics.drawRect(x1, y1+5, 20, chao-y1+5);
    		          graphics.drawLine(20, chao+margem, y1+parede, chao+margem);
    		          graphics.drawLine(parede+10, 0, parede+10, 600);
    		          int antx1,antx2,anty1,anty2;
   		          
    				   	for(int i = 1; i <= passos; i += 1){

  	    		          antx1=x1;
	    		          antx2=x2;
	    		          anty1=y1;
	    		          anty2=y2;

    				   	   vy1 = vy1 + a;
    				   	   y1 = y1 + vy1;
    				   	   x1 = x1 + vx1;
    		 			   
    		 			   vy2 = vy2 + a;
    		 			   y2 = y2 + vy2;
    		 			   x2 = x2 + vx2;
    		 			   
  		 		
    		 		      // evitar que dê erro e passe do chão
    		             if (y1>chao+margem) y1=chao;
    		             if (y2>chao+margem) y2=chao;
    		             
    		             // isto aqui é uma besteira
    		             // apenas coloca cores nos multiplos de 9,8,...,2
    		             // o que nao é multiplo fica preto
    		             // tem que ficar ordem inversa pois coloquei else if 
    		             // se botar ordem normal nunca pega multiplos tipo 4,6,8,9
    		             if (colorido == 1) {               
    		             if (i % 10 == 0) {graphics.setColor(Color.magenta);}
    		             else if (i % 9 == 0) {graphics.setColor(Color.RED);}
    		             else if (i % 8 == 0) {graphics.setColor(Color.MAGENTA);}
    		             else if (i % 7 == 0) {graphics.setColor(Color.BLUE);}
    		             else if (i % 6 == 0) {graphics.setColor(Color.CYAN);}
    		             else if (i % 5 == 0) {graphics.setColor(Color.GREEN);}
    		             else if (i % 4 == 0) {graphics.setColor(Color.GRAY);}
    		             else if (i % 3 == 0) {graphics.setColor(Color.YELLOW);}
    		             else if (i % 2 == 0) {graphics.setColor(Color.ORANGE);}
    		             else graphics.setColor(Color.DARK_GRAY);
    		          }
    		          
    		             if (jCheckBox1.isSelected()) {
    		            	 graphics.setColor(Color.BLUE);  //ISTO ESTÁ ANULANDO A PARTE ACIMA (COLORIDO)
    	    		          graphics.fillOval(x1 ,y1, raio, raio);
    	    		        //  graphics.setColor(Color.gray);
    	    		      	//  graphics.fillOval(antx1 ,anty1, raio, raio);
    		                  }
    		                  
    	    		          if (jCheckBox2.isSelected()) {
    	    		        	  
    	    		          graphics.setColor(Color.BLACK);
    	    		      	  graphics.fillOval(x2, y2, raio, raio);
    	    		      	//graphics.setColor(Color.gray);
  	    		      	    //  graphics.fillOval(antx2 ,anty2, raio, raio);
  		                  }
    		             
    		      //    if (x1>50) {
    		      //    	inicial1=30;
    		      //    }
    		      //    if (x2>50) {
    		      //    	inicial2=30;
    		      //    }
    		 			// caso toque no chão    
    		 			if (y1 >= chao)  vy1 = -(int)(vy1*amortec);
    		 			if (y2 >= chao)  vy2 = -(int)(vy2*amortec);
    		 			// caso toque no teto     
    		 			if (y1 <= teto)   vy1 = -(int)(vy1*amortec);
    		 			if (y2 <= teto)  vy2 = -(int)(vy2*amortec);
    		 			// caso toque na parede lateral    
    		 			if (x1 >= parede)   vx1 = -(int)(vx1*amortec);
    		 			if (x2 >= parede)  vx2 = -(int)(vx2*amortec);
    		 			// caso toque na volta ** ainda nao esta bom     
    		 			if (x1 <= inicial1)   vx1 = -(int)(vx1*amortec);
    		 			if (x2 <= inicial2)  vx2 = -(int)(vx2*amortec);
    		 			
     		 		    // amortecer compenente x tambem caso toque no chão
    		 			if (y1 >= chao)   vx1 = (int)(vx1*amortec2);
    		 			if (y2 >= chao)  vx2 = (int)(vx2*amortec2);
        		 		// amortecer compenente x tambem caso toque no teto
    		 			if (y1 <= teto)   vx1 = (int)(vx1*amortec2);
    		 			if (y2 <= teto)  vx2 = (int)(vx2*amortec2);
        		 		// amortecer componente y tambem caso toque na parede lateral
    		 			if (x1 >= parede)   vy1 = (int)(vy1*amortec2);
    		 			if (x2 >= parede)  vy2 = (int)(vy2*amortec2);
    		 		    // amortecer componente y tambem caso toque na volta ** ainda nao esta bom
    		 			if (x1 <= inicial1)   vy1 = -(int)(vy1*amortec2);
    		 			if (x2 <= inicial2)  vy2 = -(int)(vy2*amortec2);
    		 			
    		 			try { Thread.sleep(dorme); } catch (Exception ex) 	{ ex.printStackTrace();	}   
    				    }
    		 		 }
    		    }
    		  );
    }		 
    public static void main(String args[]) {
           try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(colisoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(colisoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(colisoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(colisoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new colisoes().setVisible(true);
            }
        });
    }
        static int DeStringPraInt(String opcao){
        	int valor=0;
        	double acres=0;
        	int y=0;
        	for (int x=opcao.length()-1; x>=0; x--, y++){
        		acres=(((double)opcao.charAt(x))-48)*Math.pow(10, y);
        		valor=valor+(int)acres;
        	}
        	return valor;
        }
    
        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JCheckBox jCheckBox1;
        private javax.swing.JCheckBox jCheckBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JSpinner jSpinner1;
        private javax.swing.JSpinner jSpinner10;
        private javax.swing.JSpinner jSpinner11;
        private javax.swing.JSpinner jSpinner12;
        private javax.swing.JSpinner jSpinner2;
        private javax.swing.JSpinner jSpinner3;
        private javax.swing.JSpinner jSpinner4;
        private javax.swing.JSpinner jSpinner5;
        private javax.swing.JSpinner jSpinner6;
        private javax.swing.JSpinner jSpinner7;
        private javax.swing.JSpinner jSpinner8;
        private javax.swing.JSpinner jSpinner9;
        // End of variables declaration
}
