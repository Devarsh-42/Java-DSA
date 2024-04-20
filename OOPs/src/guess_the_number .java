import java.util.Scanner;
import java.util.Random;
 class game {
        Random ra = new Random();
        int computer =ra.nextInt(101);

        public void num(int number){
            Scanner sc = new Scanner(System.in);
            number=sc.nextInt();
            guess(number);
            sc.close();
        }

        public int guess(int number){
            int i=1;
            int j = i;
            int count=0;
            while(i<=100){
                if (number<computer){
                    System.out.println("You have guessed a smaller number pls guess it big");
                    num(number);
                    j++;
                    count = count + j;
                }
                else if(number>computer){
                    System.out.println("You have guessed a bigger number pls guess it small");
                    num(number);
                    j++;
                    count = count + j;
                }
                else{
                    count = count + j;
                    System.out.print("You have guessed a correct no....."+"You won ");
                    break;
                }
                count = count + j;
                System.out.println("Attempts: "+count);
                break;
            }
            return count;
        }
    }

     class guess_the_number {
        public static void main(String[] args) {
            int number;
            game nu = new game();
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your no. between 1 to 100.....If u guesses it correct you will WIN");
            number=sc.nextInt();
            nu.guess(number);


  }
    }

