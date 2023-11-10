public class Kata
{
  
  public static int rotations(int[] dieArray)
  {
   int[] ways = new int[dieArray.length];
        int round;
        for (int i = 0; i < dieArray.length; i++) {
            round = 0;
            switch (dieArray[i]) {
                case 1:
                    for (int x : dieArray) {
                        if (x == 6) {
                            round += 2;
                        } else if (x != dieArray[i]) {
                            round++;
                        }
                    }
                    break;
                case 2:
                    for (int x : dieArray) {
                        if (x == 5) {
                            round += 2;
                        } else if (x != dieArray[i]) {
                            round++;
                        }
                    }
                    break;
                case 3:
                    for (int x : dieArray) {
                        if (x == 4) {
                            round += 2;
                        } else if (x != dieArray[i]) {
                            round++;
                        }
                    }
                    break;
                case 4:
                    for (int x : dieArray) {
                        if (x == 3) {
                            round += 2;
                        } else if (x != dieArray[i]) {
                            round++;
                        }
                    }
                    break;
                case 5:
                    for (int x : dieArray) {
                        if (x == 2) {
                            round += 2;
                        } else if (x != dieArray[i]) {
                            round++;
                        }
                    }
                    break;
                case 6:
                    for (int x : dieArray) {
                        if (x == 1) {
                            round += 2;
                        } else if (x != dieArray[i]) {
                            round++;
                        }
                    }
                    break;
            }
            ways[i] = round;
        }
        int answer = ways.length>0?ways[0]:0;
        for (int way : ways) {
            if (answer >= way) {
                answer = way;
            }
        }
        return answer;
  }
}
/*
You are given an array of 6-faced dice. Each die is represented by its face up.

Calculate the minimum number of rotations needed to make all faces the same.

1 will require one rotation to have 2, 3, 4 and 5 face up, but would require two rotations to make it the face 6, as 6 is the opposite side of 1.

The opposite side of 2 is 5 and 3 is 4.

Examples
dice = {1, 1, 1, 1, 1, 6} --> 2:
rotate 6 twice to get 1

dice = {1, 2, 3} --> 2:
2 rotations are needed to make all faces either 1, 2, or 3

dice = {3, 3, 3} --> 0:
all faces are already identical

dice = {1, 6, 2, 3} --> 3:
rotate 1, 6 and 3 once to make them all 2

*/