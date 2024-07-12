package Question1;

import java.util.Scanner;

class test {
    void print() {
        int num = 1;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    boolean print(int num) {
        int temp = num, sum = 0;
        while( temp != 0 ){
            sum += temp % 10;
            temp /= 10;
        }
        if((Math.pow(sum, 3)) == num) {
            return true;
        }
        return false;
    }
}

public class question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        test t = new test();
        System.out.print("Do you want to print pattern or check for Dudeney number?\nType A for pattern, and B for Dudeney number:");
        char ch = in.next().charAt(0);
        switch (ch) {
            case 'A':
            case 'a':
                t.print();
                break;

            case 'B':
            case 'b':
                System.out.print("Enter the number you wish to check: ");
                int n = in.nextInt();
                if(t.print(n)){
                    System.out.println(n+" is a Dudeney number.");
                } else {
                    System.out.println(n+" is not a Dudeney number.");
                }
                break;

            default:
                System.err.println("Not a valid choice: "+ch);
                System.exit(400);
        }
        in.close();
    }
}
