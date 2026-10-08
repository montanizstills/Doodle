import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List getFilingFreq(int n){
        ArrayList remainders = new ArrayList(){};
        ArrayList pow2 = new ArrayList(){};
        while(n>0){
            remainders.add(n%2);
            n=n/2;
        }
        for (int i =0; i< remainders.size(); i++){
            if (remainders.get(i).equals(1)){
                Long value = (long) Math.pow(2,i);
                pow2.add(value);
            }
        }
        ArrayList list = pow2;
        return list;
    }

    public static List<List<Integer>> getSublists(List<Integer> identifiers) {
        List<List<Integer>> allCombinations = new ArrayList<>();
        int targetSum = identifiers.stream().mapToInt(Integer::intValue).sum();
        getCombinations(identifiers, new ArrayList<>(), allCombinations, targetSum);
        return allCombinations;
    }

    private static void getCombinations(List<Integer> identifiers, List<Integer> current, List<List<Integer>> allCombinations, int targetSum) {
        int sum = current.stream().mapToInt(Integer::intValue).sum();
        if (sum <= targetSum) {
            allCombinations.add(new ArrayList<>(current));
        }

        for (int i = 0; i < identifiers.size(); i++) {
            if(current.contains(identifiers.get(i))) continue;
            current.add(identifiers.get(i));
            getCombinations(identifiers, current, allCombinations, targetSum);
            current.remove(current.size() - 1);
        }
    }


    public static void main(String args[]) {
        System.out.println("513: "+getFilingFreq(513));
        System.out.println("516: "+getFilingFreq(516));
        System.out.println("533: "+getFilingFreq(533));
        System.out.println("541: "+getFilingFreq(541));
        System.out.println("543: "+getFilingFreq(543));
        System.out.println("605: "+getFilingFreq(605));
        System.out.println("21: "+getFilingFreq(21));
        System.out.println("29: "+getFilingFreq(29));
        System.out.println("85: "+getFilingFreq(85));
        System.out.println("69: "+getFilingFreq(69));
        System.out.println("93: "+getFilingFreq(93));
    }
/*
* 1	Monthly
2	Bi-monthly
4	Quarterly
8	Semi-annually
16	Annually
32	First Two Months of Quarter
64	Occasional
128	Occasional/Quarterly
256	Occasional/Semi-annually
512	Occasional/Annually
* */

    class Cat{
        public Cat(){}

        String tail = "r";
        String whiskers;
        Character bob = 'b';
        Double x = .333;
        Double y = .000000000000000001;

        Integer a = 6;
        public void meow(){
            System.out.println("I am meowing...");
        }
        public void pur(){
            System.out.println("I am purring..");
        }
        Cat myLittleCat = new Cat();
        Cat Garilth = new Cat();


        public static void main(String[] args) {
            List<Number> mylist = new ArrayList<>();
            mylist.add(0.333);
            mylist.add(5);
        }
    }
}