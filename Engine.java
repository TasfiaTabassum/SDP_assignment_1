// Here we used interface as it helps us to use multiple inheritance
interface Engine {

    String engineName();
    int value();

}

// here we implement the 1300CC  Engine configuration
class Engine1 implements Engine{

    @Override
    public String engineName()
    {
        return "1300CC Engine";
    }

    public int value()
    {
       return 1300;
    }

}


// here we implement the 1700CC  Engine configuration
class Engine2 implements Engine{

    @Override
    public String engineName()
    {
        return "1700CC Engine";
    }

    public int value()
    {
       return 1700;
    }

}

// here we implement the 1800CC  Engine configuration
class Engine3 implements Engine{

    @Override
    public String engineName()
    {
        return "1800CC Engine";
    }

    public int value()
    {
       return 1800;
    }

}

// here we implement the 2100CC  Engine configuration
class Engine4 implements Engine{

    @Override
    public String engineName()
    {
        return "2100CC Engine";
    }

    public int value()
    {
       return 2100;
    }

}