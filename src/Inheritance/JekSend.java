package Inheritance;

class JekSend extends OjekOnline{
    private double jarak;
    private double weight;
    private double priceOrder;
    
    JekSend(String orderNoMasuk, String typeOrderMasuk, String userOrderMasuk, double jarakMasuk, double weightMasuk){
        super(orderNoMasuk, typeOrderMasuk, userOrderMasuk);
        jarak = jarakMasuk;
        weight = weightMasuk;
        priceOrder = (weight*3000)+(jarak*4000); //per 1kg = 3000 dan per 1km = 4000
    }

    void display(){
        System.out.println("Jarak tempuh : " + jarak);
        System.out.println("Total Price : (" + weight + " x " + 3000 + ") + (" + jarak + " x " + 4000 + ") = Rp" + priceOrder);
    }
}
