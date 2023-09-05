package com.psl.file_read_write;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EventBO {
	public List<Event> readFromFile(BufferedReader br) throws IOException{
		String str;
		List<Event> events=new ArrayList<>();
		while((str=br.readLine())!= null) {
			String[] arr=str.split(",");
			Event e=new Event(arr[0],Integer.parseInt(arr[1]),arr[2]);
			events.add(e);
		}
		return events;
	}
	void writefile(List<Event> eventList, FileWriter fr) throws IOException {
		Set<String> set = new HashSet<>();
        
		for (int i = 0; i < eventList.size(); i++) {
            if (set.contains(eventList.get(i).getOwnerName())) {
                set.add(eventList.get(i).getOwnerName());
                fr.write(eventList.get(i).getEventName());
                fr.write(",");
                fr.write(String.valueOf(eventList.get(i).getAttendeesCount()));
                fr.write(",");
                fr.write(eventList.get(i).getOwnerName());
                fr.write("\n");
            } else{

            }
	   }
   }
}
