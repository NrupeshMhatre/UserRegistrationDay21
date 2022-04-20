package practice;

import java.util.regex.Pattern;

import practice.Exception.ExceptionType;

public class User {
	public boolean FirstName(String firstName) throws Exception
	{
		try
		{
			if (firstName.length() == 0)
			{				
				throw new Exception(ExceptionType.ENTERED_EMPTY, "First name cannot be empty");      
			}
			boolean isMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(firstName).matches();
			return isMatched;
		}
		catch (NullPointerException e) 
		{
			throw new Exception(ExceptionType.ENTERED_NULL,"First name cannot be empty");
		}

	}

	
	public boolean LastName(String lastName) throws Exception
	{
		try
		{
			if (lastName.length() == 0)
			{				
				throw new Exception(ExceptionType.ENTERED_EMPTY, "last name cannot be empty");    
			}
			boolean isMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(lastName).matches();
			Valid(isMatched);
			return isMatched;
		}
		catch (NullPointerException e) 
		{			
			throw new Exception(ExceptionType.ENTERED_NULL,"last name cannot be empty");
		}
	}

	
	public boolean EmailAddress(String emailAddress) throws Exception
	{
		try
		{
			if (emailAddress.length() == 0)
			{				
				throw new Exception(ExceptionType.ENTERED_EMPTY, "Email cannot be empty");     
			}
			boolean isMatched = Pattern.compile("^[0-9a-zA-Z]+([.,+,_,-]{1}[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2})?").matcher(emailAddress).matches();
			Valid(isMatched);
			return isMatched;
		}
		catch (NullPointerException e) 
		{			
			throw new Exception(ExceptionType.ENTERED_NULL,"email cannot be empty");
		}
	}

	
	public boolean PhoneNUmber(String phoneNumber) throws Exception
	{
		try
		{
			if (phoneNumber.length() == 0)
			{				
				throw new Exception(ExceptionType.ENTERED_EMPTY, "Phone Number cannot be empty");     
			}
			boolean isMatched = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$").matcher(phoneNumber).matches();
			Valid(isMatched);
			return isMatched;
		}
		catch (NullPointerException e) 
		{			
			throw new Exception(ExceptionType.ENTERED_NULL,"Phone number cannot be empty");
		}
	}

	
	public boolean Password(String password) throws Exception
	{
		try
		{
			if (password.length() == 0)
			{				
				throw new Exception(ExceptionType.ENTERED_EMPTY, "Password cannot be empty");     
			}
			boolean isMatched = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[#$%^&-+@]).{8,}").matcher(password).matches(); 
			Valid(isMatched);
			return isMatched;
		}
		catch (NullPointerException e) 
		{			
			throw new Exception(ExceptionType.ENTERED_NULL,"Password cannot be empty");
		}
	}

	
	private void Valid(boolean isMatched) 
	{
		if(isMatched)
		{
			System.out.println("valid");
		}
		else 
		{
			System.out.println("invalid");
		}
	}

}
