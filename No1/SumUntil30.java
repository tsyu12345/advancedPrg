public class SumUntil30 {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i = 0; i < data.length; i++) {
            if(sum <= 30) {
                sum += data[i];
            }
            /*もし足し合わせた後で30を超えたら*/
            if(sum > 30) {
                sum -= data[i];
                break;
            }
        }
        System.out.println(sum);
    }
}
