package Task2;

import com.Lab6.Task1.Contact;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ContactClient{

    public static String add_url = "http://localhost:8080/contact/add";
    public static String getById_url = "http://localhost:8080/contact/";
    public static String del_url = "http://localhost:8080/contact/del";
    public static String all_url = "http://localhost:8080/contact/all";
    public static String edit_url = "http://localhost:8080/contact/edit";

    public static String type_Content = "Content-type";
    public static String type_json = "application/json";


    public static void main(String[] args) {
        new ContactClient().start();
    }

    public void start(){

        all_test();

        Contact test1 = new Contact("e0fc87df-d297-45a3-ac8b-47bed61af2d5","jinseok","Hong","01011111111","aaaaa@ajou.ac,kr");
        add_test(test1);

        String id = "e0fc87df-d297-45a3-ac8b-47bed61af2d5";
        getById_test(id);

        Contact test2 = new Contact("e0fc87df-d297-45a3-ac8b-47bed61af2d5","seokjin","Hong","01022222222","aaaaa@ajou.ac,kr");
        edit_test(test2);
        all_test();

        delete_test(test2);
        all_test();
    }

    private void add_test(Contact contact){
        String data = contactToJson(contact);

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(add_url);

        post.addHeader("Content-Type","application/json");
        post.addHeader("Accept","application/json");

        try {

            StringEntity en = new StringEntity(data);
            post.setEntity(en);

            HttpResponse response = client.execute(post);

            if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("Success!");
            } else {
                System.out.println("Error");
            }

            HttpEntity entity = response.getEntity();
            System.out.println(EntityUtils.toString(entity));

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getById_test(String id){
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet(getById_url+id);
        get.setHeader(type_Content,type_json);

        try {
            HttpResponse response = client.execute(get);

            if (response.getStatusLine().getStatusCode() != 200) {
                System.out.println("Error");
            }

            HttpEntity entity = response.getEntity();

            String data = EntityUtils.toString(entity);

            if(data.equals("")){
                System.out.println("No Value");
                return;
            }

            Contact c = jsonToContact(data);
            System.out.println("id: "+c.getId()+" "+"firstName: "+ c.getFirstName() +" "+"lastName: "+c.getLastName() +" "+"phone: "+c.getPhone() +" "+"email: "+ c.getEmail());

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void all_test(){

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet(all_url);
        get.setHeader(type_Content,type_json);

        try {
            HttpResponse response = client.execute(get);

            if (response.getStatusLine().getStatusCode() != 200) {
                System.out.println("Error");
            }

            HttpEntity entity = response.getEntity();
            String data = EntityUtils.toString(entity);

            if(data.equals("")){
                System.out.println("No Value");
                return;
            }

            Type contactListType = new TypeToken<ArrayList<Contact>>(){}.getType();
            ArrayList<Contact> contacts = new Gson().fromJson(data,contactListType);
            for(Contact c: contacts){
                System.out.println("id: "+c.getId()+" "+"firstName: "+c.getFirstName()+" "+"lastName: "+c.getLastName()+" "+"phone: "+c.getPhone()+" "+"email: "+c.getEmail());
            }

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void edit_test(Contact beEditContact){
        String data = contactToJson(beEditContact);

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpPut put = new HttpPut(edit_url);
        put.setHeader(type_Content,type_json);

        try {
            StringEntity se = new StringEntity(data);
            put.setEntity(se);

            HttpResponse response = client.execute(put);

            if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("Success!");
            } else {
                System.out.println("Error");
            }

            HttpEntity entity = response.getEntity();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void delete_test(Contact contact){

        String data = contactToJson(contact);

        CloseableHttpClient client = HttpClientBuilder.create().build();

        HttpPut del = new HttpPut(del_url);

        del.setHeader(type_Content,type_json);

        try {

            StringEntity se = new StringEntity(data);
            del.setEntity(se);

            HttpResponse response = client.execute(del);

            if (response.getStatusLine().getStatusCode() != 200) {
                System.out.println("DELETE ERROR: " + response.getStatusLine().getStatusCode());
            }

            HttpEntity entity = response.getEntity();
            System.out.println(EntityUtils.toString(entity));

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Contact jsonToContact(String json){
        Gson gson = new Gson();
        Contact contact = gson.fromJson(json, Contact.class);
        return contact;
    }

    private String contactToJson(Contact contact){
        Gson gson = new Gson();
        String json = gson.toJson(contact);
        return json;
    }

}