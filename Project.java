class Project {
    public static float CalculateAverage(int[] values) {
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum/values.length;
    }

    public static int CalculateMax(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            max = (max < values[i]) ? values[i] : max
        }
        return max;
    }

    public static void main(String[] args) {
        int[] values = new int[10]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(CalculateAverage(values));
    }
}