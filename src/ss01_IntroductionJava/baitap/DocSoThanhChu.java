package ss01_IntroductionJava.baitap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        short num = scanner.nextShort();
        if (num > 999) {
            System.out.println("out of ability!");
        } else if (num >= 0 && num < 10) {
            switch (num) {
                case 0:
                    System.out.printf("zero");
                    break;
                case 1:
                    System.out.printf("one");
                    break;
                case 2:
                    System.out.printf("two");
                    break;
                case 3:
                    System.out.printf("three");
                    break;
                case 4:
                    System.out.printf("four");
                    break;
                case 5:
                    System.out.printf("five");
                    break;
                case 6:
                    System.out.printf("six");
                    break;
                case 7:
                    System.out.printf("seven");
                    break;
                case 8:
                    System.out.printf("eight");
                    break;
                case 9:
                    System.out.printf("nine");
                    break;
            }
        } else if (num >= 10 && num < 20) {
            Integer ones = num % 10;
            switch (ones) {
                case 0:
                    System.out.printf("ten");
                    break;
                case 1:
                    System.out.printf("eleven");
                    break;
                case 2:
                    System.out.printf("twelve");
                    break;
                case 3:
                    System.out.printf("thirteen");
                    break;
                case 4:
                    System.out.printf("fourteen");
                    break;
                case 5:
                    System.out.printf("fifteen");
                    break;
                case 6:
                    System.out.printf("sixteen");
                    break;
                case 7:
                    System.out.printf("seventeen");
                    break;
                case 8:
                    System.out.printf("eighteen");
                    break;
                case 9:
                    System.out.printf("nineteen");
                    break;
            }
        } else if (num >= 20 && num < 100) {
            Integer ones = num % 10;
            Integer tens = num / 10;
            if (ones == 0) {
                switch (tens) {
                    case 2:
                        System.out.printf("twenty");
                        break;
                    case 3:
                        System.out.printf("thirty");
                        break;
                    case 4:
                        System.out.printf("fourty");
                        break;
                    case 5:
                        System.out.printf("fifty");
                        break;
                    case 6:
                        System.out.printf("sixty");
                        break;
                    case 7:
                        System.out.printf("seventy");
                        break;
                    case 8:
                        System.out.printf("eighty");
                        break;
                    case 9:
                        System.out.printf("ninety");
                        break;
                }
            } else {
                switch (tens) {
                    case 2:
                        System.out.printf("twenty");
                        break;
                    case 3:
                        System.out.printf("thirty");
                        break;
                    case 4:
                        System.out.printf("forty");
                        break;
                    case 5:
                        System.out.printf("fifty");
                        break;
                    case 6:
                        System.out.printf("sixty");
                        break;
                    case 7:
                        System.out.printf("seventy");
                        break;
                    case 8:
                        System.out.printf("eighty");
                        break;
                    case 9:
                        System.out.printf("ninety");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.printf(" one");
                        break;
                    case 2:
                        System.out.printf(" two");
                        break;
                    case 3:
                        System.out.printf(" three");
                        break;
                    case 4:
                        System.out.printf(" four");
                        break;
                    case 5:
                        System.out.printf(" five");
                        break;
                    case 6:
                        System.out.printf(" six");
                        break;
                    case 7:
                        System.out.printf(" seven");
                        break;
                    case 8:
                        System.out.printf(" eight");
                        break;
                    case 9:
                        System.out.printf(" nine");
                        break;
                }
            }
        } else if (num >= 100) {
            Integer hundreds = num / 100;
            Integer ones = (num % 100) % 10;
            Integer tens = (num % 100) / 10;
            if (tens == 0 && ones == 0) {
                switch (hundreds) {
                    case 1:
                        System.out.printf("one hundred");
                        break;
                    case 2:
                        System.out.printf("two hundred");
                        break;
                    case 3:
                        System.out.printf("three hundred");
                        break;
                    case 4:
                        System.out.printf("four hundred");
                        break;
                    case 5:
                        System.out.printf("five hundred");
                        break;
                    case 6:
                        System.out.printf("six hundred");
                        break;
                    case 7:
                        System.out.printf("seven hundred");
                        break;
                    case 8:
                        System.out.printf("eight hundred");
                        break;
                    case 9:
                        System.out.printf("nine hundred");
                        break;
                }
            } else if (tens == 0 && ones != 0) {
                switch (hundreds) {
                    case 1:
                        System.out.printf("one hundred");
                        break;
                    case 2:
                        System.out.printf("two hundred");
                        break;
                    case 3:
                        System.out.printf("three hundred");
                        break;
                    case 4:
                        System.out.printf("four hundred");
                        break;
                    case 5:
                        System.out.printf("five hundred");
                        break;
                    case 6:
                        System.out.printf("six hundred");
                        break;
                    case 7:
                        System.out.printf("seven hundred");
                        break;
                    case 8:
                        System.out.printf("eight hundred");
                        break;
                    case 9:
                        System.out.printf("nine hundred");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.printf(" and one");
                        break;
                    case 2:
                        System.out.printf(" and two");
                        break;
                    case 3:
                        System.out.printf(" and three");
                        break;
                    case 4:
                        System.out.printf(" and four");
                        break;
                    case 5:
                        System.out.printf(" and five");
                        break;
                    case 6:
                        System.out.printf(" and six");
                        break;
                    case 7:
                        System.out.printf(" and seven");
                        break;
                    case 8:
                        System.out.printf(" and eight");
                        break;
                    case 9:
                        System.out.printf(" and nine");
                        break;
                }
            } else if (ones == 0) {
                switch (hundreds) {
                    case 1:
                        System.out.printf("one hundred");
                        break;
                    case 2:
                        System.out.printf("two hundred");
                        break;
                    case 3:
                        System.out.printf("three hundred");
                        break;
                    case 4:
                        System.out.printf("four hundred");
                        break;
                    case 5:
                        System.out.printf("five hundred");
                        break;
                    case 6:
                        System.out.printf("six hundred");
                        break;
                    case 7:
                        System.out.printf("seven hundred");
                        break;
                    case 8:
                        System.out.printf("eight hundred");
                        break;
                    case 9:
                        System.out.printf("nine hundred");
                        break;
                }
                switch (tens) {
                    case 1:
                        System.out.printf(" and ten");
                        break;
                    case 2:
                        System.out.printf(" and twenty");
                        break;
                    case 3:
                        System.out.printf(" and thirty");
                        break;
                    case 4:
                        System.out.printf(" and forty");
                        break;
                    case 5:
                        System.out.printf(" and fifty");
                        break;
                    case 6:
                        System.out.printf(" and sixty");
                        break;
                    case 7:
                        System.out.printf(" and seventy");
                        break;
                    case 8:
                        System.out.printf(" and eighty");
                        break;
                    case 9:
                        System.out.printf(" and ninety");
                        break;
                }
            } else if (tens == 1) {
                switch (hundreds) {
                    case 1:
                        System.out.printf("one hundred");
                        break;
                    case 2:
                        System.out.printf("two hundred");
                        break;
                    case 3:
                        System.out.printf("three hundred");
                        break;
                    case 4:
                        System.out.printf("four hundred");
                        break;
                    case 5:
                        System.out.printf("five hundred");
                        break;
                    case 6:
                        System.out.printf("six hundred");
                        break;
                    case 7:
                        System.out.printf("seven hundred");
                        break;
                    case 8:
                        System.out.printf("eight hundred");
                        break;
                    case 9:
                        System.out.printf("nine hundred");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.printf(" and eleven");
                        break;
                    case 2:
                        System.out.printf(" and twelve");
                        break;
                    case 3:
                        System.out.printf(" and thirteen");
                        break;
                    case 4:
                        System.out.printf(" and fourteen");
                        break;
                    case 5:
                        System.out.printf(" and fifteen");
                        break;
                    case 6:
                        System.out.printf(" and sixteen");
                        break;
                    case 7:
                        System.out.printf(" and seventeen");
                        break;
                    case 8:
                        System.out.printf(" and eighteen");
                        break;
                    case 9:
                        System.out.printf(" and nineteen");
                        break;
                }
            } else {
                switch (hundreds) {
                    case 1:
                        System.out.printf("one hundred");
                        break;
                    case 2:
                        System.out.printf("two hundred");
                        break;
                    case 3:
                        System.out.printf("three hundred");
                        break;
                    case 4:
                        System.out.printf("four hundred");
                        break;
                    case 5:
                        System.out.printf("five hundred");
                        break;
                    case 6:
                        System.out.printf("six hundred");
                        break;
                    case 7:
                        System.out.printf("seven hundred");
                        break;
                    case 8:
                        System.out.printf("eight hundred");
                        break;
                    case 9:
                        System.out.printf("nine hundred");
                        break;
                }
                switch (tens) {
                    case 2:
                        System.out.printf(" and twenty");
                        break;
                    case 3:
                        System.out.printf(" and thirty");
                        break;
                    case 4:
                        System.out.printf(" and forty");
                        break;
                    case 5:
                        System.out.printf(" and fifty");
                        break;
                    case 6:
                        System.out.printf(" and sixty");
                        break;
                    case 7:
                        System.out.printf(" and seventy");
                        break;
                    case 8:
                        System.out.printf(" and eighty");
                        break;
                    case 9:
                        System.out.printf(" and ninety");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.printf(" one");
                        break;
                    case 2:
                        System.out.printf(" two");
                        break;
                    case 3:
                        System.out.printf(" three");
                        break;
                    case 4:
                        System.out.printf(" four");
                        break;
                    case 5:
                        System.out.printf(" five");
                        break;
                    case 6:
                        System.out.printf(" six");
                        break;
                    case 7:
                        System.out.printf(" seven");
                        break;
                    case 8:
                        System.out.printf(" eight");
                        break;
                    case 9:
                        System.out.printf(" nine");
                        break;
                }
            }
        }
    }
}