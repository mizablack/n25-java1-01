package br.com.senaisp.bauru.aula07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Desenho extends JPanel {
	
//criando uma variavel estatica
	

	private static int qtdeInstancias = 0; //acrescentando a qtdeInstancias
	private static final long serialVersionUID = 1L;
	private int posX;
	private int posY;
	private Color cor;
	///contrutor
	public Desenho(int posX, int posY, Color cor) {
		qtdeInstancias++;
		this.posX = posX;
		this.posY = posY;
		this.cor = cor;
	}
	
public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

	// METODO  ABSTRATO DE DESENHAR FORMA
	protected abstract void desenharForma(Graphics g);
	// metodo mostrardesenho
	@Override
	public void paint(Graphics g) {
		desenharForma(g);
	}
	//metodo static
	public static int getQtdeInstancias() {
		return qtdeInstancias;
	}
	

	

}
