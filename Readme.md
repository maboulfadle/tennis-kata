# Project

This project implements a **Tennis Game KATA** in Java, following **SOLID principles** and using **State Design Pattern** for managing game states.

## Rules of Tennis Scoring
- players start at **0 (ZERO)**.
- winning a ball increases the score to **15 → 30 → 40**.
- if both players reach **40**, the game goes to **deuce**.
- the winner of the next point gets **advantage**.
- if the player with **advantage** wins another point, they win the game.
- if the other player wins, the game returns to **deuce**.
- a player wins directly if they reach **40** and win the next point without a deuce.


## How to Run
### Prerequisites
Ensure you have **Java 21+** and **maven** installed.

### Build & Run the Game
```sh
mvn clean compile exec:java -Dexec.mainClass="Main"
```
Or run the `Main` main method from your IDE (IntelliJ, Eclipse, VS Code).

## Running Unit Tests
```sh
mvn test
```
### Test Cases Covered:
- normal progression (`15`, `30`, `40`)
- **deuce** scenarios
- **advantage** scenarios
- **winning conditions**
- **Invalid input handling**

## Dependencies (pom.xml)
```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.9.2</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.9.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Example Game Output
### Input: `"ababaa"`
```sh
player a: 15 & player b: 0
player a: 15 & player b: 15
player a: 30 & player b: 15
player a: 30 & player b: 30
player a: 40 & player b: 30
player a wins the game
```

## 📌 Improvements
- Implement **DDD (Domain-Driven Design)** for event handling.
- Add a GUI version for better visualization.
- Extend to **full tennis sets**.
