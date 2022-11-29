package unicam;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {


    @ParameterizedTest
    @ValueSource(strings={"pippo", "otto", "able was I ere I saw elba"})
    void isPalindrome(String candidate) {
        assertTrue(Palindrome.isPalindrome(candidate));
    }
}