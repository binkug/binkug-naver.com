package javaapp0427;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> stack = new Stack<String>();
		
		stack.push("Denni aaa");
		
		//스택에서 데이터를 꺼내기
		String data = stack.pop();
		System.out.println(data);
		
		//스택의 데이터가 없는데 꺼낼려고 해서 예외가 발생
		try {
			data = stack.pop();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		String [] city = new String[] {"seoul"};
		
		for(int i=0;i<city.length;i++) {System.out.println(city);
		}
		
		
	}

}
