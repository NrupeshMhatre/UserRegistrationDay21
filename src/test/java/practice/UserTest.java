package practice;

import static org.junit.Assert.*;

import org.junit.Test;

import practice.Exception.ExceptionType;

public class UserTest {
	User validator = new User();
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() 
	{
		assertTrue(validator.FirstName("Abcd"));			
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() 
	{
		assertFalse(validator.FirstName("Ab"));			
	}

	@Test
	public void givenFirstName_WhenFirstNotInUpperCase_ShouldReturnFalse() 
	{
		assertFalse(validator.FirstName("abcd"));			
	}

	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() 
	{
		assertTrue(validator.LastName("Abcd"));			
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() 
	{
		assertFalse(validator.LastName("Ab"));			
	}
	
	@Test
	public void givenLastName_WhenFirstNotInUpperCase_ShouldReturnFalse() 
	{
		assertFalse(validator.LastName("abcd"));			
	}
	
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue()
	{
		assertTrue(validator.EmailAddress("abc.xyz@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutUserName_ShouldReturnFalse()
	{
		assertFalse(validator.EmailAddress("@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutDomainName_ShouldReturnFalse()
	{
		assertFalse(validator.EmailAddress("abc.xyzco.in"));
	}
	
	@Test
	public void givenEmail_WithoutDomain_ShouldReturnFalse()
	{
		assertFalse(validator.EmailAddress("abc.xyz@bridgelabz"));
	}

	@Test
	public void givenEmail_WithoutOptinalUserName_ShouldReturnTrue()
	{
		assertTrue(validator.EmailAddress("abc@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutOptinalDomain_ShouldReturnTrue()
	{
		assertTrue(validator.EmailAddress("abc.xyz@bridgelabz.com"));
	}
	
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue()
	{
		assertTrue(validator.Password("Abacd@12"));
	}

	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse()
	{
		assertFalse(validator.Password("Ab@12"));
	}

	@Test
	public void givenPassword_WithoutUpperCase_ShouldReturnFalse()
	{
		assertFalse(validator.Password("abacd@12"));
	}

	@Test
	public void givenPassword_WithoutLowerCase_ShouldReturnFalse()
	{
		assertFalse(validator.Password("ABACD@12"));
	}

	@Test
	public void givenPassword_WithoutNumeric_ShouldReturnFalse()
	{
		assertFalse(validator.Password("Abacd@aa"));
	}

	@Test
	public void givenPassword_WithoutSpecailCharacter_ShouldReturnFalse()
	{
		assertFalse(validator.Password("Abacds12"));
	}

	@Test
	public void givenFirstName_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.FirstName(null);
		}
		catch (Exception e) 
		{
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.FirstName("");
		}
		catch (Exception e) 
		{
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenLastName_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.LastName(null);
		}
		catch (Exception e) 
		{
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.LastName("");
		}
		catch (Exception e) 
		{
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenEmail_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.EmailAddress(null);
		}
		catch (Exception e) 
		{
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenEmail_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.EmailAddress("");
		}
		catch (Exception e) 
		{
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenPhoneNumber_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.PhoneNUmber(null);
		}
		catch (Exception e) 
		{
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenPhoneNumber_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.PhoneNUmber("");
		}
		catch (Exception e) 
		{
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenPassword_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.Password(null);
		}
		catch (Exception e) 
		{
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.Password("");
		}
		catch (Exception e) 
		{
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	

}
