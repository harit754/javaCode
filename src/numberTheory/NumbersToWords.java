package numberTheory;

import java.util.Scanner;

public class NumbersToWords {
	
	
	public static String ones(char c){
		switch(c){
		case '1':return "One";
		case '2':return "Two";
		case '3':return "Three";
		case '4':return "Four";
		case '5':return "Five";
		case '6':return "Six";
		case '7':return "Seven";
		case '8':return "Eight";
		case '9':return "Nine";
		
		default:return "";
		
		}
			
	}
	public static String tens(String s){
		switch(s){
		case "10":return "Ten";
		case "11":return "Eleven";
		case "12":return "Twelve";
		case "13":return "Thirteen";
		case "14":return "Fourteen";
		case "15":return "Fifteen";
		case "16":return "Sixteen";
		case "17":return "Seventeen";
		case "18":return "Eighteen";
		case "19":return "Nineteen";
		default:return "";
		
		}
			
	}
	
	public static String tens(char c){
		switch(c){
		case '1':return "One";
		case '2':return "Two";
		case '3':return "Three";
		case '4':return "Four";
		case '5':return "Five";
		case '6':return "Six";
		case '7':return "Seven";
		case '8':return "Eight";
		case '9':return "Nine";
		default:return "";
		
		}
			
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int l=str.length();
	}

}
