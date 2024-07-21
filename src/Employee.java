public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;

    public static int idCounter = 0;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        idCounter++;
        id = idCounter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;

        if (getDepartment() != employee.getDepartment()) return false;
        if (getSalary() != employee.getSalary()) return false;
        if (getId() != employee.getId()) return false;
        return getFullName() != null ? getFullName().equals(employee.getFullName()) : employee.getFullName() == null;
    }

    @Override
    public int hashCode() {
        int result = getFullName() != null ? getFullName().hashCode() : 0;
        result = 31 * result + getDepartment();
        result = 31 * result + getSalary();
        result = 31 * result + getId();
        return result;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;


    }

    @Override
    public String toString() {
        return "Сотрудник: " + fullName +
                ", отдел: " + department +
                ", зарплата: " + salary + " рублей" +
                ", id: " + id;
    }
}