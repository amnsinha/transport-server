package com.integratedServices.email;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
@Service
public class EmailService implements IEmailService {

    public static void main(String[] args) {

                String inputFile = "D:\\class.txt"; // Replace with your input file name

                try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                    String line;
                    StringBuilder currentClass = new StringBuilder();
                    String className = "";

                    while ((line = reader.readLine()) != null) {
                        // Check for class declaration
                        if (line.trim().startsWith("public class ")) {
                            // If a class is already being processed, write it to a file
                            if (!className.isEmpty()) {
                                writeToFile(className, currentClass.toString());
                                currentClass.setLength(0);
                            }

                            // Extract the class name
                            className = line.trim().split(" ")[2];
                        }

                        currentClass.append(line).append("\n");
                    }

                    // Write the last class to a file
                    if (!className.isEmpty()) {
                        writeToFile(className, currentClass.toString());
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            private static void writeToFile(String className, String classContent) {
                try (FileWriter writer = new FileWriter(className + ".java")) {
                    writer.write(classContent);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }



    public boolean sendWelcomeEmail(String emailId, String token, String userId) {
        String verifyUrl = "http://localhost:4200/#/verifyEmail/" + userId + "/token/" + token;

        EmailTemplate emailTemplate = new EmailTemplate(verifyUrl);
        String body = emailTemplate.getEmailTemplate();
        String subject = "WELCOME TO KATIK FITNESS ZONE";

        String apikey = "0B1CD0BE76B73B5C27C54DC48B7897E10870C5F0F67024AA14BEA572B0E42A200BA5DE1995E492D84365E4C878735C37";
        try {

            //Construct the data
            String data = "userName=" + URLEncoder.encode("info@tournamentus.com", StandardCharsets.UTF_8);
            data += "&api_key=" + URLEncoder.encode(apikey, StandardCharsets.UTF_8);
            data += "&from=" + URLEncoder.encode("sinha.amn@gmail.com", StandardCharsets.UTF_8);
            data += "&from_name=" + URLEncoder.encode("Tournamentus.com", StandardCharsets.UTF_8);
            data += "&subject=" + URLEncoder.encode(subject, StandardCharsets.UTF_8);
            data += "&body_html=" + URLEncoder.encode(body, StandardCharsets.UTF_8);
            data += "&to=" + URLEncoder.encode(emailId, StandardCharsets.UTF_8);

            //Send data
            URL url = new URL("https://api.elasticemail.com/v2/email/send");
            //URL url = new URL("https://api.elasticemail.com/mailer/send");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String result = rd.readLine();
            System.out.println(result);
            wr.close();
            rd.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
