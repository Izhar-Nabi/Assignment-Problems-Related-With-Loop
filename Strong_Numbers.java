class Strong_Numbers
{
	public static void main(String args[]){
	int num=7;
	long fact=1;
	int sum=0;
	for (int i=num; i>=1; i--){
	fact*=i;
	sum+=i;}
	System.out.println(fact+ " Given Number factorial" );
	if(sum==fact){
	System.out.println("Given number is Strong Number Because its factors and it's factors addition are Equal;"); }
	if(sum!=fact){
	System.out.println("it is not Strong Number");
	} 
	}
}