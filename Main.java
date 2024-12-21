import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(-2);
        list.add(4);
        list.add(6);
        list.add(0);

        Predicate<Integer> func = n -> n > 0;

        System.out.println(Utils.any(list, func));
        System.out.println(Utils.every(list, func));
    }
}
