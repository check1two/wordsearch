/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.io.File;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author manueltijerino
 */
public class WordSearchTest {
    
    static WordSearch wordSearch;
    @BeforeClass
    public static void setUpClass() {
        File file = new File("/Users/manueltijerino/NetBeansProjects/wordsearch/wordsearch/input.txt");
        Reader reader = new Reader();
        Model model = reader.parseFile(file);
        wordSearch = new WordSearch(model);
    }
    
    @Test
    public void testParseFile() {
        System.out.println("parseFile");
        File file = new File("/Users/manueltijerino/NetBeansProjects/wordsearch/wordsearch/input.txt");
        Reader reader = new Reader();
        Model model = reader.parseFile(file);
        assertNotNull(model);
        assertNotNull(model.getWords());
        assertNotNull(model.getMatrix());
        assertTrue(model.getSize()>0);
    }
    
    /**
     * Test of searchNorth method, of class Wordsearch.
     * Matrix Row 9
     * Matrix Col 5
     * Expected true
     * KHAN: (5,9),(5,8),(5,7),(5,6)
     */
    @Test
    public void testSearchNorth() {
        System.out.println("searchNorth");
        String word = "KHAN";
        int x = 9;
        int y = 5;
        boolean expResult = true;
        boolean result = wordSearch.searchNorth(word, x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of searchSouth method, of class Wordsearch.
     * Matrix Row 6
     * Matrix Col 0
     * Expected true
     * BONES: (0,6),(0,7),(0,8),(0,9),(0,10)
     */
    @Test
    public void testSearchSouth() {
        System.out.println("searchSouth");
        String word = "BONES";
        int x = 6;
        int y = 0;
        boolean expResult = true;
        boolean result = wordSearch.searchSouth(word, x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of searchEast method, of class Wordsearch.
     * Matrix Row 5
     * Matrix Col 0
     * Expected true
     * SCOTTY: (0,5),(1,5),(2,5),(3,5),(4,5),(5,5)
     */
    @Test
    public void testSearchEast() {
        System.out.println("searchEast");
        String word = "SCOTTY";
        int x = 5;
        int y = 0;
        boolean expResult = true;
        boolean result = wordSearch.searchEast(word, x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of searchWest method, of class Wordsearch.
     * Matrix Row 7
     * Matrix Col 4
     * Expected true
     * KIRK: (4,7),(3,7),(2,7),(1,7)
     */
    @Test
    public void testSearchWest() {
        System.out.println("searchWest");
        String word = "KIRK";
        int x = 7;
        int y = 4;
        boolean expResult = true;
        boolean result = wordSearch.searchWest(word, x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of searchNorthEast method, of class Wordsearch.
     * Matrix Row 9
     * Matrix Col 5
     * Expected false
     */
    @Test
    public void testSearchNorthEast() {
        System.out.println("searchNorthEast");
        String word = "KHAN";
        int x = 9;
        int y = 5;
        boolean expResult = false;
        boolean result = wordSearch.searchNorthEast(word, x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of searchNorthWest method, of class Wordsearch.
     * Matrix Row 3
     * Matrix Col 3
     * Expected true
     * SULU: (3,3),(2,2),(1,1),(0,0)
     */
    @Test
    public void testSearchNorthWest() {
        System.out.println("searchNorthWest");
        String word = "SULU";
        int x = 3;
        int y = 3;
        boolean expResult = true;
        boolean result = wordSearch.searchNorthWest(word, x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of searchSouthEast method, of class Wordsearch.
     * Matrix Row 1
     * Matrix Col 2
     * Expected true
     * SPOCK: (2,1),(3,2),(4,3),(5,4),(6,5)
     */
    @Test
    public void testSearchSouthEast() {
        System.out.println("searchSouthEast");
        String word = "SPOCK";
        int x = 1;
        int y = 2;
        boolean expResult = true;
        boolean result = wordSearch.searchSouthEast(word, x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of searchSouthWest method, of class Wordsearch.
     * Matrix Row 0
     * Matrix Col 4
     * Expected true
     * UHURA: (4,0),(3,1),(2,2),(1,3),(0,4)
     */
    @Test
    public void testSearchSouthWest() {
        System.out.println("searchSouthWest");
        String word = "UHURA";
        int x = 0;
        int y = 4;
        boolean expResult = true;
        boolean result = wordSearch.searchSouthWest(word, x, y);
        assertEquals(expResult, result);
    }
}
