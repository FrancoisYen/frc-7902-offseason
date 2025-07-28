/*
 * FRC 7902 Markham FireBirds Programming Division Off-Season Training
 * Unit 1, Lesson 3
 * François Yen
 * 26.07.25
 */

package U1.L3;

public class PersonExercise {
    String name;
    int age;
    float netIncome;

    public PersonExercise(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void haveDinner(String dish) {
        System.out.println(name + " had a delicious " + dish + " for dinner.");
    }

    void drink() {
        if (age < 18) {
            System.out.println(name + " is too young to drink!");
        } else {
            System.out.println(name + " had a delicious beer.");
        }
    }

    void setNetIncome(float annualSalary, float monthlySpending) {
        netIncome = annualSalary - (monthlySpending * 12);
    }

    static String relationship(PersonExercise person1, PersonExercise person2) {
        double checkRelationship = Math.random();
        if (checkRelationship <= 0.25) {
            return person1.name + " and " + person2.name + " are friends.";
        } else if (checkRelationship <= 0.5) {
            return person1.name + " and " + person2.name + " are colleagues.";
        } else if (checkRelationship <= 0.75) {
            return person1.name + " and " + person2.name + " are enemies.";
        } else {
            return person1.name + " and " + person2.name + " are siblings.";
        }
    }

    static String relationship(Teacher teacher, Parent parent) {
        return teacher.name + " teaches " + parent.name + "'s child.";
    }

    static String relationship(Parent parent, Teacher teacher) {
        return teacher.name + " teaches " + parent.name + "'s child.";
    }

    static String relationship(Teacher teacher, Student student) {
        return teacher.name + " teaches " + student.name + ".";
    }

    static String relationship(Student student, Teacher teacher) {
        return teacher.name + " teaches " + student.name + ".";
    }

    static String relationship(Parent parent, Student student) {
        return parent.name + " is " + student.name + "'s parent.";
    }

    static String relationship(Student student, Parent parent) {
        return parent.name + " is " + student.name + "'s parent.";
    }

    static void pTConference(Teacher teacher, Parent parent, Student student) {
        int report = teacher.amiability + (int) (student.grades);
        if (report < 50) {
            System.out.println(student.name + " isn't doing very well!");
            System.out.println(parent.name + " doesn't react well!");
        } else if (report < 75) {
            System.out.println(student.name + " is passing!");
            if (parent.trust <= 66) {
                System.out.println(parent.name + " doesn't react well!");
            } else {
                System.out.println(parent.name + " reacts well!");
            }
        } else {
            System.out.println(student.name + " is doing very well!");
            if (parent.trust <= 33) {
                System.out.println(parent.name + " doesn't react well!");
            } else {
                System.out.println(parent.name + " reacts well!");
            }
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

class Teacher extends PersonExercise {
    int amiability;

    public Teacher(String name, int age, int amiability) {
        super(name, age);
        this.amiability = amiability;
    }

    void teach() {
        System.out.println(name + " is teaching a lesson.");
    }
}

class Parent extends PersonExercise {
    int trust;

    public Parent(String name, int age, int trust) {
        super(name, age);
        this.trust = trust;
    }

    void haveDinner(String dish) {
        System.out.println(name + " had a delicious " + dish + " with their family.");
    }
}

class Student extends PersonExercise {
    float grades;

    public Student(String name, int age, float grades) {
        super(name, age);
        this.grades = grades;
    }

    void drink() {
        System.out.println(name + " is too young to drink!");
    }
}