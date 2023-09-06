class militaryCar extends Car{
    public militaryCar(Engine engine, Tire tire, Chassis chassis, AC ac, Color color, carBodyDesign bodyDesign, AI automatedAI, Seat seat) {
        this.engine = engine;
        this.tire = tire;
        this.chassis = chassis;
        this.ac = ac;
        this.color = color;
        this.bodyDesign = bodyDesign;
        this.automatedAI = automatedAI;
        this.seat = seat;
    }
    @Override
    public double getCarPrice() {
        return engine.getEnginePrice() + tire.getTirePrice() + chassis.getChassisPrice() + ac.getACPrice() + color.getColorPrice() + bodyDesign.getBodyDesignPrice() + automatedAI.getCost();
    }
    @Override
    public String getCarDetails() {
        return "Military Car Details: " + engine.getEngineType() + ", " + tire.getTireType() + ", " + chassis.getChassisType() + ", " + ac.getACType() + ", " + color.getColorType() + ", " + bodyDesign.getBodyDesignType() + ", " + automatedAI.getRegion() + ", " + seat.seatType();
    }
}