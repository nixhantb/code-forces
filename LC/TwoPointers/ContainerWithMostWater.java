public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        
        int leftMax = height[0];
        int rightMax = height[height.length-1];
        int n = height.length;
        int x_left=0;

        for(int i=1;i < n; i++){

            if(height[i] > leftMax){
                leftMax = height[i];
                x_left=i;
            }
        }
        

        // greater than all but less than left_h

        int y_right=n-1;

        for(int i = n-1; i>0; i--){

            if(height[i] > rightMax && height[i] < leftMax){
                rightMax=height[i];
                y_right=i;
            }
        }
        
        return (rightMax)* (y_right-x_left);
    }

    public static void main(String[] args) {
        int a[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }
}
