# TechMCodeTest

Steps to Execute Suite:-
  
    mvn clean test -Denv=PROD
  OR
    
    mvn clean test -Denv=STAGE

After the execution of number of number equation on stage environment, we have observered below functional breadown of calculator as compair to PROD.

    1. On pressing number 5 key, its taking number 6 not number 5.
    2. On performing multiplication, showing +2 increment in result.
    3. After multiplication, if we perform division, always we are getting 0 as result.

Below are report screenshot for your reference

    Stage:
  ![image](https://github.com/kaps24/TechMCodeTest/assets/22386603/527c4b01-88e8-4c58-ade0-dba5e409f915)
  ![image](https://github.com/kaps24/TechMCodeTest/assets/22386603/9d32f512-52ac-4e7d-9815-5939af48aaab)

    PROD:
  ![image](https://github.com/kaps24/TechMCodeTest/assets/22386603/1932083e-f84d-4680-8ffc-cb5170ce7275)
  ![image](https://github.com/kaps24/TechMCodeTest/assets/22386603/6bed9e4c-f239-4c2e-b351-6b223e774f77)

