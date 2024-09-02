import java.util.Scanner;
class Container{
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = -1;

        while (left < right) {
            int w= right-left;
            int currentArea = Math.min(height[left], height[right]) * w;
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
public class QuestionOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();
        System.out.print("Enter the number of heights: ");
        int n = scan.nextInt();
        int[] heights = new int[n];
        System.out.println("Enter the heights:");
        for (int i = 0; i < n; i++) {
            heights[i] = scan.nextInt();
        }
        int result = container.maxArea(heights);
        System.out.println("The maximum area is: " + result);
        
    }
}

