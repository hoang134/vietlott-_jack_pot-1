/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary0;

import java.util.Scanner;

public class DictionaryCommandLine {
    Dictionary dic = new Dictionary();
    Scanner abcd = new Scanner(System.in);
    DictionaryManagement dm = new DictionaryManagement();
    
    public void showAllWords(Dictionary dic) {
      System.out.println("NO"+" "+"English"+"Vietnamese");
      int i=0;
        for (Word words : dic.hoang) {
            i++;
            System.out.println(i+" "+words.getWord_target()+":"+words.getWord_explain());
        }
    }
    public void dictionaryBasic() {
        dm.insertFromCommandline(dic);
        showAllWords(dic);
    }
    public void dictionaryAdvanced() {
        dm.insertFromFile(dic);
        showAllWords(dic);
    }
    
    public void dictionarySearcher(Dictionary dic) {
        Scanner abcd=new Scanner(System.in);
        int n;
        System.out.println("word-");
        String word=abcd.next().toLowerCase();
        n=word.length();
        int i=0;
        int KT=0;
        for (Word words : dic.hoang) {
            i++;
               if(words.getWord_target().startsWith(word))
            {
                System.out.println(i+" "+dic.hoang.get(i).getWord_target()+":"+dic.hoang.get(i).getWord_explain());
                KT=1;
            }
        }
        if(KT==0)
        {
            System.out.println("khong co tu trong file.");
        }
//        System.out.println("Moi ban nhap tu  :");
//	String line = new Scanner (System.in).nextLine();
//	ArrayList<Word> List = new ArrayList<>();
//	List = dtn.getList();
//	for (int i =0 ;i<List.size();i++)
//	{
//		if (List.get(i).getWord_Target().startsWith(line))
//			System.out.printf(" %-18s|%s\n",List.get(i).getWord_Target(),List.get(i).getWord_Explain());
//	}    
    
    }
}


