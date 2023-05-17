public class Rotar {
    public static void main(String args[]) {
        int [] arr = {1,2,3,4};
        int [] arrIn = new int [arr.length];
        arrIn = rotar(arr);
        // d = 3;
        /*
        for (int i=0; i<=d; i++){
            arrIn = rotar(arr);
        }
        */
        System.out.println(arrIn[0]+" "+arrIn[1]+" "+arrIn[2]+" "+arrIn[3]);
    }
    public static int[] rotar(int[] a){
        int c = a[0];
        int [] b = new int[a.length];
        for(int i =0; i<a.length-1;i++){
            b[i]=a[++i];
        }
        b[a.length-1] = c;
        return b;
    }
}