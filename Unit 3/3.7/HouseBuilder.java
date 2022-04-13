public class HouseBuilder {
    public static void main(String[] args){
        House myHouse = new House("Green", 1850, 3);
        House annasHouse = new House("Green", 1850, 3);
        House bobsHouse;
        House momsHouse = myHouse;
        bobsHouse = new House("Blue", 2400, 3);

        if(myHouse == momsHouse){
            System.out.println("These are aliases for the same House object.");
        }else{
            System.out.println("These are two different objects.");
        }

        if(momsHouse != annasHouse){
            System.out.println("These ae tweo different Hosue objects.");
        }else{
            System.out.println("These are the same object.");
        }
    }
}
