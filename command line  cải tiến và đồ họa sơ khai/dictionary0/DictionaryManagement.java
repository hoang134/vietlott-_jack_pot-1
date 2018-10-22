/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary0;



import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VIệt HOÀNG
 */
public class DictionaryManagement {
    Dictionary d = new Dictionary();
    Scanner sc = new Scanner(System.in);
    //hàm thêm từ
    public void insertFromCommandline(Dictionary d) {
        System.out.println("nhap so tu can them:");
        int l=sc.nextInt();
  
        sc.nextLine();
        for(int i=0;i<l;i++) {
            String tu;
            String nghia;
            System.out.println("nhap tu moi:");
            tu= sc.nextLine().toLowerCase();           
            System.out.println("Nhap nghia moi:");
            nghia= sc.nextLine().toLowerCase();          
            Word words = new Word(tu,nghia);
            d.list.add(words);
        }
    }
    //hàm tra từ
    public void dictionaryLookup(Dictionary d) {
        System.out.println("nhap tu can tim:");
        String tucamtra =sc.next().toLowerCase();
        int test=1;
        for (int i=0;i<d.list.size();i++)
        {
            if (d.list.get(i).getWord_target().equalsIgnoreCase(tucamtra)) {
                System.out.println(d.list.get(i).getWord_target()+'\t'+d.list.get(i).getWord_explain());
                test++;
            }
        }
        if (test==1) {
            System.out.println("Khong tim thay tu.");
        }
    }
    //đọc dữ liệu từ file
   public void insertFromFile(Dictionary d) {      

//File file=new File("dictionaries.txt");
//        try(Scanner sc=new Scanner(file)) {
//           while (sc.hasNext()){
//                String line=sc.nextLine();
//                String [] a= line.split("\t");
//                Word words = new Word(a[0],a[1]);
//                d.list.add(words);
//            }
//        } catch (Exception e) {
//            System.out.println("loi:"+e);
//        }
     try (Scanner scan = new Scanner(new File("3000Tu tiếng anh thông dụng.txt"))) {
            while(scan.hasNext()){
                String target = scan.next();
                String explain = scan.nextLine();
                Word words = new Word(target, explain);
                d.list.add(words);
            }
        }
       catch (Exception e){
             System.err.println("getMessage():" + e.getMessage());
         }
}

     
    
    //xóa từ
    public void deleteWord(Dictionary d) {
        String tucanxoa;
        int test=1;
        System.out.println("nhap tu can xoa:");
        tucanxoa=sc.next().toLowerCase();
        for(int i=0;i<d.list.size();i++) {
            if(d.list.get(i).getWord_target().equalsIgnoreCase(tucanxoa))
            {
                d.list.remove(d.list.get(i));
                System.out.println("xoa thanh cong.");
                test++;
            }
        }
        if(test==1)
        {
            System.out.println("khong tim thay tu can xoa.");
        }
    }
    //sửa từ
    public void suatu(Dictionary d) {
        String tucansua;
        String tu;
        String nghia;
        int KT=1;
        System.out.println("nhap tu can sua:");
        tucansua=sc.next().toLowerCase();
        for(int i=0;i<d.list.size();i++){
            if(d.list.get(i).getWord_target().equalsIgnoreCase(tucansua))
            {
                System.out.println("sua tu.");
                System.out.println("tu moi:");
                tu=sc.nextLine().toLowerCase();
                System.out.println("nghia moi:");
                nghia=sc.nextLine().toLowerCase();
                Word words = new Word(tu,nghia);
                d.list.add(words);
                System.out.println("sua thanh cong.");
                KT++;
            }
        }
        if(KT==1)
        {
            System.out.println("khong tim thay tu can sua.");
        }
    }
    //hàm xuất dữ liệu ra file
    public void dictionaryExportToFile(Dictionary d) {
        File f = new File("Dictionariescoppy.txt");
        if(!f.exists()){
        try
        {
            f.createNewFile();
        }
        catch (IOException ex) {
                Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try(PrintWriter pw = new PrintWriter(f)) {
            BufferedWriter bf = new BufferedWriter(pw);
            for(int i=0;i<d.list.size();i++)
            {
                pw.println(d.list.get(i).getWord_target()+"\t"+d.list.get(i).getWord_explain());
            }
            System.out.println("xuat du lieu thanh cong");
        }
        catch(Exception e)
        {
            System.out.println("loi:"+e);
        }
    }
}