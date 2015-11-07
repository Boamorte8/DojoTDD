import static org.junit.Assert.*;

import org.junit.Test;

import com.edu.udea.appempresariales.examples.CodeBreaker;


public class CodeBreakerTest {
	CodeBreaker c= new CodeBreaker("3184"); ;
	String r ;
	
	@Test
	public void success3184() {
		
		r = c.verify("3184");
		assertEquals("xxxx", r );
	}

	@Test 
	public void success1409() {
		
		r =c.verify("1409");
		assertEquals("--", r );
	}
	
	@Test
	public void notSucess(){
		r = c.verify("6666");
		assertEquals("", r);
	}

	
}
