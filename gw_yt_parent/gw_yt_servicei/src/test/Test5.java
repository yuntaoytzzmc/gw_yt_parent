import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test5 {
    public static void main(String[] args) {
        try {
            // 创建一个线程池
            ExecutorService pool = Executors.newFixedThreadPool(2);
            Callable callable =  new Test4();
            Future f1 =pool.submit(callable) ;
            System.out.println(f1.get().toString());
        }catch (Exception e){
             e.printStackTrace();
        }
    }
}
