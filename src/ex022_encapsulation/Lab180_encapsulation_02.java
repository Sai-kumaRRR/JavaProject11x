package ex022_encapsulation;

public class Lab180_encapsulation_02 {
    public void main(String[] args) {
        ICICIBank sai = new ICICIBank("Sai", 100);
        long bal = sai.getBal();
        System.out.println(bal);


        // sai.setBal(500, true);

        // sai.setBal(500, false);

        long bal_updated = sai.getBal();
        System.out.println(bal_updated);

    }
}

class ICICIBank {
    // data members should be private in nature.
    // methods with getter and setter only , you can access the data  members

    private final String name;
    private final long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;

    }
}

public void setNameOutside(String name) {
    this.name = name;

}

public long getBalance() {
    return bal;

}

public viod setBal(long bal, boolean isCashier) {
    if (isCashier) {
        this.bal = bal;
    }
}