import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class NumberFileReader {

    private static final File numbers = new File("Numbers.txt");


    public static Queue<Integer> readFromFile(){
        Queue<Integer> result = new LinkedList<>();

        try {
            FileReader fr = new FileReader(numbers);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine())!= null){
                result.offer(Integer.valueOf(line));

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    return result;
    }
}
