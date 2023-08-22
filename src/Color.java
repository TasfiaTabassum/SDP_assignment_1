interface color {
    String colorName();
    int value();
}

// color1 is declared here
class color1 implements color{

    public String colorName(){
        return "red";
    }

    public int value(){
        return 1;
    }
}

// color2 is declared here
class color2 implements color{

    public String colorName(){
        return "White";
    }

    public int value(){
        return 2;
    }
}

// color3 is declared here
class color3 implements color{

    public String colorName(){
        return "grey";
    }

    public int value(){
        return 3;
    }
}

// color4 is declared here
class color4 implements color{

    public String colorName(){
        return "Black";
    }

    public int value(){
        return 4;
    }
}

public class Color{
    public static void main(String[] args){

        color col1 = new color1(); 
        color col2 = new color2(); 
        color col3 = new color3(); 
        color col4 = new color4(); 
         
        System.out.println("Enter the name of the Color1: "+ col1+ "Enter the value: "+ col1.value());
        System.out.println("Enter the name of the Color2: "+ col2+ "Enter the value: "+ col2.value());
        System.out.println("Enter the name of the Color3: "+ col3+ "Enter the value: "+ col3.value());
        System.out.println("Enter the name of the Color4: "+ col4+ "Enter the value: "+ col4.value());



    }
}