/*
* Purpose: Define a Car object
*/

public class Car2 {
    private String make;
    private boolean isSports;
    private String owner;

    public Car2(String mk, boolean sports, String own){
        make = mk;
        isSports = sports;
        owner = own;
    }

    public Car2(String mk, boolean sports){
        make = mk;
        isSports = sports;
        owner = null;
    }
}
