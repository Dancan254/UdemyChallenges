package ObjectOrientedProgramming.Enum;

public enum EnumConstructors {

    RED(255, 0, 0),
    GREEN(0,255, 0),
    BLUE(0, 0, 255);

    private int R, B, G;

    EnumConstructors(int r, int b, int g) {
        R = r;
        B = b;
        G = g;
    }

    public String getRGB(){
        return "(" + R + ", " + G + ", " + B + ")";
    }

    public static void main(String[] args) {

        System.out.println("RGB of red: " + EnumConstructors.RED.getRGB());
    }
}

