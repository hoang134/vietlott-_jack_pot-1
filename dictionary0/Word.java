/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary0;

public class Word implements Comparable < Word > {
  public String word_target;//tu moi
  public String word_explain;//giai nghia
  
  
 
  Word (String word_target, String word_explain){
      this.word_target= word_target;
      this.word_explain= word_explain;
  }

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
  
    @Override
    public int compareTo(Word otherWord){
        return word_target.compareTo(otherWord.word_target);
    }
}
//    void replace(String fixWord_target, String fixWord_explain) {
//      
//    }
//    
//    }