class Prime_Numbers
{
	public static void main(String args[]){
	for(int i=2; i<=100; i++){
	for(int j=2; j<i; j++){
	if(i%j==0 ){
	System.out.println(i+" is Not a Prime number");
	break;}
	else {
	System.out.println(i);}	
	break;
	}
}
	}
}