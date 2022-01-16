package at.aau.ue4.bsp1;
// 01560303 - Kofler Katharina

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitPlatform.class)

public class FullCoverageTest {

    private final int number = 2;
    private RingBufferTest<String> buffer = new RingBufferTest<>(number);
    private Iterator<String> iterator = buffer.iterator();

    String test = "Beispiel 1";

    @Test
    public void test_all_functions() {
        buffer = new RingBufferTest<>(10);
    }

    @Test
    public void test_is_Empty() {
        assertEquals(true, buffer.isEmpty());
    }

    @Test
    public void test_size() {
        assertEquals(0, buffer.size());
    }

    @Test
    public void test_push() {
        buffer.push(test);
        String test_is_Empty = buffer.pop();
        assertEquals(test, test_is_Empty);
    }

    //For Iterator
    @Test
    public void test_hasnext() {
        assertEquals(false, iterator.hasNext());
    }

    @Test()
    public void test_remove() {
        iterator.remove();
    }

    @Test()
    public void test_next() {
        buffer.push(test);
        String a = iterator.next();
        assertEquals(test, a);
    }

    @Test
    public void test_8() {
        for (int i = 0; i < number; i++) {
            buffer.push(test);
        }
    }

    @Test
    public void test_pop() {
        for (int i = 0; i < number; i++) {
            buffer.pop();
        }
    }

    @Test
    public void test_iterator_next() {
        while(buffer.size() > 0)
            iterator.next();
    }

}
