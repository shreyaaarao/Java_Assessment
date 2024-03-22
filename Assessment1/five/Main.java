package Assessment1.five;

import Assessment1.one.Address;
import Assessment1.two.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Employee, Address> employeeAddressMap = new HashMap<>();


        Employee emp1 = new Employee(101, "Shreya");
        Address address1 = new Address(1, "First Street", "Bengaluru", 12345);
        employeeAddressMap.put(emp1, address1);

        Employee emp2 = new Employee(202, "Shravya");
        Address address2 = new Address(2, "Second Street", "Shimoga", 67890);
        employeeAddressMap.put(emp2, address2);

        Employee emp3 = new Employee(303, "Anvitha");
        Address address3 = new Address(3, "Third Street", "Chikmagaluru", 45678);
        employeeAddressMap.put(emp3, address3);


        Collection<Address> addresses = employeeAddressMap.values();


        Set<String> distinctCities = new HashSet<>();
        for (Address address : addresses) {
            distinctCities.add(address.getCity());
        }

        List<String> distinctCitiesList = new ArrayList<>(distinctCities);
        Collections.sort(distinctCitiesList);

        // Print the distinct cities in ascending order
        System.out.println("Distinct cities in ascending order:");
        for (String city : distinctCitiesList) {
            System.out.println(city);
        }
    }
}
