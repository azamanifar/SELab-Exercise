package proxy;

import java.util.Optional;

public class PrimeGenerator {

    protected PrimeGenerator() {
    }

    private static PrimeGenerator h = null;

    public static PrimeGenerator getInstance() {
        return h = Optional.ofNullable(h).orElseGet(() ->
            new PrimeGenerator()
//          TODO: use PrimeGeneratorCachable instead
        );
    }

    public boolean checkPrime(long num) {
        for (long l = 2; l <= (long) Math.sqrt(num); l++) {
            if (num % l == 0)
                return false;
        }
        return true;
    }

}
