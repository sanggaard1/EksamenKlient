package SDK.views;

import SDK.connection.ResponseCallback;
import SDK.controller.Controller;
import SDK.models.Book;
import SDK.services.BookService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sanggaard on 17/11/2016.
 */
public class MainView {

    private Controller controller;

    public MainView(Controller controller){
        this.controller = controller;
    }

    public void presentMenu() {

        System.out.println("Bog butik");
        System.out.println("Du har følgende valgmuligheder:");
        System.out.println("Vis alle bøger");
        System.out.println("Bla bla bla");
        System.out.println("bla bla ");
        System.out.println("Bla vla ");

        Scanner inputReader = new Scanner(System.in);
        int choice = inputReader.nextInt();

        switch (choice) {

            case 1:
                this.controller.getUserMainView().overMenu();
                break;

            case 2:
            case 3:
                System.out.println("Ikke lavet endnu");
                presentMenu();
                break;

            case 4:
                this.controller.getUserMainView().overMenu();
                break;

            case 5:


            default:
                System.out.println("Fejl");
                presentMenu();
                break;
        }
    }


    }