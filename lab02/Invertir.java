public class Invertir{
        public static void main(String[] args){
                int[] mat = {1,2,3,4,5};
                int[] matf;
                matf=invertirarray(mat);
		for(int i : matf){
			System.out.println(i);
		}
        }
        public static int[] invertirArray(int[] array){
		int[] result = new int[array.length];
		for(int i = 0; i< array.length; i++){
			result[i] = array[array.length-i-1];
		}
		return result;
	}
         
        
}       
~ 
