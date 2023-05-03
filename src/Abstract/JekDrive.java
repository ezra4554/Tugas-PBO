package Abstract;

class JekDrive extends OjekOnline{
    private double jarak;
    private double priceOrder;

    //pada jekdrive menggunakan jarak
    JekDrive(String orderNoMasuk, String typeOrderMasuk, String userOrderMasuk, double jarakMasuk){
        super(orderNoMasuk, typeOrderMasuk, userOrderMasuk);
        jarak = jarakMasuk;
        priceOrder = jarakMasuk * 5000; //per 1km = 5000
    }

    void display(){
        System.out.println("Jarak tempuh : " + jarak);
        System.out.println("Total Price : " + jarak + " x " + 5000 + " = Rp" + priceOrder);
    }
    void displayInfo(){
        System.out.println("=====================");
        System.out.println("Order No : " + this.orderNo);
        System.out.println("Type Order : " + super.typeOrder);
        System.out.println("Pelanggan : " + super.userOrder);
    }
}
