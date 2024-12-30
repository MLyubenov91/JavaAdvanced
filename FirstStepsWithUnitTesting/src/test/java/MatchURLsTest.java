import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Test
    public void Test_ExtractUrls_SingleUrlInText_ReturnsSingleUrl() {
        String text = "hello https://www.softuni.bg";
        List<String> expected = List.of("https://www.softuni.bg");
        List<String> result = MatchURLs.ExtractUrls(text);
        //System.out.println(result);
        assertEquals(result.size(), 1);
        assertEquals(expected, result);
    }

    @Test
    public void Test_ExtractUrls_MultipleUrlInText_ReturnsAllUrls() {
        String text = "https://www.softuni.bg, https://www.github.com, https://www.google.com";
        List<String> expected = List.of("https://www.softuni.bg", "https://www.github.com", "https://www.google.com");
        List<String> result = MatchURLs.ExtractUrls(text);
        assertEquals(result.size(), 3);
        assertEquals(expected, result);
    }

    @Test
    public void Test_ExtractUrls_UrlsInQuotationMarks_ReturnsUrlsInQuotationMarks() {
        String text = "hello \"https://www.softuni.bg\", https://www.github.com, https://www.google.com";
        List<String> expected = List.of("https://www.softuni.bg", "https://www.github.com", "https://www.google.com");
        List<String> result = MatchURLs.ExtractUrls(text);
        assertEquals(result.size(), 3);
        assertEquals(expected, result);
    }

}