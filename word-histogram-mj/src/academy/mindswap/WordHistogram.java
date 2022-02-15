package academy.mindswap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordHistogram implements  Iterable<String>{


    private Map<String, Integer> histogramData;
    private String[] words;

    public WordHistogram() {
        histogramData = new HashMap<>();
    }


    void analyseString(String toAnalyse){
        String[] words = toAnalyse.toLowerCase().split("(\s|[.,!?:;\"-])+");

        for (int i = 0; i < words.length; i++) {

            //ver se a key já existe (a palavra é o key)
            // obter o valor declarado no value (se não existir começa com 1)

            String word = words[i];

            int value = histogramData.containsKey(word) ? histogramData.get(word) + 1 : 1;

            //histogramData.get(word);//devolve o inteiro declarado como value no meu map. Procura por objecto
            histogramData.put(word,value);

        }
       //System.out.println(histogramData);
    }

    public int getValue(String word){
        return histogramData.get(word);
    }


    @Override
    public Iterator<String> iterator() {
        return histogramData.keySet().iterator();
    }
}
