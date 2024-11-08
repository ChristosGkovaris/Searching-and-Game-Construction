import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PuzzleState {

    // The current state of the puzzle
    private int[][] state;
    // Position of the blank space
    private PuzzleState parent;
    // Position of the blank space
    private int zeroRow, zeroCol; 
    // Cost to reach this state
    private int cost; 
    // Number of moves made to reach this state
    private int depth; 

    
    public PuzzleState(int[][] state, int zeroRow, int zeroCol, PuzzleState parent, int cost, int depth) {
        this.state = deepCopy(state);
        this.zeroRow = zeroRow;
        this.zeroCol = zeroCol;
        this.parent = parent;
        this.cost = cost;
        this.depth = depth;
    }

    
    public List<PuzzleState> generateSuccessors() {
        List<PuzzleState> successors = new ArrayList<>();
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        for (int[] dir : directions) {
            int newRow = zeroRow + dir[0];
            int newCol = zeroCol + dir[1];
            if (newRow >= 0 && newRow < 3 && newCol >= 0 && newCol < 3) {
                int[][] newState = deepCopy(state);
                newState[zeroRow][zeroCol] = newState[newRow][newCol];
                newState[newRow][newCol] = 0;
                successors.add(new PuzzleState(newState, newRow, newCol, this, this.cost + 1, this.depth + 1));
            }
        }
        return successors;
    }

    
    private int[][] deepCopy(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return copy;
    }

   
    public boolean isGoal(int[][] goalState) {
        return Arrays.deepEquals(this.state, goalState);
    }

    
    public List<PuzzleState> getPathFromStart() {
        List<PuzzleState> path = new ArrayList<>();
        PuzzleState current = this;
        while (current != null) {
            // Add to the beginning
            path.add(0, current); 
            current = current.parent;
        }
        return path;
    }

    
    public int getCost() {
        return cost;
    }

    
    public int getDepth() {
        return depth;
    }

    
    public int[][] getState() {
        return deepCopy(state);
    }

    
    public int misplacedTilesHeuristic(int[][] goalState) {
        int misplacedTiles = 0;
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[i].length; j++) {
                if (state[i][j] != 0 && state[i][j] != goalState[i][j]) {
                    misplacedTiles++;
                }
            }
        }
        return misplacedTiles;
    }

   
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PuzzleState other = (PuzzleState) obj;
        return Arrays.deepEquals(this.state, other.state);
    }

    
    public int hashCode() {
        return Arrays.deepHashCode(this.state);
    }
}
