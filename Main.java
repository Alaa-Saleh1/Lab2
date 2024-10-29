import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /*1.Write a program to find all of the longest word in a given dictionary.*/

//        System.out.println("Please enter count of your number : ");
//        int count = input.nextInt();
//        ArrayList<String> words= new ArrayList<>();
//
//        System.out.println("Enter word: ");
//        for (int i = 0; i <count ; i++) {
//            words.add(input.next());
//        }
//        System.out.println("The original Array : \n"+words);
//        System.out.println("The longest words: "+chickLongestWord(words));

        /*2. Write a program that displays the number of occurrences of an element in the array. */
//        System.out.println("Enter count of your number : ");
//        int count = input.nextInt();
//        int[] numberArray = new int[count];
//
//        System.out.println("Enter numbers : ");
//        for (int i = 0; i <count ; i++) {
//            numberArray[i]=input.nextInt();
//        }
//        System.out.println("Enter number of element to check : ");
//        int checkSize = input.nextInt();
//        int[] numberToCheck = new int[checkSize];
//
//        System.out.println("Enter element to check for occurrences");
//        for (int i = 0; i < checkSize; i++) {
//            numberToCheck[i]=input.nextInt();
//        }
//
//        for (int n : numberToCheck){
//            System.out.println(n+" occurs "+printOccurrences(numberArray,n)+" times");
//        }


        /*3.Write a program to find the k largest elements in a given array. Elements in the array can be in
any order. */

//        System.out.println("Please enter count of your number : ");
//        int count = input.nextInt();
//        int[] numberArray = new int[count];
//
//        System.out.println("Enter numbers : ");
//        for (int i = 0; i <count ; i++) {
//            numberArray[i]=input.nextInt();
//        }
//
//        System.out.println(Arrays.toString(numberArray));
//        System.out.println("Enter number of largest element to find : ");
//        int k = input.nextInt();
//        largestNumber(numberArray,k);

        /*4. Create a method to reverse an array of integers. Implement the method without creating a new
array.*/
//        System.out.println("Please enter count of your number : ");
//        int count = input.nextInt();
//        int[] numbers = new int[count];
//        System.out.println("Enter number : ");
//        for (int i = 0; i <count ; i++) {
//            numbers[i]=input.nextInt();
//        }
//        System.out.println("Original Array: "+Arrays.toString(numbers));
//        reverseArray(numbers);
//        System.out.print("Reversed Array: ");
//        for (int n : numbers){
//            System.out.print(n+" ");
//        }

        /*5. Write a menu driven Java program with following option:
1. Accept elements of an array
2. Display elements of an array
3. Search the element within array
4. Sort the array
5. To Stop the size of the array should be
entered by the user. */

//        int choice;
//        System.out.println("Please enter count of your number : ");
//        int count = input.nextInt();
//        ArrayList<Integer> elements = new ArrayList<>();
//        do {
//            System.out.println(
//                    "\n1. Accept elements of an array" +
//                    "\n2. Display elements of an array" +
//                    "\n3. Search the element within array" +
//                    "\n4. Sort the array " +
//                    "\n5. To Stop  ");
//            choice = input.nextInt();
//
//            switch (choice){
//                case 1:
//                    acceptElements(input, elements,count);
//                    break;
//                case 2:
//                    displayElement(elements);
//                    break;
//                case 3:
//                    searchElement(input, elements);
//                    break;
//                case 4:
//                    sortElement(elements);
//                    break;
//                case 5:
//                    System.out.println("Exiting ..");
//                    break;
//            }
//        }while (choice !=5);


    /*6. Create a method that generates a random number within a given range. Allow the user to
specify the range and call the method to display random numbers.
Hint: use Random class */
//
//        Random random = new Random();
//        System.out.println("Enter the minimum value of the range: ");
//        int minRange = input.nextInt();
//        System.out.println("Enter the maximum value of the range: ");
//        int maxRange = input.nextInt();
//        System.out.println("Enter the number of random numbers to generate: ");
//        int numberGenerate = input.nextInt();
//
//        randomNumber(minRange, maxRange, numberGenerate,random);

//        for (int i = 0; i < numberGenerate; i++) {
//            int randomNumbers = random.nextInt(maxRange-minRange+1)+minRange;
//            System.out.println(randomNumbers);
//        }


        /*7. Write a program that checks the strength of a password. Create a method that evaluates a
password based on criteria like length, inclusion of special characters, and
uppercase/lowercase letters.*/

//          System.out.println("Enter a password:");
//        String password = input.nextLine();
//
//        int totalScore = checkLength(password) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
//
//        System.out.println("Total Score: " + totalScore);
//        classifyPassword(totalScore);


        /*8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
and each subsequent number in the sequence is the sum of the two preceding ones. */

//        System.out.println("Enter the number of Fibonacci terms to generate: ");
//        int terms = input.nextInt();
//        generatesFibonacci(terms);


    }
    //8
    public static void generatesFibonacci(int terms){
        System.out.println("Fibonacci sequence with "+terms+" terms: ");
        int first=0;
        int second=1;
        for (int i = 0; i < terms; i++) {
            System.out.print(first+" ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
    //7
    public static int checkLength(String password) {
        int length = password.length();
        if (length >= 8) {
            return 3;
        } else if (length >= 6) {
            return 2;
        } else {
            return 0;
        }
    }
    public static int checkSpecialCharacters(String password) {
        String specialCharacters = "!@#$%^&*(),.?\":{}|<>";
        for (char c : password.toCharArray()) {
            if (specialCharacters.indexOf(c) >= 0) {
                return 2;
            }
        }
        return 0;
    }
    public static int checkUpperCaseLowerCase(String password) {
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        boolean hasLowerCase = !password.equals(password.toUpperCase());
        if (hasUpperCase && hasLowerCase) {
            return 3;
        } else {
            return 0;
        }
    }
    public static void classifyPassword(int totalScore) {
        if (totalScore >= 8) {
            System.out.println("Password is strong.");
        } else if (totalScore >= 5) {
            System.out.println("Password is moderately strong.");
        } else {
            System.out.println("Password is weak.");
        }
    }
    //6
    public static void randomNumber(int minRange, int maxRange, int numberGenerate, Random random){
        for (int i = 0; i < numberGenerate; i++) {
            int randomNumbers = random.nextInt(maxRange-minRange+1)+minRange;
            System.out.print(randomNumbers+ " ");
        }
    }
    //5
    public static void acceptElements(Scanner input, ArrayList<Integer> elements,int count){
        System.out.println("Enter "+count+ " element");
        for (int i = 0; i < count; i++) {
            elements.add(input.nextInt());
        }
    }
    public static void displayElement(ArrayList<Integer> elements){
        System.out.println("********************");
        System.out.println("The elements: ");
        System.out.println(elements);
        System.out.println("********************");
    }
    public static void searchElement(Scanner input, ArrayList<Integer> elements) {
        System.out.println("Enter the element to search:");
        int searchInt = input.nextInt();
        for(int e : elements) {
            if (e == searchInt) {
                System.out.println("Element found in the array.");
                break;
            } else {
                System.out.println("Element not found in the array.");
                break;
            }
        }
    }
    public static void sortElement(ArrayList<Integer> elements) {
        Collections.sort(elements);
        displayElement(elements);
    }
    //4
    public static void reverseArray(int[] number) {
        int left = 0;
        int right = number.length - 1;
        while (left < right) {
            int temp = number[left];
            number[left] = number[right];
            number[right] = temp;
            left++;
            right--;
        }
    }
    //3
    public static void largestNumber(int[] numbers, int k){
        Arrays.sort(numbers);
        System.out.print(k+ " Largest elements of the side array are : ");
        for (int i = numbers.length-1 ; i >= numbers.length-k; i--) {
            System.out.print(numbers[i]+ " ");

        }

    }
    //2
    public static int printOccurrences(int[]numbersArray , int number){
        int count = 0;
        for(int i = 0 ; i<numbersArray.length;i++){
            if (numbersArray[i] ==number){
                count++;
            }
        }
        return count;
    }
    //1
    public static ArrayList<String> chickLongestWord(ArrayList<String> words){
        ArrayList<String> longestWord = new ArrayList<>();
        int maxLength = 0;
        for (String w : words){
            maxLength = w.length();
            if (w.length() > maxLength){
                longestWord.add(w);
            }
        }
        for (String w : words){
            if (w.length()==maxLength){
                longestWord.add(w);
            }
        }
        return longestWord ;
    }

}