
/**
 * Write a description of class ArrayTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayTest
{
    public static void main(){
        int nums[];
        nums = new int[10];
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = ((Math.random()*10+1));
        }
    } 
    public int getSum(){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){ 
          sum = sum + nums[i];  //  add all in nums to values to sum
        }
        System.out.println(sum);

    }
}
