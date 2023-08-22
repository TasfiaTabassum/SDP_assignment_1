interface Seat {
    String Cargroup();
    int seatnumber();  
}

class group1 implements Seat{
    public String Cargroup()
    {
        return "Car group : Racing Car and it has " + this.seatnumber() + " number of seats. ";
    }

    public int seatnumber()
    {
        return 1;
    }
}

class group2 implements Seat{
    public String Cargroup()
    {
        return "Car group : Private Car and it has " + this.seatnumber() + " number of seats. ";
    }

    public int seatnumber()
    {
        return 5;
    }
}

class group3 implements Seat{
    public String Cargroup()
    {
        return "Car group : SUV and it has " + this.seatnumber() + " number of seats. ";
        
    }

    public int seatnumber()
    {
        return 15;
    }
}

class group4 implements Seat{
    public String Cargroup()
    {
        return "Car group : Military Vehicle and it has " + this.seatnumber() + " number of seats. ";
    }

    public int seatnumber()
    {
        return 7;
    }
}