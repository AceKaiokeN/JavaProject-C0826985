
abstract class Vehicle {

private String RegNo;

    public Vehicle(String regNo) {
        this.RegNo = regNo;
    }

    public String getRegNo() {
        return RegNo;
    }

    public void setRegNo(String regNo) {
        RegNo = regNo;
    }
}


interface IPrintable{

    abstract void printMyData();



}

