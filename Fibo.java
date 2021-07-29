class Fibo{
public static void main(String[] args){
    int n = 0;
    int f = fibonacci(n); 
 
	for(n=0; n<=10; n++){
	f = fibonacci(n); 
	System.out.println("t"+f);
    } 
}
 
public static int fibonacci(int n){
    if ( n == 0 ){
    return 0;
} 
    else if ( n == 1){ 
    return 1;
}
    else{
    return fibonacci(n - 1) + fibonacci(n - 2);
            }
    }
}