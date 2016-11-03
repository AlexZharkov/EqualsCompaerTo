package Art_Code;


public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private double averageMark;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getMark() {
        return averageMark;
    }

    public Student(String name, String surname, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.averageMark = averageMark;
    }

    public void setMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Student)) return false;
        Student st = (Student) obj;
        return this.name.equals(st.name) && this.surname.equals(st.surname);

    }


    // @Override
    public String toString() {
        return String.format(" name - %s, surname - %s, average mark - %.2f", name, surname, averageMark);
    }


    @Override
    public int compareTo(Student o) {
        int valueName = surname.compareTo(o.surname);
        if (valueName != 0) return valueName;
        return name.compareTo(o.name);

    }
}
