/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Random;
import java.util.Scanner;//allows us to get input from the user.

/**
 * Name: Nickolas Grammatico
 * Date: 04/17/19
 * Teacher: Mrs. Greenwood
 * Course Code: ICS3U
 * Description: This application involves the user playing a game of battleship with the computer.

 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//Lets create a scanner to get input from the user        
        Scanner keyboard = new Scanner(System.in);

//Create a variable that will allow the game to be repeated.
        int playAgain = 1;
        String userGuess;

        while (playAgain == 1) {

//Welcome the user
            System.out.println("About Screen\n"
                    + "Creator: Nickolas Grammatico\n"
                    + "Date Created: 06/06/19\n"
                    + "Teacher: Mrs. Greenwood\n"
                    + "Course Code: ICS3U\n"
                    + "Description: In this game, you will be playing battleship against the computer.  \n"
                    + "Enter 1 if you would like to view further instructions.  Enter 2 if you would like to play:");
            int decisionOne = keyboard.nextInt();

//If they select 1, show them further instructions
            if (decisionOne == 1) {
                System.out.println("\nInstructions:\n"
                        + "The object of Battleship is to try and sink all of the other player's before th"
                        + "ey sink all of your ships. \nAll of the other player's ships are somewhere on"
                        + " his/her board.  \nYou try and hit them by entering the coordinates of one of"
                        + " the squares on the board.  \nThe computer also guesses coordinates that coul"
                        + "d be on your board.  \nNeither you nor the computer can see each other's boar"
                        + "d so you must try to guess where they are.  \nThe result of your guess will b"
                        + "e displayed to you.  \nEverytime before you make your guess the following vis"
                        + "uals will be displayed to you:\n"
                        + "\n"
                        + "         Your Board\n"
                        + "    A B C D E F G H I\n"
                        + " 1| * * * * * * * * *\n"
                        + " 2| * * * * * * * * *\n"
                        + " 3| * * 5 5 5 5 5 * *\n"
                        + " 4| * * * * * * * * *\n"
                        + " 5| * * * * * * * * 3\n"
                        + " 6| 4 4 4 4 * * * * 3\n"
                        + " 7| * * * * * * * * 3\n"
                        + " 8| * * * 2 * * * * *\n"
                        + " 9| * * * 2 * * * * *\n"
                        + "\n"
                        + "      \n"
                        + "\n"
                        + "     Computers Board\n"
                        + "    A B C D E F G H I\n"
                        + " 1| * * * * * * * * *\n"
                        + " 2| * * * * * * * * *\n"
                        + " 3| * * * * * * * * *\n"
                        + " 4| * * * * * * * * *\n"
                        + " 5| * * * * * * * * *\n"
                        + " 6| * * * * * * * * *\n"
                        + " 7| * * * * * * * * *\n"
                        + " 8| * * * * * * * * *\n"
                        + " 9| * * * * * * * * *\n"
                        + "\n"
                        + "Everytime you achieve a hit on the computers board, the “*” will turn into an"
                        + " X at that spot.\nEverytime you miss, the computer board will switch the “*” "
                        + "to an O.  \nEverytime the computer gets a hit, your board will replace the numb"
                        + "er associated with that ship with an X.  \nEverytime the computer misses, it wi"
                        + "ll turn that corresponding ‘*’ into an O.  \n");
            }

//We will start by allowing the user to input where they wish to place their ships
            System.out.println("You will start by inputting where you would like your"
                    + " \nships of length 2,3,4 and 5 to be placed on your board.\n");

            System.out.println("Please enter 5 coordinates that are either vertical or horiz"
                    + "ontal with one another.\nand are within the parameters of the"
                    + " board(A-I and 1-9)\nEx:A1A2A3A4A5, A1B1C1D1E1, etc.");
//First scanner is to allow the second scanner to work as the program skips the first scanner for an unknown reason.        
            String decoy = keyboard.nextLine();
            String fiveShip = keyboard.nextLine();
            System.out.println("\nPlease enter another 4 coordinates that are either"
                    + " vertical or horizontal with one another\nthat are within the"
                    + " parameters of the board and have not been entered already.");
            String fourShip = keyboard.nextLine();
            System.out.println("\nPlease enter another 3 coordinates that are either"
                    + " vertical or horizontal with one another\nthat are within the"
                    + " parameters of the board and have not been entered already.");
            String threeShip = keyboard.nextLine();
            System.out.println("\nPlease enter the final 2 coordinates that are either"
                    + " vertical or horizontal with one another\nthat are within the"
                    + " parameters of the board and have not been entered already.");
            String twoShip = keyboard.nextLine();

//Create a series of for loops that will create arrays for the numerical value of each point for each ship.
            int fiveBoatValues[];
            fiveBoatValues = new int[5];
            int lowEnd = 0;
            int highEnd = 2;
            int counter = 0;
            String point;
            for (int i = 0; i < 5; i++) {
                point = fiveShip.substring(lowEnd, highEnd);
                char letter = point.charAt(0);
                char number = point.charAt(1);
                if (letter == 'A') {
                    counter += 0;
                }
                if (letter == 'B') {
                    counter += 1;
                }
                if (letter == 'C') {
                    counter += 2;
                }
                if (letter == 'D') {
                    counter += 3;
                }
                if (letter == 'E') {
                    counter += 4;
                }
                if (letter == 'F') {
                    counter += 5;
                }
                if (letter == 'G') {
                    counter += 6;
                }
                if (letter == 'H') {
                    counter += 7;
                }
                if (letter == 'I') {
                    counter += 8;
                }
                if (number == '1') {
                    counter += 0;
                }
                if (number == '2') {
                    counter += 9;
                }
                if (number == '3') {
                    counter += 18;
                }
                if (number == '4') {
                    counter += 27;
                }
                if (number == '5') {
                    counter += 36;
                }
                if (number == '6') {
                    counter += 45;
                }
                if (number == '7') {
                    counter += 54;
                }
                if (number == '8') {
                    counter += 63;
                }
                if (number == '9') {
                    counter += 72;
                }
                fiveBoatValues[i] = counter;
                lowEnd += 2;
                highEnd += 2;
                counter = 0;
            }
            int fourBoatValues[];
            fourBoatValues = new int[4];
            lowEnd = 0;
            highEnd = 2;
            for (int i = 0; i < 4; i++) {
                point = fourShip.substring(lowEnd, highEnd);
                char letter = point.charAt(0);
                char number = point.charAt(1);
                if (letter == 'A') {
                    counter += 0;
                }
                if (letter == 'B') {
                    counter += 1;
                }
                if (letter == 'C') {
                    counter += 2;
                }
                if (letter == 'D') {
                    counter += 3;
                }
                if (letter == 'E') {
                    counter += 4;
                }
                if (letter == 'F') {
                    counter += 5;
                }
                if (letter == 'G') {
                    counter += 6;
                }
                if (letter == 'H') {
                    counter += 7;
                }
                if (letter == 'I') {
                    counter += 8;
                }
                if (number == '1') {
                    counter += 0;
                }
                if (number == '2') {
                    counter += 9;
                }
                if (number == '3') {
                    counter += 18;
                }
                if (number == '4') {
                    counter += 27;
                }
                if (number == '5') {
                    counter += 36;
                }
                if (number == '6') {
                    counter += 45;
                }
                if (number == '7') {
                    counter += 54;
                }
                if (number == '8') {
                    counter += 63;
                }
                if (number == '9') {
                    counter += 72;
                }
                fourBoatValues[i] = counter;
                lowEnd += 2;
                highEnd += 2;
                counter = 0;
            }
            int threeBoatValues[];
            threeBoatValues = new int[3];
            lowEnd = 0;
            highEnd = 2;
            for (int i = 0; i < 3; i++) {
                point = threeShip.substring(lowEnd, highEnd);
                char letter = point.charAt(0);
                char number = point.charAt(1);
                if (letter == 'A') {
                    counter += 0;
                }
                if (letter == 'B') {
                    counter += 1;
                }
                if (letter == 'C') {
                    counter += 2;
                }
                if (letter == 'D') {
                    counter += 3;
                }
                if (letter == 'E') {
                    counter += 4;
                }
                if (letter == 'F') {
                    counter += 5;
                }
                if (letter == 'G') {
                    counter += 6;
                }
                if (letter == 'H') {
                    counter += 7;
                }
                if (letter == 'I') {
                    counter += 8;
                }
                if (number == '1') {
                    counter += 0;
                }
                if (number == '2') {
                    counter += 9;
                }
                if (number == '3') {
                    counter += 18;
                }
                if (number == '4') {
                    counter += 27;
                }
                if (number == '5') {
                    counter += 36;
                }
                if (number == '6') {
                    counter += 45;
                }
                if (number == '7') {
                    counter += 54;
                }
                if (number == '8') {
                    counter += 63;
                }
                if (number == '9') {
                    counter += 72;
                }
                threeBoatValues[i] = counter;
                lowEnd += 2;
                highEnd += 2;
                counter = 0;
            }
            int twoBoatValues[];
            twoBoatValues = new int[2];
            lowEnd = 0;
            highEnd = 2;
            for (int i = 0; i < 2; i++) {
                point = twoShip.substring(lowEnd, highEnd);
                char letter = point.charAt(0);
                char number = point.charAt(1);
                if (letter == 'A') {
                    counter += 0;
                }
                if (letter == 'B') {
                    counter += 1;
                }
                if (letter == 'C') {
                    counter += 2;
                }
                if (letter == 'D') {
                    counter += 3;
                }
                if (letter == 'E') {
                    counter += 4;
                }
                if (letter == 'F') {
                    counter += 5;
                }
                if (letter == 'G') {
                    counter += 6;
                }
                if (letter == 'H') {
                    counter += 7;
                }
                if (letter == 'I') {
                    counter += 8;
                }
                if (number == '1') {
                    counter += 0;
                }
                if (number == '2') {
                    counter += 9;
                }
                if (number == '3') {
                    counter += 18;
                }
                if (number == '4') {
                    counter += 27;
                }
                if (number == '5') {
                    counter += 36;
                }
                if (number == '6') {
                    counter += 45;
                }
                if (number == '7') {
                    counter += 54;
                }
                if (number == '8') {
                    counter += 63;
                }
                if (number == '9') {
                    counter += 72;
                }
                twoBoatValues[i] = counter;
                lowEnd += 2;
                highEnd += 2;
                counter = 0;
            }

//Create the array that will allow the user to see the final position of his/her ships on their board.
            char userBoard[] = new char[81];

            for (int i = 0; i < 81; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == fiveBoatValues[j]) {
                        userBoard[i] = '5';
                        counter++;
                    }
                }
                for (int k = 0; k < 4; k++) {
                    if (i == fourBoatValues[k]) {
                        userBoard[i] = '4';
                        counter++;
                    }
                }
                for (int h = 0; h < 3; h++) {
                    if (i == threeBoatValues[h]) {
                        userBoard[i] = '3';
                        counter++;
                    }
                }
                for (int m = 0; m < 2; m++) {
                    if (i == twoBoatValues[m]) {
                        userBoard[i] = '2';
                        counter++;
                    }
                }
                if (counter == 0) {
                    userBoard[i] = '*';
                }
                counter = 0;
            }

//Print out the initial board for the user to see
            System.out.println("Given the points you have entered, this is your board.\n");
            System.out.println("\n*| A B C D E F G H I");
            for (int i = 0; i <= 80; i++) {
                if (i % 9 == 0) {
                    if (i != 0) {
                        System.out.println();
                    }
                    counter++;
                    System.out.print(counter + "|");
                }
                System.out.print(" " + userBoard[i]);
            }

//Lets create the generator we will be using.
            Random positionGenerator = new Random();

//Start of random ship placement.        
            int goodOrBad = 1;//will hold a certain value if the random values of the ships must be redetermined due to duplicates

//Declare the arrays
            int compFiveBoat[];
            compFiveBoat = new int[5];
            int compFourBoat[];
            compFourBoat = new int[4];
            int compThreeBoat[];
            compThreeBoat = new int[3];
            int compTwoBoat[];
            compTwoBoat = new int[2];

            while (goodOrBad == 1) {
//Lets determine a random position for the computers 5 ship.        
//Determine a numeric value for the starting point of the 5 ship        
                int fiveStartPoint = positionGenerator.nextInt(81);

//Determine whether that ship will be vertically placed or horizontally placed.
                int vertOrHoriz = positionGenerator.nextInt(2);

//Create if structure that will help determine where the remaining 4 points of that ship will be placed.
//Let 0 represent horizontal, let 1 represent vertical
//Create an array to hold the points for the five ship.
                compFiveBoat[0] = fiveStartPoint;
                counter = fiveStartPoint;

                if (vertOrHoriz == 0) {
                    if ((fiveStartPoint + 9) % 9 < 4) {
                        for (int i = 1; i < 5; i++) {
                            counter++;
                            compFiveBoat[i] = counter;
                        }
                    } else if ((fiveStartPoint + 9) % 9 > 4) {
                        for (int j = 1; j < 5; j++) {
                            counter--;
                            compFiveBoat[j] = counter;
                        }
                    } else {
                        int leftOrRight = positionGenerator.nextInt(2);
//Let 0 mean that the ship will face left, let 1 mean the ship will face right.
                        if (leftOrRight == 0) {
                            for (int k = 1; k < 5; k++) {
                                counter--;
                                compFiveBoat[k] = counter;
                            }
                        } else {
                            for (int i = 1; i < 5; i++) {
                                counter++;
                                compFiveBoat[i] = counter;
                            }
                        }
                    }
                }

                if (vertOrHoriz == 1) {
                    if (fiveStartPoint <= 35) {
                        for (int i = 1; i < 5; i++) {
                            counter += 9;
                            compFiveBoat[i] = counter;
                        }
                    } else if (fiveStartPoint >= 45) {
                        for (int j = 1; j < 5; j++) {
                            counter -= 9;
                            compFiveBoat[j] = counter;
                        }
                    } else {
                        int leftOrRight = positionGenerator.nextInt(2);
//Let 0 mean that the ship will face down, let 1 mean the ship will face up.
                        if (leftOrRight == 0) {
                            for (int k = 1; k < 5; k++) {
                                counter -= 9;
                                compFiveBoat[k] = counter;
                            }
                        } else {
                            for (int i = 1; i < 5; i++) {
                                counter += 9;
                                compFiveBoat[i] = counter;
                            }
                        }
                    }
                }

//Lets now randomly determine where the computers 4 ship will be placed.        
//Determine a numeric value for the starting point of the 4 ship        
                int fourStartPoint = positionGenerator.nextInt(81);

//Determine whether that ship will be vertically placed or horizontally placed.
                vertOrHoriz = positionGenerator.nextInt(2);

//Create if structure that will help determine where the remaining 3 points of that ship will be placed.
//Let 0 represent horizontal, let 1 represent vertical
//Create an array to hold the points for the four ship.
                compFourBoat[0] = fourStartPoint;
                counter = fourStartPoint;

                if (vertOrHoriz == 0) {
                    if ((fourStartPoint + 9) % 9 < 3) {
                        for (int i = 1; i < 4; i++) {
                            counter++;
                            compFourBoat[i] = counter;
                        }
                    } else if ((fourStartPoint + 9) % 9 > 5) {
                        for (int j = 1; j < 4; j++) {
                            counter--;
                            compFourBoat[j] = counter;
                        }
                    } else {
                        int leftOrRight = positionGenerator.nextInt(2);
//Let 0 mean that the ship will face left, let 1 mean the ship will face right.
                        if (leftOrRight == 0) {
                            for (int k = 1; k < 4; k++) {
                                counter--;
                                compFourBoat[k] = counter;
                            }
                        } else {
                            for (int i = 1; i < 4; i++) {
                                counter++;
                                compFourBoat[i] = counter;
                            }
                        }
                    }
                }

                if (vertOrHoriz == 1) {
                    if (fourStartPoint <= 26) {
                        for (int i = 1; i < 4; i++) {
                            counter += 9;
                            compFourBoat[i] = counter;
                        }
                    } else if (fourStartPoint >= 54) {
                        for (int j = 1; j < 4; j++) {
                            counter -= 9;
                            compFourBoat[j] = counter;
                        }
                    } else {
                        int leftOrRight = positionGenerator.nextInt(2);
//Let 0 mean that the ship will face down, let 1 mean the ship will face up.
                        if (leftOrRight == 0) {
                            for (int k = 1; k < 4; k++) {
                                counter -= 9;
                                compFourBoat[k] = counter;
                            }
                        } else {
                            for (int i = 1; i < 4; i++) {
                                counter += 9;
                                compFourBoat[i] = counter;
                            }
                        }
                    }
                }

//Lets now randomly determine where the computers 3 ship will be placed.        
//Determine a numeric value for the starting point of the 3 ship        
                int threeStartPoint = positionGenerator.nextInt(81);

//Determine whether that ship will be vertically placed or horizontally placed.
                vertOrHoriz = positionGenerator.nextInt(2);

//Create if structure that will help determine where the remaining 3 points of that ship will be placed.
//Let 0 represent horizontal, let 1 represent vertical
//Create an array to hold the points for the four ship.
                compThreeBoat[0] = threeStartPoint;
                counter = threeStartPoint;

                if (vertOrHoriz == 0) {
                    if ((threeStartPoint + 9) % 9 < 2) {
                        for (int i = 1; i < 3; i++) {
                            counter++;
                            compThreeBoat[i] = counter;
                        }
                    } else if ((threeStartPoint + 9) % 9 > 6) {
                        for (int j = 1; j < 3; j++) {
                            counter--;
                            compThreeBoat[j] = counter;
                        }
                    } else {
                        int leftOrRight = positionGenerator.nextInt(2);
//Let 0 mean that the ship will face left, let 1 mean the ship will face right.
                        if (leftOrRight == 0) {
                            for (int k = 1; k < 3; k++) {
                                counter--;
                                compThreeBoat[k] = counter;
                            }
                        } else {
                            for (int i = 1; i < 3; i++) {
                                counter++;
                                compThreeBoat[i] = counter;
                            }
                        }
                    }
                }

                if (vertOrHoriz == 1) {
                    if (threeStartPoint <= 17) {
                        for (int i = 1; i < 3; i++) {
                            counter += 9;
                            compThreeBoat[i] = counter;
                        }
                    } else if (threeStartPoint >= 63) {
                        for (int j = 1; j < 3; j++) {
                            counter -= 9;
                            compThreeBoat[j] = counter;
                        }
                    } else {
                        int leftOrRight = positionGenerator.nextInt(2);
//Let 0 mean that the ship will face down, let 1 mean the ship will face up.
                        if (leftOrRight == 0) {
                            for (int k = 1; k < 3; k++) {
                                counter -= 9;
                                compThreeBoat[k] = counter;
                            }
                        } else {
                            for (int i = 1; i < 3; i++) {
                                counter += 9;
                                compThreeBoat[i] = counter;
                            }
                        }
                    }
                }

//Lets now randomly determine where the computers 3 ship will be placed.        
//Determine a numeric value for the starting point of the 3 ship        
                int twoStartPoint = positionGenerator.nextInt(81);

//Determine whether that ship will be vertically placed or horizontally placed.
                vertOrHoriz = positionGenerator.nextInt(2);

//Create if structure that will help determine where the remaining 3 points of that ship will be placed.
//Let 0 represent horizontal, let 1 represent vertical
//Create an array to hold the points for the four ship.
                compTwoBoat[0] = twoStartPoint;
                counter = twoStartPoint;

                if (vertOrHoriz == 0) {
                    if ((twoStartPoint + 9) % 9 < 1) {
                        for (int i = 1; i < 2; i++) {
                            counter++;
                            compTwoBoat[i] = counter;
                        }
                    } else if ((twoStartPoint + 9) % 9 > 7) {
                        for (int j = 1; j < 2; j++) {
                            counter--;
                            compTwoBoat[j] = counter;
                        }
                    } else {
                        int leftOrRight = positionGenerator.nextInt(2);
//Let 0 mean that the ship will face left, let 1 mean the ship will face right.
                        if (leftOrRight == 0) {
                            for (int k = 1; k < 2; k++) {
                                counter--;
                                compTwoBoat[k] = counter;
                            }
                        } else {
                            for (int i = 1; i < 2; i++) {
                                counter++;
                                compTwoBoat[i] = counter;
                            }
                        }
                    }
                }

                if (vertOrHoriz == 1) {
                    if (twoStartPoint <= 8) {
                        for (int i = 1; i < 2; i++) {
                            counter += 9;
                            compTwoBoat[i] = counter;
                        }
                    } else if (twoStartPoint >= 72) {
                        for (int j = 1; j < 2; j++) {
                            counter -= 9;
                            compTwoBoat[j] = counter;
                        }
                    } else {
                        int leftOrRight = positionGenerator.nextInt(2);
//Let 0 mean that the ship will face down, let 1 mean the ship will face up.
                        if (leftOrRight == 0) {
                            for (int k = 1; k < 2; k++) {
                                counter -= 9;
                                compTwoBoat[k] = counter;
                            }
                        } else {
                            for (int i = 1; i < 2; i++) {
                                counter += 9;
                                compTwoBoat[i] = counter;
                            }
                        }
                    }
                }

//Create an array that contains all the index points of the ship.
                int allBoats[];
                allBoats = new int[14];

                for (int i = 0; i <= 4; i++) {
                    allBoats[i] = compFiveBoat[i];
                }
                for (int i = 5; i <= 8; i++) {
                    allBoats[i] = compFourBoat[i - 5];
                }
                for (int i = 9; i <= 11; i++) {
                    allBoats[i] = compThreeBoat[i - 9];
                }
                for (int i = 12; i <= 13; i++) {
                    allBoats[i] = compTwoBoat[i - 12];
                }

//Create a for loop that will be used to ensure there are no duplicates of any number.
                counter = 0;
                for (int i = 0; i < 14; i++) {
                    for (int j = 0; j < 14; j++) {
                        if (allBoats[i] == allBoats[j]) {
                            counter++;
                        }
                    }
                }
//This if statement will determine if the locations of the ships must be redetermined.
                if (counter > 14) {
                    goodOrBad = 1;
                } else {
                    goodOrBad = 0;
                }
            }

//Create the array that the user will see that represents the computers board from their perspective.
            char compBoardToUser[];
            compBoardToUser = new char[81];

            for (int i = 0; i < 81; i++) {
                compBoardToUser[i] = '*';
            }
            counter = 0;

//Create an array that will represent the computers array that the program will use to reference to determine if the user gets a hit or a miss.
            char computerBoard[] = new char[81];

            for (int i = 0; i < 81; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == compFiveBoat[j]) {
                        computerBoard[i] = '5';
                        counter++;
                    }
                }
                for (int k = 0; k < 4; k++) {
                    if (i == compFourBoat[k]) {
                        computerBoard[i] = '4';
                        counter++;
                    }
                }
                for (int h = 0; h < 3; h++) {
                    if (i == compThreeBoat[h]) {
                        computerBoard[i] = '3';
                        counter++;
                    }
                }
                for (int m = 0; m < 2; m++) {
                    if (i == compTwoBoat[m]) {
                        computerBoard[i] = '2';
                        counter++;
                    }
                }
                if (counter == 0) {
                    computerBoard[i] = '*';
                }
                counter = 0;
            }

//Lets create a set of variables that will help ensure that when the user or computer sinks a ship, they will not recieve the message more then once.
            int fiveMessageCount = 0;//Leave out of gameplay loop
            int fourMessageCount = 0;
            int threeMessageCount = 0;
            int twoMessageCount = 0;
            int fiveMessageCount2 = 0;
            int fourMessageCount2 = 0;
            int threeMessageCount2 = 0;
            int twoMessageCount2 = 0;
//Create a variable that will allow the guessing cycle to continue.
            int guessAgain = 1;

//Now we can start gameplay
            System.out.println("\n\nNow that you have created your board and the computer has done the same, we can now start the gameplay.\n");

            while (guessAgain == 1) {
                counter = 0;
                System.out.println("\n  ~~~Your Board~~~\n*| A B C D E F G H I");
                for (int i = 0; i <= 80; i++) {
                    if (i % 9 == 0) {
                        if (i != 0) {
                            System.out.println();
                        }
                        counter++;
                        System.out.print(counter + "|");
                    }
                    System.out.print(" " + userBoard[i]);
                }
                counter = 0;
                System.out.println("\n\n~~~Computer's Board~~~\n*| A B C D E F G H I");
                for (int i = 0; i <= 80; i++) {
                    if (i % 9 == 0) {
                        if (i != 0) {
                            System.out.println();
                        }
                        counter++;
                        System.out.print(counter + "|");
                    }
                    System.out.print(" " + compBoardToUser[i]);
                }

                System.out.println("\n\nEnter a point on the computers board that you would like to check(Ex:A1,B7,D3, etc.):");
                userGuess = keyboard.next();
//Use a method to convert the users guess into a position number in the array to check.        
                int positionCounter = positionNum(userGuess, counter);

//Create variables that will be used as counters to determine the quantity of a certain number appearring in an array.
                int fiveCounter = 0;
                int fourCounter = 0;
                int threeCounter = 0;
                int twoCounter = 0;

//Determine the result of the user's guess.
                char userResult = computerBoard[positionCounter];
                switch (userResult) {
                    case '*':
                        System.out.println("-----MISS-----");
                        computerBoard[positionCounter] = 'O';
                        compBoardToUser[positionCounter] = 'O';
                        break;
                    case 'X':
                    case 'O':
                        System.out.println("You have already guessed this spot,\nyou have now lost your turn.\n");
                        break;
                    default:
                        System.out.println("-----HIT-----");
                        computerBoard[positionCounter] = 'X';
                        compBoardToUser[positionCounter] = 'X';
                        //Determine if any ships have been sunk, or if the game has finished resulting in a user victory.
                        for (int i = 0; i < 81; i++) {
                            if (computerBoard[i] == '5') {
                                fiveCounter++;
                            }
                            if (computerBoard[i] == '4') {
                                fourCounter++;
                            }
                            if (computerBoard[i] == '3') {
                                threeCounter++;
                            }
                            if (computerBoard[i] == '2') {
                                twoCounter++;
                            }
                        }
                        if (fiveCounter == 0) {
                            fiveMessageCount++;
                            if (fiveMessageCount < 2) {
                                System.out.println("Congrats! You sank the computers 5 unit ship!");
                            }
                        }
                        if (fourCounter == 0) {
                            fourMessageCount++;
                            if (fourMessageCount < 2) {
                                System.out.println("Congrats! You sank the computers 4 unit ship!");
                            }
                        }
                        if (threeCounter == 0) {
                            threeMessageCount++;
                            if (threeMessageCount < 2) {
                                System.out.println("Congrats! You sank the computers 3 unit ship!");
                            }
                        }
                        if (twoCounter == 0) {
                            twoMessageCount++;
                            if (twoMessageCount < 2) {
                                System.out.println("Congrats! You sank the computers 2 unit ship!");
                            }
                        }
                        break;
                }

//Check the computers board to make sure the game isn't already won.
                int hitCounter = 0;

                for (int i = 0; i < 81; i++) {
                    if (computerBoard[i] == 'X') {
                        hitCounter++;
                    }
                }
                if (hitCounter == 14) {
                    System.out.println("Congrats, you have sunken all of the computer's ships and won the game!\nEnter 1 if you wish to play again, enter 2 if not.");
                    playAgain = keyboard.nextInt();
                    guessAgain = 0;
                } else {//if you havent won yet
                    System.out.println("Enter 1 to prompt the computer to make it's guess:");//used to determine if a strategized guess can be made.
                    int prompt = keyboard.nextInt();
                    int xCounter = 0;
                    for (int i = 0; i < 81; i++) {
                        if (userBoard[i] == 'X') {
                            xCounter++;
                        }
                    }
                    xCounter = 0;//only here until AI is established.
                    int numberChecker = 1;//will allow us to tell the program whether or not a new number must be generated due to repeated guesses.
                    int compGuess = 0;
                    char computerGuess = 0;

                    while (numberChecker == 1) {//This loop generates a position number then checks if it is valid
                        if (xCounter == 0) {
                            compGuess = positionGenerator.nextInt(81);
                            computerGuess = userBoard[compGuess];
                        } else {
                            //Logic here will help the computer where to guess.
                        }
//Make sure that the number chosen by the computer is a valid guess.
                        switch (computerGuess) {
                            case 'X':
                                numberChecker = 1;
                                break;
                            case 'O':
                                numberChecker = 1;
                                break;
                            default:
                                numberChecker = 0;
                                break;
                        }
                    }
//Now that the computer has generated a valid guess, we will now convert that value into a coordinate to display to the user.
                    int compGuessNum;
                    int compGuessLetterCounter;
                    char compGuessLetter = 0;

                    compGuessLetterCounter = (compGuess % 9) + 1;
                    compGuessNum = compGuess - (compGuess % 9);
                    compGuessNum = (compGuessNum / 9) + 1;//determines row number.

//Create an if structure that will determine the coordinate the computer generated.
                    if (compGuessLetterCounter == 1) {
                        compGuessLetter = 'A';
                    }
                    if (compGuessLetterCounter == 2) {
                        compGuessLetter = 'B';
                    }
                    if (compGuessLetterCounter == 3) {
                        compGuessLetter = 'C';
                    }
                    if (compGuessLetterCounter == 4) {
                        compGuessLetter = 'D';
                    }
                    if (compGuessLetterCounter == 5) {
                        compGuessLetter = 'E';
                    }
                    if (compGuessLetterCounter == 6) {
                        compGuessLetter = 'F';
                    }
                    if (compGuessLetterCounter == 7) {
                        compGuessLetter = 'G';
                    }
                    if (compGuessLetterCounter == 8) {
                        compGuessLetter = 'H';
                    }
                    if (compGuessLetterCounter == 9) {
                        compGuessLetter = 'I';
                    }
//Display the computers guess as a coordinate to the user.
                    System.out.println("The computer has guessed: " + compGuessLetter + compGuessNum);
                    if (userBoard[compGuess] == '*') {
                        System.out.println("-----MISS-----");
                        userBoard[compGuess] = 'O';
                    } else {
                        System.out.println("-----HIT-----");//already excluded all X's and O's in the filter above.
                        userBoard[compGuess] = 'X';
                        //Check if any ships have been sunk
                        fiveCounter = 0;
                        fourCounter = 0;
                        threeCounter = 0;
                        twoCounter = 0;
//Determine if any ships have been sunk, or if the game has finished resulting in a computer victory.
                        for (int i = 0; i < 81; i++) {
                            if (userBoard[i] == '5') {
                                fiveCounter++;
                            }
                            if (userBoard[i] == '4') {
                                fourCounter++;
                            }
                            if (userBoard[i] == '3') {
                                threeCounter++;
                            }
                            if (userBoard[i] == '2') {
                                twoCounter++;
                            }
                        }
                        if (fiveCounter == 0) {
                            fiveMessageCount2++;
                            if (fiveMessageCount2 < 2) {
                                System.out.println("Oh no! The computer sank your 5 unit ship!");
                            }
                        }
                        if (fourCounter == 0) {
                            fourMessageCount2++;
                            if (fourMessageCount2 < 2) {
                                System.out.println("Oh no! The computer sank your 4 unit ship!");
                            }
                        }
                        if (threeCounter == 0) {
                            threeMessageCount2++;
                            if (threeMessageCount2 < 2) {
                                System.out.println("Oh no! The computer sank your 3 unit ship!");
                            }
                        }
                        if (twoCounter == 0) {
                            twoMessageCount2++;
                            if (twoMessageCount2 < 2) {
                                System.out.println("Oh no! The computer sank your 2 unit ship!");
                            }
                        }
//check if game is over resulting in computer victory.
                        hitCounter = 0;

                        for (int i = 0; i < 81; i++) {
                            if (userBoard[i] == 'X') {
                                hitCounter++;
                            }
                        }
                        if (hitCounter == 14) {
                            System.out.println("Uh oh, the computer has sank all of your ships and you lose the game.\nEnter 1 if you wish to play again, enter 2 if not.");
                            playAgain = keyboard.nextInt();
                            guessAgain = 0;
                        }

                    }
                }
            }
        }
    }

    private static int positionNum(String userGuess, int counter) {//used to convert the users guess into an index position.
        counter = 0;
        char letter = userGuess.charAt(0);
        char number = userGuess.charAt(1);
        if (letter == 'A') {
        }
        if (letter == 'B') {
            counter += 1;
        }
        if (letter == 'C') {
            counter += 2;
        }
        if (letter == 'D') {
            counter += 3;
        }
        if (letter == 'E') {
            counter += 4;
        }
        if (letter == 'F') {
            counter += 5;
        }
        if (letter == 'G') {
            counter += 6;
        }
        if (letter == 'H') {
            counter += 7;
        }
        if (letter == 'I') {
            counter += 8;
        }
        if (number == '1') {
        }
        if (number == '2') {
            counter += 9;
        }
        if (number == '3') {
            counter += 18;
        }
        if (number == '4') {
            counter += 27;
        }
        if (number == '5') {
            counter += 36;
        }
        if (number == '6') {
            counter += 45;
        }
        if (number == '7') {
            counter += 54;
        }
        if (number == '8') {
            counter += 63;
        }
        if (number == '9') {
            counter += 72;
        }
        return counter;

    }
}
