import java.util.Scanner;
public class Main {
	public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("______________________________________________________________________");

        // Delay for 2 seconds (2000 milliseconds)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println();
        }

        System.out.println("                       PHINMA-Cagayan De Oro College ");
        System.out.println("              Max Y. Suniel Street, Carmen Cagayan de oro city");
        System.out.println("______________________________________________________________________");
        String[] selectedNames = {"Boss Lorenzo Zata", "Jessie Morcillos", "Ashlee Ranay", "Johanna Ebarat", "Jose Rizal"};

        // arrays for attendance and grades
        double[] writtenWorks = new double[selectedNames.length];
        double[] Score = new double[selectedNames.length];
        double[] performanceTaskScore = new double[selectedNames.length];
        double[] quizScore = new double[selectedNames.length];
        double[] finalExamScore = new double[selectedNames.length];
        double[] firstPeriodicalGrade = new double[selectedNames.length];
        String[] remarks = new String[selectedNames.length];

        boolean loggedIn = false; // flag to check if teacher is logged in

        while (true) {
            // login process
            if (!loggedIn) {
                System.out.println("                LOGIN");
                System.out.print("Username: ");
                String username = input.nextLine();
                System.out.print("Password: ");
                String password = input.nextLine();

                // check if username and password match
                if (username.equals("loremae") && password.equals("sujero")) {
                    loggedIn = true;

                    System.out.print(".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println();
                    }
                    
                    System.out.print(".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println();
                    }
                    
                    System.out.print(".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println();
                    }
                    
                    System.out.print(".");

                    System.out.print("Login successful!\n");
                } else {
                    System.out.println("Incorrect username or password. Please try again.\n");
                    continue;
                }
            }

            // display main menu
            System.out.println("MAIN MENU:");
            System.out.print("[1. Students List]");
            System.out.println("      [2. View Grades]");
            System.out.print("[3. Input Grades]");
            System.out.println("       [4. Logout]");
            System.out.println("  [5. Shutdown]");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    // display student list
                    System.out.println("\n                           STUDENT LIST:");
                    for (int i = 0; i < selectedNames.length; i++) {
                        System.out.println((i + 1) + ". " + selectedNames[i]);
                    }
                    System.out.println(); // space in between student list and main menu
                    break;

              case 2:
    // view grades
    System.out.println("Enter student complete name for manual inputting of grades \nor type 'VIEW' to view all grades: ");
    String studentName = input.nextLine();
    int studentIndex = -1;
    boolean found = false;
    if (studentName.equalsIgnoreCase("VIEW")) {
        // view all grades
        System.out.println("______________________________________________________________________");
        System.out.println("                       PHINMA-Cagayan De Oro College ");
        System.out.println("              Max Y. Suniel Street, Carmen Cagayan de oro city");
        System.out.println("                             GRADE REPORT");
        System.out.println("______________________________________________________________________");
        System.out.println("| Student Name        | Written Works | Performance Task | Quiz | Final Exam | First Periodical Grade | Remarks |");
        System.out.println("|-------------------- |--------------- |------------------ |----- |----------- |---------------------- |---------|");
        for (int i = 0; i < selectedNames.length; i++) {
            System.out.printf("| %-20s | %-13s | %-16s | %-4s | %-10s | %-21s | %-7s |\n", 
                              selectedNames[i], writtenWorks[i], performanceTaskScore[i], quizScore[i], 
                              finalExamScore[i], firstPeriodicalGrade[i], remarks[i]);
            System.out.println("|-------------------- |--------------- |------------------ |----- |----------- |---------------------- |---------|");
        }
    } else {
        // search for student index based on student name
        for (int i = 0; i < selectedNames.length; i++) {
            if (selectedNames[i].equalsIgnoreCase(studentName)) {
                studentIndex = i;
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("______________________________________________________________________");
            System.out.println("                       PHINMA-Cagayan De Oro College ");
        System.out.println("              Max Y. Suniel Street, Carmen Cagayan de oro city");
            System.out.println("______________________________________________________________________");
            System.out.println("                             GRADE REPORT");
            System.out.println("______________________________________________________________________");
            System.out.println("Name: " + selectedNames[studentIndex]);
            System.out.println("______________________________________________________________________");
            System.out.println("Subject: Arts");
            System.out.println("______________________________________________________________________");
            System.out.println("Written Works: " + writtenWorks[studentIndex]);
            System.out.println("Performance Task: " + performanceTaskScore[studentIndex]);
            System.out.println("Quiz: " + quizScore[studentIndex]);
            System.out.println("Exam: " + finalExamScore[studentIndex]);
            System.out.println("First Periodical Grade: " + firstPeriodicalGrade[studentIndex]);
            System.out.println("Remarks: " + remarks[studentIndex]);
            System.out.println("______________________________________________________________________");
        } else {
            System.out.println("Invalid Input. Please try again.\n");
        }
    }
    break;


            case 3:
                // input grades
                System.out.print("Enter student name: ");
                String studentNameInput = input.nextLine();
                int studentIndexInput = -1;
                boolean foundInput = false;
                // search for student index based on student name
                for (int i = 0; i < selectedNames.length; i++) {
                    if (selectedNames[i].equalsIgnoreCase(studentNameInput)) {
                        studentIndexInput = i;
                        foundInput = true;
                        break;
                    }
                }
                if (foundInput) {
                    System.out.print("Enter Written Works grade : ");
                    writtenWorks[studentIndexInput] = input.nextDouble();
                    System.out.print("Enter Performance Task grade: ");
                    performanceTaskScore[studentIndexInput] = input.nextDouble();
                    System.out.print("Enter Quiz grade: ");
                    quizScore[studentIndexInput] = input.nextDouble();
                    System.out.print("Enter Exam grade: ");
                    finalExamScore[studentIndexInput] = input.nextDouble();
                    
                    
                 
                    input.nextLine(); // consume newline character
                    // calculate first periodical grade
                    
                    
                   firstPeriodicalGrade[studentIndexInput] = writtenWorks[studentIndexInput] * 0.10 + performanceTaskScore[studentIndexInput] * 0.30 + quizScore[studentIndexInput] * 0.20 + finalExamScore[studentIndexInput] * 0.40;


                    // determine remarks
                    if (firstPeriodicalGrade[studentIndexInput] >= 55) {
                        remarks[studentIndexInput] = "Passed";
                    } else {
                        remarks[studentIndexInput] = "Failed";
                    }
                    System.out.println("Grades successfully inputted for " + selectedNames[studentIndexInput] + ".\n");
                } else {
                    System.out.println("Student not found. Please try again.\n");
                }
                break;

            case 4:
                // logout
                System.out.println("Logging out...\n");
                loggedIn = false;
                break;

            default:
                System.out.println("Invalid choice. Please try again.\n");
                break;
             case 5:
             //shutdown 
             System.exit(0);
        }
    }
}
    }
		