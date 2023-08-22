interface ac {
    String AcType();
    int val();
}

//high-powered AC is configured
class highPowered implements ac{

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
class lowPowered implements ac{

    public String AcType()
    {
        return "Low-powered";
    }
    public int val()
    {
        return 2;
    }
}
