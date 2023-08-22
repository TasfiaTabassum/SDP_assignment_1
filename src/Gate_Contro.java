interface Gate{
    public String ControlType();
    public int value();
}

class type1 implements Gate{
    public String ControlType(){
        return "Remote Based";
    }
    public int value(){
        return 1;
    }
}


class type2 implements Gate{
    public String ControlType(){
        return "Mobile App Based";
    }
    public int value(){
        return 2;
    }
}