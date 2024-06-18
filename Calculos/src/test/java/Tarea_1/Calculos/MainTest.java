package Tarea_1.Calculos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(28.274333882308138, Main.calcularAreaCirculo(3), 0.0001);
        assertEquals(78.53981633974483, Main.calcularAreaCirculo(5), 0.0001);
        assertEquals(0, Main.calcularAreaCirculo(0), 0.0001);
    }

    @Test
    public void testCalcularAreaCuadrado() {
        assertEquals(9, Main.calcularAreaCuadrado(3), 0.0001);
        assertEquals(25, Main.calcularAreaCuadrado(5), 0.0001);
        assertEquals(0, Main.calcularAreaCuadrado(0), 0.0001);
    }

    @Test
    public void testCalcularAreaRectangulo() {
        assertEquals(6, Main.calcularAreaRectangulo(2, 3), 0.0001);
        assertEquals(20, Main.calcularAreaRectangulo(4, 5), 0.0001);
        assertEquals(0, Main.calcularAreaRectangulo(0, 5), 0.0001);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(3, Main.calcularAreaTriangulo(2, 3), 0.0001);
        assertEquals(10, Main.calcularAreaTriangulo(4, 5), 0.0001);
        assertEquals(0, Main.calcularAreaTriangulo(0, 5), 0.0001);
    }
}