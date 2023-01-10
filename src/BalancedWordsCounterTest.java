import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {

    @Test
    void aabbabcccbaIs28() {
        var balancedWordsCounter = new BalancedWordsCounter();
        assertEquals(28, balancedWordsCounter.count("aabbabcccba"));
    }

    @Test
    void emptyStringIs0() {
        var balancedWordsCounter = new BalancedWordsCounter();
        assertEquals(0, balancedWordsCounter.count(""));
    }

    @Test
    void abababa1ThrowsRuntimeException() {
        var balancedWordsCounter = new BalancedWordsCounter();
        assertThrows(RuntimeException.class,() -> balancedWordsCounter.count("abababa1"));
    }

    @Test
    void nullThrowsRuntimeException() {
        var balancedWordsCounter = new BalancedWordsCounter();
        assertThrows(RuntimeException.class, () -> balancedWordsCounter.count(null));
    }
}