package interfaz;

import javax.swing.JFrame;

import modelo.Juego;

public class VentanaPrincipal extends JFrame{
	
	private Juego juego;

	
	public VentanaPrincipal() {
		
		juego=new Juego();
		
		this.setSize(800, 800);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
	
}
