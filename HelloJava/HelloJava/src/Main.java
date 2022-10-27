import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<IPayment> staffs = new ArrayList<IPayment>();
        // Staffs Payment
        Developer dev1 = new Developer("John Doe",35000, 20, 500);
        staffs.add(dev1);
        Developer dev2 = new Developer("Marry Ann",35000, 10, 300);
        staffs.add(dev2);
        Developer dev3 = new Developer("John Doe",35020, 20, 500);
        staffs.add(dev3);
        CEO ceo1 = new CEO("Elon Musk", 150000, 4, 20000);
        staffs.add(ceo1);
        Marketing marketing1 = new Marketing("Sara Wong",30000,2,500);
        staffs.add(marketing1);

        ArrayList<IPayment2> payments = new ArrayList<IPayment2>();
        // External Payment
        Driver driv1 = new Driver(3, 300);
        payments.add(driv1);
        Cleaner cln1 = new Cleaner(4, 500);
        payments.add(cln1);

        // Include Payment
        Rental rent1 = new Rental(300);
        payments.add(rent1);
        Electricity elec1 = new Electricity(1500, 7);
        payments.add(elec1);
        InternetAccess interac1 = new InternetAccess(1500);
        payments.add(interac1);

        float totalPayment1 = 0.0f;
        float totalPayment2 = 0.0f;
        System.out.println("============== Staff Payment ==============");
        for (IPayment staff : staffs) {
//            System.out.println(staff.getName() + " = " + staff.getPayment());
            System.out.println(staff.getName() + " = " + staff.getPayment() + ", tax 3% = " + staff.calcTax());
            totalPayment1 += staff.getPayment() - staff.calcTax();
        }
        System.out.println("===== Total Staff Payment with tax 3% =====");
        System.out.println("Total Payment = " + totalPayment1);
        System.out.println("============= External Payment ============");
        for (IPayment2 payment : payments) {
            System.out.println(payment.getName() + " = " + payment.getPayment());
            totalPayment2 += payment.getPayment();
        }
        float totalPayment3 = totalPayment1 + totalPayment2;
        System.out.println("============== Total Payment ==============");
        System.out.println("All Total Payment = " + totalPayment3);
        System.out.println("===========================================");
    }
}