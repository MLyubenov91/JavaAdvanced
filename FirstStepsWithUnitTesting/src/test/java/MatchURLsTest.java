import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MatchURLsTest {

    @Test
    public void Test_ExtractUrls_EmptyText_ReturnsEmptyList() {
        String text = "";
        List<String> result = MatchURLs.ExtractUrls(text);
        assertTrue(result.isEmpty());
    }

    @Test
    public void Test_ExtractUrls_NoUrlsInText_ReturnsEmptyList() {
        String text = "hello world";
        List<String> result = MatchURLs.ExtractUrls(text);
        assertTrue(result.isEmpty());
    }

}