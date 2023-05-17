public class trianguloRecursivo{
    public static void main(String[] args)
    {
        int base=1;
        trianguloRecursivo(base);

            
    }
    public static void trianguloRecursivo(int base)
    {
        for(int i=0;i<base;i++)
            System.out.print("*");
        System.out.println();
        if(base<6)
        {
            trianguloRecursivo(base+1);

        }
    }  
} 
