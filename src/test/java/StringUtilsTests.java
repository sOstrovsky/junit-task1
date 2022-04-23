import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilsTests {
    static StringUtils sut;

    @BeforeAll
    public static void started() {
        System.out.println("StringUtils tests started");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("StringUtils tests completed");
    }

    @BeforeEach
    public void initSuite() {
        System.out.println("SU test started");
        sut = new StringUtils();
    }

    @AfterEach
    public void finished() {
        System.out.println("SU test completed");
    }

    @Test
    public void testPalindromeCreatorRandom() {
        // arrange
        String test = "ABCDEFG";
        String expected = "ABCDEFGGFEDCBA";
        int expectedResultLength = test.length() * 2;

        // act
        String result = sut.palindromeCreator(test);

        // assert
        assertEquals(expected, result);
        assertEquals(expectedResultLength, result.length());

    }
    @Test
    public void testPalindromeCreatorAlreadyPalindrome() {
        // arrange
        String test = "ABCBA";
        String expected = "ABCBA";
        int expectedResultLength = test.length();

        // act
        String result = sut.palindromeCreator(test);

        // assert
        assertEquals(expected, result);
        assertEquals(expectedResultLength, result.length());

    }
    @Test
    public void testPalindromeCreatorThrowsIllegalArgumentExceptionEmptyString() {
        // arrange
        String test = "";

        // assert
        assertThrows(IllegalArgumentException.class, () -> sut.palindromeCreator(test));

    }

    @Test
    public void testSpacesDestroyer() {
        // arrange
        String test = "Hello world! Let's destroy all the spaces!";
        String expected = "Helloworld!Let'sdestroyallthespaces!";
        int expectedSpaceIndex = -1;

        // act
        String result = sut.spacesDestroyer(test);

        // assert
        assertEquals(expected, result);
        // just check if there are no spaces programmatically
        assertEquals(expectedSpaceIndex, expected.indexOf(" "));

    }

    @Test
    public void testSpacesDestroyerThrowsIllegalArgumentExceptionEmptyString() {
        // arrange
        String test = "";

        // assert
        assertThrows(IllegalArgumentException.class, () -> sut.palindromeCreator(test));
    }
}
