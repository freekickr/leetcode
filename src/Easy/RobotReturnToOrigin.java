package Easy;

/*
Robot Return to Origin

There is a robot starting at position (0, 0), the origin, on a 2D plane.
Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
The move sequence is represented by a string, and the character moves[i] represents its ith move.
Valid moves are R (right), L (left), U (up), and D (down).
If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.

Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once,
      "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.

Example 1:
    Input: "UD"
    Output: true
    Explanation: The robot moves up once, and then down once. All moves have the same magnitude,
                 so it ended up at the origin where it started. Therefore, we return true.

Example 2:
    Input: "LL"
    Output: false
    Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at
                 the origin at the end of its moves.
 */

public class RobotReturnToOrigin {

    public static boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        char[] commandLine = moves.toCharArray();
        for (int i = 0; i < commandLine.length; i++)
            switch (commandLine[i]) {
                case 'R':
                    horizontal++;
                    break;

                case 'L':
                    horizontal--;
                    break;

                case 'U':
                    vertical++;
                    break;

                case 'D':
                    vertical--;
                    break;

                default:
                    break;
            }
        return (horizontal == 0 && vertical == 0);
    }

    public static boolean judgeCircle2(String moves) {
        int x = 0, y = 0;
        for (char move : moves.toCharArray()) {
            if (move == 'U') y++;
            else if (move == 'D') y--;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return (x == 0 && y == 0);
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle2("URDDLU"));
    }
}
