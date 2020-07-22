package katas.numbers;

import java.util.HashMap;
import java.util.Map;

/*

Write a method solve that accepts a list of linear equations 
that your method will have to solve. The output should be a map 
(a Map object in JavaScript) with a value for each variable in 
the equations. If the system does not have a unique solution 
(has infinitely many solutions or is unsolvable), return null.

For example :

"2x + 4y + 6z = 18"
"3y + 3z = 6"
"x + 2y = z - 3"

should result in a map :

x = 2
y = -1
z = 3
 */


public class LinearSolver {
	public Map<String, Double> solve(String... equations) {

		return new HashMap<>();
	}
}
