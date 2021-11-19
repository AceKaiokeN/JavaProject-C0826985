abstract class PartTime extends Employee {

    private boolean isPartTime;
     private double hrRate;
     private int hoursWorked;

    public PartTime(String name, int age, boolean isPartTime, double hrRate, int hoursWorked) {
        super(name, age);
        this.isPartTime = isPartTime;
        this.hrRate = hrRate;
        this.hoursWorked = hoursWorked;
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    public void setPartTime(boolean partTime) {
        isPartTime = partTime;
    }

    public double getHrRate() {
        return hrRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHrRate(double hrRate) {
        this.hrRate = hrRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }



}
