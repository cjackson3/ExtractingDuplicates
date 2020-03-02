
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christianjackson
 */
public class ExtractingDuplicate {
    public void countingDuplicate(){
        Map<String, Integer> phrase = new HashMap<>();
        String sentence ="I love to eat because eating is good and eating makes me feel good";
        
        String[] tokens = sentence.replaceAll("[^a-zA-Z ]", "").split("\\s+");
           
        for(String token : tokens){
            String w = token.toLowerCase();
              Integer count = phrase.get(w);
            if(count != null){
                phrase.put(w, count + 1);  
            }
            else{
                phrase.put(w, 1);                   
            }         
        }
        remove(phrase);

    }
    private static void remove(Map<String, Integer> phrase) {
        Iterator<String> w = phrase.keySet().iterator();
        
        while(w.hasNext()){
            String print = w.next();
            if(phrase.get(print) > 1){
                System.out.printf("%s%n", print);
            }
        }
        System.out.println();   
    }
}
