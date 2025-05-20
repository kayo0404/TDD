/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.aula.Calculadora;
/**
 *
 * @author kayok
 */
public class CalculadoraTest {
    @Test
    void testSomar(){

        Calculadora calc = new Calculadora();
        assertEquals(10, calc.somar(5, 5));
    }

    @Test
    void testSubtrair(){
        
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.subtrair(10, 5));
    }

    @Test
    void testMultiplicar(){

        Calculadora calc = new Calculadora();
        assertEquals(25, calc.multiplicar(5, 5));
    }
    
    @Test
    void testDividir(){

        Calculadora calc = new Calculadora();
        assertEquals(5, calc.dividir(10, 2));

    }

    @Test
    void testDividirPorZero(){

        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class,
                () -> calc.dividir(10, 0),
                "Dividir por zero deveria lançar IllegalArgumentException");
    }
}
