public class charfreqcount {
    public static void main(String args[]) {
        String str = "DNyaneshwar";
        char arr[] = str.toCharArray();
        int freq[] = new int[arr.length];
        char visited = '\0'; // Using '\0' as the visited marker

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != visited) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = visited;
                    }
                }
                freq[i] = count;
            }
        }

        // Printing the frequencies
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != visited) {
                System.out.println("'" + arr[i] + "' : " + freq[i]);
            }
        }
    }
}
