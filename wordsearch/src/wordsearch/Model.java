/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

/**
 * Pojo model to represent a word search puzzle
 * @author manueltijerino
 */
public class Model {

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the words
     */
    public String[] getWords() {
        return words;
    }

    /**
     * @param words the words to set
     */
    public void setWords(String[] words) {
        this.words = words;
    }

    /**
     * @return the matrix
     */
    public String[][] getMatrix() {
        return matrix;
    }

    /**
     * @param matrix the matrix to set
     */
    public void setMatrix(String[][] matrix) {
        this.matrix = matrix;
    }
    private int size;
    private String[] words;
    private String[][] matrix;
}
