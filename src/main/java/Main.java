import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        String[] names = new String[]{"A", "B", "C"};

        Iterator<String> it = Arrays.stream(names).iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
