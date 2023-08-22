interface chassis {
    String chesis1 = "Tabular";
    String chesis2 = "Backbone";
    String chesis3 = "Ladder Frame";

    // customer can choose

    String ChassisType();
    int value();
}

// Here the chassistype1 is configured
class type1 implements chassis{

    public String ChassisType(){
        return "Tabular";
    }

    public int value(){
        return 1;
    }

}

// Here the chassistype2 is configured
class type2 implements chassis{

    public String ChassisType(){
        return "Backbone";
    }

    public int value(){
        return 2;
    }

}

// Here the chassistype3 is configured
class type3 implements chassis{

    public String ChassisType(){
        return "Ladder frame";
    }

    public int value(){
        return 3;
    }

}

public class Chassis{
    public static void main(String[] args){

        chassis ch1 = new type1(); 
        chassis ch2 = new type2(); 
        chassis ch3 = new type3(); 
       
         
        System.out.println("Enter the name of the Chassis type1: "+ ch1+ "Enter the value: "+ ch1.value());
        System.out.println("Enter the name of the Chassis type2: "+ ch2+ "Enter the value: "+ ch2.value());
        System.out.println("Enter the name of the Chassis type3: "+ ch3+ "Enter the value: "+ ch3.value());
    } 
}