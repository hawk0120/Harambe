# Harambe 
## Monkey C Application Setup Tool
This Java program serves as a CLI tool for setting up a Monkey C application for Pebble smartwatch development. It creates the necessary directory structure and files for a basic project.
## Usage

1. **Compile the Program:**

    ```bash
    javac Harambe.java
    ```

2. **Run the Program:**

    ```bash
    java Harambe <app_name>
    ```

    Replace `<app_name>` with the desired name for your Monkey C application.

## Directory Structure

The program will create the following directory structure:

```
<app_name>
│   appinfo.json
└───src
    └───c
        │   <app_name>_app.c
└───resources
```

## Files Created

1. **`<app_name>/appinfo.json`:**

    A JSON file containing basic configuration for the Pebble app, such as app keys and resources.

2. **`<app_name>/src/c/<app_name>_app.c`:**

    A Monkey C source file where you can write your Pebble app code.

## Example

To create a Monkey C app named "MyPebbleApp," run the following commands:

```bash
javac Harambe.java
java Harambe MyPebbleApp
```

This will create the directory structure and basic files for your Monkey C application.

Feel free to customize the generated files and directory structure based on your Connect IQ app development needs.

