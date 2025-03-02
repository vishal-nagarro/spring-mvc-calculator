package springmvc.service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {
	
//	Functions defined as services
	
	public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}

// Test code to generate a bug (work-item) on build failure when the azure pipeline runs
Test code to generate a build error (Github Actions) which leads to send an email notification
