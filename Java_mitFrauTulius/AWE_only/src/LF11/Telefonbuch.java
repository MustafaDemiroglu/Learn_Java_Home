package LF11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Telefonbuch extends JFrame {
	
	private JTextField suchFeld;
	private JLabel ergebnisFeld;
	
	HashMap <String, String> telefonbuch = new HashMap<>();
	
	public Telefonbuch(){
		
		// HashMap-füllen
				telefonbuch.put("+491765896542", "Mustermann, Max");
				telefonbuch.put("+491715863214", "Beispiel, Gisela");
				telefonbuch.put("+332147896254", "Beispiel, Horst");

		// Aufruf der GUI
		makeGUI();
		
	}

	private void makeGUI() {
		JPanel panel = new JPanel();
		suchFeld = new JTextField(35);
		JButton btnSuche = new JButton("Suche");
		ergebnisFeld = new JLabel("Anzeige Ergebnis");
		
		// ##### TO-DO Button- Listener
		btnSuche.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String suchBegriff = suchFeld.getText();
			String telefonnummer = suchePerson(telefonbuch, suchBegriff);
			ergebnisFeld.setText(telefonnummer);	
		} 	
		});
		
		panel.add(suchFeld);
		panel.add(btnSuche);
		panel.add(ergebnisFeld);
		
		add(panel);
		setSize(500,200);
		setTitle("Telefonbuch");
		setVisible(true);
	}	
	
	private static String suchePerson (HashMap<String, String> telefonbuch, String suchBegriff) {
		for(Entry<String, String> eintrag: telefonbuch.entrySet()) {
			if (eintrag.getValue().contains(suchBegriff)){
				return eintrag.getKey();
			}
		}
		return "Kein Treffer";
	}
	
	public static void main(String[] args) {
			
			new Telefonbuch();
	}

}
