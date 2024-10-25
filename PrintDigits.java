public class PrintDigits {
    public static void main(String[] args) {
        printZero();
        System.out.println();
        printOne();
        System.out.println();
        printTwo();
        System.out.println();
        printThree();
        System.out.println();
        printFour();
        System.out.println();
        printFive();
        System.out.println();
        printSix();
        System.out.println();
        printSeven();
        System.out.println();
        printEight();
        System.out.println();
        printNine();
    }
    public static void printVerticalValue(String value){
        System.out.println(value);
    }
    public static void printVerticalValue(String value, int iterationNumber){
        for(int i = 0;i < iterationNumber;i++){
            System.out.println(value);
        }
    }
    public static void printHorizontalValue(String value){
        System.out.print(value);
    }
    public static void printHorizontalValue(String value, int iterationNumber){
        for(int i = 0;i < iterationNumber;i++){
            System.out.print(value);
        }
    }
    public static void combinedSpaceValue(String value, int iterationNumber){
        for(int i = 0; i < iterationNumber;i++){
            System.out.print(" ");
        }
        printHorizontalValue(value);
    }
    public static void printZero(){
        printHorizontalValue(" ", 2);
        printHorizontalValue("-",9);
        System.out.println();
        printVerticalValue("|           |",5);
        printHorizontalValue(" ", 2);
        printHorizontalValue("-",9);
    }

    public static void printOne(){
        printVerticalValue("|",7);
    }
    public static void printTwo(){
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("          |",3);
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("|",3);
        printHorizontalValue("-",11);
    }
    public static void printThree(){
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("          |",3);
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("          |",3);
        printHorizontalValue("-",11);
    }
    public static void printFour(){
        printVerticalValue("|         |",3);
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("          |",3);
    }
    public static void printFive(){
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("|",3);
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("          |",3);
        printHorizontalValue("-",11);
    }
    public static void printSix(){
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("|",3);
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("|         |",3);
        printHorizontalValue("-",11);
    }
    public static void printSeven(){
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("          |",6);
    }
    public static void printEight(){
        printHorizontalValue("-",11);;
        System.out.println();
        printVerticalValue("|         |",3);
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("|         |",3);
        printHorizontalValue("-",11);
    }
    public static void printNine(){
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("|         |",3);
        printHorizontalValue("-",11);
        System.out.println();
        printVerticalValue("          |",3);
    }
}

