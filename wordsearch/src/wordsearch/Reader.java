/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * importer class that reads the file and creates a model
 * @author manueltijerino
 */
public class Reader {
   /*
    * Parse file into a model representation or a word search puzzle.
    */
    public static Model parseFile(File file) {
        Model model = null;
        String [] words;
        String [][] matrix  = null;
        int size = 0;
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            words = line.split(",");
            line = reader.readLine();
            int row = 0;
            
            while (line != null) {
                String [] sa = line.split(",");
                //initialize matrix
                if(row == 0){
                    size = sa.length;
                    matrix = new String[size][size];
                    model = new Model();
                }
                for(int i=0;i<size;i++){
                    matrix[row][i] = sa[i].trim();
                }
                row = row + 1;
                //System.out.println(line);
                // read next line
                line = reader.readLine();
            }
            model.setMatrix(matrix);
            model.setSize(size);
            model.setWords(words);
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return model;
    }
}
