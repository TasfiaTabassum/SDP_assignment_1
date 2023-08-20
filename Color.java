interface Color {
    String color1 = "Red" ;
    String color2 = "White" ;
    String color3 = "Grey" ;
    String color4 = "Balck" ;

    //customer can choose

    String colorName();
    int value();
}

// color1 is declared here
class color1 implements Color{

    public String colorName(){
        return "red";
    }

    public int value(){
        return 1;
    }
}

// color2 is declared here
class color2 implements Color{

    public String colorName(){
        return "White";
    }

    public int value(){
        return 2;
    }
}

// color3 is declared here
class color3 implements Color{

    public String colorName(){
        return "grey";
    }

    public int value(){
        return 3;
    }
}

// color4 is declared here
class color4 implements Color{

    public String colorName(){
        return "Black";
    }

    public int value(){
        return 4;
    }
}