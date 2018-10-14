/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dictionary0;
        
import java.io.*;
import java.util.*;
import static java.util.Collections.list;
import dictionary0.Word;
import static java.util.Collections.list;
public class DictionaryMangement extends Dictionary {
     static int i, n;
     static Scanner sc = new Scanner (System.in);
     void insertFromCommandline(){
     
     n= Integer.valueOf(sc.nextLine());
     for(i=0; i<n; i++){
         Word word = new Word(null, null);
         System.out.println("English:");
         word.word_target= sc.nextLine();
         System.out.println("Vietnamese:");
         word.word_explain= sc.nextLine();
         list.add(word);
     }
}       
     
     //Ham doc du lieu vao file
     ArrayList  insertFromFile() throws IOException{
         try(BufferedReader br = new BufferedReader (new FileReader("Dictionarise.txt"))){
             String currentLine;    //Tao doi tuong de doc tung dong file;
             while((currentLine=br.readLine())!=null){
                 Word word = new Word(null, null);
                 String[] splitString;
                 splitString = currentLine.split("\t");
                 word.word_target= splitString[0];
                 word.word_explain= splitString[1];
                 list.add(word);
                 
             }
             
         }catch(IOException e){
                     e.printStackTrace();
                     }
         
        Collections.sort(list);
         return list;//  Collections.sort (list);
     }
     