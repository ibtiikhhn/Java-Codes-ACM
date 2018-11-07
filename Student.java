public class Student {
    private String name;
    private int id;
    private String department;
    private double cgpa;

    private static Student student;

    public static Student getInstance(String name, int id, String department, double cgpa) {
        if (student == null) {
            student = new Student(name, id, department, cgpa);
        }
        return student;
    }

    private Student(String name, int id, String department, double cgpa) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.cgpa = cgpa;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0 && id < 100) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return name + String.valueOf(cgpa);
    }
}
