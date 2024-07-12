package Question1;

import java.util.Scanner;

class My_Rating {
    String P_Name, Quality;
    int Star1, Star2, Star3, Star4, Star5;
    float Average_Rating;
    My_Rating(String name) {
        Star1 = 0;
        Star2 = 0;
        Star3 = 0;
        Star4 = 0;
        Star5 = 0;
        P_Name = name;
        Quality = null;
        Average_Rating = 0.0f;
    }
    void Find_Rating() {
        Scanner in = new Scanner(System.in);
        System.out.print("How many people gave 1 star: ");
        Star1 = in.nextInt();
        System.out.print("How many people gave 2 stars: ");
        Star2 = in.nextInt();
        System.out.print("How many people gave 3 stars: ");
        Star3 = in.nextInt();
        System.out.print("How many people gave 4 stars: ");
        Star4 = in.nextInt();
        System.out.print("How many people gave 5 stars: ");
        Star5 = in.nextInt();
        Average_Rating = ((1.0f * Star1) + (2.0f * Star2) + (3.0f * Star3) + (4.0f * Star4) + (5.0f * Star5)) /
                (Star1 + Star2 + Star3 + Star4 + Star5);
        if(Average_Rating >= 1.00 && Average_Rating <= 1.79) {
            Quality = "Fair";
        } else if (Average_Rating >= 1.80 && Average_Rating <= 2.59) {
            Quality = "Good";
        } else if (Average_Rating >= 2.60 && Average_Rating <= 3.39) {
            Quality = "Very Good";
        } else if (Average_Rating >= 3.40 && Average_Rating <= 4.19) {
            Quality = "Excellent";
        } else if (Average_Rating >= 4.20 && Average_Rating <= 5.00) {
            Quality = "Exceptional";
        } else {
            System.err.println("Invalid Rating: "+Average_Rating);
            System.exit(400);
        }
        System.out.println("The product name: "+P_Name);
        System.out.println("The average rating: "+Average_Rating);
        System.out.println("The quality: "+Quality);
    }
}


public class question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.print("Enter the product name: ");
        name = in.nextLine();
        My_Rating rating = new My_Rating(name);
        rating.Find_Rating();
    }
}
