Asymptotic Notation — Theory
________________________________________
What is Asymptotic Notation?
Asymptotic Notation is a mathematical way to describe how the performance of an algorithm changes as the input size grows. It helps us analyze and compare algorithms without worrying about hardware speed or programming language. It focuses only on how the number of steps increases when the data size increases.
________________________________________
What is Big O Notation?
Big O Notation describes the worst case performance of an algorithm. It tells us the maximum number of steps an algorithm will take for a given input size n.
Big O	Name	Meaning
O(1)	Constant	Always takes same time, no matter the size
O(log n)	Logarithmic	Steps grow very slowly as size increases
O(n)	Linear	Steps grow directly with size
O(n log n)	Log Linear	Slightly worse than linear
O(n²)	Quadratic	Steps grow very fast, bad for large data
________________________________________
Best, Average and Worst Case
Every algorithm has three cases depending on the input data:
Best Case — The minimum number of steps the algorithm takes. This happens when the data is in the most favorable condition.
Average Case — The expected number of steps the algorithm takes for a typical or random input. This is the most realistic measure.
Worst Case — The maximum number of steps the algorithm takes. This happens when the data is in the least favorable condition. Big O Notation always refers to worst case.
________________________________________
Linear Search — Case Analysis
Linear Search checks each element one by one from start to end.


Best Case — O(1)
The element we are searching for is at the very first position. Only 1 step needed.
Example: Searching for Product ID 103 and it is the first product in the list.
Average Case — O(n)
The element is somewhere in the middle of the list. On average, half the elements are checked.
Example: Searching for Product ID 105 in a list of 10 products — about 5 steps needed.
Worst Case — O(n)
The element is at the last position or not present at all. All n elements are checked.
Example: Searching for Product ID 110 in a list of 10 products — all 10 steps needed.
________________________________________
Binary Search — Case Analysis
Binary Search works only on a sorted array. It repeatedly divides the search space in half.
Best Case — O(1)
The element we are searching for is exactly at the middle position. Found in 1 step.
Example: Searching for Product ID 105 in a sorted list of 10 — it is the middle element, found immediately.
Average Case — O(log n)
The element is found after a few divisions. Each step eliminates half the remaining elements.
Example: In 10 products, at most 4 steps. In 1000 products, at most 10 steps.
Worst Case — O(log n)
The element is at the very start, very end, or not present. Maximum log n steps needed.
Example: In 1,000,000 products — Binary Search needs only 20 steps maximum

