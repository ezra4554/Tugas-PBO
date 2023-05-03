package Abstract;

class JekFood extends OjekOnline{
    private String foodName;
    private int priceFoods;
    private int qtyFoods;
    
    JekFood(String orderNoMasuk, String typeOrderMasuk, String userOrderMasuk, String foodMasuk, int priceFood, int qtyFood){
        super(orderNoMasuk, typeOrderMasuk, userOrderMasuk);
        foodName = foodMasuk;
        qtyFoods = qtyFood;
        priceFoods = priceFood;
    }

    void display(){
        System.out.println("Food Name : " + foodName);
        System.out.println("Total Price : " + qtyFoods + " x " + priceFoods + " = Rp" + (qtyFoods*priceFoods));
    }
    void displayInfo(){
        System.out.println("=====================");
        System.out.println("Order No : " + orderNo);
        System.out.println("Type Order : " + typeOrder);
        System.out.println("Pelanggan : " + userOrder);
    }
}
