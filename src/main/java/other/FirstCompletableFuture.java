package other;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

// программа создает три потока, которые возвращают свое время работы с рандомной искусственной задержкой от 1 до 10
// ждет завершения двух потоков, которые вернули результат первыми и выводит их сумму
public class FirstCompletableFuture {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();
        List<CompletableFuture<Integer>> futures = Arrays.asList(
                callable(),
                callable(),
                callable());

        futures.forEach(future ->
                future.thenAccept(result -> {
                    if (result != null) {
                        q.add(result);
                    }
                })
        );

        do {
        } while (q.size() <= 2);
        System.out.println(q.remove() + q.remove());
    }

    static CompletableFuture<Integer> callable() {
        int sec = new Random().nextInt(10) + 1;
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(sec * 1000);
                System.out.println("new " + sec);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            return sec;
        });
    }
}
