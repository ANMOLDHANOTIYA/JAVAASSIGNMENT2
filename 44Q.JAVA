class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    public void shownum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    
    public HexNum(int number) {
        super(number);
    }

    @Override
    public void shownum() {
        System.out.println("Number in hexadecimal: " + Integer.toHexString(number));
        System.out.println("Number in octal: " + Integer.toOctalString(number));
    }
}

public class NumTest {
    public static void main(String[] args) {
        Num num = new Num(10);
        num.shownum();

        HexNum hexNum = new HexNum(10);
        hexNum.shownum();
    }
}
