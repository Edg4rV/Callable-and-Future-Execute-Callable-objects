import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;


class FutureUtils {
    public static int executeCallableObjects(List<Future<Callable<Integer>>> items)  {
        // write your code here
        Collections.reverse(items);

        int sum = 0;
        try {
            for (Future<Callable<Integer>> future: items) {
                sum =  future.get().call() + sum;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }
}
