package unicam;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {


    @ParameterizedTest
    @ValueSource(strings={"otto", "able was I ere I saw elba"})
    void isPalindrome(String candidate) {
        assertTrue(Palindrome.isPalindrome(candidate));
    }
}