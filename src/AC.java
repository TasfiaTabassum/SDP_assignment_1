interface AC {
    String ac1 = "High-powered" ;
    String ac2 = "Low-powered" ;

    // customer can choose

    String AcType();
    int val();
}

//high-powered AC is configured
class highPowered implements AC{

    public String AcType()
    {
        return "High-powered";
    }
    public int val()
    {
        return 1;
    }
}

//lowPowered AC is configured
class lowPowered implements AC{

    public String AcType()
    {
        return "Low-powered";
    }
    public int val()
    {
        return 2;
    }
}