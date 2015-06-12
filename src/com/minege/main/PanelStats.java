package com.minege.main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;


public class PanelStats extends JPanel{
	int ancY = this.getHeight();
	int ancX = 10;
	
	
	public void paintComponent (Graphics g) {
		Point nextPoint = new Point(0,0);
		Point lastPoint = new Point (0,0);
		/*Pire notes: <= 3 = ROUGE; Moyenne notes; > 4 < 5 ORANGE; Bonne note: > 5 */
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		int i = 0;
		
					for (int a : Fen.getA()) {
						switch(a){
							case 1:
								g.setColor(Color.RED);
								break;
							case 2:
								g.setColor(Color.RED);
								break;
							case 3:
								g.setColor(Color.RED);
								break;
							case 4:
								g.setColor(Color.ORANGE);
								break;
							case 5:
								g.setColor(Color.ORANGE);
								break;
							case 6:
								g.setColor(Color.GREEN);
								break;
							}
						
						nextPoint = new Point(i*10,this.getHeight()-a*30);
						g.drawLine(lastPoint.x,lastPoint.y,nextPoint.x,nextPoint.y);
						lastPoint = nextPoint;
						ancY = a*10;
						ancX = a*10;
						i++;
					}
					
					//calcul de la moyenne
					ArrayList<Integer> notes = Fen.getA();
					float sum = 0;
					for(int j = 0; j<notes.size();j++){
						sum += notes.get(j);
					}
					float moyenne = sum/notes.size();
					
					//dessin de la moyenne
					g.setColor(Color.blue);
					g.drawLine(0, (int)(this.getHeight()-moyenne*30), notes.size()*10, (int)(this.getHeight()-moyenne*30));
					

		}


	}
