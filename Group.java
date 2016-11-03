package Art_Code;

import java.util.Arrays;
import java.util.Comparator;


class Group {

    private String name;
    private Student[] students;
    private int countSt;

    public String setName() {
        return name;
    }

    Group(String name, int groupSize) {
        this.name = name;
        students = new Student[groupSize];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentsCount() {
        return countSt;
    }

    public Student[] getStudents() {
        return students;
    }

    boolean addStudent(Student student) {

        if ((countSt == students.length) || (student == null)) return false;

        for (Student student1 : students) {
            if (student.equals(student1))
                return false;
        }

        students[countSt] = student;
        countSt++;
        return true;

    }

    public void sort() {
        Arrays.sort(students);

    }

    @Override
    public String toString() {
        return "Group" +
                "name = " + name +
                " , students - " + Arrays.toString(students);
    }

    void showStudents() {
        for (int i = 0; i < countSt; i++) {
            System.out.println(students[i]);

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        return name.equals(group.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}



