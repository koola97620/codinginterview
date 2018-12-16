package Chapter08.Question02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*

8-2 : 격자판상의 로봇: 행의 개수는 r, 열의 개수는 c인 격자판의 왼쪽 상단 꼭짓점에 로봇이 놓여 있다고
상상해보자. 이 로봇은 오른쪽 아니면 아래 쪽으로만 이동할 수 있다. 하지만 어떤 셀(cell)은 '금지구역'으로 지정되어
있어서 로봇이 접근할 수 없다. 왼쪽 상단 꼭짓점에서 오른쪽 하단 꼭짓점으로의 경로를 찾는 알고리즘을 설계하라.

 */
class Point {
    private int row;
    private int col;
    public Point(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Point{" +
            "row=" + row +
            ", col=" + col +
            '}';
    }
}



public class Main {
    public static void main(String[] args) {
        boolean[][] matrix = new boolean[5][5];
        Main main = new Main();

        List<Point> path = main.getPath(matrix);

        System.out.println(path.toString());



    }


    public ArrayList<Point> getPath(boolean[][] matrix) {
        if(matrix==null || matrix.length == 0) {
            return null;
        }
        ArrayList<Point> path = new ArrayList<>();

        // HashSet 을 추가하면 속도가 월등하게 빨라진다.
        Set<Point> failedSet = new HashSet<Point>();

        // 착지에서부터 시작해서 발지 까지 가는거임!
        if(getPath(matrix,matrix.length-1,matrix[0].length-1,path,failedSet)) {
            return path;
        }


        return null;
    }

    public boolean getPath(boolean[][] matrix, int row, int col, ArrayList<Point> path,Set<Point> failedSet) {

        if(row < 0 || col <0) {
            return false;
        }

        Point p = new Point(row,col);

        // 이미 pass 했다면 false 반환!
        if(failedSet.contains(p)) {
            return false;
        }

        boolean isArrival = (row ==0) && (col==0);

        // 경로가 존재하면 현재 포인트 추가하기.
        if(isArrival || getPath(matrix,row-1,col,path,failedSet) || getPath(matrix,row,col-1,path,failedSet)) {

            path.add(p);
            return true;
        }

        failedSet.add(p);
        return false;
    }
}
