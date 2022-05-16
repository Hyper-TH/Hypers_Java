package space;

public class HugeSpaceShip extends SpaceShip implements LazerShooter {
    private Integer crew;

    private Cargo cargo;
    // private String cargo;

    // public HugeSpaceShip(Integer crew, String cargo) {
    // this.crew = crew;
    // this.cargo = cargo;
    // }

    // public HugeSpaceShip(String model, String captain, Integer fuel, Integer
    // crew, String cargo) {
    // public HugeSpaceShip(String model, Integer fuel, Integer crew, Cargo cargo) {
    public HugeSpaceShip(SpaceShipType model, Integer fuel, Integer crew, Cargo cargo) {
        super(model, fuel); // extends Space Ship
        this.crew = crew;
        this.cargo = cargo;
    }

    // Inner class
    public class Captain {
        private String name;

        public Captain(String name) {
            this.name = name;
        }

        public void giveStatus() {
            System.out.println("Hi my name is " + name + "we have " + crew + "crew members aboard.");
            System.out.println("Enjoy your flight with " + getModel());
        }
    }

    // Nested class
    public static class Cargo {
        private String type;
        private Integer qty;

        public Cargo(String type, Integer qty) {
            this.type = type;
            this.qty = qty;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getQty() {
            return qty;
        }

        public void setQty(Integer qty) {
            this.qty = qty;
        }

    }

    public Integer getCrew() {
        return crew;
    }

    public void setCrew(Integer crew) {
        this.crew = crew;
    }

    // public String getCargo() {
    // return cargo;
    // }

    // public void setCargo(String cargo) {
    // this.cargo = cargo;
    // }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + " - HugeSpaceShip [" +
                "cargo=" + cargo + ", " +
                "crew=" + crew +
                "]";
    }

    // @Override
    // public void flyAround() {
    //     // super.flyAround();

    //     // System.out.println("FREAKIN NYOOOOOOM");
    //     System.out.println(getModel().getSoundWhenFlying());
    // }

    @Override
    public void practiceShoot() {
        // TODO Auto-generated method stub
        System.out.println("Pew Pew pew");
    }
}
