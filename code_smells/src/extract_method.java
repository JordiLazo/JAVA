public class extract_method {
    public static void printBanner(){
        System.out.println("This is the banner ||BANNER||");
    }
    public static double getOutstanding(){
        double x = 300.0;
        return x;
    }
    public static void printdetails(double outstanding, String name){
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
    //ERROR
    public static void printOwing(String name) {
        printBanner();
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }
    //SOLUTION
    public static void printOwingSolution() {
        printBanner();
        printdetails(getOutstanding(),"Jordi");
    }
    public static void main(String[] args) {
        printOwing("Jordi");
        printOwingSolution();
    }
}
