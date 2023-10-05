## 1. Controller: JsonPage
Třída JsonPage slouží jako hlavní API endpoint pro interakci s uživatelskými daty.

- **@GetMapping("/usersJson")**:  
  Vrací seznam všech uživatelů ve formátu JSON.

- **@GetMapping("/userJson/{userId}")**:  
  Přijímá userId jako parametr z URL.  
  Vrací informace o konkrétním uživateli ve formátu JSON na základě zadaného userId.

- **@GetMapping("/addUser/{email}/{phone_number}/{height}")**:  
  Přijímá email, phone_number a height jako parametry z URL.  
  Přidá nového uživatele do databáze s poskytnutými údaji.  
  Vrací zprávu "User added!", pokud byl uživatel úspěšně přidán, nebo "User already exists!", pokud uživatel s daným emailem již existuje.

## 2. Entita: User
Třída User definuje strukturu uživatelského objektu a jeho vztah k databázové tabulce Users.

- **Atributy**:
    - **id**: Unikátní identifikátor uživatele.
    - **email**: Emailová adresa uživatele.
    - **verified**: Určuje, zda je uživatelský účet ověřen.
    - **date_created**: Datum a čas vytvoření uživatelského účtu.
    - **phone_number**: Telefonní číslo uživatele.
    - **height**: Výška uživatele.

## 3. Repository: UserRepository
UserRepository rozšiřuje JpaRepository a obsahuje metody pro interakci s databázovou tabulkou Users.

- **Metody**:
    - **findAll()**: Vrací seznam všech uživatelů.
    - **findById(int id)**: Hledá a vrací uživatele na základě jeho ID.
    - **existsByEmail(String email)**: Zjišťuje, zda uživatel s daným emailem již existuje v databázi.

## 4. Služba: UserService
UserService poskytuje metody pro práci s uživatelskými daty, které se volají v controlleru.

- **Metody**:
    - **addUser(String email, int phone_number, double height)**: Přidává nového uživatele do databáze a vrací true, pokud byl uživatel úspěšně přidán, nebo false, pokud již existuje.
    - **findById(int userId)**: Hledá a vrací uživatele na základě jeho ID.
    - **findAll()**: Vrací seznam všech uživatelů.

## Použité anotace:

- **@RestController**: Označuje třídu jako controller, kde každá metoda vrátí objekt namísto zobrazení. Odpověď objektu je automaticky konvertována do JSON nebo XML.
- **@Autowired**: Automaticky zavádí požadovanou závislost.
- **@GetMapping**: Reaguje na HTTP GET požadavky na specifikovanou URL.
- **@PathVariable**: Vyzvedává hodnoty z URL.
- **@Data**: Z Lombok knihovny. Generuje všechny getter, setter, equals, hashCode a toString metody.
- **@Entity**: Označuje třídu jako JPA entitu. Používá se k definování tabulky.
- **@Table**: Používá se k specifikaci tabulky, ke které entita patří.
- **@Id**: Určuje, že dané pole je primární klíč v databázi.
- **@GeneratedValue**: Specifikuje, jak se generují primární klíčové hodnoty.
- **@CurrentTimestamp**: Z Hibernate knihovny. Ukládá aktuální časové razítko při vytváření objektu.
- **@Repository**: Indikuje, že třída je repository, což je schopné provádět operace s databází.
- **@Query**: Určuje SQL dotaz k výkonu na databázi.
- **@Service**: Označuje třídu jako service, která obsahuje byznysovou logiku.

