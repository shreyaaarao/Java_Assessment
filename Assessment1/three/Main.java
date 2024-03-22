package Assessment1.three;

import Assessment1.one.Address;
import Assessment1.two.Employee;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a Map<Employee, Address> to hold Employee to Address data
        Map<Employee, Address> employeeAddressMap = new HashMap<>();

        // Add sample data to the map
        Employee emp1 = new Employee(1, "Shreya");
        Address address1 = new Address(101, "First Street", "Bengaluru", 12345);
        employeeAddressMap.put(emp1, address1);

        Employee emp2 = new Employee(2, "Shravya");
        Address address2 = new Address(202, "MG", "Shimoga", 67890);
        employeeAddressMap.put(emp2, address2);

        Employee emp3 = new Employee(3, "Anvitha");
        Address address3 = new Address(303, "Second Street", "Chikmagaluru", 45678);
        employeeAddressMap.put(emp3, address3);

        // Invoke getAddress #4 and print the address
        Employee emp4 = new Employee(4, "Nischitha");
        Address address4 = employeeAddressMap.get(emp4);
        if (address4 != null) {
            System.out.println("Address for Employee #4: " + address4);
        } else {
            System.out.println("No address found for Employee #4");
        }
    }
}