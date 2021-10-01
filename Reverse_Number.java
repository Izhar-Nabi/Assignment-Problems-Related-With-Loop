class Reverse_Number
{
	public static void main(String args[]){
	int num1=123;
	int reverse=0;
	for(; num1!=0; num1=num1/10){
	int remainder = num1 % 10;
	reverse = reverse*10 + remainder;}
	System.out.println("The reverse of given number is :" +reverse);
	}

}