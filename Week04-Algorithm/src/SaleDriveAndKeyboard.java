public class SaleDriveAndKeyboard {
    public static void main(String[] args) {
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        int b = 46;

        SaleDriveAndKeyboard saleDriveAndKeyboard = new SaleDriveAndKeyboard();
        int maxSpentMoney = saleDriveAndKeyboard.getMoneySpent(keyboards, drives, b);
        System.out.println("en pahalı ürünler için ödenecek tutar :" + maxSpentMoney);
    }

    public int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxSpentMoney = -1;
        int invoice = 0;
        for (int i=0; i<keyboards.length; i++) {
            for (int j=0; j<drives.length; j++) {
                invoice = keyboards[i] + drives[j];
                if(invoice <= b && invoice > maxSpentMoney) {
                    maxSpentMoney = invoice;
                }

            }
        }
        return maxSpentMoney;
    }
}
