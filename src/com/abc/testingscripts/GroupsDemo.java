package com.abc.testingscripts;

import org.testng.annotations.Test;

public class GroupsDemo {
	
	
	@Test(groups="Sanity Testing")
	public void inbox() 
	{System.out.println("performing the Sanity testing on inbox()");}
	
	@Test(groups="Functional Testing")
	public void login() 
	{System.out.println("Performing the Functional testing on login()");}
	
	@Test(groups="Sanity Testing")
	public void sentItems() {System.out.println("Performing the Sanity testing on sentItems()");}
	
	@Test(groups="Functional Testing")
	public void compose() {System.out.println("Performing the Functional testing on compose()");}
	
	@Test(groups="Sanity Testing")
	public void logout() {System.out.println("Performing the Sanity testing on logout()");}
	
	
	

}
