public class Production {
    private String name;
    private int price;
    private String store;
    private String introduction;

    @Override
    public String toString() {
        return "Production{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", store='" + store + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
