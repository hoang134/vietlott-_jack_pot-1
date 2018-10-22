/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary0;

import java.util.Scanner;


public class Dictionary0 {

    public void menu() {
        System.out.println(" DICTIONARY\n");
        System.out.println("0. thoát\n");
        System.out.println("1. thêm từ và in kết quả\n");
        System.out.println("2. tra từ\n");
        System.out.println("3. tra nhiều từ liên quan\n");
        System.out.println("4. xóa từ\n");
        System.out.println("5. in tất cả các từ\n");
        System.out.println("6.sửa từ\n");
        System.out.println("7.xuất dữ liệu ra file\n");
        System.out.println("bạn muốn làm gì:\n");
    }

    public static void main(String[] args) {
        
        Dictionary0 r = new Dictionary0();
        Dictionary d = new Dictionary();
        DictionaryManagement e = new DictionaryManagement();
        DictionaryCommandLine f = new DictionaryCommandLine();
        e.insertFromFile(d);
        int i = 8;
        while (i != 0) {
            r.menu();
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
            switch (i) {
                case 1:
                    f.dictionaryBasic(d);
                    break;
                case 2:
                    e.dictionaryLookup(d);
                    break;
                case 3:
                    f.dictionarySearcher(d);
                    break;
                case 4:
                    e.deleteWord(d);
                    break;
                case 5:
                    f.dictionaryAdvanced(d);
                    break;
                case 6:
                    e.suatu(d);
                    break;
                case 7:
                    e.dictionaryExportToFile(d);
                    break;

            }
        }
    }
}
