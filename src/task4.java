import java.util.HashSet;
import java.util.Set;

public class task4 {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(Set.of("olma","behi","nok","uzum","ot"));
        Set<String> set2 = new HashSet<>(Set.of("olma", "tut",  "nok", "uzum", "otma"));
        Set<String> set3 = new HashSet<>(Set.of("olma", "tut",  "tuxum", "bog'lar", "gullar"));

        System.out.println("createNewSet(set1,set2,set3) = " + createNewSet(set1, set2, set3));
    }
    public static Set<String> createNewSet(Set<String> set1,Set<String> set2,Set<String> set3){
        set3.remove(set2);
        set3.remove(set1);
        Set<String> result = new HashSet<>(set3);

        set2.retainAll(set1);
        result.addAll(set2);
        return result ;
    }
}
