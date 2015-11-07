

import static org.junit.Assert.*;

import org.junit.Test;

import com.edu.udea.appempresariales.examples.Calculator;

public class CalculatorTest {
	
	Calculator c;
	int r;
	
	@Test
	public void add_1_1(){
		c = new Calculator(); //Arrange
		r = c.add(1,1); //Act
		assertEquals(2,r); //Assert
	}
	
	@Test
	public void add_2_2(){
		c = new Calculator(); //Arrange
		r = c.add(2,2); //Act
		assertEquals(4,r); //Assert
	}

}
