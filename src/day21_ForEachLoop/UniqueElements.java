package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Nadia", "Nadia",  "Hira", "Manha", "Manha", "Zanib", "Nazia", "Hira"};

        for (String each : words) {
            int count = 0;
            for (String element : words) {
                if (element.equals(each)) {
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }
    }
}
