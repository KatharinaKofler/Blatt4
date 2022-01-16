package at.aau.ue4.bsp1;
// 01560303 - Kofler Katharina

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.Iterator;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitPlatform.class)


public class BaseTest {

    private final int number = 2;
    private RingBufferTest<String> buffer = new RingBufferTest<String>(number);
    private Iterator<String> iterator = buffer.iterator();

    String test = "Beispiel 1";

    @Test
    public void test_all_functions() {


        buffer = new RingBufferTest<String>(10);
    }

    @Test
    public void test_is_Empty() {
        assertEquals(true, buffer.isEmpty());
    }
    @Test
    public void test_size(){
        assertEquals(0, buffer.size());
    }

    @Test
    public void test_push(){ //push(String item) and pop(String item)
        buffer.push(test);
        String test_is_Empty = buffer.pop();
        assertEquals(test, test_is_Empty);
    }

    @Test
    public void test_hasnext(){
        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void test_remove(){
        iterator.remove();
    }

    @Test
    public void test_next(){
        buffer.push(test);
        String a = iterator.next();
        assertEquals(test, a);
    }

}
