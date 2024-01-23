package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.DefaultListModel;


public class GUI {
	private JFrame frame;
	private JPanel listePanel;
	private JPanel mainPanel;
	private JPanel allgemeinListPanel;
	private JPanel bearbeitungPanel;
	private JPanel suchPanel;
	
	private JTextField suchFeld;
	private JTextField ergebnisFeld;
	
	private HashMap<String, String> allgemeinListe = new HashMap<>(); 
	private DefaultListModel dlm = new DefaultListModel();
	private JList liste = new JList(dlm);
	
	public GUI() {
		
		frame = new JFrame ("Finde die PLZ deiner Stadt");
		
		// AllgemeinelistePanel
		allgemeinListPanel = new JPanel(new BorderLayout());
		// erzeugt Rahmen und Titel für das Panel
		allgemeinListPanel.setBorder(new TitledBorder("Allgemein PLZ Liste"));
		// JScrollPane erzeugt scrollbare Liste
		// allgemeinListPanel.add(new JScrollPane(allgemeinListe));
		allgemeinListPanel.add(liste);
		
		// AllgemeinelistePanel
		bearbeitungPanel = new JPanel(new BorderLayout());
		// erzeugt Rahmen und Titel für das Panel
		bearbeitungPanel.setBorder(new TitledBorder("Sucht relevante Liste"));
		// JScrollPane erzeugt scrollbare Liste
		//bearbeitungPanel.add(new JScrollPane(allgemeinListe));
		bearbeitungPanel.add(liste);
		
		// ListePanel
		listePanel = new JPanel(new BorderLayout(10,10));
		listePanel.setBorder(new TitledBorder("Postleitzahl"));
		listePanel.add(allgemeinListPanel, BorderLayout.WEST);
		listePanel.add(bearbeitungPanel, BorderLayout.EAST);
		
		// suchPanel
		suchPanel = new JPanel(new FlowLayout());
		suchPanel.add(new JLabel("SuchFeld"));
		suchFeld =new JTextField();
		suchFeld.setSize(50,150);    
		suchFeld.setEditable(false);
		suchFeld.setVisible(true);
		suchPanel.add(suchFeld);
		
		suchPanel.add(new JLabel("ErgebnisFeld"));
		ergebnisFeld =new JTextField();
		ergebnisFeld.setSize(50,150);    
		ergebnisFeld.setEditable(false);
		ergebnisFeld.setVisible(true);
		suchPanel.add(ergebnisFeld);
		
		// Main Panel
		mainPanel = new JPanel(new BorderLayout(0,10)); 
		//Leerer Rahmen für Abstand
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		mainPanel.add(listePanel, BorderLayout.NORTH);	
		mainPanel.add(suchPanel, BorderLayout.SOUTH);
		
		// Fenster / frame konfigurieren
		frame.add(mainPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,500);
		frame.setVisible(true);
	}
	
	
		
		
	/*
	JPanel suchPanel = new JPanel();
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
	*/

}
