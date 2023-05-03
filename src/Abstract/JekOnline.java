package Abstract;

abstract class OjekOnline {
    protected String orderNo;
    protected String typeOrder;
    protected String userOrder;

    //constructor super
    OjekOnline(String orderNo, String typeOrder, String userOrder){
        this.orderNo = orderNo;
        this.typeOrder = typeOrder;
        this.userOrder = userOrder;
    }
    abstract void displayInfo();
}