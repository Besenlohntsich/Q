/**
 * Die generische Klasse Queue repräsentiert eine Warteschlange von Elementen vom Typ T.
 * @param <T> Der Typ der Elemente in der Warteschlange
 */
public class Queue<T> {
    private Knoten erster;

    /**
     * Ein Objekt der Klasse Queue wird erzeugt.
     * Erstellt eine leere Queue.
     */
    public Queue() {
        erster = null;
    }

    /**
     * Gibt das erste Element in der Warteschlange zurück.
     * @return T erstes Element oder null, wenn die Queue leer ist
     */
    public T front() {
        if (erster != null) {
            return erster.getZeigeAuf();
        }
        return null;
    }

    /**
     * Entfernt das erste Element aus der Warteschlange.
     */
    public void dequeue() {
        if (erster != null) {
            erster = erster.getNachfolger();
        }
    }

    /**
     * Fügt ein neues Element am Ende der Warteschlange ein.
     * @param element Das einzufügende Element
     */
    public void enqueue(T element) {
        Knoten neuerKnoten = new Knoten(element);
        if (erster == null) {
            erster = neuerKnoten;
        } else {
            Knoten aktuellerKnoten = erster;
            while (aktuellerKnoten.getNachfolger() != null) {
                aktuellerKnoten = aktuellerKnoten.getNachfolger();
            }
            aktuellerKnoten.setNachfolger(neuerKnoten);
        }
    }

    /**
     * Überprüft, ob die Warteschlange leer ist.
     * @return true, wenn die Warteschlange leer ist, sonst false
     */
    public boolean isEmpty() {
        return erster == null;
    }

    private class Knoten {
        private T zeigeAuf;
        private Knoten nachfolger;

        public Knoten(T pZeigeAuf) {
            zeigeAuf = pZeigeAuf;
            nachfolger = null;
        }

        public Knoten getNachfolger() {
            return nachfolger;
        }

        public void setNachfolger(Knoten pNachfolger) {
            this.nachfolger = pNachfolger;
        }

        public T getZeigeAuf() {
            return zeigeAuf;
        }
    }
}