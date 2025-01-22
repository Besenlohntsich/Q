import java.util.HashMap;
import java.util.Map;

/**
 * Die Klasse Warteschlangenverwaltung verwaltet mehrere Warteschlangen verschiedener Typen.
 * @param <T> Der Typ der Elemente in den verwalteten Warteschlangen
 */
public class Warteschlangenverwaltung<T> {
    private Map<String, Warteschlange<T>> warteschlangen;

    /**
     * Erzeugt eine neue Warteschlangenverwaltung.
     */
    public Warteschlangenverwaltung() {
        warteschlangen = new HashMap<>();
    }

    /**
     * Erstellt eine neue Warteschlange mit dem angegebenen Namen.
     * @param name Der Name der neuen Warteschlange
     */
    public void erstelleWarteschlange(String name) {
        warteschlangen.put(name, new Warteschlange<>());
    }

    /**
     * Fügt ein Element zur angegebenen Warteschlange hinzu.
     * @param name Der Name der Warteschlange
     * @param element Das hinzuzufügende Element
     */
    public void fuegeHinzu(String name, T element) {
        Warteschlange<T> warteschlange = warteschlangen.get(name);
        if (warteschlange != null) {
            warteschlange.einfuegen(element);
        }
    }

    /**
     * Gibt das erste Element der angegebenen Warteschlange zurück.
     * @param name Der Name der Warteschlange
     * @return Das erste Element oder null, wenn die Warteschlange leer ist
     */
    public T gibErsten(String name) {
        Warteschlange<T> warteschlange = warteschlangen.get(name);
        return warteschlange != null ? warteschlange.gibErsten() : null;
    }

    /**
     * Entfernt das erste Element aus der angegebenen Warteschlange.
     * @param name Der Name der Warteschlange
     */
    public void entferneErsten(String name) {
        Warteschlange<T> warteschlange = warteschlangen.get(name);
        if (warteschlange != null) {
            warteschlange.entfernen();
        }
    }
}