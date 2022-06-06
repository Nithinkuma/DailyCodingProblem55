import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    static Map<String,String> map = new HashMap<>();
    public static void main(String[] args) {
        String url1 = "www.google.com";
        String shortUrl = shortenUrl(url1);
        System.out.println(shortUrl);
        System.out.println(restore(shortUrl));
        String url2 = "www.google2.com";
        String shortUrl2 = shortenUrl(url2);
        System.out.println(shortUrl2);
        System.out.println(restore(shortUrl2));
        String url3 = "www.google3.com";
        String shortUrl3 = shortenUrl(url3);
        System.out.println(shortUrl3);
        System.out.println(restore(shortUrl3));
        String url4 = "www.google4.com";
        String shortUrl4 = shortenUrl(url4);
        System.out.println(shortUrl4);
        System.out.println(restore(shortUrl4));

    }
    static String shortenUrl(String url){

        String shortUrl;
        do{
            shortUrl=getAlphaNumericString(6);
        }while(map.containsKey(shortUrl));

        map.put(shortUrl,url);
        return shortUrl;
    }

    static String restore(String shortUrl){
        return map.get(shortUrl);
    }

    static String getAlphaNumericString(int n)
    {
        // lower limit for LowerCase Letters
        int lowerLimit = 97;
        // lower limit for LowerCase Letters
        int upperLimit = 122;

        Random random = new Random();

        StringBuffer r = new StringBuffer(n);

        for (int i = 0; i < n; i++) {
            int nextRandomChar = lowerLimit
                    + (int)(random.nextFloat()
                    * (upperLimit - lowerLimit + 1));
            r.append((char)nextRandomChar);
        }
        return r.toString();
    }
}