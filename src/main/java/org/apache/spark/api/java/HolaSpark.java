package org.apache.spark.api.java;
import static spark.Spark.*;

class HolaSpark {
    public static void main(String[] args) {
        port(8888);
        get("/participants", (req, res) -> "Ranking de ddatos: ");


    }
}

