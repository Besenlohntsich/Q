//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warteschlangenverwaltung<Knoten> kundenVerwaltung = new Warteschlangenverwaltung<>();
        
        System.out.println("Willkommen zur Warteschlangenverwaltung!");
        boolean running = true;
        
        while (running) {
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1. Neue Warteschlange erstellen");
            System.out.println("2. Element hinzufügen");
            System.out.println("3. Erstes Element anzeigen");
            System.out.println("4. Erstes Element entfernen");
            System.out.println("5. Beenden");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Geben Sie den Namen der neuen Warteschlange ein: ");
                    String warteschlangenName = scanner.nextLine();
                    kundenVerwaltung.erstelleWarteschlange(warteschlangenName);
                    System.out.println("Warteschlange '" + warteschlangenName + "' erstellt.");
                    break;
                case 2:
                    System.out.print("Geben Sie den Namen der Warteschlange ein: ");
                    String nameZumHinzufuegen = scanner.nextLine();
                    System.out.print("Geben Sie den Namen des Elements ein: ");
                    String kundenName = scanner.nextLine();
                    kundenVerwaltung.fuegeHinzu(nameZumHinzufuegen, new Knoten(kundenName));
                    System.out.println("Element '" + kundenName + "' hinzugefügt.");
                    break;
                case 3:
                    System.out.print("Geben Sie den Namen der Warteschlange ein: ");
                    String nameZumAnzeigen = scanner.nextLine();
                    Knoten ersterKunde = kundenVerwaltung.gibErsten(nameZumAnzeigen);
                    if (ersterKunde != null) {
                        System.out.println("Erstes Element: " + ersterKunde.getName());
                    } else {
                        System.out.println("Die Warteschlange ist leer oder existiert nicht.");
                    }
                    break;
                case 4:
                    System.out.print("Geben Sie den Namen der Warteschlange ein: ");
                    String nameZumEntfernen = scanner.nextLine();
                    kundenVerwaltung.entferneErsten(nameZumEntfernen);
                    System.out.println("Erstes Element entfernt.");
                    break;
                case 5:
                    running = false;
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Ungültige Auswahl. Bitte versuchen Sie es erneut.");
            }
        }
        
        scanner.close();
    }
}
