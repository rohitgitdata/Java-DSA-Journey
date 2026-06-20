# Week-5 Day-3 : Tree Traversals (DFS & BFS)

## What is Traversal?

Traversal means visiting every node of a tree exactly once in a specific order.

There are two major ways:

1. DFS (Depth First Search)
2. BFS (Breadth First Search)

---

# DFS (Depth First Search)

DFS goes deep into a branch before moving to another branch.

DFS has three traversals:

1. Preorder
2. Inorder
3. Postorder

---

# 1. Preorder Traversal (N → L → R)

Visit Order:

Node
→ Left Subtree
→ Right Subtree

Example:

        10
       /  \
      20   12
     / \
    15 13

Preorder:

[10, 20, 15, 13, 12]

Recursive Logic:

preorder(node){
    if(node == null) return;

    visit(node);
    preorder(node.left);
    preorder(node.right);
}

Uses:

- Tree Copy / Cloning
- Serialization & Deserialization
- Prefix Expressions
- Saving Tree Structure

Time Complexity: O(N)
Space Complexity: O(H)

---

# 2. Inorder Traversal (L → N → R)

Visit Order:

Left Subtree
→ Node
→ Right Subtree

Example:

        10
       /  \
      20   12
     / \
    15 13

Inorder:

[15, 20, 13, 10, 12]

Recursive Logic:

inorder(node){
    if(node == null) return;

    inorder(node.left);
    visit(node);
    inorder(node.right);
}

Important Observation:

For BST:

Inorder Traversal always gives elements in Sorted Order.

Example BST:

          10
         /  \
        5   20
       / \
      3   8
     /
    2

Inorder:

[2, 3, 5, 8, 10, 20]

Uses:

- Printing BST in Sorted Order
- BST Validation
- Range Queries

Time Complexity: O(N)
Space Complexity: O(H)

---

# 3. Postorder Traversal (L → R → N)

Visit Order:

Left Subtree
→ Right Subtree
→ Node

Example:

        10
       /  \
      20   12
     / \
    15 13

Postorder:

[15, 13, 20, 12, 10]

Recursive Logic:

postorder(node){
    if(node == null) return;

    postorder(node.left);
    postorder(node.right);
    visit(node);
}

Uses:

- Delete Entire Tree
- Memory Cleanup
- Bottom-Up Calculations
- Expression Evaluation

Time Complexity: O(N)
Space Complexity: O(H)

---

# DFS Summary

Preorder  = N → L → R

Inorder   = L → N → R

Postorder = L → R → N

All three traversals are DFS traversals.

Reason:

We move deeper into a branch before exploring another branch.

---

# BFS (Breadth First Search)

Also called:

- Level Order Traversal
- Breadth First Traversal (BFT)

Idea:

Visit nodes level by level.

Example:

          10
         /  \
        20   12
       / \
      15 13

BFS Output:

[10, 20, 12, 15, 13]

Queue is used in BFS.

Pseudo Logic:

1. Put root into queue.
2. Remove front node.
3. Print it.
4. Add its children.
5. Repeat until queue becomes empty.

Uses:

- Shortest Path in Unweighted Graphs
- Level Order Traversal
- Finding Minimum Depth
- Network Routing
- Web Crawlers

Time Complexity: O(N)
Space Complexity: O(W)

W = Maximum Width of Tree

---

# DFS vs BFS

DFS:

- Uses Recursion / Stack
- Goes Deep First
- Less Memory in Balanced Trees

BFS:

- Uses Queue
- Goes Level by Level
- Useful for Minimum Depth Problems

---

# Interview Points

1. Inorder traversal of BST gives sorted order.

2. BFS is also called Level Order Traversal.

3. Preorder is useful for Tree Copying.

4. Postorder is useful for Tree Deletion.

5. All DFS traversals have O(N) time complexity.

6. Recursive DFS uses O(H) auxiliary space.

H = Height of Tree.