/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.io.File;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author manueltijerino
 */
public class WordSearchTest {
    
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
}
