
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> shiftGrid(int[][] grid, int totalShifts) {
        final int rows = grid.length;
        final int columns = grid[0].length;
        List<List<Integer>> shiftedGrid = new ArrayList<>();

        for (int r = 0; r < rows; r++) {
            shiftedGrid.add(new ArrayList<>());
            for (int c = 0; c < columns; c++) {
                shiftedGrid.get(r).add(0);
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                int newRow = (r + (c + totalShifts) / columns) % (rows);
                int newColumn = (c + totalShifts) % columns;
                shiftedGrid.get(newRow).set(newColumn, grid[r][c]);
            }
        }
        return shiftedGrid;
    }
}
