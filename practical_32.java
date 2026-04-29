import java.util.LinkedList;

public class GenericSearch {

    // Generic method to search element in LinkedList
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        // Test 1: LinkedList<Integer> for roll numbers
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        int rollToSearch = 102;
        boolean foundRoll = searchElement(rollNumbers, rollToSearch);

        System.out.println("Searching roll number " + rollToSearch + ": " + foundRoll);

        // Test 2: LinkedList<String> for names
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String nameToSearch = "Bob";
        boolean foundName = searchElement(names, nameToSearch);

        System.out.println("Searching name \"" + nameToSearch + "\": " + foundName);
    }
}
      
