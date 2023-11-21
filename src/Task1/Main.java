package Task1;
//Написать try/catch/finally, в котором finally вызван не будет
public class Main {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        try {
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.exit(1);
        }finally {
            System.out.println("конец!");
        }
    }
}
