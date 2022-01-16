package at.aau.ue4.bsp1;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import java.util.Iterator;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({BaseTest.class, FullCoverageTest.class, FullMutationScoreTest.class})
@RunWith(JUnitPlatform.class)
@SelectClasses( {BaseTest.class, FullCoverageTest.class, FullMutationScoreTest.class})
public class RingBufferTest<S> {

    public Object pop;

    public RingBufferTest(int number) {
    }

    public int size() {
        return size();
    }


    public int RingBufferTest(int number) {
        return number;
    }

    public Iterator<String> iterator() {

        return iterator();
    }

    public boolean isEmpty() {

        return isEmpty();
    }

    public void push(String test) {
    }

    public String pop() {
        return pop();
    }


}
