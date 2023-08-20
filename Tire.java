public interface Tire {
    String tire1 = "Snow";
    String tire2 = "Spare";
    String tire3 = "Whitewall";
    String tire4 = "Slick";

    String TireName();
    int value();

    // customers can choose tire
}

// features of 'snow' tire
class tire1 implements Tire{

    @Override
    public String TireName(){
        return "Snow";
    }

    public int value(){
        return 1;
    }

}


// features of 'Spare' tire
class tire2 implements Tire{

    @Override
    public String TireName(){
        return "Spare";
    }

    public int value(){
        return 2;
    }

}

// features of 'Whiteall' tire
class tire3 implements Tire{

    @Override
    public String TireName(){
        return "Whitewall";
    }

    public int value(){
        return 3;
    }

}

// features of 'slick' tire
class tire4 implements Tire{

    @Override
    public String TireName(){
        return "Slick";
    }

    public int value(){
        return 4;
    }

}