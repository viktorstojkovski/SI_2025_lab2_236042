import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void test1() {
        List<Item> items = new ArrayList<Item>();
        // FFF - 9
        items.add(new Item("Soap", 5,250,0));
        // FFT - 9
        items.add(new Item("Cherries", 15,250,0));
        // FTT - 9
        items.add(new Item("Shampoos", 17,250,0.05));
        // TTT - 9
        items.add(new Item("Sweets", 12,350,0.03));
        String card = "0123456789101112";
        assertEquals(13021.5,SILab2.checkCart(items, card));
    }

    @Test
    public void test2() {
        RuntimeException e = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null,null));
        assertEquals("allItems list can't be null!",e.getMessage());
    }

    @Test
    public void test3() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("", 5,250,0));
        items.add(new Item(null, 15,250,0));
        String card = "0123456789101112";
        RuntimeException e = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, card));
        assertEquals("Invalid item!",e.getMessage());
    }

    @Test
    public void test4() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Soap", 5,250,0));
        items.add(new Item("Cherries", 15,250,0));
        items.add(new Item("Shampoos", 17,250,0.05));
        items.add(new Item("Sweets", 12,350,0.03));
        String card = "01234$67#9/011*2";
        RuntimeException e = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, card));
        assertEquals("Invalid character in card number!",e.getMessage());
    }

    @Test
    public void test5() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Soap", 5,250,0));
        items.add(new Item("Cherries", 15,250,0));
        items.add(new Item("Shampoos", 17,250,0.05));
        items.add(new Item("Sweets", 12,350,0.03));
        RuntimeException e = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, null));
        assertEquals("Invalid card number!",e.getMessage());
    }

}
