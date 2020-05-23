package proxy;

import java.util.HashMap;

// TODO: Implement a cache mechanism on this wrapper
public class PrimeGeneratorCachable extends PrimeGenerator {

    PrimeGenerator primeGenerator;

    public PrimeGeneratorCachable(PrimeGenerator primeGenerator) {
        this.primeGenerator = primeGenerator;
    }

    public boolean checkPrime(long num) {
        return primeGenerator.checkPrime(num);
    }

}
