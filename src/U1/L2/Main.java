/*
 * FRC 7902 Markham FireBirds Programming Division Off-Season Training
 * Unit 1, Lesson 2
 * François Yen
 * 22.07.25
 */

package U1.L2;

public class Main {
    static void relationship(PersonExercise person1, PersonExercise person2) {
        double checkRelationship = Math.random();
        if (checkRelationship <= 0.25) {
            System.out.println(person1.name + " and " + person2.name + " are friends.");
        } else if (checkRelationship <= 0.5) {
            System.out.println(person1.name + " and " + person2.name + " are colleagues.");
        } else if (checkRelationship <= 0.75) {
            System.out.println(person1.name + " and " + person2.name + " are enemies.");
        } else {
            System.out.println(person1.name + " and " + person2.name + " are siblings.");
        }
    }

    public static void main(String[] args) {
        PersonExercise francois = new PersonExercise("François", 18);
        PersonExercise amber = new PersonExercise("Amber", 23);
        PersonExercise tanner = new PersonExercise("Tanner", 16);
        PersonExercise jessica = new PersonExercise("Jessica", 31);
        PersonExercise heinrich = new PersonExercise("Heinrich", 26);
    }
}