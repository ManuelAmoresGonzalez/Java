package curso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaParaTestearTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        PruebaParaTestear testPrueba = new PruebaParaTestear();
        assertEquals(testPrueba.add(2,2), 4);
    }

    @Test
    void fourPlusFiveShouldEqualNine(){
        PruebaParaTestear testPrueba = new PruebaParaTestear();
        assertEquals(testPrueba.add(4,5), 9);
    }

    @Test
    void determineteIlegalArgument(){
        PruebaParaTestear testPrueba = new PruebaParaTestear();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    testPrueba.determineLetterGrade(4);
                }
        );
    }
}