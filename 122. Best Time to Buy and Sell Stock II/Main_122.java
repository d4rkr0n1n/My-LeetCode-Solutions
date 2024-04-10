public class Main_122 {
  public static void main(String arg[]) {
    int[][] testArr = {
        { 7, 1, 5, 3, 6, 4 },
        { 1, 2, 3, 4, 5 },
        { 7, 6, 4, 3, 1 },
        { 2, 4, 1 },
        { 6, 1, 3, 2, 4, 7 },
        { 2, 1, 2, 0, 1 }
    };
    for (int[] test : testArr) {
      System.out.println(Solution.maxProfit(test));
    }
  }
}
