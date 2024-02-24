public class FindCharacterLength02 {
    public static void main(String[] args) {
        FindCharacterLength02 findCharacterLength02 = new FindCharacterLength02();
        long n = 1000000000000L;
        String s = "aba";
        //repeatedString(s, n);
        long totalCountOfA = findCharacterLength02.repeatedString(s, n);
        System.out.println("Total Count Of A : " + totalCountOfA);
    }

    public long repeatedString(String s, long n) {
        long countOfAInS = calculateCountOfA(s, s.length());

        long repeats  = n / s.length();
        long remainingChars = n % s.length();
        long remainingCountOfA = calculateCountOfA(s, remainingChars);

        return (repeats * countOfAInS) + remainingCountOfA;
    }


    public long calculateCountOfA(String s, long length) {
        long countOfAInS = 0;
        for (int i=0; i<length; i++) {
            if (s.charAt(i) == 'a') {
                countOfAInS++;
            }
        }
        return countOfAInS;
    }
}
