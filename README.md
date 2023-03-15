# Battleship Interview

To complete this exercise create a maven project referencing this project using jitpack as follows:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.test</groupId>
    <artifactId>test</artifactId>
    <version>1.0.0</version>

    <properties>
        <maven.compiler.source>19</maven.compiler.source>
        <maven.compiler.target>19</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.github.brennydoogles</groupId>
            <artifactId>battleship-interview-common</artifactId>
            <version>v1.0.0</version>
        </dependency>
        // Any other dependencies you need
    </dependencies>
</project>
```

In this project, create a class which implements ```IBattleShipSolver```. This bot class will face off against a series of increasingly difficult bots on randomly generated board placements in order to prove its mettle!

```IBattleShipSolver``` has four methods. 

The ```init``` method is called at the start of the game and allows you to set up any initialization logic your solver needs.

Once initialized, your bot will alternate turns with another bot. Each turn will have the following phases which correspond to ```IBattleShipSolver``` methods:
 1. Prefire: This phase provides you with the current state of the game and lets you adjust your strategy if needed based upon the game state.
 2. Aim: This phase allows you to select and return the coordinates you wish to fire upon in this round.
 3. Postfire: This phase gives you the results of your previous shot, and allows you to alter your strategy if needed based upon the results of the shot.

Good luck!