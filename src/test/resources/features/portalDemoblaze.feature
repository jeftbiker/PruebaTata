#autor: Gustavo Adolfo Salazar Escobar
Feature: POrtal Demoblaze
    As a user, I want to register in the portal


    Background:

      Given than Gustavo wants to register at Demoblaze portal
      @tag
      Scenario: Register as a new user

      When he complete all data for register
        |strname|strpass|
        |gsaesco1|Alive2021*|
      Then can see a succesfull registration message

      @tag
      Scenario: login user
        When the user all data for auth
        |strname|strpass|
        |gsaesco|Alive2021*|
        Then can see the auth user

        @tag
        Scenario: add a product
          When the user selects the product
            |strname|strpass|
            |gsaesco|Alive2021*|
          Then can check the product MacBook Pro in the cart
        @tag
        Scenario: register form contact
        When the user register data in form
          |strEmail|strContactName|strMessage|
          |gsalazar@unicauca.edu.co|Gustavo| Confirm the form data|