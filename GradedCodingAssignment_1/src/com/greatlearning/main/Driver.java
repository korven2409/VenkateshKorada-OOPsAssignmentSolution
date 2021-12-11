package com.greatlearning.main;
import com.greatlearning.superclass.SuperClass;
import com.greatlearning.admin.*;
import com.greatlearning.hr.*;
import com.greatlearning.tech.*;

public class Driver
{
	public static void main(String args[])
	{
		SuperClass sup = new SuperClass();
		Admin obj1 = new Admin();
		System.out.println("Welcome to"+obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(sup.isTodayAHoliday());
		System.out.println();
		HR obj2 = new HR();
		System.out.println("Welcome to"+obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(sup.isTodayAHoliday());
		System.out.println();
		Tech obj3 = new Tech();
		System.out.println("Welcome to"+obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(sup.isTodayAHoliday());
	}
	
	
}
