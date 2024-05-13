import javax.swing.*;   //Necesario para diseñar ventanas
import java.awt.event.*; //Necesario para disparar eventos
import java.awt.*; //Necesario para manejar color, font e imagen


public class AdivinaQuien extends JFrame implements ActionListener{

  public JLabel etiquetaIMG, etiqueta1, etiqueta2;
  public JButton boton;


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

	boton = new JButton("JUGAR");
	boton.setBounds(20, 160, 90, 25);
	add(boton);
	
  }//Fin del constructor 
//---------------------------------------------------------------------------


//****************************************MAIN********************************
  public static void main(String args[]){
	AdivinaQuien ventana = new AdivinaQuien();
	ventana.setBounds(150, 150, 1000, 650);
 	ventana.setVisible(true);	

  }//Fin del metodo main 
//-------------------------------------------------------------------------------

}//Fin de la clase AdivinaQuien 

