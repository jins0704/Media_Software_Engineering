package Task4;

import com.Lab6.Task3.Contact;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

public class ContactClient{

    public static String add_url = "http://localhost:8080/contactbookdb/add";
    public static String getById_url = "http://localhost:8080/contactbookdb/{id}";
    public static String del_url = "http://localhost:8080/contactbookdb/del";
    public static String all_url = "http://localhost:8080/contactbookdb/all";
    public static String edit_url = "http://localhost:8080/contactbookdb/edit";
    public static String last_url = "http://localhost:8080/contactbookdb/name/{lastName}";

    public static void main(String[] args){
        new ContactClient().start();
    }

    public void start(){
        Contact test1 = new Contact(UUID.fromString("e0fc87df-d297-45a3-ac8b-47bed61af2d5"),"jinseok","Hong","01011111111","aaaaa@ajou.ac,kr");
        addContact(test1);

        getContactById(UUID.fromString("e0fc87df-d297-45a3-ac8b-47bed61af2d5"));
        getContactsByLastName("Hong");

        Contact test2 = new Contact(UUID.fromString("e0fc87df-d297-45a3-ac8b-47bed61af2d5"),"seokjin","Hong","01022222222","aaaaa@ajou.ac,kr");
        editContact(test2);
        getContacts();

        deleteContact(test2);
        getContacts();
    }

    public void addContact(Contact contact) {
        RestTemplate rt = new RestTemplate();

        if(contact!=null){
            ResponseEntity<Boolean> entity = rt.postForEntity(add_url,contact,Boolean.class);

            if(entity.getStatusCodeValue() == 200){
                System.out.println(entity.getBody());
                return;
            }
        }
    }

    public void deleteContact(Contact contact) {
        RestTemplate rt = new RestTemplate();
        rt.put(del_url,contact);
    }

    public void editContact(Contact contact) {
        RestTemplate rt = new RestTemplate();
        rt.put(edit_url,contact);
    }

    public void getContacts() {

        RestTemplate rt = new RestTemplate();

        Contact[] contacts = rt.getForObject(all_url, Contact[].class);

        if (contacts.length != 0) {
            for(Contact c: contacts){
                System.out.println(c.toString());
            }
        }
    }

    public void getContactById(UUID id){

        RestTemplate rt = new RestTemplate();

        Contact contact = rt.getForObject(getById_url, Contact.class, id);
        if (!contact.equals(null)) {
            System.out.println(contact.toString());
        }
    }

    public void getContactsByLastName(String lastName) {
        RestTemplate restTemplate = new RestTemplate();
        Contact[] contacts = restTemplate.getForObject(last_url,Contact[].class,lastName);

        for(Contact contact: contacts){
            System.out.println("contact " + contact.toString());
        }
    }
}