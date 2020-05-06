import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> contentsOfWallet;

    public Wallet(String name) {
        this.name = name;
        this.contentsOfWallet = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.contentsOfWallet.size();
    }

    public void addItem(IScan item) {
        this.contentsOfWallet.add(item);
    }
}
