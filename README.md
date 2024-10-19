# Restaurant

# Restaurant Management System

This Java-based Restaurant Management System provides a simple command-line interface for users to create an account, log in, browse menus, and manage their orders. Below is a brief overview of the main features and functionalities.

## Features

1. **User Account Management**:
   - **Sign Up**: Create a new account with a username, password, and phone number.
   - **Login**: Authenticate using username or phone number and password, with a maximum of three attempts.

2. **Menu Browsing**:
   - **Veg Menu**: View and add vegetarian dishes to the cart.
   - **Non-Veg Menu**: View and add non-vegetarian dishes to the cart.

3. **Cart Management**:
   - Users can view their selected items and total bill.
   - Checkout option to finalize the order.

4. **User Interaction**: The system is designed to prompt users for input continuously until they choose to log out or exit.

## Code Structure

- **Main Class**: The `Restaurant` class handles all functionalities.
- **Static Variables**: Holds user information, cart items, and the total bill.
- **Methods**:
  - `createAccount()`: Manages user account creation.
  - `login()`: Handles user authentication.
  - `homepage()`: Displays the main menu for navigating options.
  - `vegMenu()` & `nonVegMenu()`: Show available dishes and add selections to the cart.
  - `cart()`: Displays current cart contents and total bill.
  - `checkout()`: Initiates the checkout process.

## Usage

To run the system, compile the Java file and execute it in a command-line environment. Follow on-screen prompts to navigate through account creation, login, menu selection, and checkout.

## Note

Ensure to handle input properly, as the code currently lacks extensive error handling and validation for user input.
