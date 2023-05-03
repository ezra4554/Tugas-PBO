package Abstract;

public class JekApp {
    public static void main(String[]args){
    //OjekOnline info = new OjekOnline(0, null, null)
    //Order No, Type Order, Name User, Jarak
    JekDrive drive = new JekDrive("001", "JekDrive", "Dadang", 3);
    drive.displayInfo(); //tampilkan info dari super class
    drive.display();

    //Order No, Type Order, Name User, Name Food, Price Food, Qty Food 
    JekFood food = new JekFood("002", "JekFood", "Dudung", "Rendang", 7000, 3);
    food.displayInfo(); //tampilkan info dari super class
    food.display();
    
    //Order No, Type Order, Name User, Jarak, Weight
    JekSend send = new JekSend("003", "JekSend", "Dedeng", 7.5, 5);
    send.displayInfo(); //tampilkan info dari super class
    send.display();
    }
}
