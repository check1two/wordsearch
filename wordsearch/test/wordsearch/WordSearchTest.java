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
}
