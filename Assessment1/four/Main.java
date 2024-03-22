package Assessment1.four;

import Assessment1.one.Address;
import Assessment1.two.Employee;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a Map<Employee, Address> to hold Employee to Address data
        Map<Employee, Address> employeeAddressMap = new HashMap<>();

        // Add sample data to the map
        Employee emp1 = new Employee(101, "Shreya");
        Address address1 = new Address(1, "First Street", "Bengaluru",12345);
        employeeAddressMap.put(emp1, address1);

        Employee emp2 = new Employee(202, "Shravya");
        Address address2 = new Address(2, "Second Street", "Shimoga", 67890);
        employeeAddressMap.put(emp2, address2);

        Employee emp3 = new Employee(303, "Anvitha");
        Address address3 = new Address(3, "Third Street", "Chikmagalury", 45678);
        employeeAddressMap.put(emp3, address3);

        // Invoke getAddress method for a specific Employee and print the address
        Employee empToFind = new Employee(101, "Nischitha");
        getAddress(employeeAddressMap, empToFind);
    }

    public static void getAddress(Map<Employee, Address> employeeAddressMap, Employee employee) {
        Address foundAddress = employeeAddressMap.get(employee);
        if (foundAddress != null) {
            System.out.println("Address for Employee " + employee + ": " + foundAddress);
        } else {
            System.out.println("Employee " + employee + " does not exist in the map.");
        }
    }
}
