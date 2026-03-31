import java.util.*;
import java.io.*;
public class CountWordsInAFile{

    public static void main(String args[]){
        String fileName="file.txt";

        Map<String, Integer> words=new HashMap<>();

        try(BufferedReader br=new BufferedReader(new FileReader(fileName))){
            String line;
            while((line=br.readLine())!=null){
                String[] word=line.split("\\W+");
                for(String w:word){
                    if(w.isEmpty()){
                        continue;
                    }
                    w=w.toLowerCase();

                    words.put(w,words.getOrDefault(w,0)+1);
                }        
                    }

                    List<Map.Entry<String, Integer>> list=new ArrayList<>(words.entrySet());
                    list.sort((o1,o2)->o2.getValue()-o1.getValue());

                    System.out.println("top 5 most frequent words: ");
                    for(int i=0;i<Math.min(5,list.size());i++){
                        System.out.println(list.get(i).getKey()+":"+list.get(i).getValue());
                    }

                    System.out.println("top uinique words: "+words.size());
                    }catch(IOException e){
                        System.out.println("error reading file "+e.getMessage());
        }
    }
}