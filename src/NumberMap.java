
import java.util.Set;
import java.util.TreeMap;

public class NumberMap {



    public static String toString(TreeMap<Integer,Integer> map) {

        Set<Integer> keySet = map.keySet();
        String result = "";

        for (Integer number : keySet) {
            result+= number + " - ilosc wystapien: "+ map.get(number)+"\n";
        }
        return result;
    }
}
