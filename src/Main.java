public class Main {
    public static void main(String[] args) {
        LinSolv l = new LinSolv();
        l.setA(1);
        l.setB(2);
        double x = l.solve();
        System.out.println("x=" + x);
    }
}
