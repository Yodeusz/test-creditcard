package pl.jszk.creditcard;

class CreditCard {
    private double limit = 500;
    private boolean blockade = false;
    
    public void assignLimit(double limit) {
        this.limit = limit;
    }
    
    public double getLimit() {
        return this.limit;
    }
    
    public void block() {
        this.blockade = true;
    }
    
    public boolean isBlocked() {
        return this.blockade;
    }
    
    public boolean withdraw(double money) {
        double limitAfterWithdraw = this.limit - money;
        if (limitAfterWithdraw <= 0) {
            return false;
        }
        this.limit = limitAfterWithdraw;
        return true;
    }
}