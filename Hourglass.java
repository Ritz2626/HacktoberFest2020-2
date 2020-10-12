import java.io.*;

public class Hourglass
{
     public static void main(String[]args)throws IOException
   {
       InputStreamReader isr=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(isr);
       System.out.println("Input the limit");
       int n=Integer.parseInt(br.readLine());
       int x,y,z;
   for(x=1;x<=n;x++)
       {
           for( y=x;y>=1;y--)
           {
               System.out.print(" ");
            }
            for( z=n;z>=x;z--)
            {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
        for(x=2;x<=n;x++)
        {
            for( y=x;y<=n;y++)
            {
                System.out.print(" ");
            }
            for( z=x;z>=1;z--)
            {
                System.out.print("*"+" ");
            }
            System.out.println(" ");}}}
            
            
        
    

