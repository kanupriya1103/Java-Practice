 package Unit_02;  //inside this package we can create any classes!

/*
 * -A java package is a group of similar types of classes, interfaces and sub-packages.
 * -package in java can be categorized in 2 form
 *  -built-in package {lang,javax, swing net,io, util, sql}
 *  -user-defined package
 *  
 * -Package also helps to avoid class name collision
 * -Package also helps us to maintain access protection in java
 * -Packages are named in reverse order of domain names
 *  -unit01.javaproject.com -> "com.javaproject.unit01"
 *  
 *  import java.util.vector;  // import the vector class from util package
 *  import java.util.*; //import all the classes from util package
 *  
 *  static import:
 *  - static import is a feature introduced in java {version 5 and above}
 *  - that allows members(fields and methods) defined in class as public static
 *    . to be used in java code without specifying the class in which the field is defined
 *    
 */

import static java.lang.System.*;
import static java.lang.Math.*;

import Unit_01.SampleClass1;

public class P11_Task02_ImportingAndPackagesInJava {
    public static void main(String args[]) {
    	
    	out.println("welcome to package");
    	
    	out.println(sqrt(4));
    	System.out.println(pow(2,2));
		System.out.println(abs(6));
		
		SampleClass1 obj = new SampleClass1();
		System.out.println(obj.a);
    }


	
}
