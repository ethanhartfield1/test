import java.util.*;
class IntegerToRoman{
    public String intToRoman(int num){
        StringBuilder sb = new StringBuilder();
        while(num-1000>=0){
            sb.append("M");
            num-=1000;
            }
        if(num-900>=0){
            sb.append("CM");
            num-=900;
            }
        while(num-500>=0){
            sb.append("D");
            num-=500;
            }
        if(num-400>=0){
            sb.append("CD");
            num-=400;
            }
        while(num-100>=0){
            sb.append("C");
            num-=100;
            }
        if(num-90>=0){
            sb.append("XC");
            num-=90;
            }
        while(num-50>=0){
            sb.append("L");
            num-=50;
            }
        if(num-40>=0){
            sb.append("XL");
            num-=40;
            }
        while(num-10>=0){
            sb.append("X");
            num-=10;
            }
        if(num-9>=0){
            sb.append("IX");
            num-=9;
            }
        while(num-5>=0){
            sb.append("V");
            num-=5;
            }
        if(num-4>=0){
            sb.append("IV");
            num-=4;
            }
        while(num-1>=0){
            sb.append("I");
            num-=1;
            }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num=0;
        boolean exit = false;
        while(!exit){
            boolean done = false;
            System.out.println("Please enter the number that you would like to convert to roman numberal form");
            while(!done){
                try{
                    num = scan.nextInt();
                    done = true;
               }
                catch (InputMismatchException e){
                    System.out.println("You did not enter a number. Please enter a number");
                    scan.nextLine();
                }
            }   
            IntegerToRoman a = new IntegerToRoman();
            String answer =  a.intToRoman(num);
            System.out.println(num + " is " + answer + " in roman numberal form");
            System.out.println("Would you like to try again? y/(n)");
            String y = scan.next();
            if(y.equals("y")) exit = false;
            else exit = true;
        }
        
    }
}
