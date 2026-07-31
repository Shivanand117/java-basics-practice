package Collectons;

public class ContainerWithMostWater {
    public static int maxArea(int height[]){
        if(height.length==0){
            return 0;
        }
        int maxArea=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int width=j-i;
                int minheight=Math.min(height[i], height[j]);
                int area=minheight*width;
              
               if(area>maxArea){
                maxArea=area;
               }
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result=maxArea(height);
        System.out.println("Maximum Water = "+ result);
    }
}
