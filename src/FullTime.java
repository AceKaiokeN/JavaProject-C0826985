public class FullTime extends Employee implements IPrintable{
    private boolean isFulltime;
    private double salary;
    private double bonus;

    public FullTime(String name, int age, boolean isFulltime, double salary, double bonus) {
        super(name, age);
        this.isFulltime = isFulltime;
        this.salary = salary;
        this.bonus = bonus;
    }

    public boolean isFulltime() {
        return isFulltime;
    }

    public void setFulltime(boolean fulltime) {
        isFulltime = fulltime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public static double calcEarnings(double salary, double bonus)
    {
        return salary + bonus;
    }

    public void printMyData(){
        if(isFulltime == true) {
            System.out.println("Name: "+getName());
            System.out.println("Year of Birth: "+ calcBirthYear(getAge()));
            System.out.println("Employee is a Full Time");
            System.out.println("    -- Salary: "+getSalary());
            System.out.println("    -- Bonus: "+getBonus());
            System.out.println("    -- Earnings: "+calcEarnings(getSalary(),getBonus()));

        }

        else{
            System.out.println("full gg");
        }
    }

}
