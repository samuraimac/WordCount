package wordcount;

/*
    Word Count tutorial from Udacity, The World of Objects, Lesson 2, FileScanner
    5/5/18
 */

import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String [] args) throws Exception{
        File file = new File("ataleoftwocities.txt");
        Scanner scanner = new Scanner(file);
        int wordCtr = 0; //to count the number of words in the file
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            //System.out.println(line.split("").length); //number of words per line in the file
            wordCtr += line.split(" ").length;
        }
        System.out.println("The file contains " + wordCtr + " words");
    }

}
