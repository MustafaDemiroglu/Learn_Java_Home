package LF11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonbuchSuche {

    public static List<String> sucheImTelefonbuch(String suchstring, HashMap<String, String> telefonbuch) {
        List<String> passendeKeys = new ArrayList<>();

        for (Map.Entry<String, String> eintrag : telefonbuch.entrySet()) {
            String aktuellerName = eintrag.getValue().toLowerCase(); // Ignoriere Groß- und Kleinschreibung
            if (aktuellerName.contains(suchstring.toLowerCase())) {
                passendeKeys.add(eintrag.getKey());
            }
        }

        // Sortiere die passenden Keys nach genauigkeit absteigend
        passendeKeys.sort((k1, k2) -> {
            String name1 = telefonbuch.get(k1).toLowerCase();
            String name2 = telefonbuch.get(k2).toLowerCase();
            int score1 = getGenauigkeitsScore(name1, suchstring.toLowerCase());
            int score2 = getGenauigkeitsScore(name2, suchstring.toLowerCase());
            return Integer.compare(score2, score1);
        });

        return passendeKeys;
    }

    private static int getGenauigkeitsScore(String name, String suchstring) {
        // Berechne einen einfachen Score basierend auf der Ähnlichkeit der Zeichen im Namen
        int score = 0;
        int minLength = Math.min(name.length(), suchstring.length());

        for (int i = 0; i < minLength; i++) {
            if (name.charAt(i) == suchstring.charAt(i)) {
                score++;
            } else {
                break;
            }
        }

        return score;
    }

    public static void main(String[] args) {
        HashMap<String, String> telefonbuch = new HashMap<>();
        telefonbuch.put("+491765896542", "Mustermann, Max");
        telefonbuch.put("+332147896254", "Beispiel, Horst");

        // Beispielaufruf der Funktion
        List<String> ergebnis = sucheImTelefonbuch("muster", telefonbuch);

        // Ausgabe der Ergebnisse
        System.out.println("Passende Keys nach genauigkeit absteigend sortiert: " + ergebnis);
    }
}