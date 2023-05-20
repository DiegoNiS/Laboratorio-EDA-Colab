public class Rotar {
    public static void main(String args[]) {
        int d = 2;
        int [] a = {1,2,3,4,5};
        int [] aIz = a;
        for(int i = 0; i < d; i++){
            aIz = rotarIzquierdaArray(aIz);
        }
        System.out.println("A = ["+a[0]+", "+a[1]+", "+a[2]+", "+a[3]+", "+a[4]+"]");
        System.out.println("Aiz = ["+aIz[0]+", "+aIz[1]+", "+aIz[2]+", "+aIz[3]+", "+aIz[4]+"]");
    }
    public static int[] rotarIzquierdaArray(int [] a){
        int [] aIz = new int [a.length];
        int num = a[0];
        for (int i = 0; i < a.length-1 ; i++){
            aIz[i] = a[i+1];
        }
        aIz[aIz.length-1] = num;
        return aIz;
    }
}