import javax.swing.*;   //Necesario para diseñar ventanas
import java.awt.event.*; //Necesario para disparar eventos
import java.awt.*; //Necesario para manejar color, font e imagen


public class AdivinaQuien extends JFrame implements ActionListener{

  public JLabel etiquetaIMG, etiqueta1, etiqueta2, etiqueta3;
  public JButton boton, botonSalir, botonSIn1, botonNOn1, botonSIn2D, botonNOn2D, botonSIn2I, botonNOn2I, botonSIn3D1, botonNOn3D1, botonSIn3I1, botonNOn3I1,botonSIn3D2, botonNOn3D2, botonSIn3I2, botonNOn3I2, botonSIn4I1, botonNOn4I1, botonSIn4D1, botonNOn4D1, botonSIn4I2, botonNOn4I2, botonSIn4D2, botonNOn4D2, botonJDN;

//********************************CONSTRUCTOR*******************************
  public AdivinaQuien (){
	setLayout(null);
	setTitle("Adivina Quien del CHAVO");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	getContentPane().setBackground(Color.BLACK);
	setIconImage(new ImageIcon(getClass().getResource("Icono del programa.png")).getImage());

	ImageIcon imagen = new ImageIcon("Personajes.jpg");
	etiquetaIMG = new JLabel(imagen);
	etiquetaIMG.setBounds(200, 220, 600, 350);
	add(etiquetaIMG);
	

	Font fuente = new Font("Broadway", Font.BOLD, 35);
	etiqueta1 = new JLabel("Adivina Quien del CHAVO !!");
	etiqueta1.setBounds(20, 20, 600, 30); // x, y, ancho, alto
	etiqueta1.setFont(fuente);
	etiqueta1.setForeground(Color.WHITE);
	add(etiqueta1);

	Font fuente2 = new Font("Broadway", Font.BOLD, 20);
	etiqueta2 = new JLabel("Elige un personaje y tratare de adivinarlo !");
	etiqueta2.setBounds(60, 75, 700, 30); // x, y, ancho, alto
	etiqueta2.setFont(fuente2);
	etiqueta2.setForeground(Color.WHITE);
	add(etiqueta2);

	Font fuente3 = new Font("Broadway", Font.BOLD, 14);
	etiqueta3 = new JLabel("Presiona jugar cuando estes listo. ");
	etiqueta3.setBounds(60, 110, 700, 30); // x, y, ancho, alto
	etiqueta3.setFont(fuente3);
	etiqueta3.setForeground(Color.WHITE);
	add(etiqueta3);

	boton = new JButton("JUGAR");
	boton.setBounds(20, 160, 90, 25);
	add(boton);
	
	botonSalir = new JButton("SALIR");
	botonSalir.setBounds(850, 560, 90, 25);
	add(botonSalir);

	botonJDN = new JButton("Jugar de nuevo");
	botonJDN.setBounds(20, 160, 140, 25);
	add(botonJDN);
	botonJDN.setVisible(false);




	botonSIn1 = new JButton("Si");
	botonSIn1.setBounds(20, 160, 90, 25);
	add(botonSIn1);
	botonSIn1.setVisible(false);

	botonNOn1 = new JButton("No");
	botonNOn1.setBounds(125, 160, 90, 25);
	add(botonNOn1);
  	botonNOn1.setVisible(false); 




	botonSIn2D = new JButton("Si");
	botonSIn2D.setBounds(20, 160, 90, 25);
	add(botonSIn2D);
	botonSIn2D.setVisible(false);

	botonNOn2D = new JButton("No");
	botonNOn2D.setBounds(125, 160, 90, 25);
	add(botonNOn2D);
  	botonNOn2D.setVisible(false);

	botonSIn2I = new JButton("Si");
	botonSIn2I.setBounds(20, 160, 90, 25);
	add(botonSIn2I);
	botonSIn2I.setVisible(false);

	botonNOn2I = new JButton("No");
	botonNOn2I.setBounds(125, 160, 90, 25);
	add(botonNOn2I);
  	botonNOn2I.setVisible(false);




	botonSIn3D1 = new JButton("Si");
	botonSIn3D1.setBounds(20, 160, 90, 25);
	add(botonSIn3D1);
	botonSIn3D1.setVisible(false);

	botonNOn3D1 = new JButton("No");
	botonNOn3D1.setBounds(125, 160, 90, 25);
	add(botonNOn3D1);
  	botonNOn3D1.setVisible(false);

	botonSIn3I1 = new JButton("Si");
	botonSIn3I1.setBounds(20, 160, 90, 25);
	add(botonSIn3I1);
	botonSIn3I1.setVisible(false);

	botonNOn3I1 = new JButton("No");
	botonNOn3I1.setBounds(125, 160, 90, 25);
	add(botonNOn3I1);
  	botonNOn3I1.setVisible(false);

	botonSIn3D2 = new JButton("Si");
	botonSIn3D2.setBounds(20, 160, 90, 25);
	add(botonSIn3D2);
	botonSIn3D2.setVisible(false);

	botonNOn3D2 = new JButton("No");
	botonNOn3D2.setBounds(125, 160, 90, 25);
	add(botonNOn3D2);
  	botonNOn3D2.setVisible(false);

	botonSIn3I2 = new JButton("Si");
	botonSIn3I2.setBounds(20, 160, 90, 25);
	add(botonSIn3I2);
	botonSIn3I2.setVisible(false);

	botonNOn3I2 = new JButton("No");
	botonNOn3I2.setBounds(125, 160, 90, 25);
	add(botonNOn3I2);
  	botonNOn3I2.setVisible(false);




	botonSIn4D1 = new JButton("Si");
	botonSIn4D1.setBounds(20, 160, 90, 25);
	add(botonSIn4D1);
	botonSIn4D1.setVisible(false);

	botonNOn4D1 = new JButton("No");
	botonNOn4D1.setBounds(125, 160, 90, 25);
	add(botonNOn4D1);
  	botonNOn4D1.setVisible(false);

	botonSIn4I1 = new JButton("Si");
	botonSIn4I1.setBounds(20, 160, 90, 25);
	add(botonSIn4I1);
	botonSIn4I1.setVisible(false);

	botonNOn4I1 = new JButton("No");
	botonNOn4I1.setBounds(125, 160, 90, 25);
	add(botonNOn4I1);
  	botonNOn4I1.setVisible(false);

	botonSIn4D2 = new JButton("Si");
	botonSIn4D2.setBounds(20, 160, 90, 25);
	add(botonSIn4D2);
	botonSIn4D2.setVisible(false);

	botonNOn4D2 = new JButton("No");
	botonNOn4D2.setBounds(125, 160, 90, 25);
	add(botonNOn4D2);
  	botonNOn4D2.setVisible(false);

	botonSIn4I2 = new JButton("Si");
	botonSIn4I2.setBounds(20, 160, 90, 25);
	add(botonSIn4I2);
	botonSIn4I2.setVisible(false);

	botonNOn4I2 = new JButton("No");
	botonNOn4I2.setBounds(125, 160, 90, 25);
	add(botonNOn4I2);
  	botonNOn4I2.setVisible(false);



	boton.addActionListener(this);
	botonJDN.addActionListener(this);
	botonSIn1.addActionListener(this);
	botonNOn1.addActionListener(this);

	botonSIn2D.addActionListener(this);
	botonNOn2D.addActionListener(this);
	botonSIn2I.addActionListener(this);
	botonNOn2I.addActionListener(this);

	botonSIn3D1.addActionListener(this);
	botonNOn3D1.addActionListener(this);
	botonSIn3I1.addActionListener(this);
	botonNOn3I1.addActionListener(this);
	botonSIn3D2.addActionListener(this);
	botonNOn3D2.addActionListener(this);
	botonSIn3I2.addActionListener(this);
	botonNOn3I2.addActionListener(this);

	botonSIn4D1.addActionListener(this);
	botonNOn4D1.addActionListener(this);
	botonSIn4I1.addActionListener(this);
	botonNOn4I1.addActionListener(this);
	botonSIn4D2.addActionListener(this);
	botonNOn4D2.addActionListener(this);
	botonSIn4I2.addActionListener(this);
	botonNOn4I2.addActionListener(this);

	botonSalir.addActionListener(this);

  }//Fin del constructor 
//---------------------------------------------------------------------------

//**************************METODO ACTION PERFORMED***************************

  public void actionPerformed(ActionEvent accion){

	if(accion.getSource() == botonSalir){
	  System.exit(0);
	}

	if(accion.getSource() == botonJDN){
	  boton.setVisible(true);
	  botonJDN.setVisible(false);
	
	if(accion.getSource() == boton){
	  boton.setVisible(false);
	  botonSIn1.setVisible(true);
	  botonNOn1.setVisible(true);
	  etiqueta3.setText("Tu personaje es muejer ? ");
	}

	if(accion.getSource() == botonSIn1){
	  botonSIn1.setVisible(false);
	  botonNOn1.setVisible(false);
	  botonSIn2D.setVisible(true);
	  botonNOn2D.setVisible(true);
	  etiqueta3.setText("Tu personaje es adulto ? ");	
	}

		if(accion.getSource() == botonSIn2D){
	  	botonSIn2D.setVisible(false);
	  	botonNOn2D.setVisible(false);
	  	botonSIn3I2.setVisible(true);
	  	botonNOn3I2.setVisible(true);
	  	etiqueta3.setText("Tu personaje promueve no juntarse con la chusma ? ");
		}

			if(accion.getSource() == botonNOn3I2){
		  	  botonSIn3I2.setVisible(false);
	  		  botonNOn3I2.setVisible(false);
	  		  botonJDN.setVisible(true);	
			  etiqueta3.setText("Tu personaje es: LA BRIJA DEL 701 !!");
			}

			if(accion.getSource() == botonSIn3I2){
		  	  botonSIn3I2.setVisible(false);
	  		  botonNOn3I2.setVisible(false);		
	  		  botonJDN.setVisible(true);	  
			  etiqueta3.setText("Tu personaje es: DONA FLORINDA !!");
			}


		if(accion.getSource() == botonNOn2D){
	  	botonSIn2D.setVisible(false);
	  	botonNOn2D.setVisible(false);
	  	botonSIn3D2.setVisible(true);
	  	botonNOn3D2.setVisible(true);
	  	etiqueta3.setText("Tu personaje usa lentes ? ");
		}

			if(accion.getSource() == botonNOn3D2){
		  	  botonSIn3D2.setVisible(false);
	  		  botonNOn3D2.setVisible(false);
	  		  botonJDN.setVisible(true);	
			  etiqueta3.setText("Tu personaje es: LA POPIS !!");
			}

			if(accion.getSource() == botonSIn3D2){
		  	  botonSIn3D2.setVisible(false);
	  		  botonNOn3D2.setVisible(false);		
	  		  botonJDN.setVisible(true);	  
			  etiqueta3.setText("Tu personaje es: LA CHILINDRINA !!");
			}
//--------------------------------------------------------------------------------------------------------------


	if(accion.getSource() == botonNOn1){
	  botonSIn1.setVisible(false);
	  botonNOn1.setVisible(false);
	  botonSIn2I.setVisible(true);
	  botonNOn2I.setVisible(true);
	  etiqueta3.setText("Tu personaje es adulto ? ");
	}

		if(accion.getSource() == botonSIn2I){
	  	botonSIn2I.setVisible(false);
	  	botonNOn2I.setVisible(false);
	  	botonSIn3I1.setVisible(true);
	  	botonNOn3I1.setVisible(true);
	  	etiqueta3.setText("Tu personaje tiene problemas de sobrepeso ? ");
		}

			if(accion.getSource() == botonNOn3I1){
		  	  botonSIn3I1.setVisible(false);
	  		  botonNOn3I1.setVisible(false);
	  		  botonSIn4D1.setVisible(true);
	  		  botonNOn4D1.setVisible(true);	
			  etiqueta3.setText("Tu personaje es invitado a paar por una tasa de cafe? ");
			}

				if(accion.getSource() == botonSIn4D1){
				  botonSIn4D1.setVisible(false);
	  		  	  botonNOn4D1.setVisible(false);		
	  		  	  botonJDN.setVisible(true);	  
			  	  etiqueta3.setText("Tu personaje es: EL SENOR JIRAFAILS !!"); 
				}

				if(accion.getSource() == botonNOn4D1){
				  botonSIn4D1.setVisible(false);
	  		  	  botonNOn4D1.setVisible(false);		
	  		  	  botonJDN.setVisible(true);	  
			  	  etiqueta3.setText("Tu personaje es: RON DAMON !!"); 
				}

			if(accion.getSource() == botonSIn3I1){
		  	  botonSIn3I1.setVisible(false);
	  		  botonNOn3I1.setVisible(false);
	  		  botonSIn4I1.setVisible(true);
	  		  botonNOn4I1.setVisible(true);	
			  etiqueta3.setText("Tu personaje insiste en cobrar el dinero de la renta ? ");
			}
	
				if(accion.getSource() == botonSIn4I1){
				  botonSIn4I1.setVisible(false);
	  		  	  botonNOn4I1.setVisible(false);		
	  		  	  botonJDN.setVisible(true);	  
			  	  etiqueta3.setText("Tu personaje es: EL SENOR BARRIGA !!"); 
				}

				if(accion.getSource() == botonNOn4I1){
				  botonSIn4I1.setVisible(false);
	  		  	  botonNOn4I1.setVisible(false);		
	  		  	  botonJDN.setVisible(true);	  
			  	  etiqueta3.setText("Tu personaje es: JAIMITO EL CARTER !!"); 
				}

		if(accion.getSource() == botonNOn2I){
	  	botonSIn2I.setVisible(false);
	  	botonNOn2I.setVisible(false);
	  	botonSIn3D1.setVisible(true);
	  	botonNOn3D1.setVisible(true);
	  	etiqueta3.setText("Tu personaje tiene pelo negro ? ");
		}

			if(accion.getSource() == botonNOn3D1){
		  	  botonSIn3D1.setVisible(false);
	  		  botonNOn3D1.setVisible(false);
	  		  botonSIn4D2.setVisible(true);
	  		  botonNOn4D2.setVisible(true);	
			  etiqueta3.setText("Tu personaje goza de dormir en un barril ? ");
			}

				if(accion.getSource() == botonSIn4D2){
				  botonSIn4D2.setVisible(false);
	  		  	  botonNOn4D2.setVisible(false);		
	  		  	  botonJDN.setVisible(true);	  
			  	  etiqueta3.setText("Tu personaje es: EL CHAVO DEL 8 !!!!!"); 
				}

				if(accion.getSource() == botonNOn4D2){
				  botonSIn4D2.setVisible(false);
	  		  	  botonNOn4D2.setVisible(false);		
	  		  	  botonJDN.setVisible(true);	  
			  	  etiqueta3.setText("Tu personaje es: EL CARNALITO QUE NI TU TE SABES SU NOMBRE !!"); 
				}

			if(accion.getSource() == botonSIn3D1){
		  	  botonSIn3D1.setVisible(false);
	  		  botonNOn3D1.setVisible(false);
	  		  botonSIn4I2.setVisible(true);
	  		  botonNOn4I2.setVisible(true);	
			  etiqueta3.setText("Tu personaje podria facilmente ser usado como balon ? ");
			}
	
				if(accion.getSource() == botonSIn4I2){
				  botonSIn4I2.setVisible(false);
	  		  	  botonNOn4I2.setVisible(false);		
	  		  	  botonJDN.setVisible(true);	  
			  	  etiqueta3.setText("Tu personaje es: NONO !!"); 
				}

				if(accion.getSource() == botonNOn4I2){
				  botonSIn4I2.setVisible(false);
	  		  	  botonNOn4I2.setVisible(false);		
	  		  	  botonJDN.setVisible(true);	  
			  	  etiqueta3.setText("Tu personaje es: EL CACHETES DE MARRANA FLACA !!"); 
				}




  }//Fin del metodo actionPerformed
//----------------------------------------------------------------------------

//****************************************MAIN********************************
  public static void main(String args[]){
	AdivinaQuien ventana = new AdivinaQuien();
	ventana.setBounds(150, 150, 1000, 650);
 	ventana.setVisible(true);	

  }//Fin del metodo main 
//-------------------------------------------------------------------------------

}//Fin de la clase AdivinaQuien 

