package Art_Code;

public class TestClass {

    public static void main(String[] args) {

        University university = new University("Hogwarts", 3);

        Group group = new Group("A1", 2);
        Group group2 = new Group("B1", 3);


        Student student1 = new Student("Harry", "Potter", 8);
        Student student2 = new Student("Harry", "Potter", 8);
        Student student3 = new Student("Ronald", "Wesley", 3);
        Student student4 = new Student("Hermione", "Granger", 10);

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        System.out.println(group);


        group2.addStudent(student1);
        group2.addStudent(student3);
        group2.addStudent(student4);

        System.out.println(group2);
        group2.sort();
        System.out.println(group2);


        //university.addGroup(group);
        //university.addGroup(group);

    }
}
