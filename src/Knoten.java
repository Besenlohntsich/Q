/**
 * Die Klasse Knoten repräsentiert einen Knoten in einer Warteschlange.
 */
public class Knoten {
    private String name;
    private Knoten nachfolger;

    /**
     * Parameterloser Konstruktor der Klasse Knoten.
     */
    public Knoten() {
        this.name = "";
        this.nachfolger = null;
    }

    /**
     * Konstruktor der Klasse Knoten mit der Möglichkeit den Namen des Knotens zu setzen.
     * @param pName Der Name des Knotens
     */
    public Knoten(String pName) {
        this.name = pName;
        this.nachfolger = null;
    }

    /**
     * Setze Methode für den Nachfolger eines Knotens durch einen weiteren Knoten pKnoten.
     * @param pKnoten Der Nachfolger des Knotens
     */
    public void setNachfolger(Knoten pKnoten) {
        this.nachfolger = pKnoten;
    }
 //hallo
    /**
     * Die Anfrage gibt den Nachfolger des aktuellen Elements wieder.
     * @return Kunde nachfolger
     */
    public Knoten getNachfolger() {
        return this.nachfolger;
    }

    /**
     * Setze Methode für den Namen auf den Wert des Parameters pName.
     * @param pName Der neue Name des Kunden
     */
    public void setName(String pName) {
        this.name = pName;
    }

    /**
     * Die Anfrage gibt den Namen des Kunden als Text wieder.
     * @return String name
     */
    public String getName() {
        return this.name;
    }
}