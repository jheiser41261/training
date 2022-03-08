package challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * This is unit testing
 * - Testing individual methods for expected inputs/outputs
 * - We should always write these tests before coding the actual logic
 *
 * TRIPLE A METHOD:
 * - Arrange
 *   - Setup for the test
 * - Act
 *   - Calling the test
 * - Assert
 *   - Determining pass/fail
 * */

class ChallengeMethodsTest{
    @Test
    void wordIsPalindrome(){
        //Arrange
        String word = "racecar";
        boolean expectedOutput = true;

        //Act
        boolean actualOutput = ChallengeMethods.isPalindrome(word);

        //Assert
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void wordIsNotPalindrome(){
        //Arrange
        String word = "Justin";

        //Act
        boolean actualOutput = ChallengeMethods.isPalindrome(word);

        //Assert
        Assertions.assertFalse(actualOutput);
    }
}