package Tugas_P12;

public class ParsePost {
	private MyStack stack;
	
	public ParsePost() {
		stack = new MyStack(20); //kapasitas stack
	}
	
	  public int doParse(String input) {
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (Character.isDigit(ch)) {
	                stack.push(Character.getNumericValue(ch));
	            } else {
	                int b = stack.pop();
	                int a = stack.pop();
	                int result = switch (ch) {
	                    case '+' -> a + b;
	                    case '-' -> a - b;
	                    case '*' -> a * b;
	                    case '/' -> a / b;
	                    default -> throw new IllegalArgumentException("Operator tidak dikenali: " + ch);
	                };
	                stack.push(result);
	            }
	        }
	        return stack.pop();
	    }
	}
