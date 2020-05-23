package proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeGeneratorTest {
    
    @Test(timeout = 1000L)
    public void testSomePrimes() {
        assertTrue(PrimeGenerator.getInstance().checkPrime(2));
        assertTrue(PrimeGenerator.getInstance().checkPrime(13));
        assertTrue(PrimeGenerator.getInstance().checkPrime(19));
        assertTrue(PrimeGenerator.getInstance().checkPrime(23));
        for (int i = 1; i <= 300; i++)
            assertTrue(PrimeGenerator.getInstance().checkPrime(2300000000017L));
    }

    @Test(timeout = 1000L)
    public void testSomeNotPrimes() {
        assertFalse(PrimeGenerator.getInstance().checkPrime(4));
        assertFalse(PrimeGenerator.getInstance().checkPrime(25));
        assertFalse(PrimeGenerator.getInstance().checkPrime(38));
        assertFalse(PrimeGenerator.getInstance().checkPrime(12));
        assertFalse(PrimeGenerator.getInstance().checkPrime(2300000000019L));
    }

}
