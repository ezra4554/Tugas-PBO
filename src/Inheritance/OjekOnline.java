package Inheritance;

class OjekOnline {
    private String orderNo;
    private String typeOrder;
    private String userOrder;

    //constructor super
    OjekOnline(String orderNo, String typeOrder, String userOrder){
        this.orderNo = orderNo;
        this.typeOrder = typeOrder;
        this.userOrder = userOrder;
    }
    void displayInfo(){
        System.out.println("=====================");
        System.out.println("Order No : " + orderNo);
        System.out.println("Type Order : " + typeOrder);
        System.out.println("Pelanggan : " + userOrder);
    }    
}