package lambdasinaction.chap11.v1;

import static lambdasinaction.chap11.Util.delay;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Shop {

    private final String name;
    private final Random random;

    

    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread( () -> {
                    double price = calculatePrice(product);
                    futurePrice.complete(price);
        }).start();
        return futurePrice;
    }

    public String getName() {
        return name;
    }

}
