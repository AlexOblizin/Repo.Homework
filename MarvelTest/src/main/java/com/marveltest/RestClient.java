package com.marveltest;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.digest.DigestUtils;
import us.monoid.web.Resty;

public class ConnectionManager {

        public static void main(String[] args) throws IOException {
            String publicKey = "d0a2017f2ba25cd9f2d8f74a61bb1c98";
            String privateKey = "bf68fa8c68d2b3ccbb6f51d35d57b971928ab615";
            long timeStamp = System.currentTimeMillis();
            int limit = 5;

            String stringToHash = timeStamp + privateKey + publicKey;
            String hash = DigestUtils.md5Hex(stringToHash);

            String url = String.format("http://gateway.marvel.com/v1/public/characters?ts=%d&apikey=%s&hash=%s&limit=%d", timeStamp, publicKey, hash, limit);
            String output = new Resty().text(url).toString();
            System.out.println(output);
        }
    }

