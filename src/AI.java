interface AI {
    String ai1 = "Asia Based Automated Driving AI";
    String ai2 = "USA Based Automated Driving AI";

    // Customer can NOT choose
    // It is based on GEOGRAPHICAL AREA

    String Area();
    int num();
}

// Asia based Automated Driving AI
class area1 implements AI{

    public String Area()
    {
        return "Asia Based Automated Driving AI";
    }
    public int num()
    {
        return 1;
    }
}


//USA based Automated Driving AI
class area2 implements AI{

    public String Area()
    {
        return "USA Based Automated Driving AI";
    }
    public int num()
    {
        return 2;
    }
}