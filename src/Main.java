public class Main {

    public static void main(String args[])
    {
        CommissionBasedPartTIme pt = new CommissionBasedPartTIme("Kaioken",22,true,20.5,400,15,true);
        pt.printMyData();
        Car cr = new Car("GJ06","SUV","Red",true);
        cr.printMyData();
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        FixedBasedPartTime ft = new FixedBasedPartTime("Goku",45,true,20,250,true,25);
        ft.printMyData();
        Motorcycle mt = new Motorcycle("MK07",true,"Sports","blue");
        mt.printMyData();
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        FullTime Fut = new FullTime("Vegeta",48,true,78000,12000);
        Fut.printMyData();
        Car gg = new Car("","","",false);
        gg.printMyData();
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        Intern it = new Intern("Gohan",18,true,"Lambton College",1500);
        it.printMyData();
        Motorcycle mr = new Motorcycle("HJK01",true,"GT","Yellow");
        mr.printMyData();

        System.out.println("----------------------------------------------------------------------------------------------------------------");

        double Earnings1 = pt.calcEarnings(20.5,400,15);
        double Earnings2 = ft.calcEarnings(20,250,25);
        double Earnings3 = Fut.calcEarnings(78000,12000);
        double Earnings4 = it.getEarnings();
        System.out.println("Total Payroll : " +(Earnings1+Earnings2+Earnings3+Earnings4));



    }

}



