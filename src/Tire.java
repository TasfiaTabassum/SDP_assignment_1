interface tire {

    String TireName();
    int value();
    // customers can choose tire
}

// features of 'snow' tire
class tire1 implements tire{

    @Override
    public String TireName(){
        return "Snow";
    }

    public int value(){
        return 1;
    }

}


// features of 'Spare' tire
class tire2 implements tire{

    @Override
    public String TireName(){
        return "Spare";
    }

    public int value(){
        return 2;
    }

}

// features of 'Whiteall' tire
class tire3 implements tire{

    @Override
    public String TireName(){
        return "Whitewall";
    }

    public int value(){
        return 3;
    }

}

// features of 'slick' tire
class tire4 implements tire{

    @Override
    public String TireName(){
        return "Slick";
    }

    public int value(){
        return 4;
    }

}

public class Tire{
    public static void main(String[] args){

        tire Tire1 = new tire1(); 
        tire Tire2 = new tire2(); 
        tire Tire3 = new tire3(); 
        tire Tire4 = new tire4(); 
         
        System.out.println("Enter the name of the Tire1: "+ Tire1+ "Enter the value: "+ Tire1.value());
        System.out.println("Enter the name of the Tire2: "+ Tire2+ "Enter the value: "+ Tire2.value());
        System.out.println("Enter the name of the Tire3: "+ Tire3+ "Enter the value: "+ Tire3.value());
        System.out.println("Enter the name of the Tire4: "+ Tire4+ "Enter the value: "+ Tire4.value());



    }
}