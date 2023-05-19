package day44_map;

public class UsingBrowser {
    public static void main(String[] args) {
        Browser browser = Browser.CHROME;

        switch (browser){
            case EDGE:
                System.out.println("Opening Sdge browser");
                break;
            case CHROME:
                System.out.println("Opening chrome");
                break;
                case SAFARI:
                    System.out.println("Opening Safari");
                    break;
            case FIREFOX:
                System.out.println("Opening firefox");
        }
    }

}
