public class InternetAccess implements IPayment2 {
    int rate;

    public InternetAccess(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        return this.rate;
    }

    @Override
    public String getName() {
        return "Internet Access";
    }

}
