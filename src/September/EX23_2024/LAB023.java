package September.EX23_2024;

public class LAB023 {
    public static void main(String[]args){
//        duplicate condition not allowed
//        User to execute code under browser;
//        without the break the next condition will also executed.
        String browser = "Edge";
        switch (browser){
            case "Chrome":
                System.out.println("Starting the Chrome browser");
                break;
            case "Fire Fox":
                System.out.println("Starting the firefox browser");
                break;
            case "Edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }

    }

}
