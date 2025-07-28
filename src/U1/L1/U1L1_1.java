/*
 * FRC 7902 Markham FireBirds Programming Division Off-Season Training
 * Unit 1, Lesson 1, Exercise 1
 * François Yen
 * 12.07.25
 */

package U1.L1;

import java.util.Scanner;

public class U1L1_1 {
    public static void main(String[] args) {
        try (Scanner m_scanner = new Scanner(System.in)) {
            float total = 0;
            System.out.println("\nWelcome to Chez François, the fruiterer par excellence of Toronto!");
            while (true) {
                System.out.print("\n1 : Fruits\n2 : Beverages\nTotal : " + total + " $\n> ");
                switch (m_scanner.nextByte()) {
                    case 1:
                        System.out.print(
                                "\nFruits\n—————————————————————————————\n1 : Blueberries\t\t5   $\n2 : Apples\t\t4,5 $\n3 : Grapes\t\t4   $\n4 : Strawberries\t3,5 $\n5 : Pears\t\t3   $\nTotal : "
                                        + total + " $\n> ");
                        switch (m_scanner.nextByte()) {
                            case 1:
                                total += 5;
                                break;
                            case 2:
                                total += 4.5;
                                break;
                            case 3:
                                total += 4;
                                break;
                            case 4:
                                total += 3.5;
                                break;
                            case 5:
                                total += 3;
                        }
                        break;
                    case 2:
                        System.out.print(
                                "\nBeverages\n—————————————————————————————\n1 : Blueberry juice\t5   $\n2 : Apple juice\t\t4,5 $\n3 : Grape juice\t\t4   $\n4 : Strawberry juice\t3,5 $\n5 : Pear juice\t\t3   $\nTotal : "
                                        + total + " $\n> ");
                        switch (m_scanner.nextByte()) {
                            case 1:
                                total += 5;
                                break;
                            case 2:
                                total += 4.5;
                                break;
                            case 3:
                                total += 4;
                                break;
                            case 4:
                                total += 3.5;
                                break;
                            case 5:
                                total += 3;
                        }
                }
            }
        }
    }
}