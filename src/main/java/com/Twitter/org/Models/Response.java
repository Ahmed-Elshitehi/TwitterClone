package com.Twitter.org.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
    private boolean success;
    private String message;
    private Object data;

    public Response() {
        this.success = true;
        this.message = "";
        this.data = null;
    }

    public Response(boolean b, String youCannotBlockYourself) {
        this.success = b;
        this.message = youCannotBlockYourself;
        this.data = null;
    }
}
