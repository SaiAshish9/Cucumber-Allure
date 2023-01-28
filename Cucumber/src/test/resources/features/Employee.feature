Feature: HR Department

  @SmokeTest
  Scenario: Employee joining
    Given "Sai" is hired
    Given "Sai9" is hired
    Then Company has n+2 employees