import java.beans.Expression;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Utils {
    public static <T> boolean any(ArrayList<T> list, Predicate<T> condition){
        for(var elm : list){
            if (condition.test(elm)) return true;
        }
        return false;
    }

    public static <T> boolean every(ArrayList<T> list, Predicate<T> condition){
        for(var elm : list){
            if (!condition.test(elm)) return false;
        }
        return true;
    }
}
