
public class fizzbuzz {

    
    public static void main(String[] args) {
        for (int i = 1; i <= 35; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz --> " + i);
            } else {
                if(i % 3 == 0){
                    System.out.println("Fizz --> " + i);
                } else {
                    if(i % 5 == 0){
                        System.out.println("Buzz --> " + i);
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
