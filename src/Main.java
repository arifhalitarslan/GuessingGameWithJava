import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int chances; // chances to find unknown number or alphabet
    public static int countNumber; // how many times you find for number
    public static int countAlphabet; //how many times you find for alphabet
    public static int highScoreNumber = 6; // define the high score for number
    public static int highScoreAlphabet = 6; //define the high score for alphabet
    static Random random = new Random(); // random class
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // to get input , creating object

        while (true){

            System.out.println("MENU\n" +
                    "----\n" +
                    "1. Guess the Number.\n" +
                    "2. Guess the Alphabet\n" +
                    "3. Hight score.\n" +
                    "4. Credit.\n" +
                    "5. Exit\n" +
                    "\n" +
                    "Enter your choice:");

            int input = scan.nextInt();

       if (input == 5){
           System.exit(0);
       }
       if(input == 1){

           while (true){

               System.out.println("Start Menu\n" +
                       "----------\n" +
                       "Select a difficulty level\n" +
                       "1. Easy\n" +
                       "2. Medium\n" +
                       "3. Hard\n" +
                       "4. Return to main menu");
               int input1 = scan.nextInt();

               if (input1 == 1){
                   easyNumber(); // calling function
               }
               if (input1 == 2){
                   mediumNumber();
               }
               if (input1 == 3){
                   hardNumber();
               }
               if (input1 == 4){
                   break; // to go top menu
               }
           }
       }
       if (input == 2){

           while (true){
               System.out.println("Start Menu\n" +
                       "----------\n" +
                       "Select a difficulty level\n" +
                       "1. Easy\n" +
                       "2. Medium\n" +
                       "3. Hard\n" +
                       "4. Return to main menu\n" +
                       "===>");
               int input2 = scan.nextInt();

               if (input2 == 1){
               easyAlphabet();
               }
               if (input2 == 2){
               mediumAlphabet();
               }
               if (input2 == 3){
               hardAlphabet();
               }
               if (input2 == 4){
                   break;
               }

           }

       }
       if(input == 3){

           if (highScoreNumber == 6) {
               System.out.println("there is no data Number");
           }
           else {
               System.out.println(" The high score for the Number Game is  " + highScoreNumber);
           }

           if (highScoreAlphabet == 6) {
               System.out.println("there is no data Alphabet");
           }
           else {
               System.out.println(" The high score for the Alphabet Game is  " + highScoreAlphabet);
           }

       }
       if (input == 4){
           System.out.println("Arif Halit Arslan - 200209023\n" +
                   "Muhammed Yusuf Kaya - 200209009\n" +
                   "Ahmet Akkuş - 200209315\n" +
                   "Emir Haktan Sakarya - 210209035\n" +
                   "Ahmet Doğukan Solak - 200209012\n" +
                   "Büşra Güneş - 200209006\n" +
                   "Sinan Sensev - 200209013\n" +
                   "Müberra Yerinde - 200209038");
           System.out.println("");
           System.out.println("Course Name : Software Construction");
       }

        }



}

public static void easyNumber(){
   Scanner scan1 = new Scanner(System.in);
    chances = 5;
    countNumber = 0;
    System.out.println("Guess the Number\n" +
            "\n" +
            "----------------\n" +
            "Instructions:\n" +
            " 1. Guess the number based on the gaven range.\n" +
            " 2. You are allowed to make one guess at a time.\n" +
            " 3. Each game has 5 chances to guess the correct number.\n" +
            " 4. Once you have used up all your chances, you lose the game.\n" +
            "\n" +
            "Good Luck!\n" +
            "Easy:\n");

   int randomNumberE = random.nextInt(15)+1;


   while (chances>0) {

       System.out.println("Enter guess number from 1 to 15 . "+chances+" left");
       int userInputNumberE = scan1.nextInt();

       countNumber++;

       if (randomNumberE == userInputNumberE) {
           System.out.println("Correct! You've won the game with just "+countNumber+" times.");

           if (countNumber < highScoreNumber){
               highScoreNumber = countNumber;
           }

       return;
       }
       if (userInputNumberE > randomNumberE) {
           System.out.println("Wrong! Your guess was too high");
           chances--;
       }
       if (userInputNumberE < randomNumberE){
           System.out.println("Wrong! Your guess was too low");
           chances--;
       }


   }
}
public static void mediumNumber(){
    Scanner scan2 = new Scanner(System.in);
chances = 4;
    countNumber = 0;
    System.out.println("Guess the Number\n" +
            "\n" +
            "----------------\n" +
            "Instructions:\n" +
            " 1. Guess the number based on the gaven range.\n" +
            " 2. You are allowed to make one guess at a time.\n" +
            " 3. Each game has 4 chances to guess the correct number.\n" +
            " 4. Once you have used up all your chances, you lose the game.\n" +
            "\n" +
            "Good Luck!\n" +
            "Medium difficulty:");

    int randomNumberM = random.nextInt(20)+1;

    while (chances>0){
        System.out.println("Enter guess number: ( 1 to 20 )."+chances+" left.");

        int userInputNumberM = scan2.nextInt();

        countNumber++;
        if (randomNumberM == userInputNumberM) {
            System.out.println("Correct! You've won the game with just "+countNumber+" times.");

            if (countNumber < highScoreNumber){
                highScoreNumber = countNumber;
            }

            return;
        }
        if (userInputNumberM > randomNumberM) {
            System.out.println("Wrong!");
            chances--;
        }
        if (userInputNumberM < randomNumberM){
            System.out.println("Wrong!");
            chances--;
        }

    }

    }
public static void hardNumber(){
        Scanner scan3 = new Scanner(System.in);
        chances = 3;
    countNumber = 0;
    System.out.println("Guess the Number\n" +
            "\n" +
            "----------------\n" +
            "Instructions:\n" +
            " 1. Guess the number based on the gaven range.\n" +
            " 2. You are allowed to make one guess at a time.\n" +
            " 3. Each game has 3 chances to guess the correct number.\n" +
            " 4. Once you have used up all your chances, you lose the game.\n" +
            "\n" +
            "Good Luck!\n" +
            "Hard:");

    int randomNumberH = random.nextInt(40)+1;

    while (chances > 0){
        System.out.println("Enter guess number: ( 1 to 40 )."+chances+" left.");

        int userInputNumberH = scan3.nextInt();
        countNumber++;

        if (randomNumberH == userInputNumberH) {
            System.out.println("Correct! You've won the game with just "+countNumber+" times.");

            if (countNumber < highScoreNumber){
                highScoreNumber = countNumber;
            }

            return;
        }
        if (userInputNumberH > randomNumberH) {
            System.out.println("Wrong!");
            chances--;
        }
        if (userInputNumberH < randomNumberH){
            System.out.println("Wrong!");
            chances--;
        }


    }

    }


    public static void easyAlphabet(){

        chances = 2;
        countAlphabet = 0;

        char randomVowelE;
        char guessingCharE;

        Scanner scan4 = new Scanner(System.in);

        do{
            randomVowelE = (char)(random.nextInt(26)+'a');
        }
        while(randomVowelE != 'a' && randomVowelE!= 'e' && randomVowelE !='i' && randomVowelE != 'o' && randomVowelE !='u');

            System.out.println("Guess the Alphabet\n" +
                    "\n" +
                    "----------------\n" +
                    "Instructions:\n" +
                    " 1. Guess the vowel alphabet.\n" +
                    " 2. You are allowed to make one guess at a time.\n" +
                    " 3. Each game has 2 chances to guess the correct vowel.\n" +
                    " 4. Once you have used up all your chances, you lose the game.\n" +
                    "\n" +
                    "Good Luck!\n" +
                    "Easy:");



        while (chances >0){

            System.out.println("enter a word "+chances +" left.");

            guessingCharE = scan4.nextLine().toLowerCase().charAt(0);
            countAlphabet++;
    if (guessingCharE == randomVowelE) {
        System.out.println("Correct! You've won the game with just " + countAlphabet + " times.");

        if (countAlphabet < highScoreAlphabet){
            highScoreAlphabet = countAlphabet;
        }

        break;
    }
    if (guessingCharE < randomVowelE) {
        System.out.println("Wrong! Your guess was too low ");
        chances--;
    }
    if (guessingCharE > randomVowelE) {
        System.out.println("Wrong! Your guess was too high");
        chances--;
    }

        }

     }
    public static void mediumAlphabet(){
        chances = 4;
        countAlphabet = 0;

        char randomVowelM;
        char guessingCharM;

        Scanner scan5 = new Scanner(System.in);

        do{
            randomVowelM = (char)(random.nextInt(26)+'a');
        }
        while(randomVowelM == 'a' && randomVowelM == 'e' && randomVowelM =='i' && randomVowelM != 'o' && randomVowelM =='u');

        System.out.println("Instructions:\n" +
                " 1. Guess the consonant alphabet.\n" +
                " 2. You are allowed to make one guess at a time.\n" +
                " 3. Each game has 4 chances to guess the correct consonant.\n" +
                " 4. Once you have used up all your chances, you lose the game.\n" +
                "\n" +
                "Good Luck!\n" +
                "Medium:");

        while (chances >0){

            System.out.println("enter a word "+chances +" chances left. What is the alphabet?" +
                    "Player input : ");

            guessingCharM = scan5.nextLine().toLowerCase().charAt(0);
            countAlphabet++;
            if (guessingCharM == randomVowelM) {
                System.out.println("Correct! You've won the game with just " + countAlphabet + " times.");

                if (countAlphabet < highScoreAlphabet){
                    highScoreAlphabet = countAlphabet;
                }

                break;
            }
            if (guessingCharM < randomVowelM) {
                System.out.println("Wrong! Your guess was too low ");
                chances--;
            }
            if (guessingCharM > randomVowelM) {
                System.out.println("Wrong! Your guess was too high");
                chances--;
            }


    }





}
    public static void hardAlphabet(){
    chances = 5;
    countAlphabet = 0;

    char randomVowelH;
    char guessingCharH;

    Scanner scan6 = new Scanner(System.in);
    randomVowelH = (char)(random.nextInt(26)+'a');

    System.out.println("Guess the Alphabet\n" +
            "\n" +
            "----------------\n" +
            "Instructions:\n" +
            " 1. Guess the alphabet.\n" +
            " 2. You are allowed to make one guess at a time.\n" +
            " 3. Each game has 5 chances to guess the correct alphabet.\n" +
            " 4. Once you have used up all your chances, you lose the game.\n" +
            "\n" +
            "Good Luck!\n" +
            "Hard:");

    while (chances >0){

        System.out.println("enter a word "+chances +" left.");

        guessingCharH = scan6.nextLine().toLowerCase().charAt(0);
        countAlphabet++;
        if (guessingCharH == randomVowelH) {
            System.out.println("Correct! You've won the game with just " + countAlphabet + " times.");

            if (countAlphabet < highScoreAlphabet){
                highScoreAlphabet = countAlphabet;
            }

            break;
        }
        if (guessingCharH < randomVowelH) {
            System.out.println("Wrong! Your guess was too low ");
            chances--;
        }
        if (guessingCharH > randomVowelH) {
            System.out.println("Wrong! Your guess was too high");
            chances--;
        }
    }
    }
}