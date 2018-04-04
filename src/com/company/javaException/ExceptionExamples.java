package com.company.javaException;

import java.io.IOException;

public class ExceptionExamples {
	public static void main(String[] args) throws IOException {
		try {
			System.out.println("Starting of try");
			throw new MyException("This is an error ");
		} catch (MyException exp) {
			System.out.println("catch block");
			System.out.println(exp);

		}

	}

}
