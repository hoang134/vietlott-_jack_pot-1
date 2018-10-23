/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary0;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Dictionary0 {

    
    public static void main(String[] args) {
        Dictionary dic = new Dictionary();
        DictionaryManagement dm = new DictionaryManagement();
        DictionaryCommandLine dcl = new DictionaryCommandLine();
        dm.insertFromFile(dic);
        int i = 8;
        while (i != 0) {
            System.out.print("0. thoát\n");
            System.out.print("1. thêm từ và in kết quả\n");
            System.out.print("2. tra từ\n");
            System.out.print("3. tra nhiều từ liên quan\n");
            System.out.print("4. xóa từ\n");
            System.out.print("5. in tất cả các từ\n");
            System.out.print("6.sửa từ\n");
            System.out.print("7.xuất dữ liệu ra file\n");
            System.out.print("bạn muốn làm gì:\n");
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
            switch (i) {
                case 1:
                    dcl.dictionaryBasic();
                    break;
                case 2:
                    dm.dictionaryLookup(dic);
                    break;
                case 3:
                    dcl.dictionarySearcher(dic);
                    break;
                case 4:
                    dm.delete(dic);
                    break;
                case 5:
                    dcl.dictionaryAdvanced();
                    break;
                case 6:
                    dm.edit(dic);
                    break;
                case 7:
            {
                try {
                    dm.dictionaryExportToFile(dic);
                } catch (IOException ex) {
                    Logger.getLogger(Dictionary0.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;

            }
        }
    }
}
