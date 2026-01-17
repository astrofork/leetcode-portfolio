<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?size=32&center=true&vCenter=true&width=700&lines=Add+To+Number+Linkedlist;Java+DSA+Practice;Not perfect but efficient+Algorithm+Solution"/>
</p>



<p align="center">
  <b>Java Implementation | Algorithm Practice | Clean Logic</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange"/>
  <img src="https://img.shields.io/badge/Time%20Complexity-O(n)-blue"/>
  <img src="https://img.shields.io/badge/Space%20Complexity-O(1)-green"/>
  <img src="https://img.shields.io/badge/Status-Completed-success"/>
</p>

<hr>


## 📌 Problem  
We are given a string representing a Roman numeral. The task is to convert it into its corresponding integer value.
we are give a two linked list l1, l2 . The task is to add two Linkedlist and return result Linkedlist

---

## 🧠 Approach / How I Solved It  
At first, I didn’t know how to properly implement a **Linked List** solution. So I started by learning the basic structure and operations, then switched to a **pen-and-paper approach** to visualize node connections and number addition.

### Step-by-Step Learning Process  
- I began by **drawing the linked lists** and simulating the addition process manually. This helped me understand how traversal and carry propagation work. ✍️  

- While implementing the logic, I encountered the problem of **uneven linked list sizes**. I solved this by using the logical OR (`||`) condition to continue iterating as long as at least one list still had nodes remaining.  

- After writing the initial code, the program worked logically, but I noticed that **leading zeros** were appearing in the result. At first, I didn’t realize that returning `res.next` would skip the dummy head node. Once I understood this concept, I fixed the issue.  

- The carry handling logic was mostly correct, but I initially **forgot to handle the final carry** after the loop ended. When I realized this, I added an extra node to store the remaining carry value if it existed.  

- After submitting the solution, I asked ChatGPT for optimization suggestions. It provided a **cleaner carry-handling approach**, but instead of replacing my original logic, I decided to **comment the optimized version** in the code for future reference and learning purposes.  

---

### ✅ What I Learned  

- Visualizing linked lists using drawings makes complex pointer logic easier to understand  
- Dummy head nodes help simplify result construction  
- Edge cases like final carry and leading zeros are easy to miss but critical  
- Writing a working solution first and optimizing later is an effective learning strategy  

This problem helped me gain more confidence in working with **linked list traversal, carry management, and edge-case handling**.

---


## 🔍 Key Observations  

- The problem involves **adding two numbers represented as linked lists**, digit by digit.  
- Since the lists can be of **uneven lengths**, the loop must continue as long as **at least one list still has nodes**.  
- A **carry value** must be maintained and propagated during addition.  
- Using a **dummy head node** simplifies result list construction and avoids edge-case handling for the first node.

---

## ⚙️ Algorithm  

1. Initialize a **dummy head node** and a pointer for building the result list.  
2. Initialize `carry = 0`.  
3. Iterate while **either linked list still has nodes** (`l1 != null || l2 != null`):  
   - Extract values from the current nodes (use `0` if a list has ended).  
   - Add both values and the carry.  
   - Create a new node with `(sum % 10)` and attach it to the result list.  
   - Update the carry using `(sum / 10)`.  
4. After the loop ends:  
   - If `carry > 0`, create a **new node for the remaining carry**.  
5. Return `result.next` to **skip the dummy node** and avoid leading zeros.  

This approach ensures clean traversal, correct carry handling, and proper result construction.

---

## 🐞 Debugging Experience (Important Learning)  

While implementing the solution, I faced several logical issues that helped me understand the problem better.

### ❗ Issues  

- At first, I didn’t know how to properly **traverse and add linked list nodes**, so I used a **drawing-based approach** to visualize the addition process.  
- I initially forgot to handle **uneven list sizes**, which caused incorrect termination of the loop.  
- After getting correct logic, I noticed **leading zero values** in the result because I was returning the dummy node instead of `result.next`.  
- I also forgot to **add a final carry node** after the loop, which caused incorrect output for some test cases.

---

### ✅ Solutions  

- Used the logical OR (`||`) condition to continue traversal until both lists are exhausted.  
- Returned `result.next` instead of `result` to skip the dummy head node.  
- Added a final carry check to insert an extra node if needed.  
- Improved my carry logic after reviewing optimization suggestions (kept original logic and commented optimized version for learning reference).  

This taught me the importance of:

- Careful edge-case handling 🧩  
- Using dummy nodes to simplify list construction  
- Always validating carry behavior after loop completion  

---

## 📊 Complexity Analysis  

### ⏱ Time Complexity  
- **O(n)**  
Where `n` is the length of the longer linked list. Each node is visited once.

### 💾 Space Complexity  
- **O(n)**  
Extra space is used for creating the result linked list.

---

## 🎯 Key Takeaways  

- Visualizing linked lists using drawings makes pointer logic easier ✏️  
- Dummy nodes simplify edge-case handling 🔗  
- Carry management is critical in number-based linked list problems ➕  
- Testing edge cases reveals hidden bugs 🚀  
- Writing a working solution first and optimizing later is a good learning strategy  

---

