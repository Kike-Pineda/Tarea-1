package Tarea_1.Calculos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testCalcularAreaCirculo() {
        double resultado1 = Main.calcularAreaCirculo(3);
        double resultado2 = Main.calcularAreaCirculo(5);
        double resultado3 = Main.calcularAreaCirculo(1);

        System.out.println("Área del círculo (radio 3): " + resultado1);
        System.out.println("Área del círculo (radio 5): " + resultado2);
        System.out.println("Área del círculo (radio 1): " + resultado3);

        assertEquals(28.274333882308138, resultado1, 0.0001);
        assertEquals(78.53981633974483, resultado2, 0.0001);
        assertTrue(resultado3 > 3);
    }

    @Test
    public void testCalcularAreaCirculoCasosLimite() {
        double resultado1 = Main.calcularAreaCirculo(0);
        double resultado2 = Main.calcularAreaCirculo(1);

        System.out.println("Área del círculo (radio 0): " + resultado1);
        System.out.println("Área del círculo (radio 1): " + resultado2);

        assertEquals(0, resultado1, 0.0001);
        assertNotEquals(0, resultado2);
    }

    @Test
    public void testCalcularAreaCuadrado() {
        double resultado1 = Main.calcularAreaCuadrado(3);
        double resultado2 = Main.calcularAreaCuadrado(5);
        double resultado3 = Main.calcularAreaCuadrado(1);

        System.out.println("Área del cuadrado (lado 3): " + resultado1);
        System.out.println("Área del cuadrado (lado 5): " + resultado2);
        System.out.println("Área del cuadrado (lado 1): " + resultado3);

        assertEquals(9, resultado1, 0.0001);
        assertEquals(25, resultado2, 0.0001);
        assertTrue(resultado3 > 0);
    }

    @Test
    public void testCalcularAreaCuadradoCasosLimite() {
        double resultado1 = Main.calcularAreaCuadrado(0);
        double resultado2 = Main.calcularAreaCuadrado(2);

        System.out.println("Área del cuadrado (lado 0): " + resultado1);
        System.out.println("Área del cuadrado (lado 2): " + resultado2);

        assertEquals(0, resultado1, 0.0001);
        assertNotEquals(0, resultado2);
    }

    @Test
    public void testCalcularAreaRectangulo() {
        double resultado1 = Main.calcularAreaRectangulo(2, 3);
        double resultado2 = Main.calcularAreaRectangulo(4, 5);
        double resultado3 = Main.calcularAreaRectangulo(1, 1);

        System.out.println("Área del rectángulo (2x3): " + resultado1);
        System.out.println("Área del rectángulo (4x5): " + resultado2);
        System.out.println("Área del rectángulo (1x1): " + resultado3);

        assertEquals(6, resultado1, 0.0001);
        assertEquals(20, resultado2, 0.0001);
        assertTrue(resultado3 > 0);
    }

    @Test
    public void testCalcularAreaRectanguloCasosLimite() {
        double resultado1 = Main.calcularAreaRectangulo(0, 5);
        double resultado2 = Main.calcularAreaRectangulo(2, 3);

        System.out.println("Área del rectángulo (0x5): " + resultado1);
        System.out.println("Área del rectángulo (2x3): " + resultado2);

        assertEquals(0, resultado1, 0.0001);
        assertNotEquals(0, resultado2);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        double resultado1 = Main.calcularAreaTriangulo(2, 3);
        double resultado2 = Main.calcularAreaTriangulo(4, 5);
        double resultado3 = Main.calcularAreaTriangulo(1, 2);

        System.out.println("Área del triángulo (2x3): " + resultado1);
        System.out.println("Área del triángulo (4x5): " + resultado2);
        System.out.println("Área del triángulo (1x2): " + resultado3);

        assertEquals(3, resultado1, 0.0001);
        assertEquals(10, resultado2, 0.0001);
        assertTrue(resultado3 > 0);
    }

    @Test
    public void testCalcularAreaTrianguloCasosLimite() {
        double resultado1 = Main.calcularAreaTriangulo(0, 5);
        double resultado2 = Main.calcularAreaTriangulo(2, 4);

        System.out.println("Área del triángulo (0x5): " + resultado1);
        System.out.println("Área del triángulo (2x4): " + resultado2);

        assertEquals(0, resultado1, 0.0001);
        assertNotEquals(0, resultado2);
    }
}