package com.ShaswotDhungana.SPEL;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {

	public static void main(String[] args)  {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ShaswotDhungana/SPEL/config.xml");
		
	//	Student obj =  appContext.getBean("student" , Student.class);
		
		Student obj1 =  appContext.getBean("myObjectVariable1" , Student.class);
	
		System.out.println(obj1);
		
	
		// SPEL EXPRESSION PARSER
		
		SpelExpressionParser sep = new SpelExpressionParser();
		Expression expression = sep.parseExpression("45+5");
		try {
			
		System.out.println(expression.getValue());
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
