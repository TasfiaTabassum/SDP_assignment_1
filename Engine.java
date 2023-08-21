// Here we used interface as it helps us to use multiple inheritance
// Here strategy pattern is used

interface engine {

    String engineName();
    int value();

}

// here we implement the 1300CC  Engine configuration
class Engine1 implements engine{

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
class Engine2 implements engine{

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
class Engine3 implements engine{

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
class Engine4 implements engine{

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

public class Engine{
    public static void main(String[] args){
        engine engine1 = new Engine1();
        engine engine2 = new Engine2();
        engine engine3 = new Engine3();
        engine engine4 = new Engine4();

        System.out.println("Enter the name of the Engine1: "+ engine1+ "Enter the value: "+ engine1.value());
        System.out.println("Enter the name of the Engine2: "+ engine1+ "Enter the value: "+ engine2.value());
        System.out.println("Enter the name of the Engine3: "+ engine1+ "Enter the value: "+ engine3.value());
        System.out.println("Enter the name of the Engine4: "+ engine1+ "Enter the value: "+ engine4.value());







    }

}