import java.math.BigInteger;

public class test1 {
    public static void main(String[] args) {
        BigInteger res = new BigInteger("1");
        for(int i=5000; i>0; i--) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res);
    }
}