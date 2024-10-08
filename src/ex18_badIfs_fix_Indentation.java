public class ex18_badIfs_fix_Indentation {
    public static void main(String[] args) {
        int x = 9;
        int y = 3;
        int z = 7;

        // fix below
        if (x < y) {
            System.out.println("aaa");
            if (x < z) {
                System.out.println("bbb");}
        } else {
            System.out.println("ccc");
        }

        System.out.println("ddd");

        if (y > z){
            if (z > x) {
                System.out.println("eee");}
            else {
                System.out.println("fff");
            }
        } else{System.out.println("ggg");
        }
    }
}


//        if (x < y){System.out.println("aaa"); if (x < z)
//        System.out.println("bbb"); } else System.out.println("ccc");
//        System.out.println("ddd");

//        if (y > z)if (z > x) System.out.println("eee");
//        else System.out.println("fff"); else
//        System.out.println("ggg"); }
//        }