# NEURAL CLASSIFICATION AND UNSUPERVISED LEARNING

This project implements **foundational Computational Intelligence algorithms** from scratch in **Java**, including a **Multi-Layer Perceptron (MLP)** for supervised classification and a **K-Means clustering engine** for unsupervised pattern recognition[cite: 9, 62, 84]. [cite_start]It was developed as part of the **MYE035 – Computational Intelligence** course at the **University of Ioannina**[cite: 1].

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

The **Neural Classification and Unsupervised Learning** project consists of two primary modules:

### **1. MLP Classifier (Supervised Learning)**
A robust Neural Network implementation designed to solve a complex 4-class spatial classification problem.
- Utilizes a **3-layer hidden architecture** ($H_1, H_2, H_3$).
- Supports multiple activation functions: **Logistic**, **Tanh**, or **ReLU**.
- Trained using **Backpropagation** with **Mini-batch Gradient Descent**.

### **2. K-Means Engine (Unsupervised Learning)**
An algorithmic tool for discovering hidden structures in 2D spatial datasets.
- Performs clustering on a dataset of 1200 points across 9 real clusters.
- Evaluates clustering quality using the **Sum of Squared Errors (SSE)**.
- Implements iterative optimization to find optimal centroid locations.

---

## FEATURES

### **MLP Classifier**
- Customizable Architecture: Configurable neurons for three hidden layers to optimize performance.
- Optimization Control: Flexible mini-batch sizes ($N/10, N/20, N/100, N/200$) for efficient training.
- Generalization Testing: Automated evaluation of model accuracy on a 4000-sample test set.
- Stopping Criteria: Training persists for at least 800 epochs or until error convergence.

### **K-Means Clustering**
- Global Best Pursuit: Executes 50 independent runs with random initializations to find the global minimum error.
- Elbow Method Support: Facilitates estimation of the true cluster count by testing $M = \{3, 5, 7, 9, 11, 13\}$.
- Visual Validation: Generates detailed plots of data points and calculated centroids.

---

## INPUT DATA

### **SDT (Classification Dataset)**
- Samples: 8000 points total (4000 for Training and 4000 for Testing).
- Space: Points $(x_1, x_2)$ distributed within the $[0,2] \times [0,2]$ square.
- Categories: 4 classes ($C_1, C_2, C_3, C_4$) defined by non-linear geometric constraints.

### **SDO (Clustering Dataset)**
- Samples: 1200 points in total.
- Structure: 9 clusters based on specific rectangular regions and background noise.

---

## ALGORITHMS IMPLEMENTED

### **1. Multi-Layer Perceptron (MLP)**
- Forward Pass: Calculations of neuron activations across all layers.
- Backpropagation: Gradient computation for every weight and bias in the network.
- Mini-batch Gradient Descent: Error-driven weight updates performed per group of $L$ examples.

### **2. K-Means Clustering**
- Centroid Initialization: Selecting random initial data points as cluster centers.
- Assignment & Update: Iterative process of assigning points to nearest centers and re-calculating centroids.
- Error Minimization: Objective function based on Euclidean distance.

---

## IMPLEMENTATION DETAILS

- Language: Pure **Java** (JDK 8+) without external machine learning libraries.
- Visualization: **Python (Matplotlib)** scripts are used to process the generated `.txt` data and create:
    - Decision boundary plots.
    - Centroid distribution maps.
    - SSE vs. $M$ "Elbow" charts.
- Architecture: Modular design with separate classes for MLP logic, K-Means execution, and Data generation.

---

## USAGE

### **Run the MLP Classifier**
1. Navigate to the Exercise 1 directory.
2. Compile: `javac Main.java`
3. Run: `java Main`
4. View the training error per epoch and the final generalization percentage on the test set.

### **Run the K-Means Engine**
1. Navigate to the Exercise 2 directory.
2. Compile: `javac MainKMeans.java`
3. Run: `java MainKMeans`
4. The program will generate `kmeans_result_M[X].txt` files for each tested $M$ value.

### **Generate Visualizations**
1. Ensure Python and Matplotlib are installed.
2. Run: `python visualization.py` (Exercise 1) or `python clusters.py` (Exercise 2) to view graphical results.

---

## LICENSE

This project was developed for academic purposes as part of the **MYE035 - Computational Intelligence** course at the University of Ioannina.

Final implementation by the project creators.

---

## CONTACT

**Christos-Grigorios Gkovaris** University of Ioannina – Computer Science and Engineering  
GitHub: [ChristosGkovaris](https://github.com/ChristosGkovaris)

**Vasilis Kotopoulos** University of Ioannina – Computer Science and Engineering  
GitHub: [VasilisK1](https://github.com/VasilisK1)