import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramSorter {

    public static void main(String[] args) {
        // Test case 1
        String[] strings1 = {"dog", "god", "cat", "act"};
        testAnagramSorter(strings1);

        // Test case 2
        String[] strings2 = {"abc", "cab", "bca", "def", "fed", "xyz", "zyx"};
        testAnagramSorter(strings2);
    }

    private static void testAnagramSorter(String[] strings) {
        System.out.println("Input strings: " + Arrays.toString(strings));

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
        System.out.println();
    }
}
