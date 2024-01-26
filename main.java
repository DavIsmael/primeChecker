import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose number to verify if it's prime or not ");
        int number = scanner.nextInt();
        boolean isPrime;
        //1, 2, and 3 - 1 is not prime, but 2 and 3 are!
        //If number equals 2 or greater than 2, then it sets it to prime.
        if(number < 2) isPrime = false;
        else isPrime = true;
        //Checks up to square root of 'number' to optimize for loop by reducing the number of iterations
        for(int i = 2; i <= number / i; ++i){
            //Division remainder has to be 0 to be a composite number, if not, it's prime
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The number " + number + " is prime!");
        }else if(number == 0){
            System.out.println(number + " has infinite factors, but isnt a prime nor a composite number because it is not a natural number, it's just unique!");
        }else if(number == 1){
            System.out.println(number + " isnt prime nor is it a composite number because it only has 1 factor!");
        }else if(number < 0){
            System.out.println(number + " is a negative number and therefore it can't be a prime nor a composite number because it isn't a natural number!");
        }else{
            System.out.println("The number " + number + " isnt prime, therefore it's a composite number!");
        }
    }
}
