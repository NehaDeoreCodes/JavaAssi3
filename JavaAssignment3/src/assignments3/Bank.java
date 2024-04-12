package assignments3;

public class Bank {


private static final int MAX_SIZE = 100;
private Customer[] customers;
private int size;

public Bank() {
    customers = new Customer[MAX_SIZE];
    size = 0;
}

public void addCustomer(Customer customer) {
    if (size < MAX_SIZE) {
        customers[size++] = customer;
    } else {
        System.out.println("Bank is full, cannot add more customers");
    }
}

public void removeCustomer(Customer customer) {
    int index = -1;
    for (int i = 0; i < size; i++) {
        if (customers[i] == customer) {
            index = i;
            break;
        }
    }
    if (index != -1) {
        for (int i = index; i < size - 1; i++) {
            customers[i] = customers[i + 1];
        }
        size--;
    } else {
        System.out.println("Customer not found");
    }
}

public void displayCustomerDetails() {
    for (int i = 0; i < size; i++) {
        customers[i].displayDetails();
        System.out.println();
    }
}

public void applyInterest(double rate) {
    for (int i = 0; i < size; i++) {
        double balance = customers[i].getAccount().getBalance();
        double interest = balance * rate / 100;
        customers[i].getAccount().deposit(interest);
    }
}
}