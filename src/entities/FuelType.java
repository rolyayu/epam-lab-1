package entities;

public enum FuelType {
    GAS{
        public String type() {return "Газ";}
        public int averageMileage() {return 30000;};
    },PETROL{
        public String type() {return "Бензин";}
        public int averageMileage() {return 20000;}
    },DIESEL{
        public String type() {return "Дизель";}
        public int averageMileage() {return 40000;}
    };
    public abstract String type();
    public abstract int averageMileage();
}
