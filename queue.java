import java.util.LinkedList;
import java.util.Queue;

public class Main 
{
    public static void main(String[] args) 
    {
        Queue<String> schlange = new LinkedList<>();

        // hinten anstellen
        schlange.offer("Frida");
        schlange.offer("Kurt");
        schlange.offer("Hannelore");
        schlange.offer("Erwin");

        String person;

        // Wartenschlange einzeln "abarbeiten"
//        person = schlange.poll();
//        System.out.println(person);
//
//        person = schlange.poll();
//        System.out.println(person);

        // Komplette Warteschlage "abarbeiten"
//        while(!schlange.isEmpty()) {
//            person = schlange.poll(); // der/die/das Nächste
//            System.out.println(person);
//        }

        // erstes Element abfragen ohne es zu entfernen
        
        
        person = schlange.peek();
        System.out.println(person);

        // Iteration mit der erweiterten for-Schleife (foreach)
        for(String p : schlange) 
        {
            System.out.println(p);
        }

        // Ausgabe über toString
        System.out.println(schlange);

    }
}

