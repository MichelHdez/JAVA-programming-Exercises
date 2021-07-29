class NumeroPrimo{
	public static void main(String a[]){
	int num;
	boolean isprime=true;
	num=5;
	for(int i=2;i<num/2;i++){
		if((num%i)==0){
		isprime=false;
		break;
	}
}
if(isprime) System.out.println("primo");
else System.out.println("No primo");
}
}