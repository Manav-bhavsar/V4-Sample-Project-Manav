# V4-Sample-Project-Manav

Architecture Description:

1. seleniumMethods - an interface to define common methods used across the project.
2. seleniumImplementation - implements the seleniumMethods interface
3. testBaseClass - Base Class for testing and extends seleniumImplementation
4. homePageObjects - contains the objects used for testing with identifiers and methods for testing (extends testBaseClass)
5. homePageTestScript - executable test script, calls the methods with relevant arguments (extends testBaseClass)
