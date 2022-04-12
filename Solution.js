
/**
 * @param {number[][]} grid
 * @param {number} totalShifts
 * @return {number[][]}
 */
var shiftGrid = function (grid, totalShifts) {
    const rows = grid.length;
    const columns = grid[0].length;
    const shiftedGrid = Array.from(new Array(rows), () => new Array(columns).fill(0));

    for (let r = 0; r < rows; r++) {
        for (let c = 0; c < columns; c++) {
            let newRow = (r + Math.floor((c + totalShifts) / columns)) % (rows);
            let newColumn = (c + totalShifts) % columns;
            shiftedGrid[newRow][newColumn] = grid[r][c];
        }
    }
    return shiftedGrid;
};
