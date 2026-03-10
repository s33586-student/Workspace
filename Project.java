class Project {
    public static float CalculateAverage(int[] values) {
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum/values.length;
    }

    public static void main(String[] args) {
        int[] values = new int[10]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(CalculateAverage(values));
    }
}