public class reverseArray {
    public static void main(String[] args){
        double [] list = {1.1, 2.2, 3.3, 4.4, 5.5};

        for(int i  = 0; i < list.length / 2; i++){
            double temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }

        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
