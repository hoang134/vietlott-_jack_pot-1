/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary0;



import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author VIệt HOÀNG
 */
public class DictionaryManagement {
    Dictionary dic = new Dictionary();
    Scanner abcd = new Scanner(System.in);
    public void insertFromCommandline(Dictionary dic) {
        System.out.println("so tu can them-");
        int l=abcd.nextInt();
        abcd.nextLine();
        for(int i=0;i<l;i++) {
            System.out.println("target-");
            String a= abcd.nextLine().toLowerCase();           
            System.out.println("explain-");
            String b= abcd.nextLine().toLowerCase();          
            Word words = new Word(a,b);
            dic.hoang.add(words);
        }
    }
    public void dictionaryLookup(Dictionary dic) {
        System.out.println("word-");
        String tu =abcd.next().toLowerCase();
        int KT=1;
        for (Word words : dic.hoang)
        {
            if (words.getWord_target().equalsIgnoreCase(tu)) {
                System.out.println(words.getWord_target()+'\t'+words.getWord_explain());
                KT++;
            }
        }
        if (KT==1) {
            System.out.println("Khong co tu trong file.");
        }
    }
   public void insertFromFile(Dictionary dic) {      

//File file=new File("dictionaries.txt");
//        try(Scanner abcd=new Scanner(file)) {
//           while (abcd.hasNext()){
//                String line=abcd.nextLine();
//                String [] a= line.split("\t");
//                Word words = new Word(a[0],a[1]);
//                dic.hoang.add(words);
//            }
//        } catch (Exception e) {
//            System.out.println("loi-"+e);
//        }
     try (Scanner abcd = new Scanner(new File("3000Tu tiếng anh thông dụng.txt"))) {
            while(abcd.hasNext()){
                String target = abcd.next();
                String explain = abcd.nextLine();
                Word words = new Word(target, explain);
                dic.hoang.add(words);
            }
        }
       catch (Exception e){
             System.err.println("getMessage()-" + e.getMessage());
         }
}

    public void delete(Dictionary dic) {
        
        System.out.println("word-");
        String word=abcd.next().toLowerCase();
        int KT=1;
        for(Word words : dic.hoang) {
            if(words.getWord_target().equalsIgnoreCase(word))
            {
                dic.hoang.remove(words);
                System.out.println("xoa thanh cong.");
                KT++;
            }
        }
        if(KT==1)
        {
            System.out.println("khong co tu trong file.");
        }
    }
    public void edit(Dictionary dic) {
        
        System.out.println("nhap tu can sua-");
        String word=abcd.next().toLowerCase();
        int KT=1;
        for(Word words : dic.hoang){
            if(words.getWord_target().equalsIgnoreCase(word))
            {
                System.out.println("target-");String target=abcd.nextLine().toLowerCase();
                System.out.println("explain--");String explain=abcd.nextLine().toLowerCase();
                words.setWord_target(target);words.setWord_explain(explain);
                System.out.println("thanh cong.");
                KT++;
            }
        }
        if(KT==1)
        {
            System.out.println("khong tim thay tu can sua.");
        }
    }
    public void dictionaryExportToFile(Dictionary dic) throws IOException {
        File file = new File("Dictionaries2.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        try(PrintWriter filef = new PrintWriter(file)) {
            for(Word words : dic.hoang)
            {
                filef.println(words.getWord_target()+"\t"+words.getWord_explain());
            }
            System.out.println("xuat thanh cong");
        }
        catch(Exception e)
        {
            System.out.println("l-"+e);
        }
    }
}