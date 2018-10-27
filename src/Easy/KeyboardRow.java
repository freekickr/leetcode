package Easy;

/*
Keyboard Row

Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American
keyboard like the image below.

Example:
    Input: ["Hello", "Alaska", "Dad", "Peace"]
    Output: ["Alaska", "Dad"]

Note:
    You may use one character in the keyboard more than once.
    You may assume the input string will only contain letters of alphabet.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KeyboardRow {

    public static String[] findWords(String[] words) {
        Pattern p = Pattern.compile("[QqWwEeRrTtYyUuIiOoPp]+|[AaSsDdFfGgHhJjKkLl]+|[ZzXxCcVvBbNnMm]+");
        List<String> result = new ArrayList<>();
        for (String s : words) {
            Matcher m = p.matcher(s);
            if (m.matches())
                result.add(s);
        }
        return result.toArray(new String[0]);
    }

    public static String[] findWords2(String[] words) {
        List<String> result = new ArrayList<>();
        for (String s : words)
            if (s.matches("[QqWwEeRrTtYyUuIiOoPp]+|[AaSsDdFfGgHhJjKkLl]+|[ZzXxCcVvBbNnMm]+"))
                result.add(s);
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] result = findWords(new String[] {"Hello", "Alaska", "Dad", "Peace"});
        for (String s : result)
            System.out.println(s);
    }
}
