import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramSorter {

    public static void main(String[] args) {
        String[] strings = {"Apple", "Button", "Cherry", "Dot", "Easy", "Fog", "Gross", "Hall"};

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strings) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            List<String> anagrams = anagramGroups.getOrDefault(sortedStr, new ArrayList<>());
            anagrams.add(str);
            anagramGroups.put(sortedStr, anagrams);
        }

        for (List<String> anagrams : anagramGroups.values()) {
            if (anagrams.size() > 1) {
                System.out.println("Anagrams: " + anagrams);
            }
        }
    }
}
