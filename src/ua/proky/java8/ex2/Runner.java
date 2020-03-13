package ua.proky.java8.ex2;

import java.security.MessageDigest;
import java.util.Base64;

public class Runner {
    final static RequestHandler wrapInRequestTag =
        (req) -> new Request(String.format("<request>%s</request>", req.getData()));

    final static RequestHandler wrapInTransactionTag =
        (req) -> new Request(String.format("<transaction>%s</transaction>", req.getData()));

    final static RequestHandler createDigest =
        (req) -> {
            String digest = "";
            try {
                final MessageDigest md5 = MessageDigest.getInstance("MD5");
                final byte[] digestBytes = md5.digest(req.getData().getBytes("UTF-8"));
                digest = new String(Base64.getEncoder().encode(digestBytes));
            } catch (Exception ignored) { }
            return new Request(req.getData() + String.format("<digest>%s</digest>", digest));
        };

//    final static RequestHandler commonRequestHandler = req -> wrapInRequestTag.setNext(wrapInTransactionTag).setNext(createDigest).handle(req);
    final static RequestHandler commonRequestHandler = wrapInTransactionTag.setNext(createDigest).setNext(wrapInRequestTag);

    public static void main(String[] args) {
        System.out.println(commonRequestHandler.handle(new Request("")));
    }


}
