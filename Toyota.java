interface Toyota {
    String getName();
    int value();
}

class racing_car implements Toyota{
    public String getName(){
        return "Racing Car";
    }

    public int value(){
        return 1;
    }

}

class Private_car implements Toyota{
    public String getName(){
        return "Private Car";
    }

    public int value(){
        return 2;
    }

}

class SUV implements Toyota{
    public String getName(){
        return "SUV";
    }

    public int value(){
        return 3;
    }

}

class Military_Vehicle implements Toyota{
    public String getName(){
        return "Military Vehicle";
    }

    public int value(){
        return 4 ;
    }

}