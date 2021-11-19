public class FixedBasedPartTime extends PartTime implements IPrintable{
    private boolean isFixed;
  private double fixedAmount;

    public FixedBasedPartTime(String name, int age, boolean isPartTime, double hrRate, int hoursWorked, boolean isFixed, double fixedAmount) {
        super(name, age, isPartTime, hrRate, hoursWorked);
        this.isFixed = isFixed;
        this.fixedAmount = fixedAmount;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public static double calcEarnings(double hrRate, int hoursWorked, double fixedAmount){

        return (hrRate * hoursWorked) + fixedAmount;
    }

    public void printMyData() {

        if (isPartTime() == true) {
            if (isFixed == true)
                System.out.println("Name: "+getName());
                System.out.println("Year of Birth: "+ calcBirthYear(getAge()));
                System.out.println("Employee is Part Time / Fixed Amount");
                System.out.println("    -- Rate: "+getHrRate());
                System.out.println("    -- Hours Worked: "+getHoursWorked());
                System.out.println("    -- Fixed Amount: "+getFixedAmount());
                System.out.println("    -- Earnings: "+calcEarnings(getHrRate(),getHoursWorked(),getFixedAmount()));

        }

        else{
            System.out.println("gg");
        }


    }

}
