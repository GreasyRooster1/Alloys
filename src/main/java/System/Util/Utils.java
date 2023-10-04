package main.java.System.Util;

import main.java.System.Entity.BaseEntity.Entity;
import main.java.System.Logging.Logger;
import main.java.System.Setup.Setup;

public class Utils {
    public static Object[] append(Object[] arr, Object value) {
        if (arr == null) {
            Object[] single = {value};
            Logger.log(value.toString(), "system");
            return single;
        }
        int n = arr.length;
        Object[] newArr = new Object[n + 1];
        System.arraycopy(arr, 0, newArr, 0, n);
        newArr[n] = value;
        return newArr;
    }

    public static boolean collision(float r1x, float r1y, float r1w, float r1h, float r2x, float r2y, float r2w, float r2h) {

        // are the sides of one rectangle touching the other?

        // r1 bottom edge past r2 top
        return r1x + r1w >= r2x &&    // r1 right edge past r2 left
                r1x <= r2x + r2w &&    // r1 left edge past r2 right
                r1y + r1h >= r2y &&    // r1 top edge past r2 bottom
                r1y <= r2y + r2h;

    }

    public static boolean collision(Entity e, Entity e1) {
        float r1x = e.getX();
        float r1y = e.getY();
        float r1w = e.getW();
        float r1h = e.getH();
        float r2x = e1.getX();
        float r2y = e1.getY();
        float r2w = e1.getW();
        float r2h = e1.getH();


        // are the sides of one rectangle touching the other?

        // r1 bottom edge past r2 top
        return r1x + r1w >= r2x &&    // r1 right edge past r2 left
                r1x <= r2x + r2w &&    // r1 left edge past r2 right
                r1y + r1h >= r2y &&    // r1 top edge past r2 bottom
                r1y <= r2y + r2h;
    }

    public static boolean mouseCollision(Entity e) {
        float r1x = e.getX();
        float r1y = e.getY();
        float r1w = e.getW();
        float r1h = e.getH();
        float r2x = Setup.getApplet().mouseX;
        float r2y = Setup.getApplet().mouseY;
        float r2w = 1;
        float r2h = 1;


        // are the sides of one rectangle touching the other?

        // r1 bottom edge past r2 top
        return r1x + r1w >= r2x &&    // r1 right edge past r2 left
                r1x <= r2x + r2w &&    // r1 left edge past r2 right
                r1y + r1h >= r2y &&    // r1 top edge past r2 bottom
                r1y <= r2y + r2h;
    }
    public static int[] removeElementFromArray(int[] arr, int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
}
