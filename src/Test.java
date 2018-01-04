import java.util.Queue;
import java.util.TreeMap;


public class Test {

    public static void main(String[] args) {

        Queue<Integer> queue = NumberFileReader.readFromFile();

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (Integer integer : queue) {
            map.put(integer,0);
        }

        while (!queue.isEmpty()){
            int number = queue.poll();
            map.replace(number,map.get(number)+1);
        }

        System.out.println(NumberMap.toString(map));

    }
}
