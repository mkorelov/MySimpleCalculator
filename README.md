## MySimpleCalculator

This is my implementation of a Simple Calculator using Java & JavaFX on an Apple Silicon Mac in VSCode.

## TODO

1. Implement Logic
2. Improve UI (replace text with transparent images of symbols)
3. Add error messages (Footer)

Current Bugs: 

Potential Updates:
- clear just resets everything, doesn't have dual functions where you can retype one number
- clear button should initially display AC, after a number is entered it switches to C if clicked then it returns to AC
- clicking clear button when it display C means clear the current number, but if an operation is hit before you need to then hit AC after as well to all clear

- after an operation is clicked, 0 is displayed, instead it shouldn't change display until a number is entered
- highlight which operation is selected until clear button is pressed or equals is pressed
- percent automatically performs function unlike other operations that require equals to be pressed
- must click equals for all operations but on other calculators you can click another operation to calculate the result
- resize font if exceed num of chars allowed on display

## Features:

- Use Apple Calculator App as an inspiration and to figure out logic/funcitons
- Should only have two screens and one logic file

Iteration 1:
- Main Screen has a display that shows the current number, the digits 0-10, decimal point, add, minus, times, divide, equals, negative, and a clear button
- Number defaults to 0 and prevent cutoff by rounding
- A disabled button that increases the size of the screen and offers much more functions

Iteration 2:
- Implement option to expand window and access a lot more functions

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).