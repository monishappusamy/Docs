import java.util.LinkedHashMap;

class TestClass {
    public static void main(String args[]){
        Employee employee = new Employee();
        employee.setId(3456);
        employee.setAge(40);
        employee.setMarried(true);
        employee.setFirstName("jane");
        employee.setLastName("doe");
        employee.setSalary(90000.456f);
        employee.setHeight(6.5);

        LinkedHashMap<String, Object> filterConditions = new LinkedHashMap<>();
        filterConditions.put("id", 3456);
        filterConditions.put("firstName", "test");
        filterConditions.put("lastName", "doe");
        filterConditions.put("age", 40);
        filterConditions.put("salary", 90000.456f);
        filterConditions.put("height", 6.5);
        filterConditions.put("isMarried", true);

        String status = employee.filterCondition(filterConditions);

        if(!status.equals(""))
            System.out.println(status);
        else
            System.out.println("Passed");
    }

    static void printStatus(boolean status){
        System.out.println(status);
    }

}
