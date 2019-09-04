/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

/**
 *
 * @author manueltijerino
 */
public class WordSearch {
    
    private String[] words;
    private String[][] matrix;
    private int size;
    
    public WordSearch(Model puzzle){
        this.words = puzzle.getWords();
        this.matrix = puzzle.getMatrix();
        this.size = puzzle.getSize();
    }
    
    public boolean searchNorth(String word, int x, int y){
        boolean found = false;
        
        return found;
    }
}
