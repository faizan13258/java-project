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
