class Without_Multiplication
{
	public static void main(String args[]){
	int x=10;
	int y=5;
	int sum=0;
	int multiplication=(x*y);
	System.out.println("Multiplication ans is " +multiplication);
	if(x>y){
	for(int i=1; i<=x; i++){
	int add=y;
	sum+=add;
	//System.out.println(sum);
	}
	System.out.println(sum);
	}
	else if(y>x){
	for(int k=1; k<=y; k++){
	int add2=x;
	sum+=add2;
	//System.out.println(sum);
	}
	System.out.println(sum);
	}
}
}