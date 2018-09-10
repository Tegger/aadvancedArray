import java.util.Scanner;
import java.util.ArrayList;
import java.security.*;
public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] hotDogStand = new String[6];
        hotDogStand[0] = " ";//blank space
        hotDogStand[1] = "Bun";
        hotDogStand[2] = "Hot Dog";
        hotDogStand[3] = "Mustard";
        hotDogStand[4] = "Relish";
        hotDogStand[5] = "Onion";
        double[] total = {5, 5, 5, 5, 5, 5};

        boolean check = false;
        int userInput = 0;
        int userChange = 0;
        int userEdit = 0;


        //make a never ending loop
        while (!check) {
            System.out.println("Please enter the corresponding number to edit its value: ");
            System.out.println("1: Buns");
            System.out.println("2: Hot Dog");
            System.out.println("3: Mustard");
            System.out.println("4: Relish");
            System.out.println("5: Onion");
            System.out.println("6: See all totals");
            userInput = scanner.nextInt();

            while (userInput == 1) {
                System.out.println("We currently have " + total[userInput] + " " + hotDogStand[userInput] + " remaining.");
                System.out.println(" ");
                System.out.println("Would you like to remove or add to this number?");
                System.out.println("1: Add");
                System.out.println("2: Subtract");
                userChange = scanner.nextInt();

                if (userChange == 1) {
                    System.out.println("How many would you like to add?");
                    userEdit = scanner.nextInt();
                    total[userInput] = total[userInput] + userEdit;
                    userInput = 0;
                } else if (userChange == 2) {
                    System.out.println("How many would you like to add?");
                    userEdit = scanner.nextInt();
                    total[userInput] = total[userInput] - userEdit;

                    if (total[userInput] <= 0) {
                        System.out.println("Sorry, but we can't have fewer than 1 of any product.");
                        total[userInput] = total[userInput] + userEdit;
                    } else {
                        userInput = 0;
                    }

                } else {
                    System.out.println("Sorry, but that is not a viable option...");
                }

            }


            while (userInput == 2) {
                System.out.println("We currently have " + total[userInput] + " " + hotDogStand[userInput] + " remaining.");
                System.out.println(" ");
                System.out.println("Would you like to remove or add to this number?");
                System.out.println("1: Add");
                System.out.println("2: Subtract");
                userChange = scanner.nextInt();

                if (userChange == 1) {
                    System.out.println("How many would you like to add?");
                    userEdit = scanner.nextInt();
                    total[userInput] = total[userInput] + userEdit;
                    userInput = 0;
                } else if (userChange == 2) {
                    System.out.println("How many would you like to add?");
                    userEdit = scanner.nextInt();
                    total[userInput] = total[userInput] - userEdit;

                    if (total[userInput] <= 0) {
                        System.out.println("Sorry, but we can't have fewer than 1 of any product.");
                        total[userInput] = total[userInput] + userEdit;
                    } else {
                        userInput = 0;
                    }

                } else {
                    System.out.println("Sorry, but that is not a viable option...");
                }

            }


            while (userInput == 3) {
                System.out.println("We currently have " + total[userInput] + " " + hotDogStand[userInput] + " remaining.");
                System.out.println(" ");
                System.out.println("Would you like to remove or add to this number?");
                System.out.println("1: Add");
                System.out.println("2: Subtract");
                userChange = scanner.nextInt();

                if (userChange == 1) {
                    System.out.println("How many would you like to add?");
                    userEdit = scanner.nextInt();
                    total[userInput] = total[userInput] + userEdit;
                    userInput = 0;
                } else if (userChange == 2) {
                    System.out.println("How many would you like to add?");
                    userEdit = scanner.nextInt();
                    total[userInput] = total[userInput] - userEdit;

                    if (total[userInput] <= 0) {
                        System.out.println("Sorry, but we can't have fewer than 1 of any product.");
                        total[userInput] = total[userInput] + userEdit;
                    } else {
                        userInput = 0;
                    }

                } else {
                    System.out.println("Sorry, but that is not a viable option...");
                }

            }

            while (userInput == 4) {
                System.out.println("We currently have " + total[userInput] + " " + hotDogStand[userInput] + " remaining.");
                System.out.println(" ");
                System.out.println("Would you like to remove or add to this number?");
                System.out.println("1: Add");
                System.out.println("2: Subtract");
                userChange = scanner.nextInt();

                if (userChange == 1) {
                    System.out.println("How many would you like to add?");
                    userEdit = scanner.nextInt();
                    total[userInput] = total[userInput] + userEdit;
                    userInput = 0;
                } else if (userChange == 2) {
                    System.out.println("How many would you like to add?");
                    userEdit = scanner.nextInt();
                    total[userInput] = total[userInput] - userEdit;

                    if (total[userInput] <= 0) {
                        System.out.println("Sorry, but we can't have fewer than 1 of any product.");
                        total[userInput] = total[userInput] + userEdit;
                    } else {
                        userInput = 0;
                    }

                } else {
                    System.out.println("Sorry, but that is not a viable option...");
                }


            }


            while (userInput == 5) {
                System.out.println("We currently have " + total[userInput] + " " + hotDogStand[userInput] + " remaining.");
                System.out.println(" ");
                System.out.println("Would you like to remove or add to this number?");
                System.out.println("1: Add");
                System.out.println("2: Subtract");
                userChange = scanner.nextInt();

                if (userChange == 1) {
                    System.out.println("How many would you like to add?");
                    userEdit = scanner.nextInt();
                    total[userInput] = total[userInput] + userEdit;
                    userInput = 0;
                } else if (userChange == 2) {
                    System.out.println("How many would you like to add?");
                    userEdit = scanner.nextInt();
                    total[userInput] = total[userInput] - userEdit;

                    if (total[userInput] <= 0) {
                        System.out.println("Sorry, but we can't have fewer than 1 of any product.");
                        total[userInput] = total[userInput] + userEdit;
                    } else {
                        userInput = 0;
                    }

                } else {
                    System.out.println("Sorry, but that is not a viable option...");
                }
            }


            if (userInput == 6) {
                for (int i = 1; i <= 5; i++)
                System.out.println("We currently have " + total[i] + " " + hotDogStand[i] + " remaining.");
                userInput = 0;

            }

            else{
                System.out.println("Sorry, but that is not a viable option...");
                userInput = 0;
            }
        }
    }
}