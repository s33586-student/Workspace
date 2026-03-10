class Project {
    public static float CalculateAverage(int[] values) {
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum/values.length;
    }

    public static void main(String[] args) {
        
    }
}