# Dokumentace

## 1. Controller: JsonPage

Třída `JsonPage` slouží jako hlavní API endpoint pro interakci s uživatelskými daty.

- **Endpoint: `@GetMapping("/usersJson")`**
    - Popis: Vrací seznam všech uživatelů ve formátu JSON.

- **Endpoint: `@GetMapping("/userJson/{userId}")`**
    - Popis: Přijímá `userId` jako parametr z URL a vrací informace o konkrétním uživateli ve formátu JSON.

- **Endpoint: `@GetMapping("/addUser/{email}/{phone_number}/{height}")`**
    - Popis: Přijímá `email`, `phone_number`, a `height` jako parametry z URL. Přidává nového uživatele a vrací příslušnou zprávu.

## 2. Entity: User

Třída `User` definuje strukturu uživatelského objektu a jeho vztah k databázové tabulce `Users`.

- **Atributy**:
    - `id`: Unikátní identifikátor uživatele.
    - `email`: Emailová adresa uživatele.
    - `verified`: Stav ověření uživatelského účtu.
    - `date_created`: Datum a čas vytvoření uživatelského účtu.
    - `phone_number`: Telefonní číslo.
    - `height`: Výška uživatele v metrech.

## 3. Repository: UserRepository

`UserRepository` rozšiřuje `JpaRepository` a nabízí metody pro interakci s databázovou tabulkou `Users`.

- **Metody**:
    - `findAll()`: Vrací seznam všech uživatelů.
    - `findById(int id)`: Vyhledává uživatele podle jeho ID.
    - `existsByEmail(String email)`: Kontroluje, zda uživatel s daným emailem existuje.

## 4. Service: UserService

`UserService` poskytuje logiku pro práci s daty uživatelů.

- **Metody**:
    - `addUser(...)`: Přidává nového uživatele do databáze.
    - `findById(int userId)`: Vyhledává uživatele podle jeho ID.
    - `findAll()`: Vrací seznam všech uživatelů.