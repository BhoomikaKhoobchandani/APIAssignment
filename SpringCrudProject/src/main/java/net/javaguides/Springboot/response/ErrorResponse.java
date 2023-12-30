//package net.javaguides.Springboot.response;
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//
//public class ErrorResponse {
//    JSONObject jsonObject=new JSONObject();
//    jsonObject.put("status", "error");
//
//            // Create the errorResponse JSON object
//            JSONObject errorResponse = new JSONObject();
//            errorResponse.put("code", "E10010");
//
//            // Create the messages array
//            JSONArray messagesArray = new JSONArray();
//            messagesArray.put("Lead Already Exists in the database with the lead id");
//
//            // Add the messages array to the errorResponse object
//            errorResponse.put("messages", messagesArray);
//
//            // Add the errorResponse object to the main JSON object
//            jsonObject.put("errorResponse", errorResponse);
//
//            // Print the final JSON string
//            System.out.println(jsonObject.toString());
//        }
//    }
//}
