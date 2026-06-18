# 🌳 Week-5 Day-1: Trees Introduction

## Why Trees?

Trees ka use hierarchical data ko store karne ke liye hota hai.

### Advantages

* Efficient Searching → `O(log N)` (Balanced Trees)
* Ordered Storage
* Dynamic Structure
* Better than Linear Structures for many operations

### Real World Uses

* File Systems
* Databases
* Hierarchical Data
* Search Engines
* Machine Learning
* Network Routing
* Compiler Syntax Trees

---

# Basic Terminologies

## Node

Tree ka har element ek node hota hai.

## Root Node

Tree ka sabse upar wala node.

## Parent Node

Jo node kisi doosre node ko connect karta hai.

## Child Node

Parent se connected node.

## Sibling Nodes

Same parent ke children.

## Edge

Do nodes ke beech ki connection line.

## Leaf Node

Jis node ke koi children nahi hote.

## Ancestor

Current node ke upar ke saare nodes.

## Descendant

Current node ke neeche ke saare nodes.

---

# Important Properties

## Size

Tree me total nodes ki sankhya.

## Height of Node

Node se deepest leaf node tak edges ki count.

## Height of Tree

Root node ki height.

## Depth of Node

Root se current node tak edges ki count.

## Level of Node

`Depth + 1`

Root ka:

* Depth = 0
* Level = 1

---

# Binary Tree

Binary Tree me har node ke maximum 2 children ho sakte hain:

* Left Child
* Right Child

```text
        10
       /  \
      5    20
```

---

# Types of Binary Trees

## 1. Full Binary Tree (Strict Binary Tree)

Har node ke:

* Ya to 0 children
* Ya 2 children

Exactly 1 child allowed nahi hai.

```text
        1
       / \
      2   3
```

---

## 2. Complete Binary Tree

Last level ko chhodkar saare levels completely filled hote hain.

Last level ke nodes left se right fill hote hain.

```text
        1
       / \
      2   3
     / \  /
    4  5 6
```

---

## 3. Perfect Binary Tree

Saare internal nodes ke 2 children hote hain.

Saare leaf nodes same level par hote hain.

Formula:

```text
Nodes = 2^(h+1) - 1
```

---

## 4. Balanced Binary Tree

Har node ke left aur right subtree ki height ka difference:

```text
≤ 1
```

Searching, insertion aur deletion fast rehte hain.

Average Complexity:

```text
O(log N)
```

---

## 5. Degenerate (Skewed) Binary Tree

Har node ka sirf ek child hota hai.

Linked List jaisa structure ban jata hai.

```text
1
 \
  2
   \
    3
     \
      4
```

Time Complexity:

```text
O(N)
```

---

# Ordered Binary Tree

Har node ki position matter karti hai.

Left child aur Right child ko interchange karne par tree change ho jata hai.

---

# Revision Questions

1. Root Node kya hota hai?
2. Parent aur Child Node me difference?
3. Edge kya hoti hai?
4. Height aur Depth me difference?
5. Full Binary Tree kya hota hai?
6. Complete Binary Tree kya hota hai?
7. Perfect Binary Tree kya hota hai?
8. Balanced Binary Tree kya hota hai?
9. Degenerate Tree kya hota hai?
10. Binary Tree aur BST me difference?

---

# ✅ Day-1 Completed

### Topics Covered

* Why Trees?
* Uses of Trees
* Terminologies
* Binary Tree Introduction
* Types of Binary Trees
* Height, Depth, Level
* Ordered Binary Trees

### Next Day (Week-5 Day-2)

* Properties of Binary Trees
* Binary Tree Implementation (Code)
* Node Class
* Tree Creation
