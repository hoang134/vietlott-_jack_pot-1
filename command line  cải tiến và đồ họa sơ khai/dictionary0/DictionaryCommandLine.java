/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary0;

import java.util.Scanner;

public class DictionaryCommandLine extends DictionaryManagement {
    DictionaryManagement e = new DictionaryManagement();
    //hàm thừa kế
    public DictionaryCommandLine() {
        super();
    }
    //hàm in tất cả ra màn hình
    public void showAllWords(Dictionary d) {
        System.out.printf("|%-3s|%-25s|%-25s|\n","No","English","Vietnamese");
        for (int i = 0; i < d.list.size(); i++) {
            int j=i+1;
            System.out.printf("|%-5d|%-25s|%-25s|\n",j,d.list.get(i).getWord_target(),d.list.get(i).getWord_explain());
        }
    }
    //gọi hàm
    public void dictionaryBasic(Dictionary d) {
        e.insertFromCommandline(d);
        showAllWords(d);
    }
    //gọi hàm
    public void dictionaryAdvanced(Dictionary d) {
        e.insertFromFile(d);
        showAllWords(d);
    }
    
    //gợi từ ý
    public void dictionarySearcher(Dictionary d) {
        String tucantra;
        Scanner scan=new Scanner(System.in);
         int KT=1;
        int ab;
        System.out.println("nhap tu can tim:");
        tucantra=scan.next().toLowerCase();
        ab=tucantra.length();
        for (int i = 0; i < d.list.size(); i++) {
            int j=i+1;
//            if(tucantra.equalsIgnoreCase(d.list.get(i).getWord_target().substring(0,ab)))
               if(d.list.get(i).getWord_target().startsWith(tucantra))
            {
                System.out.printf("|%-3s|%-25s|%-25s|\n",j,d.list.get(i).getWord_target(),d.list.get(i).getWord_explain());
                KT++;
            }
        }
        if(KT==1)
        {
            System.out.println("khong tim thay tu.");
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


