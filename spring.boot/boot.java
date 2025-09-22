import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

class TestUrl {
    public static void main(String[] args) throws Exception {
        String file = "Link page.html";

        String encoded = URLEncoder.encode(file, StandardCharsets.UTF_8);
        String decoded = URLDecoder.decode(encoded, StandardCharsets.UTF_8);

        System.out.println("Encoded: " + encoded); // Link+page.html
        System.out.println("Decoded: " + decoded); // Link page.html
    }
}





