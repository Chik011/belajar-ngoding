public class percabangan4 {
    public static void main(String[] args) {
        int bulan = 3;
        
        switch (bulan) {
            case 1:
            System.out.println("bulan ke-" + bulan + " adalah bulan " + "januari");
            break;
            
            case 2:
            System.out.println("bulan ke-" + bulan + " adalah bulan " + "febuari");
            break;
            
            case 3:
            System.out.println("bulan ke-" + bulan + " adalah bulan " + "maret");
            break;
            
            case 4:
            System.out.println("bulan ke-" + bulan + " adalah bulan " + "april");
            break;
            
            case 5:
            System.out.println("bulan ke-" + bulan + " adalah bulan " + "mei");
            break;
            
            case 6:
            System.out.println("bulan ke-" + bulan + " adalah bulan " + "jino");
            break;
            
            case 7:
            System.out.println("bulan ke-" + bulan + " adalah bulan " + "juli");
            break;
        
            default:
                System.out.println("bulan tidak di kenali");
        }
    }
}
