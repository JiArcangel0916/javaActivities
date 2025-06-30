import java.util.Scanner;

public class doubly {
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            choice = disMenu(sc);

            switch(choice){
                case 1:
                    createList(list, sc);
                    list.displayList();
                    break;
                
                case 2:
                    list.displayList();
                    break;

                case 3:
                    addToStart(list, sc);
                    break;

                case 4:
                    addToEnd(list, sc);
                    break;

                case 5:
                    list.addBefore();
                    break;

                case 6:
                    list.addAfter();
                    break;
                    
                case 7:
                    list.delStart();
                    break;

                case 8:
                    list.delEnd();
                    break;

                case 9:
                    list.deleteNode();
                    break;

                case 10:
                    list.delBefore();
                    break;

                case 11:
                    list.delAfter();
                    break;

                case 12:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice >= 1 && choice != 12);
        sc.close();
    }

    public static int disMenu(Scanner sc){
        int choice;

        System.out.println("[1] CREATE STUDENT RECORDS");
        System.out.println("[2] DISPLAY STUDENT RECORDS");
        System.out.println("[3] ADD STUDENT AT THE START");
        System.out.println("[4] ADD STUDENT AT THE END");
        System.out.println("[5] ADD STUDENT BEFORE A STUDENT");
        System.out.println("[6] ADD STUDENT AFTER A STUDENT");
        System.out.println("[7] DELETE STUDENT AT THE START");
        System.out.println("[8] DELETE STUDENT AT THE END");
        System.out.println("[9] DELETE A STUDENT");
        System.out.println("[10] DELETE STUDENT BEFORE A STUDENT");
        System.out.println("[11] DELETE STUDENT AFTER A STUDENT");
        System.out.println("[12] EXIT");
        System.out.print("Enter choice => ");
        choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public static void createList(DoublyLinkedList list, Scanner sc){
        int ctr = 1;
        char resp;
        String studNo, studName, crsYr, add;
        float GWA;

        System.out.println("*** Creating Student Records ***");
        System.out.println("Enter the ff. information");
        do{
            System.out.println("\tStudent " + ctr);
            System.out.print("\tStudent Number: ");
            studNo = sc.nextLine();
            System.out.print("\tStudent Name: ");
            studName = sc.nextLine();
            System.out.print("\tCourse and Year Level: ");
            crsYr = sc.nextLine();
            System.out.print("\tAddress: ");
            add = sc.nextLine();
            System.out.print("\tGWA: ");
            GWA = sc.nextFloat();
            list.addNode(studNo, studName, crsYr, add, GWA);

            sc.nextLine();
            System.out.print("Add another student [Y/N]? ");
            resp = sc.nextLine().charAt(0);
            resp = Character.toUpperCase(resp);
            System.out.println();

            if (resp == 'Y'){
               ctr++; 
            }
            
        } while(resp == 'Y');
        System.out.print("Press enter to continue...");
        sc.nextLine();
        System.out.println();
    }

    public static void addToStart(DoublyLinkedList list, Scanner sc){
        String studNo, studName, crsYr, add;
        float GWA; 

        System.out.println("Enter the ff. information");
        System.out.print("\tStudent Number: ");
        studNo = sc.nextLine();
        System.out.print("\tStudent Name: ");
        studName = sc.nextLine();
        System.out.print("\tCourse and Year Level: ");
        crsYr = sc.nextLine();
        System.out.print("\tAddress: ");
        add = sc.nextLine();
        System.out.print("\tGWA: ");
        GWA = sc.nextFloat();

        list.addStart(studNo, studName, crsYr, add, GWA);

        System.out.println();
        list.displayList();
    }

    public static void addToEnd(DoublyLinkedList list, Scanner sc){
        String studNo, studName, crsYr, add;
        float GWA; 

        System.out.println("Enter the ff. information");
        System.out.print("\tStudent Number: ");
        studNo = sc.nextLine();
        System.out.print("\tStudent Name: ");
        studName = sc.nextLine();
        System.out.print("\tCourse and Year Level: ");
        crsYr = sc.nextLine();
        System.out.print("\tAddress: ");
        add = sc.nextLine();
        System.out.print("\tGWA: ");
        GWA = sc.nextFloat();

        list.addEnd(studNo, studName, crsYr, add, GWA);
        
        System.out.println();
        list.displayList();
    }
}

class Node {
    String studNo;
    String studName;
    String crsYr;
    String add;
    float GWA;
    Node next;
    Node prev;

    public Node(String studNo, String studName, String crsYr, String add, float GWA) {
        this.studNo = studNo;
        this.studName = studName;
        this.crsYr = crsYr;
        this.add = add;
        this.GWA = GWA;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node Head;
    private Node Tail;
    Scanner sc = new Scanner(System.in);

    // fucntion CREATE LIST
    public void addNode(String studNo, String studName, String crsYr, String add, float GWA) {
        Node newNode = new Node(studNo, studName, crsYr, add, GWA);
        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            Tail.next = newNode;
            newNode.prev = Tail;
            Tail = newNode;
        }
    }

    // function to DISPLAY the list
    public void displayList() {
        Node Current = Head;
        if (Current == null) {
            System.out.println("This list is empty!");
            System.out.println();
            return; 
        }

        while (Current != null) {
            System.out.println();
            System.out.println("Student No.: " + Current.studNo);
            System.out.println("Student Name: " + Current.studName);
            System.out.println("Course and Year: " + Current.crsYr);
            System.out.println("Address: " + Current.add);
            System.out.println("GWA: " + Current.GWA);
            Current = Current.next;
            System.out.println();
        }
    }

    // ADDING NODES-----------------------------------------------------------------------------
    // function to ADD AT THE HEAD
    public void addStart(String studNo, String studName, String crsYr, String add, float GWA) {
        Node newNode = new Node(studNo, studName, crsYr, add, GWA);
        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            newNode.next = Head;
            Head.prev = newNode;
            Head = newNode;
        }
        System.out.print("Press enter to continue...");
        sc.nextLine();
    }

    // function to ADD AT THE TAIL
    public void addEnd(String studNo, String studName, String crsYr, String add, float GWA) {
        addNode(studNo, studName, crsYr, add, GWA);
        System.out.print("Press enter to continue...");
        sc.nextLine();
    }

    // function to ADD BEFORE A NODE
    public void addBefore() {
        Node newNode;
        Node Current = Head;
        boolean found = false;
        String studNo, studName, crsYr, add, findNode;
        float GWA;

        if (Current == null){
            System.out.println("There are no entries in the list yet");
            System.out.print("Press enter to continue...");
            sc.nextLine();
            System.out.println();
            return;
        }

        System.out.println("Enter the ff. information");
        System.out.print("\tStudent Number: ");
        studNo = sc.nextLine();
        System.out.print("\tStudent Name: ");
        studName = sc.nextLine();
        System.out.print("\tCourse and Year Level: ");
        crsYr = sc.nextLine();
        System.out.print("\tAddress: ");
        add = sc.nextLine();
        System.out.print("\tGWA: ");
        GWA = sc.nextFloat();
        sc.nextLine();
        newNode = new Node(studNo, studName, crsYr, add, GWA);

        System.out.print("Enter the STUDENT NUMBER to add the new student before: ");
        findNode = sc.nextLine();

        while (Current != null && found != true) {
            if (Current.studNo.equals(findNode)) {
                found = true;
            } else {
                Current = Current.next;
            }
        }

        if (found == true) {
            if (Current == Head){
                newNode.next = Current;
                Current.prev = newNode;
                Head = newNode;
            }
            else{
                newNode.next = Current;
                newNode.prev = Current.prev;
                Current.prev.next = newNode;
                Current.prev = newNode;
            }
            
        } else {
            System.out.println("Student " + findNode + " does not exist in the list");
        }
        System.out.print("Press enter to continue...");
        sc.nextLine();

        displayList();
    }

    // function to ADD AFTER A NODE
    public void addAfter() {
        Node newNode;
        Node Current = Head;
        boolean found = false;
        String studNo, studName, crsYr, add, findNode;
        float GWA; 

        if (Current == null){
            System.out.println("There are no entries in the list yet");
            System.out.print("Press enter to continue...");
            sc.nextLine();
            System.out.println();
            return;
        }

        System.out.println("Enter the ff. information");
        System.out.print("\tStudent Number: ");
        studNo = sc.nextLine();
        System.out.print("\tStudent Name: ");
        studName = sc.nextLine();
        System.out.print("\tCourse and Year Level: ");
        crsYr = sc.nextLine();
        System.out.print("\tAddress: ");
        add = sc.nextLine();
        System.out.print("\tGWA: ");
        GWA = sc.nextFloat();
        sc.nextLine();

        newNode = new Node(studNo, studName, crsYr, add, GWA);

        System.out.print("Enter the STUDENT NUMBER to add the new student after: ");
        findNode = sc.nextLine();

        while (Current != null && found != true) {
            if (Current.studNo.equals(findNode)) {
                found = true;
            } else {
                Current = Current.next;
            }
        }

        if (found == true) {
            if (Current == Tail){
                newNode.prev = Current;
                Current.next = newNode;
                Tail = newNode;
            }
            else{
                newNode.prev = Current;
                newNode.next = Current.next;
                Current.next.prev = newNode;
                Current.next = newNode;
            }
            
        } else {
            System.out.println("Student " + findNode + " does not exist in the list");
        }
        System.out.print("Press enter to continue...");
        sc.nextLine();

        displayList();
    }

    // DELETING NODES----------------------------------------------------------------------------
    // function to DELETE AT THE START
    public void delStart() {
        Node delNode = Head;
        char resp;
        if (delNode == null){
            System.out.println("There are no entries to delete");
            System.out.print("Press enter to continue...");
            sc.nextLine();
            System.out.println();
            return;
        }

        System.out.print("Confirm action [Y/N]: ");
        resp = sc.nextLine().charAt(0);
        resp = Character.toUpperCase(resp);

        if (resp == 'Y'){
            if (Head == Tail){
                Head = null;
                Tail = null;
            }
            else{
                Head = Head.next;
                delNode.next = null;
                Head.prev = null;
            }
        }
        else{
            System.out.println("Cancelling...");
            return;
        }

        System.out.print("Press enter to continue...");
        sc.nextLine();
        System.out.println();
        displayList();
    }

    // function to DELETE AT THE END
    public void delEnd() {
        Node delNode = Tail;
        char resp;
        if (delNode == null){
            System.out.println("There are no entries to delete");
            System.out.print("Press enter to continue...");
            sc.nextLine();
            System.out.println();
            return;
        }

        System.out.print("Confirm action [Y/N]: ");
        resp = sc.nextLine().charAt(0);
        resp = Character.toUpperCase(resp);

        if (resp == 'Y'){
            if (Head == Tail){
                Tail = null;
                Head = null;
            }
            else{
                Tail = Tail.prev;
                delNode.prev = null;
                Tail.next = null;
            }  
        }
        else{
            System.out.println("Cancelling...");
            return;
        }
        
        System.out.print("Press enter to continue...");
        sc.nextLine();
        System.out.println();
        displayList();
    }

    // function to DELETE A NODE
    public void deleteNode() {
        Node delNode = Head;
        boolean found = false;
        String findNode;
        if (delNode == null){
            System.out.println("There are no entries to delete");
            System.out.print("Press enter to continue...");
            sc.nextLine();
            System.out.println();
            return;
        }
        System.out.print("Enter the STUDENT NUMBER of the student to delete: ");
        findNode = sc.nextLine();
        
        while (delNode != null && found != true){
            if (delNode.studNo.equals(findNode)){
                found = true;
            }
            else{
                delNode = delNode.next;
            }
        }
        
        if(found == true){
            if (delNode == Head){
                Head = Head.next;
                delNode.next = null;
                Head.prev = null;
            }
            else if(delNode == Tail){
                Tail = Tail.prev;
                delNode.prev = null;
                Tail.next = null;
            }
            else{
                delNode.prev.next = delNode.next;
                delNode.next.prev = delNode.prev;
            }  
        }
        else{
            System.out.println("Student " + findNode + " does not exist in the list");
        }
        System.out.print("Press enter to continue...");
        sc.nextLine();
        System.out.println();
        displayList();
    }

    // function to DELETE A NODE BEFORE A NODE
    public void delBefore() {
        Node Current = Head;
        Node delNode = null;
        boolean found = false;
        String findNode;

        if (Current == null){
            System.out.println("There are no entries to delete...");
            System.out.print("Press enter to continue...");
            sc.nextLine();
            System.out.println();
            return;
        }

        System.out.print("Enter the STUDENT NUMBER of the student you want to delete before it: ");
        findNode = sc.nextLine();

        if (Current.studNo.equals(findNode)){
            System.out.println("There is no student before " + findNode);
            System.out.print("Press enter to continue...");
            sc.nextLine();
            System.out.println();
            return;
        }
        else{
            while (Current != null && found != true){
                if (Current.studNo.equals(findNode)){
                    found = true;
                }
                else{
                    delNode = Current;
                    Current = Current.next;
                }
            }

            if (found == true){
                if (delNode == Head){
                    Head = Current;
                    Current.prev = null;
                }
                else{
                    delNode.next.prev = delNode.prev;
                    delNode.prev.next = delNode.next;
                }
                delNode.next = null;
                delNode.prev = null;
            }
            else{
                System.out.println("Student " + findNode + " does not exist in the list");
            }
            System.out.print("Press enter to continue...");
            sc.nextLine();
            System.out.println();

            displayList();
        }
    }

    // function to DELETE A NODE AFTER A NODE
    public void delAfter() {
        Node Current = Head;
        Node delNode = null;
        boolean found = false;
        String findNode;

        if (Current == null){
            System.out.println("There are no entries to delete");
            System.out.print("Press enter to continue...");
            sc.nextLine();
            System.out.println();
            return;
        }

        System.out.print("Enter the STUDENT NUMBER of the student you want to delete after it: ");
        findNode = sc.nextLine();
        
        while(Current != null && found != true){
            if (Current.studNo.equals(findNode)){
                found = true;
            }
            else{
                Current = Current.next;
            }
        }

        if(found == true){
            delNode = Current.next;
            if (Current == Tail){
                System.out.println("There is no student after " + findNode);
            }
            else if (delNode == Tail){
                Tail = Tail.prev;
                Tail.next = null;
            }
            else{
                delNode.next.prev = delNode.prev;
                Current.next = delNode.next;
                delNode.prev.next = delNode.next;
                delNode.next = null;
                delNode.prev = null;
            }
        }
        else{
            System.out.println("Student " + findNode + " does not exist in the list");
        }
        System.out.print("Press enter to continue...");
        sc.nextLine();
        System.out.println();

        displayList();
    }
}