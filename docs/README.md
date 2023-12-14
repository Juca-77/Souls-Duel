# LDTS - com.aor.soulsduel.model.Soul's Duel
## project-l14gr09

This project was developed by *João Rey*(up202205576@fe.up.pt) and *Antero Morgado*(up202204971@fe.up.pt) for the curricular unity LDTS 2023/24.

Embark on an epic adventure in "com.aor.soulsduel.model.Soul's Duel," a 2D game inspired by the intense battles of Undertale. Assume the role of a courageous soul navigating a mysterious world filled with challenges and adversaries. Engage in thrilling battles where strategic decisions and quick reflexes are key to survival. Face formidable enemies, each with unique abilities, and navigate through their attacks to emerge victorious. Dive into intense battles and determine the fate of your soul.

------

### IMPLEMENTED FEATURES

- **Move** - The game character will be able to move with the WASD keys.
- **HP** - The player will have hearth points.
- **Get hitted** - If the character get hitted he will lose Health Points(HP).
- **Enemys** - There will be a display area where the enemys will be displayed in a Ascii design.
- **Different attacks** - The enemys will have diferent combinations of attacks.
- **Menu** - There will be a menu with play options.
- **Music** - Music in the menus/in game and some sound effects.
- **Skins** - The hero will not be a letter, using FontForge we will 'create' him as a hearth.
- **Levels** - The player will be able to play in 4 different levels.

### PLANNED FEATURES

- **Score** - As the time pass the score goes up.



  
As inspiration and ilustration (Mockup) of what the game will look like (or at least we will try to make it look like) there's this GIFs of two Undertale fights:

![undertale-fight](https://github.com/FEUP-LDTS-2023/project-l14gr09/assets/144793333/01a079c5-7c83-4dc7-adf5-960c9f2f9a33)

![3-3118](https://github.com/FEUP-LDTS-2023/project-l14gr09/assets/144793333/7d3289a4-36a6-4791-8a9e-d9146a22eaae)

------

### States

**Managing Different States in the Game**

In our game, we aimed to introduce a diverse set of experiences by incorporating distinct com.aor.soulsduel.states. The primary focus was on creating a menu that offers various options, including the selection of game levels and initiating gameplay.

**The State Pattern for Managing Different com.aor.soulsduel.Game States**

In our game development, we recognized the need for managing distinct com.aor.soulsduel.states such as the main menu and the gameplay itself. To facilitate this, we implemented the State pattern, providing a structured approach to represent and transition between various com.aor.soulsduel.states within our application.

**Implementation**

This figure can ilustrate how the pattern were mapped to the application classes:

![Screenshot from 2023-11-26 17-13-09](https://github.com/FEUP-LDTS-2023/project-l14gr09/assets/144793333/8a330320-e86f-4110-af00-7e14abe4565f)


**Consequences**

The use of the State pattern in our game design brings several benefits:
- Organized Code Structure: The State pattern enables a clean and organized codebase by encapsulating the behavior of each state within separate classes.
- Flexible State Transitions: Dynamic state transitions are achieved through the setState() method, providing flexibility in managing different game com.aor.soulsduel.states.
- Modular and Extensible: Adding new com.aor.soulsduel.states becomes a modular process, and the system is easily extensible without modifying existing code.
- Improved Readability: The State pattern enhances code readability by isolating the logic associated with each state, making it easier to understand and maintain.

### Singleton

**Managing Different Themes and Sounds**

In this game we wanted to have different themes in the diferent com.aor.soulsduel.states of the game and some sounds, because of that we decided to use the singleton pattern to help us.


**The Singleton Pattern**

We applied the **Singleton** pattern to our menu.com.aor.soulsduel.Music class to ensure that only one instance exists, providing a global point of access for managing different themes and sounds within our application.

**Implementation**

This figure can ilustrate how the pattern were mapped to the application class:

![Screenshot from 2023-11-26 17-28-59](https://github.com/FEUP-LDTS-2023/project-l14gr09/assets/144793333/51e32f1d-678d-406b-be8a-9c3cd54847ca)


**Consequences**

The use of the Singleton pattern in the current design allows the following benefits:

- Single Point of Control: With a single instance of the menu.com.aor.soulsduel.Music class, we have a centralized point for controlling different themes and sounds throughout the application.
- Global Accessibility: The Singleton pattern provides a globally accessible instance, allowing any part of the application to interact with the music functionality without the need for multiple instances.
- Resource Efficiency: By having only one instance, we avoid unnecessary duplication of resources, such as memory, associated with managing themes and sounds.


### com.aor.soulsduel.Game Loop

**Make the game work**

We encountered a critical challenge related to the continuous and synchronized execution of the game logic. Without a structured approach to manage the dynamic nature of gameplay, we faced difficulties in maintaining consistent interactions between the com.aor.soulsduel.model, com.aor.soulsduel.controller, and com.aor.soulsduel.viewer components. So we decided to implement the **com.aor.soulsduel.Game Loop** as sugested by the teacher. 

**The com.aor.soulsduel.Game Loop Pattern**

We've incorporated the **com.aor.soulsduel.Game Loop** pattern into our application, aligning with the Model-Controller-Viewer architecture. This pattern orchestrates the continuous execution of the game logic, providing a structured and synchronized flow between the com.aor.soulsduel.model, com.aor.soulsduel.controller, and com.aor.soulsduel.viewer components.

**Implementation**

This figure can ilustrate how the pattern were mapped to the application classes:

![Screenshot from 2023-11-26 19-12-07](https://github.com/FEUP-LDTS-2023/project-l14gr09/assets/144793333/84584aac-7c40-4ae5-bcd6-e9e0563aab78)

**Consequences**

The integration of the com.aor.soulsduel.Game Loop pattern into our Model-Controller-Viewer architecture yields several advantages:

- Consistent com.aor.soulsduel.Game Logic Execution: The com.aor.soulsduel.Game Loop ensures a steady and consistent execution of the game logic, promoting smooth gameplay experiences.
- Separation of Concerns: The Model-Controller-Viewer architecture remains well-defined, with the game loop acting as the orchestrator, keeping the concerns of the com.aor.soulsduel.model, com.aor.soulsduel.controller, and com.aor.soulsduel.viewer separate.
- Real-time Responsiveness: By controlling the update interval, the application remains responsive in real-time, adapting to changes in the game state.
- Predictable Rendering: The synchronized game loop provides predictability in rendering frames, enhancing visual stability and reducing potential glitches.
- Dynamic Adaptability: The ability to dynamically adjust the loop's update interval allows us to optimize performance based on the application's requirements.

### Factory Method

**Utilizing the Factory Method Pattern for Controller and Viewer Instances in Different States:**

Within our game development, we recognized the need for dynamic instantiation of controllers and viewers based on the current game state. To address this, we employed the Factory Method pattern, allowing us to encapsulate the creation logic of these components within dedicated factory methods.

**Implementation**

This illustration demonstrates how the Factory Method pattern is applied in our application:

![Screenshot from 2023-11-26 19-32-36](https://github.com/FEUP-LDTS-2023/project-l14gr09/assets/144793333/f27a2b35-29a6-47d4-9943-0cd8df4d1a01)


**Consequences**

Applying the Factory Method pattern to our com.aor.soulsduel.controller and com.aor.soulsduel.viewer instantiation offers several advantages:
- Decoupling: The creation logic for controllers and viewers is decoupled from the com.aor.soulsduel.Game class, enhancing flexibility and maintainability.
- Extensibility: Introducing new com.aor.soulsduel.states and corresponding controllers/viewers becomes a modular process without affecting existing code.
- State-specific Implementations: Each state can have its own implementation of com.aor.soulsduel.controller and com.aor.soulsduel.viewer creation, tailoring the components to specific state requirements.
- Encapsulation: The Factory Method pattern encapsulates the instantiation details, promoting a cleaner and more organized structure.

------

#### KNOWN CODE SMELLS

> None so far.

### TESTING

> Soon.

### SELF-EVALUATION

- Antero Morgado: 50%
- João Rey: 50%
