package interviewpractice;

public class StringToInteger {

	public int convert(String s) {
		char[] charAr = s.trim().toCharArray();
		int sign = 1;
		int i = 0;
		int numb = -1;
		long check = 0;
		int number = 0;
		boolean flag = true;
		if(charAr.length > 0 && charAr[0] == '-') {
			sign = -1;
			i ++;
		}
		
		while(i< charAr.length && flag) {
			numb = isNumeral(charAr[i]) ;
			if(numb != -1) {
				//a number
				check = check * 10 + numb;
				if(check < Integer.MAX_VALUE) {
					number = number * 10 + numb;
				}
				else {
					flag = false;
					check = -1; // -1 means over integer value
				}
			}
			else {
				flag = false;
			}
			i++;
		}
		if(check == -1 ) {
			if(sign == -1)
				return Integer.MIN_VALUE;
			else 
				return Integer.MAX_VALUE;
		}
		return number * sign;
		
	}
	
	public int isNumeral(char c) {
		/*
		char[] numerals = new char[] {'0','1','2','3','4','5','6','7','8','9'};
		for(int i = 0; i<numerals.length;i++) {
			if(c == numerals[i]) {
				return i;
			}
		}
		return -1;
		*/
		if(c >= '0' && c <= '9')
			return c - '0';
		return -1;
	}
}
