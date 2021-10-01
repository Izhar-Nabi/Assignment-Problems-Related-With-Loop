class Without_Multiplicatiion
{
	public static void main(String args[]){
	int x=10;
	int y=5;
	if(x==0 || y==0){
	System.out.println("Ans is 0");
	int multiplication=(x*y);
	System.out.println(multiplication);}
	if(x>y){
	for(int i=1; i<=x; i++){
	int add=y;
	int sum+=add;
	System.out.println("ans is "+add);}
	System.out.println(sum);
	}
	else if(y>x){
	for(int k=1; k<=y; k++){
	int add2=x;
	int sum2+=add2;
	System.out.println("Ans is "+add2);
	System.out.println("Ans is "+sum2);}
	}
}
}