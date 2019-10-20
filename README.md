# Replace if-else chain Kata

## Description
The code represents a Calculator class wich has a _calculate_ method. Initially, this method receives three parameters:
* numberA: Left input number in calculation. double
* numberB: Right input number in calculation. double
* operator: Type of operation wich will be executed. It is an String expected to have the value of _add_, _multiply_, _divide_ or _subtract_

The if-else chain present in _calculate_ method have to be replaced with other structures. Its signature can be changed in order to accomplish this.

## Purpose
First, this kata is about learning and having fun :)<br>
Of course is also about practicing Safe Refactoring, TDD, SOLID and Design Patterns. Use everything you want in order to obtain Clean Code.

## Problem
The code exposes the overuse of if-else statements for executing different behaviours in a method depending of any or some conditions. It implies that code is or will be unmaintainable in future due to the certain exponential growth of its complexity.<br>
This bad smell could be present in our code like a switch statement too, especially when the conditions checked in that switch statement are not isolated and are also present in other parts of the code.

## Proposed Solutions
The solutions proposed to the problem are:
* Enums
* Factory Pattern
* Command Pattern
* Rule Engine