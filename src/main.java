import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;


public class main {
    public static void main(String[] args) {
        String[] names = {"Lena", "Gunnar", "Ella", "Carl", "Johan", "Pelle"};
        System.out.println(Arrays.toString(names));

        names[1] = "Olof";

        int lenghtOfNames = names.length;
        int indexOfLastName = lenghtOfNames - 1;

        System.out.println(names[indexOfLastName]);

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 0;

        names[0] = "Mia";
        System.out.println(names[0]);

        System.out.println("PLats 1: " + numbers[0]);
        System.out.println("Plats 2: " + numbers[1]);
        System.out.println("Plats 3: " + numbers[2]);

        numbers[2] = 3;
        System.out.println("Plats 3: " + numbers[2]);

        numbers[0] = 56;
        System.out.println("PLats 1: " + numbers[0]);


        String alva = names[3];
        System.out.println(alva);

        String name = "Lena";
        System.out.println(name);

        //ArrayList<String> familyNames1;
        //familyNames1 = new ArrayList<>();

        ArrayList<String> familyNames = new ArrayList<>();
        familyNames.add("Lena");       // Index 0
        familyNames.add("Johan");      // Index 1
        familyNames.add("Pelle");      // Index 2
        System.out.println(familyNames);
        familyNames.set(1, "Olof");
        familyNames.remove(indexOfLastName)

        int size = familyNames.size();
        int indexOfLastElementInFamilyNames = size - 1;
        String lastNameInList = familyNames.get(indexOfLastElementInFamilyNames);
        System.out.println(lastNameInList);
        



        /*
        ArrayList mixed = new ArrayList();
        mixed.add("lena");
        mixed.add(2);
        mixed.add(true);
        System.out.println(mixed);
         */

        int i = 1;
        Integer y = 1;

        boolean bool1 = false;
        Boolean bool2 = true;


         /*int[] numbers = {1, 2, 3, 4, 5, 6,};
         System.out.println(Arrays.toString(numbers));
        */
        

    }
}
