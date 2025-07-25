/*
 * FRC 7902 Markham FireBirds Programming Division Off-Season Training
 * Unit 1, Lesson 1, Exercise 3
 * François Yen
 * 12.07.25
 */
package U1.L1;

import java.util.Scanner;

public class U1L1_3 {
    public static void main() {
        Scanner m_scanner = new Scanner(System.in);
        System.out.print("\nYour string > ");
        String string = m_scanner.nextLine();
        while (true) {
            if (string.length() == 0) {
                break;
            }
            string = string.substring(1);
            System.out.println(string);
        }
        m_scanner.close();
    }
}