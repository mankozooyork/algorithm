package Java.BInarySearchNatualOrdering;

import java.util.*;
public class PhysicalData {
    private String name;
    private int height;
    private double vision;

    public PhysicalData(String name, int height, double vision) {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }

    private static final Comparator<PhysicalData> HEIGHT_ORDER = new HeightOrderComparator();

    private static class HeightOrderComparator implements Comparator<PhysicalData> {
        public int compare(PhysicalData d1, PhysicalData d2) {
            return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhysicalData[] data = {
            new PhysicalData("John", 165, 0.3),
            new PhysicalData("Craig", 166, 0.5),
            new PhysicalData("Mark", 170, 0.5),
            new PhysicalData("Watson", 171, 0.8),
            new PhysicalData("Kevin", 175, 0.1),
            new PhysicalData("Marcos", 180, 0.2),
            new PhysicalData("Dave", 185, 1.0)
        };

        System.out.println("What centimerters tall person do you looking for?");
        int height = sc.nextInt();
        sc.close();
        int index = Arrays.binarySearch(data, new PhysicalData("", height, 0.0), PhysicalData.HEIGHT_ORDER);
        if(index < 0) {
            System.out.println("Not found the person you are looking for");
        } else {
            System.out.println("Found the person you are looking for" + " Index No : " + index);
            System.out.println("Data is : " + data[index]);
        }
    }
}
