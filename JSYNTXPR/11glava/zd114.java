public class zd114 {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(this.salary < salary) {
            this.salary = salary;
        }
    }
}



