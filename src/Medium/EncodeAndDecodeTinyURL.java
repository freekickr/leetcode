package Medium;

/*
TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl
and it returns a short URL such as http://tinyurl.com/4e9iAk.

Design the encode and decode methods for the TinyURL service.
There is no restriction on how your encode/decode algorithm should work.
You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 */

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

import java.util.HashMap;
import java.util.Random;

public class EncodeAndDecodeTinyURL {
    private static final String STRING_TOKENS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    private static final String PREFIX = "http://tinyurl.com/";
    private static HashMap<String, String> entriesMap = new HashMap<>();

    private static String generateCode(String url) {
        boolean isUnique = true;
        Random random = new Random();
        StringBuilder stringBuilder;
        do {
            stringBuilder = new StringBuilder();
            while(stringBuilder.length() <= 6) {
                int index = random.nextInt(STRING_TOKENS.length());
                stringBuilder.append(STRING_TOKENS.charAt(index));
            }
            if (entriesMap.get(stringBuilder.toString()) != null) isUnique = false;
        } while (!isUnique);

        return stringBuilder.toString();
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String code = entriesMap.get(longUrl);
        if (code == null) {
            code = generateCode(longUrl);
        }
        entriesMap.put(code, longUrl);
        return PREFIX + code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if (!shortUrl.contains(PREFIX))
            return "Wrong URL";
        String[] urlParts = shortUrl.split(PREFIX);
        if (urlParts.length != 2 || entriesMap.get(urlParts[1]) == null)
            return "No such URL";
        return entriesMap.get(urlParts[1]);
    }

    public static void main(String[] args) {
        EncodeAndDecodeTinyURL test = new EncodeAndDecodeTinyURL();
        System.out.println(test.decode(test.encode("https://leetcode.com/problems/design-tinyurl")));
    }
}
