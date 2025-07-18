package Miniproject;

import java.util.*;


class Student {
    private String name;
    private int[] marks;
    private String grade;

    public Student() {}

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}


class NullMarksArrayException extends Exception {
    public String toString() {
        return "mark array is null";
    }
}

class NullNameException extends Exception {
    public String toString() {
        return "name is null";
    }
}

class NullStudentObjectException extends Exception {
    public String toString() {
        return "object is null";
    }
}


class StudentService {

    public int findNumberOfNullMarksArray(Student[] s) {
        int count = 0;
        if (s != null) {
            for (Student student : s) {
                if (student != null && student.getMarks() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public int findNumberOfNullName(Student[] s) {
        int count = 0;
        if (s != null) {
            for (Student student : s) {
                if (student != null && student.getName() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public int findNumberOfNullObjects(Student[] s) {
        int count = 0;
        if (s != null) {
            for (Student student : s) {
                if (student == null) {
                    count++;
                }
            }
        }
        return count;
    }
}

class StudentReport {

    public String findGrades(Student student) {
        int[] marks = student.getMarks();
        for (int mark : marks) {
            if (mark < 35) {
                return "F";
            }
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        if (sum < 150) return "C";
        else if (sum < 200) return "B";
        else if (sum < 250) return "A";
        else return "A+";
    }

    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
        if (s == null) throw new NullStudentObjectException();
        if (s.getName() == null) throw new NullNameException();
        if (s.getMarks() == null) throw new NullMarksArrayException();
        return "VALID";
    }
}


public class MiniProject3 {

    public static void main(String[] args) {
        Student[] data = new Student[10];
        data[0] = new Student("A1", new int[]{72, 73, 74});
        data[1] = new Student("B1", new int[]{75, 76, 77});
        data[2] = new Student("C1", new int[]{99, 99, 99});
        data[3] = new Student("C3", new int[]{100, 100, 99});
        data[4] = new Student("B2", new int[]{13, 88, 13});
        data[5] = new Student("C3", new int[]{14, 14, 99});
        data[6] = new Student("A2", new int[]{77, 55, 12});
        data[7] = new Student(null, new int[]{13, 88, 13});
        data[8] = new Student("A2", null);
        data[9] = null;

        StudentReport sr = new StudentReport();
        StudentService ss = new StudentService();

        for (int i = 0; i < data.length; i++) {
            try {
                if (sr.validate(data[i]).equals("VALID")) {
                    String grade = sr.findGrades(data[i]);
                    data[i].setGrade(grade);
                    System.out.println("Grade for student " + data[i].getName() + " is: " + grade);
                }
            } catch (Exception e) {
                System.out.println("Exception at student " + i + ": " + e);
            }
        }

        System.out.println("\nSummary:");
        System.out.println("Number of null objects: " + ss.findNumberOfNullObjects(data));
        System.out.println("Number of null name fields: " + ss.findNumberOfNullName(data));
        System.out.println("Number of null marks arrays: " + ss.findNumberOfNullMarksArray(data));
    }
}