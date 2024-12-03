package com.example.optionaldemo;

import java.util.Optional;

public class OptionalDemo {
	 public static void main(String[] args) {
	 
		 // Creating an Optional
		 
		 // Creating an optional value with String "Hello World"
		 
		 Optional<String> opt1 = Optional.of("Hello World");
		 
		 // Creating an Optional value with null
		 Optional<String> opt2 = Optional.ofNullable(null);
		 
		 Optional<String> opt3 = Optional.empty();
		 
		 // When we do sysout here, we get Optional[Hello World] and not Hello World
		 System.out.println(opt1);
		 
		 System.out.println(opt2);
		 System.out.println(opt3);
		 
		 
		 // To retrieve the value (to remove the Optional[Hello World]
		 
		 // 1) Use if else
		 
		 System.out.println("Retrieving the value");
		 if (opt1.isPresent()) {
			 System.out.println(opt1.get());
		 } else {
			 System.out.println("No value set");
		 }
		 
		 // 2) Lambda expression
		 // 
		 opt1.ifPresent(value-> System.out.println("Optional value is "+value));
		 
		 // It will show value does not exists if it is empty / null
		 
		 opt2.ifPresentOrElse(value->System.out.println(value), 
				 ()->System.out.println("Value does not exist"));
		 
		 
		 // 3) Or Else
		 
		 // EIther it will retrieve Hello World or "Default Value"
		 String defaultValue = opt1.orElse("Default value");
		 System.out.println(defaultValue);
		 
		 String defaultValue2 = opt2.orElse("Default value");
		 System.out.println(defaultValue2);
	 }
}
