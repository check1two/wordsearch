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
    
    public void solve(){
        for(int i=0;i<words.length;i++){
            String word = words[i];
            searchWord(word);
        }
    }
    
    public void searchWord(String word){
        String firstLetter = word.substring(0,1);
        int rowLen = size;
        int colLen = size;
        for(int i = 0; i < rowLen; i++){
            for(int j = 0; j < colLen; j++){
                String letter = matrix[i][j];
                if(letter.equals(firstLetter)){
                    searchNorth(word,i,j);
                    searchSouth(word,i,j);
                    searchEast(word,i,j);
                    searchWest(word,i,j);
                    searchNorthEast(word,i,j);
                    searchNorthWest(word,i,j);
                    searchSouthEast(word,i,j);
                    searchSouthWest(word,i,j);
                }
            }
        }
    }
    
    public boolean searchNorth(String word, int x, int y){
        boolean found = false;
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        int i = x;
        int l = 0;
        while(i>=0 && l<length){
            sb.append(matrix[i][y]);
            i = i - 1;
            l = l + 1;
        }
        String searchString = sb.toString();
        found = searchString.contains(word);
        if(found){
            i = x;
            l = 0;
            System.out.print(word+": ");
            while(i>=0 && l<length){
                System.out.print("("+y+","+i+")");
                i = i - 1;
                l = l + 1;
                if(l<length){
                    System.out.print(",");
                }
            }
            System.out.println("");
        }
        return found;
    }
    
    public boolean searchSouth(String word, int x, int y){
        boolean found = false;
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        int i = x;
        int l = 0;
        while(i<size && l<length){
            sb.append(matrix[i][y]);
            i = i + 1;
            l = l + 1;
        }
        String searchString = sb.toString();
        found = searchString.contains(word);
        if(found){
            i = x;
            l = 0;
            System.out.print(word+": ");
            while(i<size && l<length){
                System.out.print("("+y+","+i+")");
                i = i + 1;
                l = l + 1;
                if(l<length){
                    System.out.print(",");
                }
            }
            System.out.println("");
        }
        return found;
    }

    public boolean searchEast(String word, int x, int y) {
        boolean found = false;
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        int i = y;
        int l = 0;
        while(i<size && l<length){
            sb.append(matrix[x][i]);
            i = i + 1;
            l = l + 1;
        }
        String searchString = sb.toString();
        found = searchString.contains(word);
        if(found){
            i = y;
            l = 0;
            System.out.print(word+": ");
            while(i<size && l<length){
                System.out.print("("+i+","+x+")");
                i = i + 1;
                l = l + 1;
                if(l<length){
                    System.out.print(",");
                }
            }
            System.out.println("");
        }
        return found;
    }

    public boolean searchWest(String word, int x, int y) {
        boolean found = false;
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        int i = y;
        int l = 0;
        while(i>=0 && l<length){
            sb.append(matrix[x][i]);
            i = i - 1;
            l = l + 1;
        }
        String searchString = sb.toString();
        found = searchString.contains(word);
        if(found){
            i = y;
            l = 0;
            System.out.print(word+": ");
            while(i>=0 && l<length){
                System.out.print("("+i+","+x+")");
                i = i - 1;
                l = l + 1;
                if(l<length){
                    System.out.print(",");
                }
            }
            System.out.println("");
        }
        return found;
    }

    public boolean searchNorthEast(String word, int x, int y) {
        boolean found = false;
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        int i = x;
        int j = y;
        int l = 0;
        while(i>=0 && j<size && l<length){
            sb.append(matrix[i][j]);
            i = i - 1;
            j = j + 1;
            l = l + 1;
        }
        String searchString = sb.toString();
        found = searchString.contains(word);
        if(found){
            i = x;
            j = y;
            l = 0;
            System.out.print(word+": ");
            while(i>=0 && j<size && l<length){
                System.out.print("("+j+","+i+")");
                i = i - 1;
                j = j + 1;
                l = l + 1;
                if(l<length){
                    System.out.print(",");
                }
            }
            System.out.println("");
        }
        return found;
    }
    
    public boolean searchNorthWest(String word, int x, int y){
        boolean found = false;
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        int i = x;
        int j = y;
        int l = 0;
        while(i>=0 && j>=0 && l<length){
            sb.append(matrix[i][j]);
            i = i - 1;
            j = j - 1;
            l = l + 1;
        }
        String searchString = sb.toString();
        found = searchString.contains(word);
        if(found){
            i = x;
            j = y;
            l = 0;
            System.out.print(word+": ");
            while(i>=0 && j>=0 && l<length){
                System.out.print("("+j+","+i+")");
                i = i - 1;
                j = j - 1;
                l = l + 1;
                if(l<length){
                    System.out.print(",");
                }
            }
            System.out.println("");
        }
        return found;
    }
    
    public boolean searchSouthEast(String word, int x, int y){
        boolean found = false;
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        int i = x;
        int j = y;
        int l = 0;
        while(i<size && j<size && l<length){
            sb.append(matrix[i][j]);
            i = i + 1;
            j = j + 1;
            l = l + 1;
        }
        String searchString = sb.toString();
        found = searchString.contains(word);
        if(found){
            i = x;
            j = y;
            l = 0;
            System.out.print(word+": ");
            while(i<size && j<size && l<length){
                System.out.print("("+j+","+i+")");
                i = i + 1;
                j = j + 1;
                l = l + 1;
                if(l<length){
                    System.out.print(",");
                }
            }
            System.out.println("");
        }
        return found;
    }
    
    public boolean searchSouthWest(String word, int x, int y){
        boolean found = false;
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        int i = x;
        int j = y;
        int l = 0;
        while(i<size && j>=0 && l<length){
            sb.append(matrix[i][j]);
            i = i + 1;
            j = j - 1;
            l = l + 1;
        }
        String searchString = sb.toString();
        found = searchString.contains(word);
        if(found){
            i = x;
            j = y;
            l = 0;
            System.out.print(word+": ");
            while(i<size && j>=0 && l<length){
                System.out.print("("+j+","+i+")");
                i = i + 1;
                j = j - 1;
                l = l + 1;
                if(l<length){
                    System.out.print(",");
                }
            }
            System.out.println("");
        }
        return found;
    }

}
