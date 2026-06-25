ATM Withdrawal System

A simple Java program that simulates withdrawing money from a bank account, with robust error handling for invalid inputs and insufficient funds.

Features

- Custom checked exception `InsufficientFundsException` with detailed message.
- Handles `NumberFormatException` for non‑numeric inputs.
- Handles `IllegalArgumentException` for negative or zero amounts.
- `finally` block always prints the final account balance.
