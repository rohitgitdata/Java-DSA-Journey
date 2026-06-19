# Week-5 Day-2 🌳

## Topics Covered

- Perfect Binary Tree
- Strict (Full) Binary Tree Properties
- Internal Nodes
- Leaf Nodes
- Height and Levels
- Minimum Height Concept
- Array Representation of Binary Trees
- Linked Representation of Binary Trees
- Sequential Representation of Binary Trees

---

## Important Formulas

### Perfect Binary Tree

If height = h

Total Nodes:

```text
2^(h+1) - 1
```

Leaf Nodes:

```text
2^h
```

Internal Nodes:

```text
2^h - 1
```

---

### Strict Binary Tree

```text
Leaf Nodes = Internal Nodes + 1
```

---

### Minimum Height

```text
h ≈ log₂(N)
```

where N = Total Nodes

---

## Binary Tree Representations

### Linked Representation

```java
class Node{
    int value;
    Node left;
    Node right;
}
```

### Sequential Representation

Uses arrays.

For index i:

```text
Left Child  = 2*i + 1
Right Child = 2*i + 2
Parent      = (i-1)/2
```

---

## Key Learning

- Complete Binary Trees minimize height.
- Lower height improves searching efficiency.
- Arrays are efficient for Complete Binary Trees.
- Linked representation is the most commonly used representation in DSA problems.

---