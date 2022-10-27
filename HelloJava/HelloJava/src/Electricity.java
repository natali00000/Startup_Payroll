public class Electricity implements IPayment2 {
    int unit;
    int rate;

    public Electricity(int unit, int rate) {
        this.unit = unit;
        this.rate = rate;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        return this.unit * this.rate;
    }

    @Override
    public String getName() {
        return "Electricity";
    }

}
