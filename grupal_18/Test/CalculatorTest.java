import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void suma() {
        Calculator suma = new Calculator(5,3,0,"");
        suma.suma();
        assertEquals(8, suma.getResultado());
    }

    @Test
    void resta() {
        Calculator resta = new Calculator(5,3,0,"");
        resta.resta();
        assertEquals(2, resta.getResultado());
    }

    @Test
    void multiplicacion() {
        Calculator multiplicacion = new Calculator(5,3,0,"");
        multiplicacion.multiplicacion();
        assertEquals(15, multiplicacion.getResultado());
    }

    @Test
    void divisionDividendo0() {
        Calculator division = new Calculator(0,3,0,"");
        division.division();
        assertEquals(0, division.getResultado());
    }
    @Test
    void divisionDivisor0() {
        Calculator div = new Calculator(6,0,0,"");
        div.division();
        assertEquals(0, div.getResultado());
    }
    @Test
    void division() {
        Calculator divNormal = new Calculator(6,3,0,"");
        divNormal.division();
        assertEquals(2, divNormal.getResultado());
    }
}