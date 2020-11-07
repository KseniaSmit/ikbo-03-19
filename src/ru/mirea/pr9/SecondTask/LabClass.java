package ru.mirea.pr9.SecondTask;


public class LabClass implements LabClassUI {
    public void sortStudent(Student[] students){
        SortingStudentsByGPA s = new SortingStudentsByGPA();
        s.quickSort(students, 0, students.length-1);
    }
    public int findStudent(Student[] students, String name){
        try {
            if (name.equals("")) throw new EmptyStringException("Input string is empty!");
            for (int i = 0; i < students.length; i++) {
                if (students[i].getName().equals(name)) {
                    return students[i].getId();
                }
            }
            throw new StudentNotFoundException(String.format("Student %s was not found!", name));
        } catch (StudentNotFoundException | EmptyStringException e) {
            System.err.println(e);
        }
        return -1;

    }

}
