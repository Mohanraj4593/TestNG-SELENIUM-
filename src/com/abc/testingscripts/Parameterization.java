package com.abc.testingscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

@Test
@Parameters({"fname","lname"})
public void parameterDisplay(String finame,String laname) 
{
System.out.println("Firstname is"+finame);	
System.out.println("Lastname is"+laname);

}


}
