import java.math.*;

public class Two {
  public static void main(String[] args) {
    BigDecimal a = new BigDecimal("1");
    BigDecimal b = new BigDecimal("2");
    BigDecimal c = new BigDecimal("3");

    System.out.println( "(new BigDecimal(\"3\")).multiply((new BigDecimal(\"1\")).add(new BigDecimal(\"2\"))) = " + c.multiply(a.add(b)) ); // 3 * ( 1 + 2)

    System.out.println( (new BigDecimal("3")).multiply((new BigDecimal("1")).add(new BigDecimal("2"))) ); 

  }
}  