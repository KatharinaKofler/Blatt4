package at.aau.ue4.bsp3;
//01560303 - Kofler Katharina

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitPlatform.class)

public class McCabeTest {

    @Test
    public void test() {
        int ggt = McCabe.ggt(4,8);
        assertEquals(4, ggt);
    }
    @Test
    public void test1(){
        int ggt = McCabe.ggt(16,8);
        assertEquals(8, ggt);
    }
    @Test
    public void test2(){
        int ggt = McCabe.ggt(4,0);
        assertEquals(4,ggt);
    }

}
