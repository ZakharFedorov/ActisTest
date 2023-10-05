1. Controller: JsonPage
    Třída JsonPage slouží jako hlavní API endpoint pro interakci s uživatelskými daty.

@GetMapping("/usersJson"):
Vrací seznam všech uživatelů ve formátu JSON.
@GetMapping("/userJson/{userId}"):
Přijímá userId jako parametr z URL.
Vrací informace o konkrétním uživateli ve formátu JSON na základě zadaného userId.
@GetMapping("/addUser/{email}/{phone_number}/{height}"):
Přijímá email, phone_number a height jako parametry z URL.
Přidá nového uživatele do databáze s poskytnutými údaji.
Vrací zprávu "User added!", pokud byl uživatel úspěšně přidán, nebo "User already exists!", pokud uživatel s daným emailem již existuje.
2. Entita: User
   Třída User definuje strukturu uživatelského objektu a jeho vztah k databázové tabulce Users.

Atributy:
id: Unikátní identifikátor uživatele.
email: Emailová adresa uživatele.
verified: Určuje, zda je uživatelský účet ověřen.
date_created: Datum a čas vytvoření uživatelského účtu.
phone_number: Telefonní číslo uživatele.
height: Výška uživatele.
3. Repository: UserRepository
   UserRepository rozšiřuje JpaRepository a obsahuje metody pro interakci s databázovou tabulkou Users.

Metody:
findAll(): Vrací seznam všech uživatelů.
findById(int id): Hledá a vrací uživatele na základě jeho ID.
existsByEmail(String email): Zjišťuje, zda uživatel s daným emailem již existuje v databázi.
4. Služba: UserService
   UserService poskytuje metody pro práci s uživatelskými daty, které se volají v controlleru.

Metody:
addUser(String email, int phone_number, double height): Přidává nového uživatele do databáze a vrací true, pokud byl uživatel úspěšně přidán, nebo false, pokud již existuje.
findById(int userId): Hledá a vrací uživatele na základě jeho ID.
findAll(): Vrací seznam všech uživatelů.