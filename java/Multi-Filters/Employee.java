import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    private int id;
    private float salary;
    private int age;
    private double height;
    private String firstName;
    private String lastName;
    private boolean isMarried;

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String filterCondition(LinkedHashMap<String, Object> filterConditions){
        Class clazz = this.getClass();
        String status = "";

        for(Map.Entry<String, Object> condition : filterConditions.entrySet()){
            try {
                Field field = clazz.getDeclaredField(condition.getKey());
                if(!field.get(this).equals(condition.getValue())){
                    status = status + "Condition failed for field ----> (" + condition.getKey() +
                            ") with value  ----> (" + condition.getValue() + ")\n";
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return status;
    }
}
