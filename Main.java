package task3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void validateAge(int age) throws InvalidAgeException {

        if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");

        System.out.println("ArrayList:");
        System.out.println(list);

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Java");
        set.add("Python");

        System.out.println("HashSet:");
        System.out.println(set);

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Shifani");
        map.put(2,"Golda");

        System.out.println("HashMap:");
        System.out.println(map);

        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch(Exception e) {
            System.out.println( "Exception Caught: "+ e.getMessage());
        }
        try {
            validateAge(15);
        }
        catch(InvalidAgeException e) {
            System.out.println("Custom Exception: "+ e.getMessage());
        }
    }
}