class Fabonic_Series
{
	public static void main(String ags[]){
	System.out.println("Starting Numbers are 0 and 1");
	int oldnum=0;
	int Newnum=1;
	int Nextnum=oldnum+Newnum;
	for(int i=0; i<=10; i++){
	Nextnum=oldnum+Newnum;
	oldnum=Newnum;
	Newnum=Nextnum;
	System.out.println(Nextnum);
		}
	}
}