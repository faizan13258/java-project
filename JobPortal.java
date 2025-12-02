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
