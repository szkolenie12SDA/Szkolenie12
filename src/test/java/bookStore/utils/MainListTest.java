package bookStore.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainListTest {
    private String[] table;
    String testString = "test";

    @Before
    public void createList() {
        table = new String[1];
        table[0] = testString;
        System.out.println("Uruchamiam Before");
    }

    @Test
    public void addTest() {
        MainList<String> mainList = new MainList<>();
        mainList.add(testString);
        assertArrayEquals(table, mainList.getTable());
    }
    @Test
    public void addCheckSizeTest(){
        MainList<String> mainList = new MainList<>();
        mainList.add(testString);
        mainList.add(testString);
        mainList.add(testString);
        String[] temp = mainList.getTable();
        int mainListLength = temp.length;
        System.out.println(mainListLength);
        int expectedLength = 3;
        assertEquals(expectedLength,mainListLength);
    }

    @After
    public void emptyList() {
        table = new String[0];
        System.out.println("Uruchamiam After");
    }

}