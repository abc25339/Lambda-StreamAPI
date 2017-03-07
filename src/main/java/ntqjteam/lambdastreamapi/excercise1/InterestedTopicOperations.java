package ntqjteam.lambdastreamapi.excercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TooManyListenersException;
import java.util.stream.Collectors;

/**
 * Created by toan on 3/1/17.
 */
public class InterestedTopicOperations {

    public static void main(String[] args) {

        List<Topic> currentTopics = Topics.initCurrentTopic();
        List<Topic> updatingTopics = Topics.initUpdateTopic();

        List<Topic> totalTopic = new ArrayList<>();
        totalTopic.addAll(currentTopics);
        totalTopic.addAll(updatingTopics);
        
        List<Topic> addedTopics = new ArrayList<Topic>();
        List<Topic> updatedTopics = new ArrayList<Topic>();
        List<Topic> deletedTopics = new ArrayList<Topic>();
        Map<String, List<Topic>> mapTotalTopic = totalTopic.stream().collect(Collectors.groupingBy(Topic::getId));
        // Find out these groups of topics from currentTopics and updatingTopics
        for (Entry<String, List<Topic>> element : mapTotalTopic.entrySet()) {
			if(element.getValue().size() == 1){
				Topic topic = element.getValue().get(0);
				if(currentTopics.contains(topic)){
					deletedTopics.add(topic);
				}else{
					addedTopics.add(topic);
				}
			} else if(element.getValue().size() == 2){
				Topic topic1 = element.getValue().get(0);
				Topic topic2 = element.getValue().get(1);
				if(!topic1.equals(topic2)){
					updatedTopics.add(currentTopics.contains(topic1) ? topic1 : topic2);
				}
			}
		}

    }

}
