/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.io.File;

/**
 *
 * @author manueltijerino
 */
public class Main {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        File file = new File(userDir+"/input.txt");
        if(!file.exists()){
            System.out.println("missing input.txt");
            System.exit(0);
        }
        Model puzzle = Reader.parseFile(file);
        WordSearch wordSearch = new WordSearch(puzzle);
        wordSearch.solve( );
    }
}