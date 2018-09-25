public class Array {

    //public int[][] Test = new int[9][9];


    public static void main(String[] args){
        int[][] Test = new int[9][9];
        for (int i = 0; i < Test.length; i++) {
            for (int j = 0; j < Test[0].length; j++) {
                Test[i][j] = 0;
            }
        }
        Test[0][0] = 5;
        Test[0][1] = 3;
        Test[0][4] = 7;
        Test[1][0] = 6;
        Test[1][3] = 1;
        Test[1][4] = 9;
        Test[1][5] = 5;
        Test[2][1] = 9;
        Test[2][2] = 8;
        Test[2][7] = 6;
        Test[3][0] = 8;
        Test[3][4] = 6;
        Test[3][8] = 3;
        Test[4][0] = 4;
        Test[4][3] = 8;
        Test[4][5] = 3;
        Test[4][8] = 1;
        Test[5][0] = 7;
        Test[5][4] = 2;
        Test[5][8] = 6;
        Test[6][1] = 6;
        Test[6][6] = 2;
        Test[6][7] = 8;
        Test[7][3] = 4;
        Test[7][4] = 1;
        Test[7][5] = 9;
        Test[7][8] = 5;
        Test[8][4] = 8;
        Test[8][7] = 7;
        Test[8][8] = 9;

        boolean[][] fixed = new boolean[9][9];
        for (int i = 0; i < fixed.length; i++) {
            for (int j = 0; j < fixed[0].length; j++) {
                fixed[i][j] = false;

            }
        }
        fixed[0][0] = true;
        fixed[0][1] = true;
        fixed[0][4] = true;
        fixed[1][0] = true;
        fixed[1][3] = true;
        fixed[1][4] = true;
        fixed[1][5] = true;
        fixed[2][1] = true;
        fixed[2][2] = true;
        fixed[2][7] = true;
        fixed[3][0] = true;
        fixed[3][4] = true;
        fixed[3][8] = true;
        fixed[4][0] = true;
        fixed[4][3] = true;
        fixed[4][5] = true;
        fixed[4][8] = true;
        fixed[5][0] = true;
        fixed[5][4] = true;
        fixed[5][8] = true;
        fixed[6][1] = true;
        fixed[6][6] = true;
        fixed[6][7] = true;
        fixed[7][3] = true;
        fixed[7][4] = true;
        fixed[7][5] = true;
        fixed[7][8] = true;
        fixed[8][4] = true;
        fixed[8][7] = true;
        fixed[8][8] = true;


        for(int i = 0; i<Test.length; i++){
            for(int j = 0; j<Test[0].length; j++){
                System.out.print(Test[i][j] + " ");
            }
            System.out.println();
        }


        Checker checker = new Checker(Test, fixed);
        checker.solve(0, 0, true);


    }
}

