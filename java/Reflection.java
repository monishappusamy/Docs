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
