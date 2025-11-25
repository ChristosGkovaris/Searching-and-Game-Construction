# SEARCHING AND GAME CONSTRUCTION

This project implements **AI search algorithms and game-playing techniques** in **Java**, including an **8-Puzzle solver** using **Uniform Cost Search (UCS)** and **A\***, as well as a **3×3 strategic game** powered by the **Minimax algorithm**. It was developed as part of the **MYY602 – Artificial Intelligence** course at the **University of Ioannina**. The final grade of the project is **2.5 out of 3**.

---

## TABLE OF CONTENTS
1. [Overview](#overview)  
2. [Features](#features)  
3. [Input Data](#input-data)  
4. [Algorithms Implemented](#algorithms-implemented)  
5. [Implementation Details](#implementation-details)  
6. [Usage](#usage)  
7. [License](#license)  
8. [Contact](#contact)

---

## OVERVIEW

The **Searching and Game Construction** project includes two core components:

### **1. 8-Puzzle Solver (UCS & A\*)**
A solver for the classical **8-puzzle**, where the player must reach a goal configuration by sliding tiles.

Users can:
- Input the **initial state** of the puzzle  
- Choose between **Uniform Cost Search (UCS)** or **A\*** with a heuristic  
- Receive the **optimal sequence of moves** or termination feedback when no solution exists  

### **2. Game with AI (Minimax Algorithm)**
A 3×3 board game played by two players (**MIN** and **MAX**) who alternate placing symbols (`C`, `S`, `E`).

- The **MAX player uses Minimax** to choose the best move  
- The goal is to form a winning sequence of **C-S-E** or **E-S-C**  
- Game ends when a **winning line** (row/column/diagonal) is formed or when no moves remain  

Both tasks focus on **state search**, **heuristics**, and **optimal-move decision making**.

---

## FEATURES

### **8-Puzzle Solver**
- State validation and move generation  
- Uniform Cost Search implementation  
- A\* search with heuristic evaluation  
- Detection of unsolvable states  
- Output of optimal path and explored states  

### **AI Game (3×3 Grid)**
- Alternating turns between MIN and MAX  
- Automatic optimal move selection using Minimax  
- Win detection (rows, columns, diagonals)  
- Input validation and state printing  
- Termination on solution or exhaustion of moves  

---

## INPUT DATA

### For the 8-Puzzle:
- Initial 3×3 configuration  
- Goal state (fixed)  
- Algorithm selection: **UCS** or **A\***

### For the AI Game:
- Starting board containing one initial `S`  
- Player inputs (`C`, `S`, `E` placements) for MIN turns  
- MAX player moves are **AI-generated**

---

## ALGORITHMS IMPLEMENTED

### **1. Uniform Cost Search (UCS) – 8-Puzzle**
- Explores states using lowest path cost  
- Guarantees optimal solution  
- Suitable when all moves have equal cost  

### **2. A\* Search – 8-Puzzle**
Uses:  
- `f(n) = g(n) + h(n)`  
- Heuristics (e.g., misplaced tiles, Manhattan distance)

Efficient for exploring large search spaces with optimality.

### **3. Minimax Algorithm – AI Game**
- MAX aims to maximize evaluation  
- MIN aims to minimize it  
- Explores future board states recursively  
- Selects move with best guaranteed outcome  

---

## IMPLEMENTATION DETAILS

### **8-Puzzle Solver**
- State objects representing tile configurations  
- Expansion functions for up/down/left/right moves  
- Priority queues for UCS/A\*  
- Path reconstruction from goal back to root  
- Printed step-by-step solution

### **AI Game**
- 3×3 board representation  
- Methods for:
  - Valid move generation  
  - Winning pattern detection (C-S-E or E-S-C)  
  - Minimax recursive evaluation  
- Alternating turns between MIN and MAX  
- Complete game loop with result handling  

---

## USAGE

### **Run the 8-Puzzle Solver**
1. Start the program  
2. Enter the **initial puzzle state**  
3. Choose:
   - `1` → Uniform Cost Search  
   - `2` → A\* Search  
4. View:
   - Optimal path  
   - Number of moves  
   - Final solution or failure message  

### **Run the AI Game**
1. Launch the program  
2. Board starts with an `'S'` in a fixed position  
3. MIN enters moves manually  
4. MAX responds with **AI-generated Minimax moves**  
5. Game ends when a winning C-S-E or E-S-C pattern appears or no moves remain  

---

## LICENSE

This project was developed as part of the  
**MYY602 – Artificial Intelligence** course at the University of Ioannina.

Final implementation by the project creators.

---

## CONTACT

**Christos-Grigorios Gkovaris**  
University of Ioannina – Computer Science and Engineering  
GitHub: https://github.com/ChristosGkovaris

**Maria Spanou**  
University of Ioannina – Computer Science and Engineering  
GitHub: https://github.com/SpanouMaria

**Vasilis Kotopoulos**  
University of Ioannina – Computer Science and Engineering  
GitHub: https://github.com/VasilisK1
