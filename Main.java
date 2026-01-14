import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1 - Create a scanner and an array of size 3
    Scanner scan = new Scanner(System.in);
    double[] nums = new double[3];

    System.out.print("Enter first number: ");
    nums[0] = scan.nextDouble();
    System.out.print("Enter second number: ");
    nums[1] = scan.nextDouble();
    System.out.print("Enter third number: ");
    nums[2] = scan.nextDouble();

    double sum = nums[0] + nums[1] + nums[2];

    System.out.println(nums[0]);
    System.out.println(nums[1]);
    System.out.println(nums[2]);
    System.out.println("Sum of array is " + sum);

    // Problem 2
    // Use the scanner to get user input and give it to the method
    System.out.print("Give me a positive number: ");
    int N = scan.nextInt();
    int[] output = sumsOfNums(N);
  }

  public static int[] sumsOfNums(int input)
  {
    // Implement Problem 2 here
    int totalSum = 0;
    int[] sum = new int[input]
    for (int i = 0; i < sum.length; i++)
    {
      totalSum += i;
      sum[i] = totalSum;
    }
    return sum;
  }
}
