
public class Job {
    private String title;
    private String company;
    private String location;
    private double salary;

    public Job(String title, String company, String location, double salary) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Job Title: " + title + " | Company: " + company + 
               " | Location: " + location + " | Salary: " + salary;
    }
}
```

---

## **File 2: JobPortal.java**

```java
import java.util.ArrayList;
import java.util.List;

public class JobPortal {
    private List<Job> jobs;

    public JobPortal() {
        jobs = new ArrayList<>();
    }

    public void addJob(Job job) {
        jobs.add(job);
        System.out.println("Job added successfully!
");
    }

    public void listJobs() {
        if (jobs.isEmpty()) {
            System.out.println("No jobs available right now.
");
            return;
        }

        System.out.println("Available Jobs:
");
        for (int i = 0; i < jobs.size(); i++) {
            System.out.println((i + 1) + ". " + jobs.get(i));
        }
        System.out.println();
    }

    public void searchJob(String keyword) {
        boolean found = false;
        System.out.println("Search Results:
");

        for (Job job : jobs) {
            if (job.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                job.getCompany().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(job);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching jobs found.
");
        }
    }
}
```

---

## **File 3: Main.java**

```java
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

