package summingArrays;

public class sumArrays {
    public static void main(String[] args) {

        int[] num ={34,24,6,6,67,54,5665,56,64,3,3,654,67,987,34234,578,9,76};
        int sum=0;
        for (int j : num) {
            sum += j;
        }
        System.out.println(sum);
        
          for (int i= 0; i<=3;i++){
            for (int j= 0; j<=30;j++){
                System.out.print("-");
                if (i==3 && j==7){
                    break;
                }
            }
            System.out.println();
        }
    }
}
