import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 20) + 2;

        ArrayList<Integer> arrayList = new ArrayList<>(n);
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < n; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println(arrayList);
        System.out.println(linkedList);


        while (arrayList.size() > 1) {
            for (int j = 1; j < arrayList.size(); j = j + 2) {
                arrayList.remove(arrayList.get(j));
                j--;
            }
        }
        System.out.println(arrayList);
        

        while (linkedList.size() > 1) {
            for (int j = 1; j < linkedList.size(); j = j + 2) {
                linkedList.remove(linkedList.get(j));
                j--;
            }
        }

        System.out.println(linkedList);


    }
}