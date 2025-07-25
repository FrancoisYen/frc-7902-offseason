/*
 * FRC 7902 Markham FireBirds Programming Division Off-Season Training
 * Unit 1, Lesson 2
 * François Yen
 * 22.07.25
 */

package U1.L2;

public class PersonExercise {
    String name;
    int age;
    float netIncome;

    public PersonExercise(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void haveDinner(String dish) {
        System.out.println(name + " had a delicious " + dish + " for dinner.");
    }

    public void drink() {
        if (age < 18) {
            System.out.println(name + " is too young to drink alcohol.");
        } else {
            System.out.println(name + " had a delicious beer.");
        }
    }

    public void getNetIncome(float annualSalary, float monthlySpending) {
        netIncome = annualSalary - (monthlySpending * 12);
    }
}