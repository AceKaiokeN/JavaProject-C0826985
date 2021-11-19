public class CommissionBasedPartTIme extends PartTime implements IPrintable {
    private boolean isCommission;
    private int Commission;


    public CommissionBasedPartTIme(String name, int age, boolean isPartTime, double hrRate, int hoursWorked, int commission, boolean isCommission) {
        super(name, age, isPartTime, hrRate, hoursWorked);
        this.Commission = commission;
        this.isCommission = isCommission;
    }

    public boolean isCommission() {
        return isCommission;
    }

    public void setCommission(boolean commission) {
        isCommission = commission;
    }

    public int getCommission() {
        return Commission;
    }

    public void setCommission(int commission) {
        Commission = commission;
    }

    public static double calcEarnings(double hrRate, int hoursWorked, int Commission) {

        return (hrRate * hoursWorked) + Commission;
    }

    public void printMyData() {
        if (isPartTime() == true) {
            if (isCommission == true)
                System.out.println("Name: "+getName());
                System.out.println("Year of Birth: "+ calcBirthYear(getAge()));
                System.out.println("Employee is Part Time Commissioned");
                System.out.println("    -- Rate: "+getHrRate());
                System.out.println("    -- Hours Worked: "+getHoursWorked());
                System.out.println("    -- Commission: "+getCommission()+"%");
                System.out.println("    -- Earnings: "+calcEarnings(getHrRate(),getHoursWorked(),getCommission()));

        }

        else{
            System.out.println("gg");
        }


    }
}
