import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        int choice;
        do
        {
            System.out.println("\n=================================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("=================================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student s = new Student(id, name, age, course);

                    sms.addStudent(s);

                    break;

                case 2:

                    sms.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    sms.searchStudent(searchId);

                    break;

                case 4:

                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    sms.updateStudent(updateId, newName, newAge, newCourse);

                    break;

                case 5:

                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    sms.deleteStudent(deleteId);

                    break;

                case 6:

                    System.out.println("Thank you for using Student Management System!");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}