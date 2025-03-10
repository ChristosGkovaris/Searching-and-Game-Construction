# Searching and Game Construction
Welcome to the "Searching and Game Construction" repository. This repository contains an implementation of artificial intelligence search algorithms in Java. The project includes two primary exercises: an 8-puzzle problem solver using UCS and A* algorithms, and a Minimax-based game with AI. This project was implemented during the sixth semester, in the course MYY602 of the curriculum of the University of Ioannina. The final grade of the project is 2.5 out of 3.



# Overview
**8-puzzle Solver**
- Objective: Solve the 8-puzzle by finding the minimum sequence of moves from an initial to a 
  final state using Uniform Cost Search (UCS) or A* with a heuristic function.
- How to play: Input the initial puzzle state and choose between UCS and A* algorithms to find the 
  optimal path.
- Feedback: The program terminates when no further moves are possible or a solution/winner is 
  found.

**Game with AI**
- Objective: Play a 3x3 grid game where two players (MIN and MAX) alternate moves. The MAX player uses the 
  Minimax algorithm to select optimal moves to achieve winning configurations.
- How to play: The game begins with an 'S' in a specific position on the grid. Players 
  alternate 
  placing 'C', 'S' or 'E' on the grid. The game ends when one player creates a winning sequence 
  (C-S-E or E-S-C) in a row, column or diagonal.
- Feedback: The program terminates when no further moves are possible or a solution/winner is 
  found.



## Implementation Details
- The 8-puzzle Solver includes classes and methods to manage states, validate moves and print 
  solutions.
- The Game with AI includes methods for managing player turns, determining winning conditions, 
  using the Minimax algoriths to choose moves.



## Collaboration
This project was a collaborative effort. Special thanks to [SpanouMaria](https://github.com/SpanouMaria) and [VasilisK1](https://github.com/VasilisK1), for their significant contributions to the development and improvement of the game.
