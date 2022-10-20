import java.io.*;
import java.util.*;
class freqWords {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            map.put(words[i], map.getOrDefault(words[i], 0)+1);
        }
        PriorityQueue<WordAndFreq> pq = new PriorityQueue<>();
        for(String key : map.keySet()){
            pq.offer(new WordAndFreq(key, map.get(key)));
        }
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < k; i++){
            answer.add(pq.poll().word);
        }
        return answer;
    }
    public class WordAndFreq implements Comparable<WordAndFreq>{
        String word;
        int freq;
        int req;
        public WordAndFreq(String word, int freq){
            this.word = word;
            this.freq = freq;
        }
        public int compareTo(WordAndFreq other){
            if(freq != other.freq) return other.freq - freq;
            return word.compareTo(other.word);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new FileReader("test.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int k = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        String[] a = new String[length];
        for(int i = 0; i < a.length; i++)
            a[i] = st.nextToken();
        freqWords test = new freqWords();
        out.println(test.topKFrequent(a, k).toString());
        out.close();
    }

}

