package basic.viii_interoper;

import basic.iii_classes.Customer;
import basic.iii_classes.Employee;
import basic.viii_interoper.MyUtilClass;

import java.io.IOException;

/**
 * Interop with java
 */

public class TalkingToKotlin {

    public static void main(String[] args) {
        Employee employee = new Employee("rachit@gmail.com");
        Employee employee2 = new Employee(1, "Rachit");
        System.out.println(employee.getEmail());
        Customer customer = new Customer(1, "Rachit");
        String myJvmField = customer.myJvmField;
        customer.changeStatus(Customer.Status.APPROVED);
        customer.changeStatus();
        customer.preferential();

        try {
            customer.throwsException();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println(MyUtilClass.prefix("Dr", "Rachit")); // Calling prefix functions from java
    }
}
