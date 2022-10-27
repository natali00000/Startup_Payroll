public class Cleaner implements IPayment2{
    int DayOfWork;
    int rate;

    public Cleaner(int dayOfWork, int rate) {
        DayOfWork = dayOfWork;
        this.rate = rate;
    }

    public int getDayOfWork() {
        return DayOfWork;
    }

    public void setDayOfWork(int dayOfWork) {
        DayOfWork = dayOfWork;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        return this.DayOfWork * this.rate;
    }

    @Override
    public String getName() {
        return "Cleaner";
    }

}
