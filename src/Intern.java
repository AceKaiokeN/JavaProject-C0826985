public class Intern extends Employee implements IPrintable{
    private boolean isIntern;
    private String schoolName;
    private double Earnings;


    public Intern(String name, int age, boolean isIntern, String schoolName, double earnings) {
        super(name, age);
        this.isIntern = isIntern;
        this.schoolName = schoolName;
        Earnings = earnings;
    }

    public boolean isIntern() {
        return isIntern;
    }

    public void setIntern(boolean intern) {
        isIntern = intern;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getEarnings() {
        return Earnings;
    }

    public void setEarnings(double earnings) {
        Earnings = earnings;
    }

    public void printMyData(){
        if(isIntern==true)
        {
            System.out.println("Name: "+getName());
            System.out.println("Year of Birth: "+ calcBirthYear(getAge()));
            System.out.println("Registered Employee is Intern");
            System.out.println("    --  School Name: " +getSchoolName());
            System.out.println("    --  Earnings: " +getEarnings());
        }

        else{
            System.out.println("Intern gg");
        }

    }
}
