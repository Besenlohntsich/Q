/**
 * Die Klasse Kunde repräsentiert einen Kunden in einer Warteschlange.
 */
public class Kunde {
    private String name;
    private Kunde nachfolger;

    /**
     * Parameterloser Konstruktor der Klasse Kunde.
     */
    public Kunde() {
        this.name = "";
        this.nachfolger = null;
    }

    /**
     * Konstruktor der Klasse Kunde mit der Möglichkeit den Namen des Kunden zu setzen.
     * @param pName Der Name des Kunden
     */
    public Kunde(String pName) {
        this.name = pName;
        this.nachfolger = null;
    }

    /**
     * Setze Methode für den Nachfolger eines Kunden durch einen weiteren Kunden pKunde.
     * @param pKunde Der Nachfolger des Kunden
     */
    public void setNachfolger(Kunde pKunde) {
        this.nachfolger = pKunde;
    }

    /**
     * Die Anfrage gibt den Nachfolger des aktuellen Kunden wieder.
     * @return Kunde nachfolger
     */
    public Kunde getNachfolger() {
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