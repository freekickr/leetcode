package Easy;

/*
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-").
We'll call such a concatenation, the transformation of a word.
Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation:
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

Note:
The length of words will be at most 100.
Each words[i] will have length in range [1, 12].
words[i] will only consist of lowercase letters.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

    ////////////////////////1st implementation
    public static int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> morseMap = new HashMap<>();
        mapInit(morseMap);

        Set<String> result = new HashSet<>();
        StringBuilder sb;
        for (String oWord : words) {
            char[] word = oWord.toCharArray();
            sb = new StringBuilder();
            for (int i = 0; i < oWord.length(); i++) {
                sb.append(morseMap.get(Character.toLowerCase(word[i])));
            }
            System.out.println(sb.toString());
            result.add(sb.toString());
        }
        return result.size();
    }

    private static void mapInit(HashMap<Character, String> map) {
        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e', ".");
        map.put('f', "..-.");
        map.put('g', "--.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".---");
        map.put('k', "-.-");
        map.put('l', ".-..");
        map.put('m', "--");
        map.put('n', "-.");
        map.put('o', "---");
        map.put('p', ".--.");
        map.put('q', "--.-");
        map.put('r', ".-.");
        map.put('s', "...");
        map.put('t', "-");
        map.put('u', "..-");
        map.put('v', "...-");
        map.put('w', ".--");
        map.put('x', "-..-");
        map.put('y', "-.--");
        map.put('z', "--..");
    }

    ////////////////////////2nd implementation
    public static int uniqueMorseRepresentations2(String[] words) {
        HashSet<String> result = new HashSet<>();
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb;
        for (String word : words) {
            sb = new StringBuilder();
            for (char letter : word.toCharArray())
                sb.append(morse[letter - 'a']);
            result.add(sb.toString());
            System.out.println(sb.toString());
        }
        return result.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations2(new String[] {"rwjje","aittjje","auyyn","lqtktn","lmjwn"}));
        HashSet<StringBuilder> ss = new HashSet<>();
        ss.add(new StringBuilder("ass"));
        ss.add(new StringBuilder("ass"));
        ss.add(new StringBuilder("ass"));
        ss.add(new StringBuilder("ass"));
        System.out.println(ss.size());
        for (StringBuilder sb : ss)
            System.out.println(sb.toString());
    }
}
