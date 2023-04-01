package onClass;
public class traprainwater {

    public static int trapedWater(int a[]) {
        // calculate left max boundary --array1
        int leftmax[] = new int[a.length];
        leftmax[0] = a[0];

        for (int i = 1; i < a.length; i++) {
            leftmax[i] = Math.max(a[i], leftmax[i -1]);

        }

        // calculate right max boundary --drray 2
        int rightmax[] = new int[a.length];
        rightmax[a.length-1] = a[a.length-1];
        for (int i = a.length-2; i >= 0; i--) {
            rightmax[i] = Math.max(a[i], rightmax[i + 1]);

        }
        int trappedwater = 0;
        // loop
        for (int i = 0; i < a.length; i++) {
            // waterlevel = min(leftmax boundary , right max boundary)
            int waterlevel = Math.min(leftmax[i] ,
             rightmax[i]);
                // trapped water = waterlevel - height[i]
            trappedwater += waterlevel -a[i];
        }
        return trappedwater;
     
    }

    public static void main(String[] args) {
        int a[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapedWater(a));
    }
}
