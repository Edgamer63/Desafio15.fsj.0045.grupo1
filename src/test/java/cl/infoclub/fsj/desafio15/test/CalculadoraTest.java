package cl.infoclub.fsj.desafio15.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Map;
import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.infoclub.fsj.desafio15.Calculadora;

import java.util.logging.Logger;

@DisplayName("Test Calculadora")
public class CalculadoraTest 
{
	private static Logger log =Logger.getLogger("cl.infoclub.fsj.desafio15.test.CalculadoraTest");
	
    @Test
    public void testSuma() {
    	log.info("info test suma");
    	Calculadora c = new Calculadora();
    	float suma=c.suma(1.0f, 2.0f);
    	assertEquals(3.0f,suma);
    }
    
    @Test
    public void testResta() {
    	log.info("info test resta");
    	Calculadora c = new Calculadora();
    	float resta=c.restar(2.0f, 1.0f);
    	assertEquals(1.0f,resta);
    }
    
    @Test
    public void testMultiplicar() {
    	log.info("info test multiplicar");
    	Calculadora c = new Calculadora();
    	float multiplicacion=c.multiplicar(1.0f, 2.0f);
    	assertEquals(2.0f,multiplicacion);
    }
    
    @Test
    public void testDividir() {
    	log.info("info test dividir");
    	Calculadora c = new Calculadora();
    	float division=c.dividir(1.0f, 2.0f);
    	assertEquals(0.5f,division);
    }
}
