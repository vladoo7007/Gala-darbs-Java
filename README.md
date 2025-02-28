# Gala-darbs-Java: Studentu Informācijas Sistēma

## Apraksts
Šī ir Java konsoles aplikācija, kas vāc lietotāja ievades datus, apstrādā tos un parāda informāciju par personu vai studentu. Tā demonstrē šādas programmēšanas pamatprasmes:
- **Objektorientētā programmēšana (OOP)**
- **Datu validācija**
- **Konsoles ievades apstrāde, izmantojot `Scanner`**
- **Matemātiskie aprēķini (ĶMI – Ķermeņa masas indekss)**
- **Cikli un loģiskie nosacījumi**

## Funkcijas
- Lietotājs var ievadīt savus datus (**vārds, vecums, augums, svars, ienākumi, valsts utt.**)
- Programma aprēķina:
  - **Vecumu dienās**
  - **Augumu centimetros**
  - **Gada ienākumus**
  - **Ķermeņa masas indeksu (BMI) un tā kategoriju**
- Nodrošina datu validāciju, nepieļaujot **negatīvas vai nederīgas vērtības**
- Pārbauda **ienākumu līmeni** un sniedz atbilstošu paziņojumu
- Ja lietotājs dzīvo **Latvijā**, tiek sniegta papildus informācija par **vidējiem ienākumiem**
- Ietver `Student` apakšklasi ar `studyProgram` mainīgo un metodi studiju programmas attēlošanai
- Izmanto **try-with-resources**, lai nodrošinātu pareizu resursu pārvaldību
- Atļauj secīgi ievadīt **vairākus lietotājus**

## Instalēšana un palaišana
### **Nepieciešamās prasības**
Pārliecinies, ka tev ir uzstādīts:
- [**Java JDK**](https://adoptium.net/) (versija **8 vai jaunāka**)
- [**Visual Studio Code**](https://code.visualstudio.com/) (vai cita Java IDE)
- **Java Extension Pack** VS Code vidē (ja izmanto VS Code)

### **Kā palaist programmu**
1. **Lejupielādē vai klonē repozitoriju** (ja izmanto Git):
   ```sh
   git clone https://github.com/your-repo/java-student-app.git
   cd java-student-app
   ```
2. **Kompilē Java programmu**:
   ```sh
   javac Main.java
   ```
3. **Palaid programmu**:
   ```sh
   java Main
   ```
4. Ievadi nepieciešamos datus, sekojot ekrāna norādēm.

## Piemēra izpilde
```sh
Enter your first name:
Jānis
Enter your last name:
Bērziņš
Enter your age:
30
Enter your height in meters:
1.80
Enter your weight in kg:
80
Enter your country:
Latvia
Enter your monthly income in EUR:
900
Do you like programming? (yes/no):
yes
Enter your study program:
IT

--- Person Information ---
Name: Jānis Bērziņš
Age: 30 years (10950 days)
Height: 1.80 m (180.0 cm)
Weight: 80.0 kg
Country: Latvia
Monthly Income: 900.0 EUR
Yearly Income: 10800.0 EUR
Likes to Program: Yes
BMI: 24.69 - Normal weight
Jūsu ienākumi ir zem vidējā.
Jūs dzīvojat Latvijā. Vidējie ienākumi šeit ir aptuveni 1500 EUR.
Study Program: IT
```

## Problēmu novēršana
### **Izplatītākās kļūdas un risinājumi**
#### **1. Programma neatpazīst decimālskaitļus**
   - Mēģini ievadīt skaitļus ar **punktu (`.`)** nevis komatu (`,`), piemēram, `1.75` nevis `1,75`.
   - Ja problēma saglabājas, pārbaudi **sistēmas reģionālos iestatījumus** (`Vadības panelis → Reģions → Decimālzīme`).

#### **2. `Scanner` problēmas (`nextDouble()` nepareizi nolasa datus)**
   - Pēc `scanner.nextDouble()` pievieno `scanner.nextLine();`, lai attīrītu buferi un novērstu nepareizu ievadi.

#### **3. Kļūda: `java not recognized`**
   - Pārbaudi, vai **Java ir instalēts** un pievienots sistēmas `PATH`. Palaid komandu:
     ```sh
     java -version
     ```
     Ja Java nav instalēts, lejupielādē un uzstādi JDK no [Adoptium](https://adoptium.net/).

## Uzlabojumu idejas
- **Pievienot grafisko lietotāja interfeisu (GUI)**, izmantojot JavaFX vai Swing
- **Saglabāt lietotāju datus** failā (piem., JSON vai CSV)
- **Izveidot datubāzes savienojumu** pastāvīgai datu glabāšanai

## Licence
Šis projekts ir atvērtā koda un pieejams saskaņā ar [MIT licenci](LICENSE).

