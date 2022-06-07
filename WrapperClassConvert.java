import java.util.*;
public class WrapperClassConvert{
    public static Object convertToWrapper(int number){
        Integer object = Integer.valueOf(number);
        try{
            if(object instanceof Integer){
                return object;
            }
            else{
                System.out.println("Input are wrong");
            }      
        }     
        catch (Exception e){
            System.out.println(e);
        }
        return object;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        System.out.println(convertToWrapper(number));
    }
}