/**
 * Die generische Klasse Warteschlange repräsentiert eine Warteschlange von Elementen vom Typ T.
 * @param <T> Der Typ der Elemente in der Warteschlange
 */
public class Warteschlange<T> {
    private Queue<T> queue;

    /**
     * Ein Objekt der Klasse Warteschlange wird erzeugt.
     */
    public Warteschlange() {
        queue = new Queue<>();
    }

    /**
     * Das erste Element in der Warteschlange wird zurückgegeben.
     * @return T erstes Element
     */
    public T gibErsten() {
        return queue.front();
    }

    /**
     * Das erste Element wird gelöscht bzw. aus der Warteschlange entlassen.
     */
    public void entfernen() {
        queue.dequeue();
    }

    /**
     * Die Methode fügt ein neues Element am Ende der Warteschlange ein.
     * @param element Das einzufügende Element
     */
    public void einfuegen(T element) {
        queue.enqueue(element);
    }

    /**
     * Überprüft, ob die Warteschlange leer ist.
     * @return true, wenn die Warteschlange leer ist, sonst false
     */
    public boolean istLeer() {
        return queue.isEmpty();
    }
}