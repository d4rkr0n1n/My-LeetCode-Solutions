public class Main_121 {
  public static void main(String arg[]) {
    int[][] testArr = {
        { 7, 1, 5, 3, 6, 4 },
        { 7, 6, 4, 3, 1 },
        { 2, 4, 1 }
    };
    for (int[] test : testArr) {
      System.out.println(Solution.maxProfit(test));
    }
  }
  
}
