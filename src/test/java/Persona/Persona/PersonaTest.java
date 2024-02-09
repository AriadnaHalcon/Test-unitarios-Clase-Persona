package Persona.Persona;




import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * Unit test for simple App.
 */
public class PersonaTest 
{
	
    private Persona persona;
    @BeforeEach
    public void init() {
    	Persona persona = new Persona("Maria", 18, 'M', 65.0, 1.67);
    }
	

    
    @Test
    public void testCalcularIMC() {
    	
    	assertEquals(persona.PESO_IDEAL, persona.calcularIMC());
    	
    	persona.setPeso(100);
    	assertEquals(persona.SOBREPESO, persona.calcularIMC());
    	
    	persona.setPeso(50);
    	assertEquals(persona.INFRAPESO, persona.calcularIMC());
    }
    
   
	@Test
	public void testCompruebaEdad() {
		assertEquals(persona.esMayorDeEdad(), true);
		
		persona.setEdad(16);
		assertEquals(persona.esMayorDeEdad(), false);
	}
    
	@AfterEach 
	public void finish() { 
		Persona persona = null;
	}
}


