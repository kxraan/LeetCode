class Solution {
	public static String decodeString(String s) {

  		Stack<String> stack = new Stack<>();
		String ans = "";
		String elements = "";
		String num = "";
		StringBuffer s2 = new StringBuffer(s);

		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);

			if (Character.isDigit(ch)) { 
				num += ch;
			} else {
				if (!num.isBlank())
					stack.push(num);

				num = "";
				stack.push(Character.toString(ch));

				if (ch == ']') {
					
					ans+=process(stack,elements, s2, i);
					elements="";

				} else if (i == s2.length() - 1) {
					while (!stack.isEmpty()) {
						elements += stack.pop();
					}
					StringBuffer temp = new StringBuffer(elements);
					elements = temp.reverse().toString();
					ans += elements;
					elements = "";

				}else if(!stack.contains("[")&&!stack.contains("]")) {
					ans+=stack.pop();
				}
			

			}

		}
	
		return ans;

	}
	
	public static String process( Stack<String> stack, String elements, StringBuffer s, int j){
		String ans="";
		stack.pop();
		if(!stack.isEmpty()) {
		while (!stack.peek().equals("[")) {
			elements += stack.pop();
		}
		stack.pop(); 
				
		StringBuffer temp = new StringBuffer(elements);
		elements = temp.reverse().toString();
		
		if(stack.contains("[")) {
			elements = elements.repeat(Integer.parseInt(stack.pop()));
			for(int i=0; i<elements.length();i++) {
				stack.push(Character.toString(elements.charAt(i)));
				
			}
			String s1="";
			
					if(s.charAt(j+1)==(']')) {
						s1=Character.toString(s.charAt(j+1));
						s.deleteCharAt(j+1);
					}else {
						s1= s.substring(j+1, s.indexOf("]",j+2));
					
						s.delete(j+1, s.indexOf("]",j+2)+1);

					}
					
				
			String num="";
			for(int i=0; i<s1.length(); i++) {
				char ch=s1.charAt(i);
				
				if (Character.isDigit(ch)) { 
				num += ch;
			}else {
				
			
				if (!num.isBlank())
					stack.push(num);

				num = "";
				stack.push(Character.toString(ch));
			}
			}
			
			if(!stack.peek().equals("]")){
				stack.push("]");
			}
			
			elements="";
			return process(stack,elements,s , j);
		}else {
		
		ans= elements.repeat(Integer.parseInt(stack.peek()) == 0 ? 1 : Integer.parseInt(stack.pop()));
		elements = "";
		return ans;
		}
	}else{
	return"";	
	}
	}}
