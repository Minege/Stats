package com.minege.main;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class Fen extends JFrame implements ActionListener{
	
	/*Panel: */
	PanelStats panelStats = new PanelStats();
	JPanel root = new JPanel();
	JPanel control = new JPanel();
	
	static ArrayList<Integer> notes = new ArrayList<>();
	private JButton button;
	private JSpinner spin1;
	
	public Fen(){
	/*Zone control*/
    JButton afficher = new JButton("Afficher");
	button = new JButton("Ajouter");
	button.addActionListener(this);
	spin1 = new JSpinner();
	JLabel info_note = new JLabel("Entre ta note ici: ");
	
	this.setBounds(100, 100, 450, 300);
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setContentPane(root);
	
	/*Disposition des Panels sur le root */
	root.setLayout(new BorderLayout());

	root.add(panelStats, BorderLayout.CENTER);
	root.add(control, BorderLayout.SOUTH);
	
	/*On met les boutons sur le control*/
	control.setLayout(new BorderLayout());
	control.add(spin1, BorderLayout.CENTER);
	control.add(button, BorderLayout.EAST);
	control.add(info_note, BorderLayout.WEST);
	}
	
	
	public static void main(String[] args) {
		Fen f = new Fen();
		f.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
        //On ajoute une valeur à l'array et on appelle PanelStats
        //a.add((int)spin1.getValue());
			    Object src = e.getSource();
			    if (src == button) {
			    	notes.add((int)spin1.getValue());
			    	panelStats.updateUI();
			    }
	}


	public static ArrayList<Integer> getA() {
		return notes;
	}
	public static int getAsize(){
		return notes.size();
	}

	public static void setA(ArrayList<Integer> newA) {
		Fen.notes = newA;
	}
	
	}