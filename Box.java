public class Box {
    String name;
    String name1;
    String name2;

    int sm;
    int sm3;

    public Box(String light, String width, String depth, int s) {
       this.name = light;
       this.name1 = width;
       this.name2 = depth;
       sm = s;

        System.out.println("Light: " + light);
        System.out.println("Sm = " + sm);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
    }

    public Box(String light, String width, int sm3) {
            this.name = light;
            this.name1 = width;
            sm = sm3;

            System.out.println("Light: " + light);
            System.out.println("Sm = " + sm3);
            System.out.println("Width: " + width);
    }
    public Box(String light, int sm3) {
        this.name = light;
        sm = sm3;

        System.out.println("Light: " + light);
        System.out.println("Sm = " + sm3);
    }
    public Box() {





    }
}
