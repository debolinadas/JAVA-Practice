
//An ordered collection of elements is represented by the List interface,
//which extends the Collection interface. Both duplicate elements and the insertion order are preserved. 

import java.util.ArrayList;
import java.util.List;

public class Col3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Josh");
        names.add("Musk");
        names.add("Alok");
        names.add("Josh");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.size());
        System.out.println(names.contains("Mask"));
        names.remove(3);
        System.out.println(names);
    }

}
