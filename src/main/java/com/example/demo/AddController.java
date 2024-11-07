package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class AddController {
    @FXML
    private TextField nameField;

    @FXML
    private TextField phoneField;

    private Contact contact;

    @FXML
    public void saveContact() {
        String name = nameField.getText();
        String phone = phoneField.getText();

        if (contact == null) {
            contact = new Contact(name, phone);
        } else {
            contact.setName(name);
            contact.setPhone(phone);
        }


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Успішно збережено");
        alert.setHeaderText(null);
        alert.setContentText("Запис успішно збережений!");
        alert.showAndWait();


        nameField.getScene().getWindow().hide();
    }


    public void setContact(Contact contact) {
        this.contact = contact;
        if (contact != null) {
            nameField.setText(contact.getName());
            phoneField.setText(contact.getPhone());
        }
    }

    @FXML
    public void cancel() {
        nameField.getScene().getWindow().hide();
    }

    

}




