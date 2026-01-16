<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?size=32&center=true&vCenter=true&width=700&lines=Roman+To+Integer+Converter;Java+DSA+Practice;Clean+Algorithm+Solution"/>
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

---

## 🧠 Approach / How I Solved It  

At first, I thought the problem was difficult and not straightforward. So I used **pen and paper ✍️** to understand the Roman numeral patterns and rules before writing code.

---

## 🔍 Key Observations  

- Roman numerals sometimes use **subtractive notation**  
  Example: `IV`, `IX`, `XL`, `XC`, `CD`, `CM`
- To handle this easily, I decided to **iterate from right to left ⬅️**

---

## ⚙️ Algorithm  

1. Start iterating from the **end of the string** (`s.length() - 1`)  
2. For each character:
   - Check the **next character (right side)** to detect subtractive pairs  
   - If a subtractive pattern is found ➖  
     → Subtract the current value from the total  
   - Otherwise ➕  
     → Add the current value to the total  
3. Continue until all characters are processed  

This approach allows handling subtraction cases without complex forward lookups.

---

## 🐞 Debugging Experience (Important Learning)  

While writing conditions using `&&` and `||`, I encountered **unexpected behavior**.

### ❗ Issue  

The logical condition was not working as expected because of **operator precedence**:

- `&&` has higher priority than `||`  
- This caused incorrect grouping of conditions  

---

### ✅ Solution  

I fixed the issue by properly grouping expressions using **parentheses `( )`**.

This taught me the importance of:

- Understanding operator precedence 🧩  
- Always grouping logical conditions clearly  

---

## 📊 Complexity Analysis  

### ⏱ Time Complexity  
- **O(n)**  
Each character is processed once.

### 💾 Space Complexity  
- **O(1)**  
Only constant extra space is used for variables and the Roman mapping.

---

## 🎯 Key Takeaways  

- Drawing patterns on paper helps understand the problem better ✏️  
- Reverse iteration simplifies Roman numeral subtraction logic 🔁  
- Parentheses are critical when combining `&&` and `||` ⚠️  
- Debugging logic errors teaches more than directly copying solutions 🚀  

---


