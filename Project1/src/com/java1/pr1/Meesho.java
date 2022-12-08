package com.java1.pr1;

interface Amazoncompany
{
	abstract void menu();
	abstract void orderonline();
	abstract void delivery();
}

class Meesho implements Amazoncompany
{
	public void menu()
	{
		System.out.println("Indian");
		System.out.println("Western");
		System.out.println("Kids wear");
		System.out.println("Mens Wear");
		System.out.println("Foot wear");
		System.out.println("Jewellery");
	}
	public void orderonline()
	{
		System.out.println("recieve by Meesho");
		System.out.println("issue the order by Meesho");
		System.out.println("Meesho organization will prepare the list of things");
	}
	public void delivery()
	{
		System.out.println("Handover the ordred product to the customer");
	}
}
  class Nike implements Amazoncompany
	{
		public void menu()
		{
			System.out.println("Running Shirts and tops");
			System.out.println("Jorden shoes");
			System.out.println("Running Trousers and T-shirts");
		}
		public void orderonline()
		{
			System.out.println("Receive by Nike");
			System.out.println("issue the order by Nike ");
			System.out.println("Nike team people will ready order");
		}
		public void delivery()
		{
			System.out.println("handover the order to delivery person");
		}
		
	}
	class Amazonapp
	{
		Amazoncompany selectbrand(char ch)
		{
			if(ch=='A')
			{
				return new Meesho();
			}
			else 
			{
				return new Nike();  
			}
		}
	}
     class Prog1 {

		public static void main(String[] args)
		{
			Amazonapp ref=new Amazonapp();
		    Amazoncompany ac=ref.selectbrand('N');
		    ac.menu();
		    ac.orderonline();
		    ac.delivery();
		}

	}
