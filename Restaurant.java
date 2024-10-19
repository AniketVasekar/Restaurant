import java.util.*;

class Restaurant {
    static String username;
    static String pass;
    static String phone;
    static ArrayList<String> cart = new ArrayList<>();
    static double bill;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println();
            System.out.println("********  WELCOME TO TAJ *********");
            System.out.println();
            System.out.println("1. Sign in ");
            System.out.println("2. sign up");
            System.out.println();
            System.out.println("Enter an option ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    createAccount(sc);
                    break;
                case 2:
                    login(sc);
                    break;
                default:
                    System.out.println("Wrong Option Entered");
            }
        }
    }

    public static void createAccount(Scanner sc) {
        System.out.println();
        System.out.println(" Create Account ");
        System.out.println();
        System.out.println("Username : ");
        sc.nextLine();
        username = sc.nextLine();
        System.out.println("Password : ");
        pass = sc.next();
        System.out.println("Contact Number : ");
        phone = sc.next();
        System.out.println();
        System.out.println("Account Created ");
        System.out.println();
    }

    public static void login(Scanner sc) {
        if (username != null) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(" ");
                System.out.println("Login Page ");
                System.out.println();
                System.out.println("Username/contact : ");
                sc.nextLine();
                String un1 = sc.nextLine();
                System.out.println("Password : ");
                String pass1 = sc.next();

                if ((un1.equals(username)) || (un1.equals(phone)) && (pass1.equals(pass))) {
                    homepage(sc);
                } else {
                    System.out.println();
                    System.out.println("Wrong Cred Entered");
                    System.out.println();
                }
            }
            System.exit(0);

        } else {
            System.out.println("Create Your Account First ");
        }
    }

    public static void homepage(Scanner sc) {
        for (;;) {
            System.out.println();
            System.out.println("HOME PAGE");
            System.out.println();
            System.out.println("1. VEG MENU");
            System.out.println("2.NON-VEG MENU");
            System.out.println("3.Checkout");
            System.out.println("4.logout");
            System.out.println();
            System.out.println("Enter an Option");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    vegMenu(sc);
                    break;
                case 2:
                    nonVegMenu(sc);
                    break;
                case 3:
                    checkout(sc);
                    break;
                case 4:
                    System.exit(0);
                    System.out.println("Thank U NEVER VISIT AGAIN");
                default:
                    System.out.println("Wrong option");
                    break;
            }
        }
    }

    public static void vegMenu(Scanner sc) {
        for (;;) {
            System.out.println();
            System.out.println("VEG DISHES");
            System.out.println("101 : Paneer Tikka :- Rs. 200");
            System.out.println("102 : Kaju Curry :- Rs. 300");
            System.out.println("103 : Veg Maratha :- Rs. 350");
            System.out.println("104 : Dal Tadka :- Rs. 200");
            System.out.println("105 : Veg Biryani :- Rs. 400");
            System.out.println("106 : MENU");
            System.out.println();
            System.out.println("Enter a Dish ID");
            int id = sc.nextInt();
            switch (id) {
                case 101:
                    cart.add("Paneer Tikka : 200");
                    bill += 200;
                    System.out.println("Paneer Tikka Added Inside The Cart");
                    break;
                case 102:
                    cart.add("Kaju Curry : 300");
                    bill += 300;
                    System.out.println("Kaju Curry Added Inside The Cart");
                    break;
                case 103:
                    cart.add("Veg Maratha : 350");
                    bill += 350;
                    System.out.println("Veg Maratha Added Inside The Cart");
                    break;
                case 104:
                    cart.add("Dal Tadka : 200");
                    bill += 200;
                    System.out.println("Dal Tadka Added Inside The Cart");
                    break;
                case 105:
                    cart.add("Veg Biryani : 400");
                    bill += 400;
                    System.out.println("Paneer Tikka Added Inside The Cart");
                    break;
                case 106:
                    return;
                default:
                    System.out.println("Wrong Dish ID");
                    break;
            }
        }
    }

    public static void nonVegMenu(Scanner sc) {
        for (;;) {
            System.out.println();
            System.out.println("NON-VEG DISHES");
            System.out.println("201: Chicken Tikka :- 200");
            System.out.println("202: Chicken Curry :- 300");
            System.out.println("203: Chicken Biryani :- 350");
            System.out.println("204: MENU ");
            System.out.println();
            System.out.println("Enter a Dish Id");
            int id = sc.nextInt();
            switch (id) {
                case 201:
                    cart.add("Chicken Tikka : 200");
                    bill += 200;
                    System.out.println("Chicken tikka Added inside the cart");
                    break;
                case 202:
                    cart.add("Chicken Curry : 300");
                    bill += 300;
                    System.out.println("Chicken tikka Added inside the cart");
                    break;
                case 203:
                    cart.add("Chicken Biryani : 350");
                    bill += 350;
                    System.out.println("Chicken tikka Added inside the cart");
                    break;
                case 204:
                    return;
                default:
                    System.out.println("Wrong dish Id");
                    break;

            }
        }
    }

    public static void cart(Scanner sc) {
        System.out.println("Your Purchased Food");
        System.out.println();
        for (String food : cart) {
            System.out.println(food);
        }
        System.out.println();
        System.out.println("Your Total Bill is : " + bill + "Rs");
        System.out.println();
    }

    public static void checkout(Scanner sc) {
        System.out.println("Checkout TOMO");
        cart(sc);
    }
}
