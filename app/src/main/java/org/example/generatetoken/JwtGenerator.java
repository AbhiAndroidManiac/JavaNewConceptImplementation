package org.example.generatetoken;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import com.auth0.jwt.interfaces.RSAKeyProvider;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Date;
public class JwtGenerator {
    /**method to generate to JWT token for the
     * fcm oauth bearer token access
     * **/
    public static void main(String[] args) {
        try {
            // Load your service account JSON file
            String serviceAccountPath = "file location to be added here";
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(serviceAccountPath));

            // Extract fields from the JSON
            String privateKeyPEM = jsonNode.get("private_key").asText();
            String clientEmail = jsonNode.get("client_email").asText();
            String scope = "https://www.googleapis.com/auth/firebase.messaging";

            // Convert the private key to a RSAPrivateKey object
            privateKeyPEM = privateKeyPEM.replace("-----BEGIN PRIVATE KEY-----\n", "")
                    .replace("-----END PRIVATE KEY-----", "")
                    .replace("\n", "");
            byte[] pkcs8EncodedKey = Base64.getDecoder().decode(privateKeyPEM);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(pkcs8EncodedKey);
            PrivateKey privateKey = KeyFactory.getInstance("RSA").generatePrivate(keySpec);

            // Generate the JWT
            String jwt = JWT.create()
                    .withIssuer(clientEmail)
                    .withAudience("https://oauth2.googleapis.com/token")
                    .withClaim("scope", scope)
                    .withIssuedAt(new Date(System.currentTimeMillis()))
                    .withExpiresAt(new Date(System.currentTimeMillis() + 3600 * 1000)) // 1 hour expiration
                    .sign(Algorithm.RSA256((RSAKey) privateKey));

            System.out.println("Generated JWT: " + jwt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
