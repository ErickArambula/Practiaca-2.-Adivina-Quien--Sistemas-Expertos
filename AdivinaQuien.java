import javax.swing.*;   //Necesario para diseñar ventanas
import java.awt.event.*; //Necesario para disparar eventos
import java.awt.*; //Necesario para manejar color, font e imagen


public class AdivinaQuien extends JFrame{

  public JLabel etiqueta1;
  public JButton boton;

  public AdivinaQuien (){
	setLayout(null);
	setTitle("Adivina Quien del CHAVO");
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	etiqueta1 = new JLabel("Erick Arambula");
	etiqueta1.setBounds(100, 100, 100, 15); // x, y, ancho, alto
	add(etiqueta1);

	boton = new JButton("Boton");
	boton.setBounds(70, 140, 70, 15);
	add(boton);
	
  }//Fin del constructor 


  public static void main(String args[]){
	AdivinaQuien ventana = new AdivinaQuien();
	ventana.setBounds(150, 150, 1200, 650);
 	ventana.setVisible(true);	

  }//Fin del metodo main 


}//Fin de la clase AdivinaQuien 

