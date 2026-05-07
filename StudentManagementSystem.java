import java.util.ArrayList;

public class StudentManagementSystem {

    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {

        // Check duplicate ID
        for (Student s : students) {

            if (s.id == student.id) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        students.add(student);

        System.out.println("Student added successfully!");
        System.out.println("Total Students: " + students.size());
    }

    // View All Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== STUDENT DETAILS =====");

        for (Student s : students) {

            System.out.println("ID      : " + s.id);
            System.out.println("Name    : " + s.name);
            System.out.println("Age     : " + s.age);
            System.out.println("Course  : " + s.course);
            System.out.println("----------------------------");
        }

        System.out.println("Total Students: " + students.size());
    }

    // Search Student
    public void searchStudent(int id) {

        for (Student s : students) {

            if (s.id == id) {

                System.out.println("\nStudent Found:");
                System.out.println("----------------------------");
                System.out.println("ID      : " + s.id);
                System.out.println("Name    : " + s.name);
                System.out.println("Age     : " + s.age);
                System.out.println("Course  : " + s.course);
                System.out.println("----------------------------");

                return;
            }
        }

        System.out.println("No student found with ID: " + id);
    }

    // Update Student
    public void updateStudent(int id, String newName, int newAge, String newCourse) {

        for (Student s : students) {

            if (s.id == id) {

                s.name = newName;
                s.age = newAge;
                s.course = newCourse;

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("No student found with ID: " + id);
    }

    // Delete Student
    public void deleteStudent(int id) {

        for (Student s : students) {

            if (s.id == id) {

                students.remove(s);

                System.out.println("Student deleted successfully!");
                System.out.println("Remaining Students: " + students.size());

                return;
            }
        }

        System.out.println("No student found with ID: " + id);
    }
}