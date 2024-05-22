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
