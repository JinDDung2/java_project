package week4.algorithm;

interface Compare {
    public boolean doSomething(int firstValue, int secondValue);
}

public class MaxAndMin {
    // 크드업 2081 : 최대값 I
    // {3, 29, 38, 12, 57, 74, 40, 85, 61 };

    /**
     * @return : max, maxIdx
     */
    private int getMaxOrMin(int[] arr, Compare compare) {
        int targetValue = arr[0]; // max
        for (int i=1; i<arr.length; i++) {
            boolean isSomething = compare.doSomething(targetValue, arr[i]);
            //
            if(isSomething) {
                targetValue = arr[i];
            }
        }
        return targetValue;
    }

    public int getMax(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int firstValue, int secondValue) {
                return firstValue > secondValue;
            }
        });
    }

    public int getMin(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int firstValue, int secondValue) {
                return firstValue < secondValue;
            }
        });
    }
    public static void main(String[] args) {

        MaxAndMin solution = new MaxAndMin();
        int[] arr =  {3, 29, 38, 12, 57, 74, 40, 85, 61 };
        int maxValue = solution.getMax(arr);
        int minValue = solution.getMin(arr);
        System.out.println("maxValue = " + maxValue);
        System.out.println("minValue = " + minValue);
    }
}
