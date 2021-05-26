package company;

public class Controller {
    public void textCon(String str) {
        str = str.trim();
        Service service = new Service();
        int num1, num2;
        char fm = ' ';
        int ii = 0;
        if (str.charAt(0) == '+' || str.charAt(0) == '-'){
            fm = str.charAt(0);
            ii = 1;
        }
        for (int i = ii; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' ) {
                try {
                    num1 = Integer.parseInt((fm + (str.substring(ii, i).trim())).trim());
                    num2 = Integer.parseInt(str.substring(i + 1).trim());
                    if (str.charAt(i) == '+') System.out.println(service.plus(num1, num2));
                    if (str.charAt(i) == '-') System.out.println(service.minus(num1, num2));
                    if (str.charAt(i) == '*') System.out.println(service.times(num1, num2));
                    if (str.charAt(i) == '/') System.out.println(service.divide(num1, num2));
                } catch (Exception e) {
                    System.out.println("input error");
                }
                break;
            }else if(str.charAt(i) == ';'){
                System.out.println("input error");
            }
        }
    }
}
