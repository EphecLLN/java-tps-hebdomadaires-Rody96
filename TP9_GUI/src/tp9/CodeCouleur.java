package tp9;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class CodeCouleur implements ActionListener {
	
	JFrame window;
	Container c;
	JButton noir,brun,rouge,orange,jaune,vert,bleu,magenta, gris,blanc, go, exit;
	JRadioButton couleur1, couleur2, couleur3;
	JLabel result;
	HashMap <Color,Integer> couleurs = new HashMap <Color,Integer>();
	
	public CodeCouleur() {
		addCouleur(Color.black,0);
		addCouleur(new Color(128,0,0),1);
		addCouleur(Color.red,2);
		addCouleur(Color.orange,3);
		addCouleur(Color.yellow,4);
		addCouleur(Color.green,5);
		addCouleur(Color.blue,6);
		addCouleur(Color.magenta,7);
		addCouleur(Color.gray,8);
		addCouleur(Color.white,9);
		
		GUI();
	}
	
	public void addCouleur(Color c, int value) {
		getColors().put(c, value);
	}
	
	public int getValue(Color c) {
		return couleurs.get(c);
	}
	
	public HashMap <Color,Integer>  getColors() {
		return couleurs;
	}
	
	public int calcule(Color dizaine, Color unite, Color puissance) {
		return Integer.parseInt(getValue(dizaine) + "" + getValue(unite)) * (int)Math.pow(10, getValue(puissance));  
	}
	
	public void GUI() {
		window = new JFrame("Code couleur");
		window.setSize(525, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.lightGray);
		window.setLayout(null);
		c = window.getContentPane();
		
		noir = new JButton();
		noir.setBackground(Color.black);
		noir.setBounds(10, 10, 40, 30);
		noir.setFocusPainted(false);
		noir.addActionListener(this);
		
		brun = new JButton();
		brun.setBackground(new Color(128,0,0));
		brun.setBounds(60, 10, 40, 30);
		brun.setFocusPainted(false);
		brun.addActionListener(this);
		
		rouge = new JButton();
		rouge.setBackground(Color.red);
		rouge.setBounds(110, 10, 40, 30);
		rouge.setFocusPainted(false);
		rouge.addActionListener(this);
		
		orange = new JButton();
		orange.setBackground(Color.orange);
		orange.setBounds(160, 10, 40, 30);
		orange.setFocusPainted(false);
		orange.addActionListener(this);
		
		jaune = new JButton();
		jaune.setBackground(Color.yellow);
		jaune.setBounds(210, 10, 40, 30);
		jaune.setFocusPainted(false);
		jaune.addActionListener(this);
		
		vert = new JButton();
		vert.setBackground(Color.green);
		vert.setBounds(260, 10, 40, 30);
		vert.setFocusPainted(false);
		vert.addActionListener(this);
		
		bleu = new JButton();
		bleu.setBackground(Color.blue);
		bleu.setBounds(310, 10, 40, 30);
		bleu.setFocusPainted(false);
		bleu.addActionListener(this);
		
		magenta = new JButton();
		magenta.setBackground(Color.magenta);
		magenta.setBounds(360, 10, 40, 30);
		magenta.setFocusPainted(false);
		magenta.addActionListener(this);
		
		gris = new JButton();
		gris.setBackground(Color.gray);
		gris.setBounds(410, 10, 40, 30);
		gris.setFocusPainted(false);
		gris.addActionListener(this);
		
		blanc = new JButton();
		blanc.setBackground(Color.white);
		blanc.setBounds(460, 10, 40, 30);
		blanc.setFocusPainted(false);
		blanc.addActionListener(this);
		
		couleur1 = new JRadioButton();
		couleur1.setBounds(180, 50, 20, 20);
		
		couleur2 = new JRadioButton();
		couleur2.setBounds(230, 50, 20, 20);

		couleur3 = new JRadioButton();
		couleur3.setBounds(280, 50, 20, 20);
		
		result = new JLabel("0 ohms",SwingConstants.CENTER);
		result.setFont(new Font("Times New Roman",Font.PLAIN,20));
		result.setBounds(30, 100, 450, 30);
		
		go = new JButton("Go");
		go.setBounds(30, 150, 450, 30);
		go.setFocusPainted(false);
		go.addActionListener(this);
		
		exit = new JButton("Exit");
		exit.setBounds(30, 200, 450, 30);
		exit.setFocusPainted(false);
		exit.addActionListener(this);
		
		
		c.add(noir);
		c.add(brun);
		c.add(rouge);
		c.add(orange);
		c.add(jaune);
		c.add(vert);
		c.add(bleu);
		c.add(magenta);
		c.add(gris);
		c.add(blanc);
		c.add(couleur1);
		c.add(couleur2);
		c.add(couleur3);
		c.add(result);
		c.add(go);
		c.add(exit);
		
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		 new CodeCouleur();
	}
	
	public void changerFond(JRadioButton rad1,JRadioButton rad2,JRadioButton rad3, Color c) {
	
		if(rad1.isSelected()) {
			rad1.setBackground(c);
		}
		else if(rad2.isSelected()) {
			rad2.setBackground(c);
		}
		else if(rad3.isSelected()) {
			rad3.setBackground(c);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object  source = e.getSource();
		
		if(source == noir) {
			changerFond(couleur1,couleur2,couleur3,Color.black);
		}
		else if(source == brun) {
			changerFond(couleur1,couleur2,couleur3,new Color(128,0,0));
		}
		else if(source == rouge) {
			changerFond(couleur1,couleur2,couleur3,Color.red);
		}
		else if(source == orange) {
			changerFond(couleur1,couleur2,couleur3,Color.orange);
		}
		else if(source == jaune) {
			changerFond(couleur1,couleur2,couleur3,Color.yellow);
		}
		else if(source == vert) {
			changerFond(couleur1,couleur2,couleur3,Color.green);
		}
		else if(source == bleu) {
			changerFond(couleur1,couleur2,couleur3,Color.blue);
		}
		else if(source == magenta) {
			changerFond(couleur1,couleur2,couleur3,Color.magenta);
		}
		else if(source == gris) {
			changerFond(couleur1,couleur2,couleur3,Color.gray);
		}
		else if(source == blanc) {
			changerFond(couleur1,couleur2,couleur3,Color.white);
		}
		else if(source == go) {
			int valeurResistance = calcule(couleur1.getBackground(), couleur2.getBackground(),couleur3.getBackground());
			result.setText(valeurResistance + " ohms");
		}
		else if(source == exit) {
			window.dispose();
		}
		
	}

}
