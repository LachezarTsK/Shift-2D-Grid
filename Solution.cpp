
#include <vector>
using namespace std;

class Solution {
    
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int totalShifts) {
        const size_t rows = grid.size();
        const size_t columns = grid[0].size();
        vector<vector<int>> shiftedGrid(rows, vector<int>(columns, 0));

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                int newRow = (r + (c + totalShifts) / columns) % (rows);
                int newColumn = (c + totalShifts) % columns;
                shiftedGrid[newRow][newColumn] = grid[r][c];
            }
        }
        return shiftedGrid;
    }
};
