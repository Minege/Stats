package com.minege.main;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;


public class PanelStats extends JPanel{
	int ancY = this.getHeight();
	int ancX = 10;
	public void paintComponent (Graphics g) {
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
				g.drawLine(ancX, ancY, a*10, this.getHeight()-a*10);
						ancY = a*10;
						ancX = a*10;
				i++;
			}

		}


	}
