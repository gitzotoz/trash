public class main {
    public static void main(String[] args) {
        int n = 100;
        double array[] = new double[n];
        for(int i=0; i<array.length; i++){
            array[i] = Math.random();
            System.out.println(array[i]);
        }
    }
}
