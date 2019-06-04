public class NumberDivider {
    public static void main(String[] arguments) {
        if (arguments.length == 2) {
            int result = 0;
            try {
                result = Integer.parseInt(arguments[0]) /
                        Integer.parseInt(arguments[1]);
                System.out.println(arguments[0] + " dzielone przez "
                        + arguments[1] + " rowna sie " + result);
            } catch (NumberFormatException e) {
                System.out.println("Oba argumenty musza byc liczbami");
                throw e;
            } catch (ArithmeticException e) {
                System.out.println("Nie mozna dzielic przez zero");
                throw e;
            }
        }
    }
}