public class EmployeeMemento {
    private final int employeeId;
    private final String pps;
    private final String surname;
    private final String firstName;
    private final char gender;
    private final String department;
    private final double salary;
    private final boolean fullTime;

    public EmployeeMemento(int employeeId, String pps, String surname, String firstName, char gender, 
                           String department, double salary, boolean fullTime) {
        this.employeeId = employeeId;
        this.pps = pps;
        this.surname = surname;
        this.firstName = firstName;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.fullTime = fullTime;
    }

    // Getters to restore the state
    public int getEmployeeId() { return employeeId; }
    public String getPps() { return pps; }
    public String getSurname() { return surname; }
    public String getFirstName() { return firstName; }
    public char getGender() { return gender; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public boolean isFullTime() { return fullTime; }
}
