class Prime_Number2
{
	public static void main(String args[]){
	int n,i,count=0;
	n=100;
	for(i=2; i<=n; i++){
	if(n%i==0){
	System.out.println("Not a Prime Number");
	break;}
	else if(count==2){
	System.out.println("it is a Prime number"+n);}
	}
	}
}