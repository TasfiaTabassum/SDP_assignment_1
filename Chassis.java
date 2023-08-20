interface Chassis {
    String chesis1 = "Tabular";
    String chesis2 = "Backbone";
    String chesis3 = "Ladder Frame";

    // customer can choose

    String ChassisType();
    int value();
}

// Here the chassistype1 is configured
class type1 implements Chassis{

    public String ChassisType(){
        return "Tabular";
    }

    public int value(){
        return 1;
    }

}

// Here the chassistype2 is configured
class type2 implements Chassis{

    public String ChassisType(){
        return "Backbone";
    }

    public int value(){
        return 2;
    }

}

// Here the chassistype3 is configured
class type3 implements Chassis{

    public String ChassisType(){
        return "Ladder frame";
    }

    public int value(){
        return 3;
    }

}