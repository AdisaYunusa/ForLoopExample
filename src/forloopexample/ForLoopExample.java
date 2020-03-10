

package forloopexample;


public class ForLoopExample {

    
    public static void main(String[] args) {
               //1      //2     //4
        stop: for (int x = 10; x >= 1; x--)
        {
            //3
            System.out.println(x);
//            if (x == 6)
//            {
//                break;
//            }
            switch(x)
            {
                case 5: 
                break stop;
//                default:
//                    System.out.println("Finish lng!");
//                    break;
            }
        }
        
        System.out.println("Finish looping!");
    }
    
}
