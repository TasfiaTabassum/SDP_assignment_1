interface Bumper {
    public String BUmperType();
    public int value();
}

class type1 implements Bumper{
    public String BUmperType(){
        return "Loosen Big Bumper";
    }
    public int value(){
        return 1;
    }
}


class type2 implements Bumper{
    public String BUmperType(){
        return "Tight Small Bumper";
    }
    public int value(){
        return 2;
    }
}