class Product {
    private int id;
    private String name;
    boolean soldout;

    Product(int id, String name, boolean soldout) {
        this.id = id;
        this.name = name;
        this.soldout = soldout;
    }

    @Override
    public String toString() {
        return "No." + id + " " + name + (soldout ? " (εεγδΈ­)" : "");
    }
}
