import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JobPortal portal = new JobPortal();

        while (true) {
            System.out.println("=== Online Job Portal ===");
            System.out.println("1. Add Job");
            System.out.println("2. View Jobs");
            System.out.println("3. Search Job");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Job Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Company Name: ");
                    String company = sc.nextLine();

                    System.out.print("Enter Location: ");
                    String location = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    Job newJob = new Job(title, company, location, salary);
                    portal.addJob(newJob);
                    break;

                case 2:
                    portal.listJobs();
                    break;

                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = sc.nextLine();
                    portal.searchJob(keyword);
                    break;

                case 4:
                    System.out.println("Exiting portal...");
                    return;

                default:
                    System.out.println("Invalid option. Try again.
");
            }
        }
    }
}
