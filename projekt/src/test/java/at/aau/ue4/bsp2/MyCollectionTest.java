package at.aau.ue4.bsp2;


import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnitPlatform.class)

public class MyCollectionTest
{
    private MyCollection c;

    @BeforeEach
    public void setup() {
        c = new MyCollection(5);
        c.add("1");
        c.add("2");
        c.add("3");
    }
    private boolean isIn(String s) {
        try {
            c.remove(s);
        } catch (IllegalArgumentException e) {
            return false;
        }
        c.add(s);
        return true;
    }

    @Test
    public void testSizeSimple() {
        assertEquals(3,c.size());
    }
    @Test
    public void testSizeChange() {
        c.add("4");
        assertEquals(4, c.size());
        c.remove("2");
        c.remove("3");
        assertEquals(4, c.size());
    }

    @Test
    public void testAdd1() {
        assertEquals(3, c.size());
        c.add("Katharina");
        c.add(" ");
        assertEquals(5, c.size());
    }
    @Test
    public void testAdd2() { // Add until full
        c.add("Martin");
        c.add("Andreas");
        //c.add("Ueœberfuellt");
    }

    @Test
    public void testRemove1() {
        c.remove("1");
        assertEquals(3, c.size());
        c.add("Christina");
        assertEquals(4, c.size());
        c.add("1");
        c.remove("Christina");
        assertEquals(5, c.size());

    }

    @Test
    public void testRemove2() { //Test Remove not Exisitng
        c.remove("gibt es nicht");
    }

    @Test
    public void testRemove3() { //Remove Empty
        c.remove("1");
        c.remove("2");
        c.remove("3");
        Assert.assertEquals(3, c.size());
        c.remove("1");
        c.remove("2");
    }

    @Test
    public void testIfEmpty() {
        c.empty();
        Assert.assertEquals(3, c.size());
        c.add("Hallo");
        Assert.assertEquals(4, c.size());
       // Assert.assertFalse(isIn("4"));
    }
    @Test
    public void testAddOverflow() {
        c.add("4");
        c.add("5");
        c.remove("5");
        //c.add("6");
       //Assert.assertTrue(isIn("1"));
    }

    @Test
    public void testRemoveNull() {
        try {
            c.remove(null);
            //fail();
        } catch (IllegalArgumentException ignored) {

        }
        Assert.assertEquals(3, c.size());
    }


}
