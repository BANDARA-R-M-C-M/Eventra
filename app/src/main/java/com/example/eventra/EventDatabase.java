package com.example.eventra;

import java.util.HashMap;
import java.util.Map;

public class EventDatabase {
    // Event List Array
    Map<String, Map<String, String>> eventList = new HashMap<>();

    public void setFirstEvent(String eventName, String eventDescription, String eventDate, String eventTime, String eventVenue, String eventTicket, String eventOrganizers){

        // Add values to the first element of the array

        this.eventList.put("1", new HashMap<>());
        this.eventList.get("1").put("name", eventName);
        this.eventList.get("1").put("description", eventDescription);
        this.eventList.get("1").put("date", eventDate);
        this.eventList.get("1").put("time", eventTime);
        this.eventList.get("1").put("venue", eventVenue);
        this.eventList.get("1").put("ticket", eventTicket);
        this.eventList.get("1").put("organizers", eventOrganizers);
    }

    public void setRandomEvent(String eventName, String eventDescription, String eventDate, String eventTime, String eventVenue, String eventTicket, String eventOrganizers){

        // Set array ID

        int rowCount = this.eventList.size();
        System.out.println(rowCount);
        ++rowCount;
        String eventID = String.valueOf(rowCount);

        // Add values to the random array

        this.eventList.put(eventID, new HashMap<>());
        this.eventList.get(eventID).put("name", eventName);
        this.eventList.get(eventID).put("description", eventDescription);
        this.eventList.get(eventID).put("date", eventDate);
        this.eventList.get(eventID).put("time", eventTime);
        this.eventList.get(eventID).put("venue", eventVenue);
        this.eventList.get(eventID).put("ticket", eventTicket);
        this.eventList.get(eventID).put("organizers", eventOrganizers);

    }

    public boolean isEventNull(){

        // Check th table is empty
        return this.eventList.isEmpty();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////// Please Call Only This Methods ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void addEvent(String eventName, String eventDescription, String eventDate, String eventTime, String eventVenue, String eventTicket, String eventOrganizers){

        // Set the event
        if(isEventNull()){
            setFirstEvent(eventName, eventDescription, eventDate, eventTime, eventVenue, eventTicket, eventOrganizers);
        }else{
            setRandomEvent(eventName, eventDescription, eventDate, eventTime, eventVenue, eventTicket, eventOrganizers);
        }
    }

    public String getEventName(int i){

        //Return the event name
        String eventID = String.valueOf(i);
        return this.eventList.get(eventID).get("name");
    }

    public String getEventDescription(int i){

        //Return the event description
        String eventID = String.valueOf(i);
        return this.eventList.get(eventID).get("description");
    }

    public String getEventDate(int i){

        ////Return the event date
        String eventID = String.valueOf(i);
        return this.eventList.get(eventID).get("date");
    }

    public String getEventTime(int i){

        //Return the event time
        String eventID = String.valueOf(i);
        return this.eventList.get(eventID).get("time");
    }

    public String getEventVenue(int i){

        //Return the event venue
        String eventID = String.valueOf(i);
        return this.eventList.get(eventID).get("venue");
    }

    public String getEventTicket(int i){

        //Return the event ticket
        String eventID = String.valueOf(i);
        return this.eventList.get(eventID).get("ticket");
    }

    public String getEventOrganizers(int i){

        //Return the event organizers
        String eventID = String.valueOf(i);
        return this.eventList.get(eventID).get("organizers");
    }

}

