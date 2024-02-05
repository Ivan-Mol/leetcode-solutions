package codewars;

public interface SurfaceArea {
    public static int[] getSize(int w,int h,int d) {
        //To-Do
        return new int[]{2 * w * h + 2 * w * d  + 2 * h * d,w*d*h};
    }
}
