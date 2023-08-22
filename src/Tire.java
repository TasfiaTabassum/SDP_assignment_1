interface tire {
    String TireName();
    int value();
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
