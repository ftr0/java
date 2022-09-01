import java.util.ArrayList;


public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Hans");
        list.add("Elsa");
        list.add("Berni");
        list.add("Ert");


        System.out.println("size = " + list.size());

        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) 
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        for (String s : list) 
        {
            System.out.print(s + " ");
        }
        System.out.println();


        list.add(2, "Hilde");

        list.remove(1);

        list.remove("Ert");

        if (list.remove("Bla")) 
        {
            System.out.println("wurde entfernt");
        }
        
        else 
        {
            System.out.println("wurde nicht gefunden");
        }

        boolean enthalten = list.contains("Hansi");
        System.out.println(enthalten);

        int index = list.indexOf("Hansi");
        System.out.println(index);

        list.clear();

        System.out.println(list.isEmpty());

        System.out.println(list);

        Object[] feld = list.toArray();
    }
}
