package company;

public class Controller {
    public void textCon(String str) {
        Service service = new Service();
        int num1, num2;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                try {
                    num1 = Integer.parseInt(str.substring(0, i).trim());
                    num2 = Integer.parseInt(str.substring(i + 1).trim());
                    if (str.charAt(i) == '+') System.out.println(service.plus(num1, num2));
                    if (str.charAt(i) == '-') System.out.println(service.minus(num1, num2));
                    if (str.charAt(i) == '*') System.out.println(service.times(num1, num2));
                    if (str.charAt(i) == '/') System.out.println(service.divide(num1, num2));
                } catch (Exception e) {
                    System.out.println("input error");
                }
                break;
            }
        }
    }
}
