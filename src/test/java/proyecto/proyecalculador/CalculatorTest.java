/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyecto.proyecalculador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class CalculatorTest {
    
   public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
           // System.out.println("Esto se ejecutara antes del test unitario");
    }
    
    @After
    public void tearDown() {
         //System.out.println("Esto se ejecutara despues del test unitario");
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Calculator instance = new Calculator(15,10);
        float expResult = 25.0F;
        float result = instance.add();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of resta method, of class Calculator.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculator instance = new Calculator(15,10);
        float expResult = 5.0F;
        float result = instance.resta();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of producto method, of class Calculator.
     */
    @Test
    public void testProducto() {
        System.out.println("producto");
        Calculator instance = new Calculator(15,10);
        float expResult = 150.0F;
        float result = instance.producto();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of division method, of class Calculator.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        Calculator instance = new Calculator(15,10);
        float expResult = 1.5F;
        float result = instance.division();
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testDivision1() {
        System.out.println("division demonibador 0");
        Calculator instance = new Calculator(15,0);
        float expResult = 0.0F;
        float result = instance.division();
        assertEquals(expResult, result, 0.0);
        
    }
       @Test
    public void testDivision2() {
        System.out.println("division valor ngativo");
        Calculator instance = new Calculator(15,-10);
        float expResult = -1.5F;
        float result = instance.division();
        assertEquals(expResult, result, 0.0);
        
    }
}
