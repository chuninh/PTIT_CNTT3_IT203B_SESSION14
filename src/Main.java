import service.FlashSaleService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        FlashSaleService service = new FlashSaleService();

        ExecutorService executor = Executors.newFixedThreadPool(50);

        for (int i = 1; i <= 50; i++) {
            int userId = i;

            executor.submit(() -> {
                service.placeOrder(userId, 1, 1);
            });
        }
        executor.shutdown();
    }
}
