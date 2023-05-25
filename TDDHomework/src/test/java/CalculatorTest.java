/*
 * Student id: B201202053
 * Name: Meryem Berra
 * Surname: AVŞAR
 * Lecture: SWE 202 Software Verification And Validation
 * Homework: 1
 * Repository Link: github.com/meryemberra/SWE202-TDD
 * */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"10,2,5","10,4,2.5","12.5,5,2.5",
                "10,2.5,4","12.5,2.5,5"})
    void Division5Test(double f, double b, double result){
        assertEquals(result,Calculator.divide(f,b));
    }
    @Test
    void testDivision6() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected."
        );
    }

    }