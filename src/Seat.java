interface Seat {
    String Cargroup();
    int seatnumber();  
}

class group1 implements Seat{
    public String Cargroup()
    {
        return "Racing Car";
    }

    public int seatnumber()
    {
        return 1;
    }
}

class group2 implements Seat{
    public String Cargroup()
    {
        return "Private Car";
    }

    public int seatnumber()
    {
        return 5;
    }
}

class group3 implements Seat{
    public String Cargroup()
    {
        return "SUV";
    }

    public int seatnumber()
    {
        return 15;
    }
}

class group4 implements Seat{
    public String Cargroup()
    {
        return "Military Vehicle";
    }

    public int seatnumber()
    {
        return 7;
    }
}