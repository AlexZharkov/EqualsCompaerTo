package Art_Code;

import java.util.Arrays;


class University {
    private String name;
    private Group[] groups;
    private int groupCount;

    University(String name, int groupSize) {
        this.name = name;
        this.groups = new Group[groupSize];
    }


    boolean addGroup(Group group) {

        if (groupCount == groups.length || group == null) return false;
        for (int i = 0; i < groups.length; i++) {

            if (group.equals(groups[i]))
                return false;
        }

        groups[groupCount] = group;
        groupCount++;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group[] getGroups() {
        return groups;
    }

    public int getGroupCount() {
        return groupCount;
    }

    void showStudents() {
        for (int i = 0; i < groupCount; i++) {
            groups[i].showStudents();
        }
    }

    void showGroups() {
        for (int i = 0; i < groupCount; i++) {
            System.out.printf("%d. - %s\n", i + 1, groups[i].getName());
        }

    }

    @Override
    public String toString() {
        return "University " +
                "name = " + name + '\'' +
                " , groups=" + Arrays.toString(groups);
    }
}
